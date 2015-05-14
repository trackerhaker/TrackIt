//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.29 at 05:12:22 PM WET 
//


package com.henriquemalheiro.trackit.presentation.view.map.provider.heremaps.routes.routingcommon;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpeedCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpeedCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SC1"/>
 *     &lt;enumeration value="SC2"/>
 *     &lt;enumeration value="SC3"/>
 *     &lt;enumeration value="SC4"/>
 *     &lt;enumeration value="SC5"/>
 *     &lt;enumeration value="SC6"/>
 *     &lt;enumeration value="SC7"/>
 *     &lt;enumeration value="SC8"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpeedCategoryType", namespace = "http://www.navteq.com/lbsp/Common/4")
@XmlEnum
public enum SpeedCategoryType {


    /**
     * >130 km/h / >80 MPH
     * 
     */
    @XmlEnumValue("SC1")
    SC_1("SC1"),

    /**
     *  101-130 km/h / 65-80 MPH
     * 
     */
    @XmlEnumValue("SC2")
    SC_2("SC2"),

    /**
     *  91-100 km/h / 55-64 MPH
     * 
     */
    @XmlEnumValue("SC3")
    SC_3("SC3"),

    /**
     *  71-90 km/h / 41-54 MPH
     * 
     */
    @XmlEnumValue("SC4")
    SC_4("SC4"),

    /**
     *  51-70 km/h / 31-40 MPH
     * 
     */
    @XmlEnumValue("SC5")
    SC_5("SC5"),

    /**
     *  31-50 km/h / 21-30 MPH
     * 
     */
    @XmlEnumValue("SC6")
    SC_6("SC6"),

    /**
     *  11-30 km/h / 6-20 MPH
     * 
     */
    @XmlEnumValue("SC7")
    SC_7("SC7"),

    /**
     * <11 km/h / <6 MPH
     * 
     */
    @XmlEnumValue("SC8")
    SC_8("SC8");
    private final String value;

    SpeedCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpeedCategoryType fromValue(String v) {
        for (SpeedCategoryType c: SpeedCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
