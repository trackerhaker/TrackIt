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
 * <p>Java class for PublicTransportLinkFlagType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PublicTransportLinkFlagType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="barrierFree"/>
 *     &lt;enumeration value="bicycleAllowed"/>
 *     &lt;enumeration value="lowFloorVehicle"/>
 *     &lt;enumeration value="physicalDisabilityAccess"/>
 *     &lt;enumeration value="restaurantEquipped"/>
 *     &lt;enumeration value="snackBarEquipped"/>
 *     &lt;enumeration value="airConditioned"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PublicTransportLinkFlagType")
@XmlEnum
public enum PublicTransportLinkFlagType {

    @XmlEnumValue("barrierFree")
    BARRIER_FREE("barrierFree"),
    @XmlEnumValue("bicycleAllowed")
    BICYCLE_ALLOWED("bicycleAllowed"),
    @XmlEnumValue("lowFloorVehicle")
    LOW_FLOOR_VEHICLE("lowFloorVehicle"),
    @XmlEnumValue("physicalDisabilityAccess")
    PHYSICAL_DISABILITY_ACCESS("physicalDisabilityAccess"),
    @XmlEnumValue("restaurantEquipped")
    RESTAURANT_EQUIPPED("restaurantEquipped"),
    @XmlEnumValue("snackBarEquipped")
    SNACK_BAR_EQUIPPED("snackBarEquipped"),
    @XmlEnumValue("airConditioned")
    AIR_CONDITIONED("airConditioned");
    private final String value;

    PublicTransportLinkFlagType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PublicTransportLinkFlagType fromValue(String v) {
        for (PublicTransportLinkFlagType c: PublicTransportLinkFlagType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
