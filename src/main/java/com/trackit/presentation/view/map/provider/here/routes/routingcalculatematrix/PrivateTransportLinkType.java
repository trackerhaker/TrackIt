//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.29 at 05:11:02 PM WET 
//


package com.trackit.presentation.view.map.provider.here.routes.routingcalculatematrix;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * A private transport link is a link traversed in a route using private transport as car, truck, pedestrian, etc.
 * 
 * <p>Java class for PrivateTransportLinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrivateTransportLinkType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.navteq.com/lbsp/Routing-Common/4}RouteLinkType">
 *       &lt;sequence>
 *         &lt;element name="SpeedLimit" type="{http://www.navteq.com/lbsp/Common/4}SpeedType" minOccurs="0"/>
 *         &lt;element name="DynamicSpeedInfo" type="{http://www.navteq.com/lbsp/Routing-Common/4}DynamicSpeedInfoType" minOccurs="0"/>
 *         &lt;element name="ExternalResource" type="{http://www.navteq.com/lbsp/Routing-Common/4}ExternalResourceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Flags" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.navteq.com/lbsp/Routing-Common/4}RouteLinkFlagType" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FreewayExit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreewayJunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TMCCodes" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.navteq.com/lbsp/Common/4}TMCCodeType" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FunctionalClass" type="{http://www.navteq.com/lbsp/Common/4}FunctionalClassType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.navteq.com/lbsp/Common/4}AddressType" minOccurs="0"/>
 *         &lt;element name="RoadNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Timezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Incident" type="{http://www.navteq.com/lbsp/Routing-Common/4}IncidentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CorridorLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Stubs" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.navteq.com/lbsp/Common/4}LinkIdType" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NavigationFlags" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.navteq.com/lbsp/Routing-Common/4}NavigationFlagType" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TruckRestrictions" type="{http://www.navteq.com/lbsp/Routing-Common/4}TruckRestrictionsType" minOccurs="0"/>
 *         &lt;element name="RoadName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuccessorLinkIds" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.navteq.com/lbsp/Common/4}LinkIdType" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PredecessorLinkIds" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.navteq.com/lbsp/Common/4}LinkIdType" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SpeedCategory" type="{http://www.navteq.com/lbsp/Common/4}SpeedCategoryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivateTransportLinkType", propOrder = {
    "speedLimit",
    "dynamicSpeedInfo",
    "externalResource",
    "flags",
    "freewayExit",
    "freewayJunction",
    "tmcCodes",
    "functionalClass",
    "address",
    "roadNumber",
    "timezone",
    "incident",
    "corridorLevel",
    "stubs",
    "navigationFlags",
    "truckRestrictions",
    "roadName",
    "successorLinkIds",
    "predecessorLinkIds",
    "speedCategory"
})
public class PrivateTransportLinkType
    extends RouteLinkType
{

    @XmlElement(name = "SpeedLimit")
    protected Double speedLimit;
    @XmlElement(name = "DynamicSpeedInfo")
    protected DynamicSpeedInfoType dynamicSpeedInfo;
    @XmlElement(name = "ExternalResource")
    protected List<ExternalResourceType> externalResource;
    @XmlList
    @XmlElement(name = "Flags")
    protected List<RouteLinkFlagType> flags;
    @XmlElement(name = "FreewayExit")
    protected String freewayExit;
    @XmlElement(name = "FreewayJunction")
    protected String freewayJunction;
    @XmlList
    @XmlElement(name = "TMCCodes")
    protected List<String> tmcCodes;
    @XmlElement(name = "FunctionalClass")
    protected Byte functionalClass;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "RoadNumber")
    protected String roadNumber;
    @XmlElement(name = "Timezone")
    protected String timezone;
    @XmlElement(name = "Incident")
    protected List<IncidentType> incident;
    @XmlElement(name = "CorridorLevel")
    protected Integer corridorLevel;
    @XmlList
    @XmlElement(name = "Stubs")
    protected List<String> stubs;
    @XmlList
    @XmlElement(name = "NavigationFlags")
    protected List<NavigationFlagType> navigationFlags;
    @XmlElement(name = "TruckRestrictions")
    protected TruckRestrictionsType truckRestrictions;
    @XmlElement(name = "RoadName")
    protected String roadName;
    @XmlList
    @XmlElement(name = "SuccessorLinkIds")
    protected List<String> successorLinkIds;
    @XmlList
    @XmlElement(name = "PredecessorLinkIds")
    protected List<String> predecessorLinkIds;
    @XmlElement(name = "SpeedCategory")
    protected SpeedCategoryType speedCategory;

    /**
     * Gets the value of the speedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpeedLimit() {
        return speedLimit;
    }

    /**
     * Sets the value of the speedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpeedLimit(Double value) {
        this.speedLimit = value;
    }

    /**
     * Gets the value of the dynamicSpeedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicSpeedInfoType }
     *     
     */
    public DynamicSpeedInfoType getDynamicSpeedInfo() {
        return dynamicSpeedInfo;
    }

    /**
     * Sets the value of the dynamicSpeedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicSpeedInfoType }
     *     
     */
    public void setDynamicSpeedInfo(DynamicSpeedInfoType value) {
        this.dynamicSpeedInfo = value;
    }

    /**
     * Gets the value of the externalResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalResourceType }
     * 
     * 
     */
    public List<ExternalResourceType> getExternalResource() {
        if (externalResource == null) {
            externalResource = new ArrayList<ExternalResourceType>();
        }
        return this.externalResource;
    }

    /**
     * Gets the value of the flags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteLinkFlagType }
     * 
     * 
     */
    public List<RouteLinkFlagType> getFlags() {
        if (flags == null) {
            flags = new ArrayList<RouteLinkFlagType>();
        }
        return this.flags;
    }

    /**
     * Gets the value of the freewayExit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreewayExit() {
        return freewayExit;
    }

    /**
     * Sets the value of the freewayExit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreewayExit(String value) {
        this.freewayExit = value;
    }

    /**
     * Gets the value of the freewayJunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreewayJunction() {
        return freewayJunction;
    }

    /**
     * Sets the value of the freewayJunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreewayJunction(String value) {
        this.freewayJunction = value;
    }

    /**
     * Gets the value of the tmcCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tmcCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTMCCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTMCCodes() {
        if (tmcCodes == null) {
            tmcCodes = new ArrayList<String>();
        }
        return this.tmcCodes;
    }

    /**
     * Gets the value of the functionalClass property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getFunctionalClass() {
        return functionalClass;
    }

    /**
     * Sets the value of the functionalClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setFunctionalClass(Byte value) {
        this.functionalClass = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the roadNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadNumber() {
        return roadNumber;
    }

    /**
     * Sets the value of the roadNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadNumber(String value) {
        this.roadNumber = value;
    }

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
    }

    /**
     * Gets the value of the incident property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incident property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncident().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncidentType }
     * 
     * 
     */
    public List<IncidentType> getIncident() {
        if (incident == null) {
            incident = new ArrayList<IncidentType>();
        }
        return this.incident;
    }

    /**
     * Gets the value of the corridorLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCorridorLevel() {
        return corridorLevel;
    }

    /**
     * Sets the value of the corridorLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCorridorLevel(Integer value) {
        this.corridorLevel = value;
    }

    /**
     * Gets the value of the stubs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stubs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStubs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStubs() {
        if (stubs == null) {
            stubs = new ArrayList<String>();
        }
        return this.stubs;
    }

    /**
     * Gets the value of the navigationFlags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the navigationFlags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNavigationFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NavigationFlagType }
     * 
     * 
     */
    public List<NavigationFlagType> getNavigationFlags() {
        if (navigationFlags == null) {
            navigationFlags = new ArrayList<NavigationFlagType>();
        }
        return this.navigationFlags;
    }

    /**
     * Gets the value of the truckRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link TruckRestrictionsType }
     *     
     */
    public TruckRestrictionsType getTruckRestrictions() {
        return truckRestrictions;
    }

    /**
     * Sets the value of the truckRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TruckRestrictionsType }
     *     
     */
    public void setTruckRestrictions(TruckRestrictionsType value) {
        this.truckRestrictions = value;
    }

    /**
     * Gets the value of the roadName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadName() {
        return roadName;
    }

    /**
     * Sets the value of the roadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadName(String value) {
        this.roadName = value;
    }

    /**
     * Gets the value of the successorLinkIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the successorLinkIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccessorLinkIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSuccessorLinkIds() {
        if (successorLinkIds == null) {
            successorLinkIds = new ArrayList<String>();
        }
        return this.successorLinkIds;
    }

    /**
     * Gets the value of the predecessorLinkIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predecessorLinkIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredecessorLinkIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPredecessorLinkIds() {
        if (predecessorLinkIds == null) {
            predecessorLinkIds = new ArrayList<String>();
        }
        return this.predecessorLinkIds;
    }

    /**
     * Gets the value of the speedCategory property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedCategoryType }
     *     
     */
    public SpeedCategoryType getSpeedCategory() {
        return speedCategory;
    }

    /**
     * Sets the value of the speedCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedCategoryType }
     *     
     */
    public void setSpeedCategory(SpeedCategoryType value) {
        this.speedCategory = value;
    }

}