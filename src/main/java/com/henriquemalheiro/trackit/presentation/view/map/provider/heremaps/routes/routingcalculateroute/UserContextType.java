//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.29 at 05:11:32 PM WET 
//


package com.henriquemalheiro.trackit.presentation.view.map.provider.heremaps.routes.routingcalculateroute;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The user context provides information about the user's position and the map view he is looking at.
 * 
 * <p>Java class for UserContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserContextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Position" type="{http://www.navteq.com/lbsp/Common/4}GeoPositionType" minOccurs="0"/>
 *         &lt;element name="MapView" type="{http://www.navteq.com/lbsp/Common/4}GeoBoundingBoxType" minOccurs="0"/>
 *         &lt;element name="ViewResolution" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.navteq.com/lbsp/Common/4}CountryCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserContextType", namespace = "http://www.navteq.com/lbsp/Common/4", propOrder = {
    "position",
    "mapView",
    "viewResolution",
    "country"
})
public class UserContextType {

    @XmlElement(name = "Position")
    protected GeoPositionType position;
    @XmlElement(name = "MapView")
    protected GeoBoundingBoxType mapView;
    @XmlElement(name = "ViewResolution")
    protected Integer viewResolution;
    @XmlElement(name = "Country")
    protected String country;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link GeoPositionType }
     *     
     */
    public GeoPositionType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoPositionType }
     *     
     */
    public void setPosition(GeoPositionType value) {
        this.position = value;
    }

    /**
     * Gets the value of the mapView property.
     * 
     * @return
     *     possible object is
     *     {@link GeoBoundingBoxType }
     *     
     */
    public GeoBoundingBoxType getMapView() {
        return mapView;
    }

    /**
     * Sets the value of the mapView property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoBoundingBoxType }
     *     
     */
    public void setMapView(GeoBoundingBoxType value) {
        this.mapView = value;
    }

    /**
     * Gets the value of the viewResolution property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getViewResolution() {
        return viewResolution;
    }

    /**
     * Sets the value of the viewResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setViewResolution(Integer value) {
        this.viewResolution = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

}
