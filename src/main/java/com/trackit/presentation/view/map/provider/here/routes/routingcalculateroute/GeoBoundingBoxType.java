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
 * As the bounding box is specified by its top-left and bottom-right corner the box, it is not necessarily the smallest rectangle spanned by these two points; it is possible to define bounding boxes that are wider than 180 degrees or higher than 90 degrees (e.g. by setting the longitude of top-left corner to a bigger value than the longitude of the bottom-right corner). A bounding box with longitude of  180 degrees for the top-left corner and a longitude of 180 degrees for the bottom-right corner constructs an area that encircles the globe whereas a bounding box with the same longitude values for both corners constructs a bounding box of width 0 degrees.
 * 
 * <p>Java class for GeoBoundingBoxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoBoundingBoxType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.navteq.com/lbsp/Common/4}GeoAreaType">
 *       &lt;sequence>
 *         &lt;element name="TopLeft" type="{http://www.navteq.com/lbsp/Common/4}GeoCoordinateType"/>
 *         &lt;element name="BottomRight" type="{http://www.navteq.com/lbsp/Common/4}GeoCoordinateType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoBoundingBoxType", namespace = "http://www.navteq.com/lbsp/Common/4", propOrder = {
    "topLeft",
    "bottomRight"
})
public class GeoBoundingBoxType
    extends GeoAreaType
{

    @XmlElement(name = "TopLeft", required = true)
    protected GeoCoordinateType topLeft;
    @XmlElement(name = "BottomRight", required = true)
    protected GeoCoordinateType bottomRight;

    /**
     * Gets the value of the topLeft property.
     * 
     * @return
     *     possible object is
     *     {@link GeoCoordinateType }
     *     
     */
    public GeoCoordinateType getTopLeft() {
        return topLeft;
    }

    /**
     * Sets the value of the topLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoCoordinateType }
     *     
     */
    public void setTopLeft(GeoCoordinateType value) {
        this.topLeft = value;
    }

    /**
     * Gets the value of the bottomRight property.
     * 
     * @return
     *     possible object is
     *     {@link GeoCoordinateType }
     *     
     */
    public GeoCoordinateType getBottomRight() {
        return bottomRight;
    }

    /**
     * Sets the value of the bottomRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoCoordinateType }
     *     
     */
    public void setBottomRight(GeoCoordinateType value) {
        this.bottomRight = value;
    }

}
