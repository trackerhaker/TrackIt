//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.29 at 05:12:22 PM WET 
//


package com.trackit.presentation.view.map.provider.here.routes.routingcommon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * The routing mode encapsulates the parameters for one route calculation.
 * 
 * <p>Java class for RoutingModeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingModeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.navteq.com/lbsp/Routing-Common/4}RoutingTypeType"/>
 *         &lt;element name="TransportModes" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.navteq.com/lbsp/Routing-Common/4}TransportModeType" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TrafficMode" type="{http://www.navteq.com/lbsp/Routing-Common/4}TrafficModeType" minOccurs="0"/>
 *         &lt;element name="Feature" type="{http://www.navteq.com/lbsp/Routing-Common/4}WeightedRouteFeatureType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingModeType", propOrder = {
    "type",
    "transportModes",
    "trafficMode",
    "feature"
})
public class RoutingModeType {

    @XmlElement(name = "Type", required = true)
    protected RoutingTypeType type;
    @XmlList
    @XmlElement(name = "TransportModes")
    protected List<TransportModeType> transportModes;
    @XmlElement(name = "TrafficMode")
    protected TrafficModeType trafficMode;
    @XmlElement(name = "Feature")
    protected List<WeightedRouteFeatureType> feature;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingTypeType }
     *     
     */
    public RoutingTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingTypeType }
     *     
     */
    public void setType(RoutingTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the transportModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportModeType }
     * 
     * 
     */
    public List<TransportModeType> getTransportModes() {
        if (transportModes == null) {
            transportModes = new ArrayList<TransportModeType>();
        }
        return this.transportModes;
    }

    /**
     * Gets the value of the trafficMode property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficModeType }
     *     
     */
    public TrafficModeType getTrafficMode() {
        return trafficMode;
    }

    /**
     * Sets the value of the trafficMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficModeType }
     *     
     */
    public void setTrafficMode(TrafficModeType value) {
        this.trafficMode = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeightedRouteFeatureType }
     * 
     * 
     */
    public List<WeightedRouteFeatureType> getFeature() {
        if (feature == null) {
            feature = new ArrayList<WeightedRouteFeatureType>();
        }
        return this.feature;
    }

}