//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.29 at 05:11:02 PM WET 
//


package com.trackit.presentation.view.map.provider.here.routes.routingcalculatematrix;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicTransportActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PublicTransportActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="enter"/>
 *     &lt;enumeration value="leave"/>
 *     &lt;enumeration value="change"/>
 *     &lt;enumeration value="departStation"/>
 *     &lt;enumeration value="arriveStation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PublicTransportActionType")
@XmlEnum
public enum PublicTransportActionType {

    @XmlEnumValue("enter")
    ENTER("enter"),
    @XmlEnumValue("leave")
    LEAVE("leave"),
    @XmlEnumValue("change")
    CHANGE("change"),
    @XmlEnumValue("departStation")
    DEPART_STATION("departStation"),
    @XmlEnumValue("arriveStation")
    ARRIVE_STATION("arriveStation");
    private final String value;

    PublicTransportActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PublicTransportActionType fromValue(String v) {
        for (PublicTransportActionType c: PublicTransportActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
