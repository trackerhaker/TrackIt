//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.29 at 05:11:02 PM WET 
//


package com.henriquemalheiro.trackit.presentation.view.map.provider.heremaps.routes.routingcalculatematrix;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * A RouteLeg defines the portion of a route between two way points.
 * 
 * <p>Java class for RouteLegType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteLegType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Start" type="{http://www.navteq.com/lbsp/Routing-Common/4}WaypointType" minOccurs="0"/>
 *         &lt;element name="End" type="{http://www.navteq.com/lbsp/Routing-Common/4}WaypointType" minOccurs="0"/>
 *         &lt;element name="Length" type="{http://www.navteq.com/lbsp/Common/4}DistanceType" minOccurs="0"/>
 *         &lt;element name="TravelTime" type="{http://www.navteq.com/lbsp/Common/4}DurationType" minOccurs="0"/>
 *         &lt;element name="Maneuver" type="{http://www.navteq.com/lbsp/Routing-Common/4}ManeuverType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Link" type="{http://www.navteq.com/lbsp/Routing-Common/4}RouteLinkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BoundingBox" type="{http://www.navteq.com/lbsp/Common/4}GeoBoundingBoxType" minOccurs="0"/>
 *         &lt;element name="Shape" type="{http://www.navteq.com/lbsp/Common/4}GeoPolylineType" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element name="FirstPoint" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *           &lt;element name="LastPoint" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="TrafficTime" type="{http://www.navteq.com/lbsp/Common/4}DurationType" minOccurs="0"/>
 *         &lt;element name="BaseTime" type="{http://www.navteq.com/lbsp/Common/4}DurationType" minOccurs="0"/>
 *         &lt;element name="Summary" type="{http://www.navteq.com/lbsp/Routing-Common/4}RouteSummaryType" minOccurs="0"/>
 *         &lt;element name="SubLegSummary" type="{http://www.navteq.com/lbsp/Routing-Common/4}RouteSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteLegType", propOrder = {
    "start",
    "end",
    "length",
    "travelTime",
    "maneuver",
    "link",
    "boundingBox",
    "shape",
    "firstPoint",
    "lastPoint",
    "trafficTime",
    "baseTime",
    "summary",
    "subLegSummary"
})
public class RouteLegType {

    @XmlElement(name = "Start")
    protected WaypointType start;
    @XmlElement(name = "End")
    protected WaypointType end;
    @XmlElement(name = "Length")
    protected Double length;
    @XmlElement(name = "TravelTime")
    protected Double travelTime;
    @XmlElement(name = "Maneuver")
    protected List<ManeuverType> maneuver;
    @XmlElement(name = "Link")
    protected List<RouteLinkType> link;
    @XmlElement(name = "BoundingBox")
    protected GeoBoundingBoxType boundingBox;
    @XmlList
    @XmlElement(name = "Shape")
    protected List<String> shape;
    @XmlElement(name = "FirstPoint")
    protected Integer firstPoint;
    @XmlElement(name = "LastPoint")
    protected Integer lastPoint;
    @XmlElement(name = "TrafficTime")
    protected Double trafficTime;
    @XmlElement(name = "BaseTime")
    protected Double baseTime;
    @XmlElement(name = "Summary")
    protected RouteSummaryType summary;
    @XmlElement(name = "SubLegSummary")
    protected List<RouteSummaryType> subLegSummary;

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link WaypointType }
     *     
     */
    public WaypointType getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaypointType }
     *     
     */
    public void setStart(WaypointType value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link WaypointType }
     *     
     */
    public WaypointType getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaypointType }
     *     
     */
    public void setEnd(WaypointType value) {
        this.end = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLength(Double value) {
        this.length = value;
    }

    /**
     * Gets the value of the travelTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTravelTime() {
        return travelTime;
    }

    /**
     * Sets the value of the travelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTravelTime(Double value) {
        this.travelTime = value;
    }

    /**
     * Gets the value of the maneuver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maneuver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManeuver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManeuverType }
     * 
     * 
     */
    public List<ManeuverType> getManeuver() {
        if (maneuver == null) {
            maneuver = new ArrayList<ManeuverType>();
        }
        return this.maneuver;
    }

    /**
     * Gets the value of the link property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the link property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteLinkType }
     * 
     * 
     */
    public List<RouteLinkType> getLink() {
        if (link == null) {
            link = new ArrayList<RouteLinkType>();
        }
        return this.link;
    }

    /**
     * Gets the value of the boundingBox property.
     * 
     * @return
     *     possible object is
     *     {@link GeoBoundingBoxType }
     *     
     */
    public GeoBoundingBoxType getBoundingBox() {
        return boundingBox;
    }

    /**
     * Sets the value of the boundingBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoBoundingBoxType }
     *     
     */
    public void setBoundingBox(GeoBoundingBoxType value) {
        this.boundingBox = value;
    }

    /**
     * Gets the value of the shape property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shape property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShape().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getShape() {
        if (shape == null) {
            shape = new ArrayList<String>();
        }
        return this.shape;
    }

    /**
     * Gets the value of the firstPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirstPoint() {
        return firstPoint;
    }

    /**
     * Sets the value of the firstPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstPoint(Integer value) {
        this.firstPoint = value;
    }

    /**
     * Gets the value of the lastPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastPoint() {
        return lastPoint;
    }

    /**
     * Sets the value of the lastPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastPoint(Integer value) {
        this.lastPoint = value;
    }

    /**
     * Gets the value of the trafficTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTrafficTime() {
        return trafficTime;
    }

    /**
     * Sets the value of the trafficTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTrafficTime(Double value) {
        this.trafficTime = value;
    }

    /**
     * Gets the value of the baseTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseTime() {
        return baseTime;
    }

    /**
     * Sets the value of the baseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseTime(Double value) {
        this.baseTime = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link RouteSummaryType }
     *     
     */
    public RouteSummaryType getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteSummaryType }
     *     
     */
    public void setSummary(RouteSummaryType value) {
        this.summary = value;
    }

    /**
     * Gets the value of the subLegSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subLegSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubLegSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteSummaryType }
     * 
     * 
     */
    public List<RouteSummaryType> getSubLegSummary() {
        if (subLegSummary == null) {
            subLegSummary = new ArrayList<RouteSummaryType>();
        }
        return this.subLegSummary;
    }

}
