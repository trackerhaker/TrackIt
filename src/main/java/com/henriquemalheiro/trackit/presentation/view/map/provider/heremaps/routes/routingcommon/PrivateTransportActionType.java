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
 * <p>Java class for PrivateTransportActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrivateTransportActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="depart"/>
 *     &lt;enumeration value="departAirport"/>
 *     &lt;enumeration value="arrive"/>
 *     &lt;enumeration value="arriveAirport"/>
 *     &lt;enumeration value="arriveLeft"/>
 *     &lt;enumeration value="arriveRight"/>
 *     &lt;enumeration value="leftLoop"/>
 *     &lt;enumeration value="leftUTurn"/>
 *     &lt;enumeration value="sharpLeftTurn"/>
 *     &lt;enumeration value="leftTurn"/>
 *     &lt;enumeration value="slightLeftTurn"/>
 *     &lt;enumeration value="continue"/>
 *     &lt;enumeration value="slightRightTurn"/>
 *     &lt;enumeration value="rightTurn"/>
 *     &lt;enumeration value="sharpRightTurn"/>
 *     &lt;enumeration value="rightUTurn"/>
 *     &lt;enumeration value="rightLoop"/>
 *     &lt;enumeration value="leftExit"/>
 *     &lt;enumeration value="rightExit"/>
 *     &lt;enumeration value="leftRamp"/>
 *     &lt;enumeration value="rightRamp"/>
 *     &lt;enumeration value="leftFork"/>
 *     &lt;enumeration value="middleFork"/>
 *     &lt;enumeration value="rightFork"/>
 *     &lt;enumeration value="leftMerge"/>
 *     &lt;enumeration value="rightMerge"/>
 *     &lt;enumeration value="nameChange"/>
 *     &lt;enumeration value="trafficCircle"/>
 *     &lt;enumeration value="ferry"/>
 *     &lt;enumeration value="leftRoundaboutEnter"/>
 *     &lt;enumeration value="rightRoundaboutEnter"/>
 *     &lt;enumeration value="leftRoundaboutPass"/>
 *     &lt;enumeration value="rightRoundaboutPass"/>
 *     &lt;enumeration value="leftRoundaboutExit1"/>
 *     &lt;enumeration value="leftRoundaboutExit2"/>
 *     &lt;enumeration value="leftRoundaboutExit3"/>
 *     &lt;enumeration value="leftRoundaboutExit4"/>
 *     &lt;enumeration value="leftRoundaboutExit5"/>
 *     &lt;enumeration value="leftRoundaboutExit6"/>
 *     &lt;enumeration value="leftRoundaboutExit7"/>
 *     &lt;enumeration value="leftRoundaboutExit8"/>
 *     &lt;enumeration value="leftRoundaboutExit9"/>
 *     &lt;enumeration value="leftRoundaboutExit10"/>
 *     &lt;enumeration value="leftRoundaboutExit11"/>
 *     &lt;enumeration value="leftRoundaboutExit12"/>
 *     &lt;enumeration value="rightRoundaboutExit1"/>
 *     &lt;enumeration value="rightRoundaboutExit2"/>
 *     &lt;enumeration value="rightRoundaboutExit3"/>
 *     &lt;enumeration value="rightRoundaboutExit4"/>
 *     &lt;enumeration value="rightRoundaboutExit5"/>
 *     &lt;enumeration value="rightRoundaboutExit6"/>
 *     &lt;enumeration value="rightRoundaboutExit7"/>
 *     &lt;enumeration value="rightRoundaboutExit8"/>
 *     &lt;enumeration value="rightRoundaboutExit9"/>
 *     &lt;enumeration value="rightRoundaboutExit10"/>
 *     &lt;enumeration value="rightRoundaboutExit11"/>
 *     &lt;enumeration value="rightRoundaboutExit12"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrivateTransportActionType")
@XmlEnum
public enum PrivateTransportActionType {


    /**
     * Identifer for a departure maneuver. Example text: "Start at"
     * 
     */
    @XmlEnumValue("depart")
    DEPART("depart"),

    /**
     * Identifer for a departure at an airport maneuver. Example text: "Start toward the airport exit"
     * 
     */
    @XmlEnumValue("departAirport")
    DEPART_AIRPORT("departAirport"),

    /**
     * Identifer for an arrival maneuver. Example text: "Arrive at"
     * 
     */
    @XmlEnumValue("arrive")
    ARRIVE("arrive"),

    /**
     * Identifer for an arrival at the airport maneuver. Example text: "Follow the signs to your terminal"
     * 
     */
    @XmlEnumValue("arriveAirport")
    ARRIVE_AIRPORT("arriveAirport"),

    /**
     * Identifer for an arrival maneuver with the destination on the left hand side. Example text: "Arrive at"
     * 
     */
    @XmlEnumValue("arriveLeft")
    ARRIVE_LEFT("arriveLeft"),

    /**
     * Identifer for an arrival maneuver with the destination on the right hand side. Example text: "Arrive at"
     * 
     */
    @XmlEnumValue("arriveRight")
    ARRIVE_RIGHT("arriveRight"),

    /**
     * Identifer for a left-hand loop maneuver. Example text: "Make a left-hand loop onto"
     * 
     */
    @XmlEnumValue("leftLoop")
    LEFT_LOOP("leftLoop"),

    /**
     * Identifer for a left-hand U-turn maneuver. Example text: "Make a U-turn at"
     * 
     */
    @XmlEnumValue("leftUTurn")
    LEFT_U_TURN("leftUTurn"),

    /**
     * Identifer for a sharp left turn maneuver. Example text: "Make a hard left turn onto"
     * 
     */
    @XmlEnumValue("sharpLeftTurn")
    SHARP_LEFT_TURN("sharpLeftTurn"),

    /**
     * Identifer for a left turn maneuver. Example text: "Turn left on"
     * 
     */
    @XmlEnumValue("leftTurn")
    LEFT_TURN("leftTurn"),

    /**
     * Identifer for a slight left turn maneuver. Example text: "Bear left onto"
     * 
     */
    @XmlEnumValue("slightLeftTurn")
    SLIGHT_LEFT_TURN("slightLeftTurn"),

    /**
     * Identifer for a continue maneuver. Example text: "Continue on"
     * 
     */
    @XmlEnumValue("continue")
    CONTINUE("continue"),

    /**
     * Identifer for a slight right turn maneuver. Example text: "Bear right onto"
     * 
     */
    @XmlEnumValue("slightRightTurn")
    SLIGHT_RIGHT_TURN("slightRightTurn"),

    /**
     * Identifer for a right turn maneuver. Example text: "Turn right on"
     * 
     */
    @XmlEnumValue("rightTurn")
    RIGHT_TURN("rightTurn"),

    /**
     * Identifer for a sharp right turn maneuver. Example text: "Make a hard right turn onto"
     * 
     */
    @XmlEnumValue("sharpRightTurn")
    SHARP_RIGHT_TURN("sharpRightTurn"),

    /**
     * Identifer for a right u-turn maneuver. Example text: "Make a right U-turn at"
     * 
     */
    @XmlEnumValue("rightUTurn")
    RIGHT_U_TURN("rightUTurn"),

    /**
     * Identifer for a right loop maneuver. Example text: "Make a right-hand loop onto"
     * 
     */
    @XmlEnumValue("rightLoop")
    RIGHT_LOOP("rightLoop"),

    /**
     * Identifer for a left exit maneuver. Example text: "Take the left exit to"
     * 
     */
    @XmlEnumValue("leftExit")
    LEFT_EXIT("leftExit"),

    /**
     * Identifer for a right exit maneuver. Example text: "Take the right exit to"
     * 
     */
    @XmlEnumValue("rightExit")
    RIGHT_EXIT("rightExit"),

    /**
     * Identifer for a left ramp maneuver. Example text: "Take the left ramp onto"
     * 
     */
    @XmlEnumValue("leftRamp")
    LEFT_RAMP("leftRamp"),

    /**
     * Identifer for a right ramp maneuver. Example text: "Take the right ramp onto"
     * 
     */
    @XmlEnumValue("rightRamp")
    RIGHT_RAMP("rightRamp"),

    /**
     * Identifer for a left fork maneuver. Example text: "Take the left fork onto"
     * 
     */
    @XmlEnumValue("leftFork")
    LEFT_FORK("leftFork"),

    /**
     * Identifer for a middle fork maneuver. Example text: "Take the middle fork onto"
     * 
     */
    @XmlEnumValue("middleFork")
    MIDDLE_FORK("middleFork"),

    /**
     * Identifer for a right fork maneuver. Example text: "Take the right fork onto"
     * 
     */
    @XmlEnumValue("rightFork")
    RIGHT_FORK("rightFork"),

    /**
     * Identifer for a left merge maneuver. Example text: "Merge left onto"
     * 
     */
    @XmlEnumValue("leftMerge")
    LEFT_MERGE("leftMerge"),

    /**
     * Identifer for a right merge maneuver. Example text: "Merge right onto"
     * 
     */
    @XmlEnumValue("rightMerge")
    RIGHT_MERGE("rightMerge"),

    /**
     * Identifer for a name change maneuver (no maneuver action needed). Example text: "Road becomes"
     * 
     */
    @XmlEnumValue("nameChange")
    NAME_CHANGE("nameChange"),

    /**
     * Identifer for a traffic circle maneuver. Example text: "At the traffic circle take the exit to"
     * 
     */
    @XmlEnumValue("trafficCircle")
    TRAFFIC_CIRCLE("trafficCircle"),

    /**
     * Identifer for a ferry maneuver. Example text: "Take the ferry to"
     * 
     */
    @XmlEnumValue("ferry")
    FERRY("ferry"),

    /**
     * Identifer for a roundabout maneuver (left-hand traffic) Example text: "Enter the roundabout"
     * 
     */
    @XmlEnumValue("leftRoundaboutEnter")
    LEFT_ROUNDABOUT_ENTER("leftRoundaboutEnter"),

    /**
     * Identifer for a roundabout maneuver. Example text: "Enter the roundabout"
     * 
     */
    @XmlEnumValue("rightRoundaboutEnter")
    RIGHT_ROUNDABOUT_ENTER("rightRoundaboutEnter"),

    /**
     * Identifer for a roundabout maneuver (left-hand traffic) Example text: "Pass the roundabout"
     * 
     */
    @XmlEnumValue("leftRoundaboutPass")
    LEFT_ROUNDABOUT_PASS("leftRoundaboutPass"),

    /**
     * Identifer for a roundabout maneuver. Example text: "Pass the roundabout"
     * 
     */
    @XmlEnumValue("rightRoundaboutPass")
    RIGHT_ROUNDABOUT_PASS("rightRoundaboutPass"),

    /**
     * Identifer for a roundabout maneuver (left-hand traffic) Example text: "Take the first exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("leftRoundaboutExit1")
    LEFT_ROUNDABOUT_EXIT_1("leftRoundaboutExit1"),

    /**
     * Identifer for a roundabout maneuver (left-hand traffic) Example text: "Take the second exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("leftRoundaboutExit2")
    LEFT_ROUNDABOUT_EXIT_2("leftRoundaboutExit2"),

    /**
     * Identifer for a roundabout maneuver (left-hand traffic) Example text: "Take the third exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("leftRoundaboutExit3")
    LEFT_ROUNDABOUT_EXIT_3("leftRoundaboutExit3"),

    /**
     * Identifer for a roundabout maneuver (left-hand traffic) Example text: "Take the fourth exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("leftRoundaboutExit4")
    LEFT_ROUNDABOUT_EXIT_4("leftRoundaboutExit4"),

    /**
     * Identifer for a roundabout maneuver (left-hand traffic) Example text: "Take the fifth exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("leftRoundaboutExit5")
    LEFT_ROUNDABOUT_EXIT_5("leftRoundaboutExit5"),

    /**
     * Identifer for a roundabout maneuver (left-hand traffic) Example text: "Take the sixth exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("leftRoundaboutExit6")
    LEFT_ROUNDABOUT_EXIT_6("leftRoundaboutExit6"),

    /**
     * Identifer for a roundabout maneuver (left-hand traffic) Example text: "Take the 7th exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("leftRoundaboutExit7")
    LEFT_ROUNDABOUT_EXIT_7("leftRoundaboutExit7"),

    /**
     * Identifer for a roundabout maneuver (left-hand traffic) Example text: "Take the 8th exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("leftRoundaboutExit8")
    LEFT_ROUNDABOUT_EXIT_8("leftRoundaboutExit8"),

    /**
     * Identifer for a roundabout maneuver (left-hand traffic) Example text: "Take the 9th exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("leftRoundaboutExit9")
    LEFT_ROUNDABOUT_EXIT_9("leftRoundaboutExit9"),

    /**
     * Identifer for a roundabout maneuver (left-hand traffic) Example text: "Take the 10th exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("leftRoundaboutExit10")
    LEFT_ROUNDABOUT_EXIT_10("leftRoundaboutExit10"),

    /**
     * Identifer for a roundabout maneuver (left-hand traffic) Example text: "Take the 11th exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("leftRoundaboutExit11")
    LEFT_ROUNDABOUT_EXIT_11("leftRoundaboutExit11"),

    /**
     * Identifer for a roundabout maneuver (left-hand traffic) Example text: "Take the 12th exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("leftRoundaboutExit12")
    LEFT_ROUNDABOUT_EXIT_12("leftRoundaboutExit12"),

    /**
     * Identifer for a roundabout maneuver (right-hand traffic) Example text: "Take the first exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("rightRoundaboutExit1")
    RIGHT_ROUNDABOUT_EXIT_1("rightRoundaboutExit1"),

    /**
     * Identifer for a roundabout maneuver (right-hand traffic) Example text: "Take the second exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("rightRoundaboutExit2")
    RIGHT_ROUNDABOUT_EXIT_2("rightRoundaboutExit2"),

    /**
     * Identifer for a roundabout maneuver (right-hand traffic) Example text: "Take the third exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("rightRoundaboutExit3")
    RIGHT_ROUNDABOUT_EXIT_3("rightRoundaboutExit3"),

    /**
     * Identifer for a roundabout maneuver (right-hand traffic) Example text: "Take the fourth exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("rightRoundaboutExit4")
    RIGHT_ROUNDABOUT_EXIT_4("rightRoundaboutExit4"),

    /**
     * Identifer for a roundabout maneuver (right-hand traffic) Example text: "Take the fifth exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("rightRoundaboutExit5")
    RIGHT_ROUNDABOUT_EXIT_5("rightRoundaboutExit5"),

    /**
     * Identifer for a roundabout maneuver (right-hand traffic) Example text: "Take the sixth exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("rightRoundaboutExit6")
    RIGHT_ROUNDABOUT_EXIT_6("rightRoundaboutExit6"),

    /**
     * Identifer for a roundabout maneuver (right-hand traffic) Example text: "Take the 7th exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("rightRoundaboutExit7")
    RIGHT_ROUNDABOUT_EXIT_7("rightRoundaboutExit7"),

    /**
     * Identifer for a roundabout maneuver (right-hand traffic) Example text: "Take the 8th exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("rightRoundaboutExit8")
    RIGHT_ROUNDABOUT_EXIT_8("rightRoundaboutExit8"),

    /**
     * Identifer for a roundabout maneuver (right-hand traffic) Example text: "Take the 9th exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("rightRoundaboutExit9")
    RIGHT_ROUNDABOUT_EXIT_9("rightRoundaboutExit9"),

    /**
     * Identifer for a roundabout maneuver (right-hand traffic) Example text: "Take the 10th exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("rightRoundaboutExit10")
    RIGHT_ROUNDABOUT_EXIT_10("rightRoundaboutExit10"),

    /**
     * Identifer for a roundabout maneuver (right-hand traffic) Example text: "Take the 11th exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("rightRoundaboutExit11")
    RIGHT_ROUNDABOUT_EXIT_11("rightRoundaboutExit11"),

    /**
     * Identifer for a roundabout maneuver (right-hand traffic) Example text: "Take the 12th exit of the roundabout onto"
     * 
     */
    @XmlEnumValue("rightRoundaboutExit12")
    RIGHT_ROUNDABOUT_EXIT_12("rightRoundaboutExit12");
    private final String value;

    PrivateTransportActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrivateTransportActionType fromValue(String v) {
        for (PrivateTransportActionType c: PrivateTransportActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
