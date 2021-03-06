//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.29 at 05:11:32 PM WET 
//


package com.trackit.presentation.view.map.provider.here.routes.routingcalculateroute;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteAttributeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RouteAttributeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="waypoints"/>
 *     &lt;enumeration value="summary"/>
 *     &lt;enumeration value="summaryByCountry"/>
 *     &lt;enumeration value="shape"/>
 *     &lt;enumeration value="boundingBox"/>
 *     &lt;enumeration value="legs"/>
 *     &lt;enumeration value="notes"/>
 *     &lt;enumeration value="lines"/>
 *     &lt;enumeration value="compressedShapes"/>
 *     &lt;enumeration value="groups"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RouteAttributeType")
@XmlEnum
public enum RouteAttributeType {


    /**
     * Short value: "wp". Indicates whether via points shall be included in the route.
     * 
     */
    @XmlEnumValue("waypoints")
    WAYPOINTS("waypoints"),

    /**
     * Short value: "sm": Indicates whether a route summary shall be provided for the route.
     * 
     */
    @XmlEnumValue("summary")
    SUMMARY("summary"),

    /**
     * Short value: "sc". Indicates whether a country-based route summary shall be provided for the route.
     * 
     */
    @XmlEnumValue("summaryByCountry")
    SUMMARY_BY_COUNTRY("summaryByCountry"),

    /**
     * Short value: "sh". Indicates whether the shape of the route shall be provided for the route.
     * 
     */
    @XmlEnumValue("shape")
    SHAPE("shape"),

    /**
     * Short value: "bb". Indicates whether the bounding box of the route shall be provided for the route.
     * 
     */
    @XmlEnumValue("boundingBox")
    BOUNDING_BOX("boundingBox"),

    /**
     * Short value: "lg". Indicates whether the legs of the route shall be provided for the route.
     * 
     */
    @XmlEnumValue("legs")
    LEGS("legs"),

    /**
     * Short value: "no". Indicates whether additional notes shall be provided for the route.
     * 
     */
    @XmlEnumValue("notes")
    NOTES("notes"),

    /**
     * Short value: "li". Indicates whether PublicTransportLines shall be provided for the route.
     * 
     */
    @XmlEnumValue("lines")
    LINES("lines"),

    /**
     * Short value: "sz": Indicates whether compressed shape information should be included in the route. Shape compression may considerably reduce the amount of data transferred.
     * 
     */
    @XmlEnumValue("compressedShapes")
    COMPRESSED_SHAPES("compressedShapes"),

    /**
     * Short value: "gr": Indicates whether Maneuver Groups should be included in the route. Maneuver Groups are mainly useful for multi modal routes
     * 
     */
    @XmlEnumValue("groups")
    GROUPS("groups");
    private final String value;

    RouteAttributeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RouteAttributeType fromValue(String v) {
        for (RouteAttributeType c: RouteAttributeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
