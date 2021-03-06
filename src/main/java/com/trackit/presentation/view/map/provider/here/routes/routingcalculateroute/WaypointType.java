//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.29 at 05:11:32 PM WET 
//


package com.trackit.presentation.view.map.provider.here.routes.routingcalculateroute;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A waypoint can represent both a position exactly specified by LinkId as well as the result of a map matching.
 * In the first case the mappedPosition attribute will not be filled.
 * 
 * <p>Java class for WaypointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaypointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LinkId" type="{http://www.navteq.com/lbsp/Common/4}LinkIdType"/>
 *         &lt;element name="MappedPosition" type="{http://www.navteq.com/lbsp/Common/4}GeoCoordinateType"/>
 *         &lt;element name="OriginalPosition" type="{http://www.navteq.com/lbsp/Common/4}GeoCoordinateType" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.navteq.com/lbsp/Routing-Common/4}WaypointParameterTypeType" minOccurs="0"/>
 *         &lt;element name="StopId" type="{http://www.navteq.com/lbsp/Common/4}TransitStopIdType" minOccurs="0"/>
 *         &lt;element name="MatchQuality" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Spot" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SideOfStreet" type="{http://www.navteq.com/lbsp/Common/4}SideOfStreetType" minOccurs="0"/>
 *         &lt;element name="MappedRoadName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityType" type="{http://www.navteq.com/lbsp/Routing-Common/4}WaypointParameterEntityTypeType" minOccurs="0"/>
 *         &lt;element name="EntityDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShapeIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Waypoint", propOrder = {
    "linkId",
    "mappedPosition",
    "originalPosition",
    "type",
    "stopId",
    "matchQuality",
    "spot",
    "sideOfStreet",
    "mappedRoadName",
    "label",
    "userLabel",
    "entityType",
    "entityDetails",
    "shapeIndex"
})
public class WaypointType {

    @XmlElement(name = "LinkId", required = true)
    protected String linkId;
    @XmlElement(name = "MappedPosition", required = true)
    protected GeoCoordinateType mappedPosition;
    @XmlElement(name = "OriginalPosition")
    protected GeoCoordinateType originalPosition;
    @XmlElement(name = "Type")
    protected WaypointParameterTypeType type;
    @XmlElement(name = "StopId")
    protected String stopId;
    @XmlElement(name = "MatchQuality")
    protected Float matchQuality;
    @XmlElement(name = "Spot")
    protected Double spot;
    @XmlElement(name = "SideOfStreet")
    protected SideOfStreetType sideOfStreet;
    @XmlElement(name = "MappedRoadName")
    protected String mappedRoadName;
    @XmlElement(name = "Label")
    protected String label;
    @XmlElement(name = "UserLabel")
    protected String userLabel;
    @XmlElement(name = "EntityType")
    protected WaypointParameterEntityTypeType entityType;
    @XmlElement(name = "EntityDetails")
    protected String entityDetails;
    @XmlElement(name = "ShapeIndex")
    protected Integer shapeIndex;

    /**
     * Gets the value of the linkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkId() {
        return linkId;
    }

    /**
     * Sets the value of the linkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkId(String value) {
        this.linkId = value;
    }

    /**
     * Gets the value of the mappedPosition property.
     * 
     * @return
     *     possible object is
     *     {@link GeoCoordinateType }
     *     
     */
    public GeoCoordinateType getMappedPosition() {
        return mappedPosition;
    }

    /**
     * Sets the value of the mappedPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoCoordinateType }
     *     
     */
    public void setMappedPosition(GeoCoordinateType value) {
        this.mappedPosition = value;
    }

    /**
     * Gets the value of the originalPosition property.
     * 
     * @return
     *     possible object is
     *     {@link GeoCoordinateType }
     *     
     */
    public GeoCoordinateType getOriginalPosition() {
        return originalPosition;
    }

    /**
     * Sets the value of the originalPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoCoordinateType }
     *     
     */
    public void setOriginalPosition(GeoCoordinateType value) {
        this.originalPosition = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link WaypointParameterTypeType }
     *     
     */
    public WaypointParameterTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaypointParameterTypeType }
     *     
     */
    public void setType(WaypointParameterTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the stopId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopId() {
        return stopId;
    }

    /**
     * Sets the value of the stopId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopId(String value) {
        this.stopId = value;
    }

    /**
     * Gets the value of the matchQuality property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMatchQuality() {
        return matchQuality;
    }

    /**
     * Sets the value of the matchQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMatchQuality(Float value) {
        this.matchQuality = value;
    }

    /**
     * Gets the value of the spot property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpot() {
        return spot;
    }

    /**
     * Sets the value of the spot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpot(Double value) {
        this.spot = value;
    }

    /**
     * Gets the value of the sideOfStreet property.
     * 
     * @return
     *     possible object is
     *     {@link SideOfStreetType }
     *     
     */
    public SideOfStreetType getSideOfStreet() {
        return sideOfStreet;
    }

    /**
     * Sets the value of the sideOfStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SideOfStreetType }
     *     
     */
    public void setSideOfStreet(SideOfStreetType value) {
        this.sideOfStreet = value;
    }

    /**
     * Gets the value of the mappedRoadName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappedRoadName() {
        return mappedRoadName;
    }

    /**
     * Sets the value of the mappedRoadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappedRoadName(String value) {
        this.mappedRoadName = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the userLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLabel() {
        return userLabel;
    }

    /**
     * Sets the value of the userLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLabel(String value) {
        this.userLabel = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link WaypointParameterEntityTypeType }
     *     
     */
    public WaypointParameterEntityTypeType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaypointParameterEntityTypeType }
     *     
     */
    public void setEntityType(WaypointParameterEntityTypeType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the entityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityDetails() {
        return entityDetails;
    }

    /**
     * Sets the value of the entityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityDetails(String value) {
        this.entityDetails = value;
    }

    /**
     * Gets the value of the shapeIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShapeIndex() {
        return shapeIndex;
    }

    /**
     * Sets the value of the shapeIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShapeIndex(Integer value) {
        this.shapeIndex = value;
    }

}
