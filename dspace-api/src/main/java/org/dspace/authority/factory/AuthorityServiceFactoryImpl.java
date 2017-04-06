/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.authority.factory;

import java.util.*;
import org.dspace.authority.*;
import org.dspace.authority.indexer.*;
import org.dspace.authority.service.*;
import org.dspace.content.*;
import org.dspace.core.*;
import org.dspace.utils.*;
import org.springframework.beans.factory.annotation.*;

/**
 * Factory implementation to get services for the authority package, use AuthorityServiceFactory.getInstance() to retrieve an implementation
 *
 * @author kevinvandevelde at atmire.com
 * @author philip at atmire.com
 */
public class AuthorityServiceFactoryImpl extends AuthorityServiceFactory {

    @Autowired
    private CachedAuthorityService cachedAuthorityService;

    @Autowired(required = true)
    private AuthoritySearchService authoritySearchService;

    @Override
    public AuthoritySearchService getAuthoritySearchService() {
        return authoritySearchService;
    }

    @Override
    public CachedAuthorityService getCachedAuthorityService() {
        return cachedAuthorityService;
    }

    @Override
    public List<AuthorityIndexerInterface> createAuthorityIndexers(Context context) {
        final List<AuthorityIndexerInterface> authorityIndexers = createUninitialisedAuthorityIndexers();
        for (AuthorityIndexerInterface authorityIndexerInterface : authorityIndexers) {
            authorityIndexerInterface.init(context);
        }
        return authorityIndexers;
    }

    @Override
    public List<AuthorityIndexerInterface> createAuthorityIndexers(Context context, Item item) {
        final List<AuthorityIndexerInterface> authorityIndexers = createUninitialisedAuthorityIndexers();
        for (AuthorityIndexerInterface authorityIndexerInterface : authorityIndexers) {
            authorityIndexerInterface.init(context, item);
        }
        return authorityIndexers;
    }


    /**
     * Retrieve a list of uninitialized authority indexers, the init method needs to be called in order to use these.
     * @return a list of uninitialized authority indexers
     */
    @Override
    public List<AuthorityIndexerInterface> createUninitialisedAuthorityIndexers()
    {
        return new DSpace().getServiceManager().getServiceByName("indexerList",List.class);
    }

    public void setCachedAuthorityService(CachedAuthorityService cachedAuthorityService) {
        this.cachedAuthorityService = cachedAuthorityService;
    }
}
