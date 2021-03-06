//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.29 at 05:09:22 PM WET 
//


package com.trackit.presentation.view.map.provider.here.routes.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A proximity represents a circular area.
 * 
 * <p>Java class for GeoProximityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoProximityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.navteq.com/lbsp/Common/4}GeoAreaType">
 *       &lt;sequence>
 *         &lt;element name="Center" type="{http://www.navteq.com/lbsp/Common/4}GeoCoordinateType"/>
 *         &lt;element name="Radius" type="{http://www.navteq.com/lbsp/Common/4}DistanceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoProximityType", propOrder = {
    "center",
    "radius"
})
public class GeoProximityType
    extends GeoAreaType
{

    @XmlElement(name = "Center", required = true)
    protected GeoCoordinateType center;
    @XmlElement(name = "Radius")
    protected Double radius;

    /**
     * Gets the value of the center property.
     * 
     * @return
     *     possible object is
     *     {@link GeoCoordinateType }
     *     
     */
    public GeoCoordinateType getCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoCoordinateType }
     *     
     */
    public void setCenter(GeoCoordinateType value) {
        this.center = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRadius(Double value) {
        this.radius = value;
    }

}
