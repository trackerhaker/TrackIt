//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.29 at 05:12:22 PM WET 
//


package com.henriquemalheiro.trackit.presentation.view.map.provider.heremaps.routes.routingcommon;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The corridor tolerance level allows to specify the number of wrong turns the user is allowed to deviate from the base route with the corridor still being available.
 * The level is defined only for the area specified in the area attribute, e.g. for the start or the destination of the route.
 * 
 * <p>Java class for CorridorToleranceLevelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorridorToleranceLevelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Area" type="{http://www.navteq.com/lbsp/Routing-Common/4}CorridorAreaType" minOccurs="0"/>
 *         &lt;element name="AreaRadius" type="{http://www.navteq.com/lbsp/Common/4}DistanceType" minOccurs="0"/>
 *         &lt;element name="LevelMajorNetwork" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="LevelMinorNetwork" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorridorToleranceLevelType", propOrder = {
    "area",
    "areaRadius",
    "levelMajorNetwork",
    "levelMinorNetwork"
})
public class CorridorToleranceLevelType {

    @XmlElement(name = "Area")
    protected CorridorAreaType area;
    @XmlElement(name = "AreaRadius")
    protected Double areaRadius;
    @XmlElement(name = "LevelMajorNetwork")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger levelMajorNetwork;
    @XmlElement(name = "LevelMinorNetwork")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger levelMinorNetwork;

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link CorridorAreaType }
     *     
     */
    public CorridorAreaType getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorridorAreaType }
     *     
     */
    public void setArea(CorridorAreaType value) {
        this.area = value;
    }

    /**
     * Gets the value of the areaRadius property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAreaRadius() {
        return areaRadius;
    }

    /**
     * Sets the value of the areaRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAreaRadius(Double value) {
        this.areaRadius = value;
    }

    /**
     * Gets the value of the levelMajorNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevelMajorNetwork() {
        return levelMajorNetwork;
    }

    /**
     * Sets the value of the levelMajorNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevelMajorNetwork(BigInteger value) {
        this.levelMajorNetwork = value;
    }

    /**
     * Gets the value of the levelMinorNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevelMinorNetwork() {
        return levelMinorNetwork;
    }

    /**
     * Sets the value of the levelMinorNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevelMinorNetwork(BigInteger value) {
        this.levelMinorNetwork = value;
    }

}
