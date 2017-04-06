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
// Generated on: 2012.08.13 at 04:58:08 PM BST 
//

package org.orcid.jaxb.model.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}funding-external-identifier-type"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}funding-external-identifier-value"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}funding-external-identifier-url" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}put-code"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "type", "value", "url" })
@XmlRootElement(name = "funding-external-identifier")
@JsonIgnoreProperties({ "relationship" })
public class FundingExternalIdentifier implements Serializable {
	private static final long serialVersionUID = 1L;	
	@XmlElement(name="funding-external-identifier-type")
	protected FundingExternalIdentifierType type;
	@XmlElement(name="funding-external-identifier-value")
	protected String value;
	@XmlElement(name="funding-external-identifier-url")
	protected Url url;
	
	public FundingExternalIdentifierType getType() {
		return type;
	}
	public void setType(FundingExternalIdentifierType type) {
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Url getUrl() {
		return url;
	}
	public void setUrl(Url url) {
		this.url = url;
	}	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		FundingExternalIdentifier other = (FundingExternalIdentifier) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}		
}
