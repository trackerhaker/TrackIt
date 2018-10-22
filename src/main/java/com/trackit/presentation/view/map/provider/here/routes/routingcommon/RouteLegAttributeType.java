//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.29 at 05:12:22 PM WET 
//


package com.trackit.presentation.view.map.provider.here.routes.routingcommon;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteLegAttributeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RouteLegAttributeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="waypoint"/>
 *     &lt;enumeration value="maneuvers"/>
 *     &lt;enumeration value="links"/>
 *     &lt;enumeration value="length"/>
 *     &lt;enumeration value="travelTime"/>
 *     &lt;enumeration value="shape"/>
 *     &lt;enumeration value="indices"/>
 *     &lt;enumeration value="compressedShapes"/>
 *     &lt;enumeration value="boundingBox"/>
 *     &lt;enumeration value="baseTime"/>
 *     &lt;enumeration value="trafficTime"/>
 *     &lt;enumeration value="summary"/>
 *     &lt;enumeration value="subLegSummaries"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RouteLegAttributeType")
@XmlEnum
public enum RouteLegAttributeType {


    /**
     * Short value: "wp". Indicates whether the waypoint shall be included in the route leg.
     * 
     */
    @XmlEnumValue("waypoint")
    WAYPOINT("waypoint"),

    /**
     * Short value: "mn". Indicates whether the maneuvers of the route leg shall be provided.
     * 
     */
    @XmlEnumValue("maneuvers")
    MANEUVERS("maneuvers"),

    /**
     * Short value: "li". Indicates whether the links along the route leg shall be provided.
     * 
     */
    @XmlEnumValue("links")
    LINKS("links"),

    /**
     * Short value: "le". Indicates whether the route leg should include its length
     * 
     */
    @XmlEnumValue("length")
    LENGTH("length"),

    /**
     * Short value: "tt". Indicates whether the route leg should include its duration
     * 
     */
    @XmlEnumValue("travelTime")
    TRAVEL_TIME("travelTime"),

    /**
     * Short value: "sh". Indicates whether the shape of the segment to the next maneuver should be included in the maneuvers.
     * 
     */
    @XmlEnumValue("shape")
    SHAPE("shape"),

    /**
     * Short value: "ix": Indicates whether shape index information (FirstPoint, LastPoint) should be included in the maneuvers instead of copying shape points to the maneuver.
     * 
     */
    @XmlEnumValue("indices")
    INDICES("indices"),

    /**
     * Short value: "sz": Indicates whether compressed shape information should be included in the route leg. Shape compression may considerably reduce the amount of data transferred.
     * 
     */
    @XmlEnumValue("compressedShapes")
    COMPRESSED_SHAPES("compressedShapes"),

    /**
     * Short value: "bb". Indicates whether the bounding box of the maneuver shall be provided.
     * 
     */
    @XmlEnumValue("boundingBox")
    BOUNDING_BOX("boundingBox"),

    /**
     * Short value: "bt": Indicates whether the BaseTime information should be provided in RouteLegs.
     * 
     */
    @XmlEnumValue("baseTime")
    BASE_TIME("baseTime"),

    /**
     * Short value: "tm": Indicates whether the TrafficTime information should be included in RouteLegs.
     * 
     */
    @XmlEnumValue("trafficTime")
    TRAFFIC_TIME("trafficTime"),

    /**
     * Short value: "sm": Indicates whether distance and time summary information should be included in RouteLegs.
     * 
     */
    @XmlEnumValue("summary")
    SUMMARY("summary"),

    /**
     * Short value: "sl": Indicates whether sub leg summaries should be included in RouteLegs. Sub legs are defined by the usage of passThrough waypoints.
     * 
     */
    @XmlEnumValue("subLegSummaries")
    SUB_LEG_SUMMARIES("subLegSummaries");
    private final String value;

    RouteLegAttributeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RouteLegAttributeType fromValue(String v) {
        for (RouteLegAttributeType c: RouteLegAttributeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}