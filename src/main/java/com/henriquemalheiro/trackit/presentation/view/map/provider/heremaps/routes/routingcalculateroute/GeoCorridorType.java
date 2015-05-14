//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.29 at 05:11:32 PM WET 
//


package com.henriquemalheiro.trackit.presentation.view.map.provider.heremaps.routes.routingcalculateroute;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * A GeoCorridor is the two-dimensional area consisting of all points within a given width of a line.
 * 
 * <p>Java class for GeoCorridorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoCorridorType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.navteq.com/lbsp/Common/4}GeoAreaType">
 *       &lt;sequence>
 *         &lt;element name="Line" type="{http://www.navteq.com/lbsp/Common/4}GeoPolylineType"/>
 *         &lt;element name="Width" type="{http://www.navteq.com/lbsp/Common/4}DistanceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoCorridorType", namespace = "http://www.navteq.com/lbsp/Common/4", propOrder = {
    "line",
    "width"
})
public class GeoCorridorType
    extends GeoAreaType
{

    @XmlList
    @XmlElement(name = "Line", required = true)
    protected List<String> line;
    @XmlElement(name = "Width")
    protected Double width;

    /**
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLine() {
        if (line == null) {
            line = new ArrayList<String>();
        }
        return this.line;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWidth(Double value) {
        this.width = value;
    }

}
