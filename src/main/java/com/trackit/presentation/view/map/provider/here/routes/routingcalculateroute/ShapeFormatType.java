//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.29 at 05:11:32 PM WET 
//


package com.trackit.presentation.view.map.provider.here.routes.routingcalculateroute;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShapeFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShapeFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WKT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShapeFormatType", namespace = "http://www.navteq.com/lbsp/Common/4")
@XmlEnum
public enum ShapeFormatType {


    /**
     * Identifier for Well-known text (WKT)
     * 
     */
    WKT;

    public String value() {
        return name();
    }

    public static ShapeFormatType fromValue(String v) {
        return valueOf(v);
    }

}