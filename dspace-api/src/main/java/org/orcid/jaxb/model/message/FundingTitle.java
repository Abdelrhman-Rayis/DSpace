/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2014 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.09 at 01:52:56 PM BST 
//

package org.orcid.jaxb.model.message;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}title" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}translated-title" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = { "title", "translatedTitle" })
@XmlRootElement(name = "funding-title")
public class FundingTitle implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    protected Title title;
    @XmlElement(name = "translated-title")
    protected TranslatedTitle translatedTitle;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link org.orcid.jaxb.model.message.Title }
     *
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value
     *     allowed object is
     *     {@link org.orcid.jaxb.model.message.Title }
     *     
     */
    public void setTitle(Title value) {
        this.title = value;
    }    
    
    /**
     * Gets the value of the translatedTitle property.
     * 
     * @return
     *     possible object is
     *     {@link translatedTitle }
     *     
     */
    public TranslatedTitle getTranslatedTitle() {
        return translatedTitle;
    }

    /**
     * Sets the value of the translatedTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link translatedTitle }
     *     
     */
    public void setTranslatedTitle(TranslatedTitle translatedTitle) {
        this.translatedTitle = translatedTitle;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((translatedTitle == null) ? 0 : translatedTitle.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FundingTitle other = (FundingTitle) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        
        if(translatedTitle == null){
            if(other.translatedTitle != null)
                return false;
        } else if(!translatedTitle.equals(other.translatedTitle))
            return false;
        
        return true;
    }

}
