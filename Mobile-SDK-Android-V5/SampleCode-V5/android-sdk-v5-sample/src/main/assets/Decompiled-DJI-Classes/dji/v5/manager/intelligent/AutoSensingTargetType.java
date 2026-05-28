/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.manager.intelligent;

import androidx.annotation.Keep;
import dji.sdk.keyvalue.value.flightassistant.MultipleTrackDetectedType;
import dji.sdk.keyvalue.value.flightassistant.SmartTrackTrackingObjType;

@Keep
public final class AutoSensingTargetType
extends Enum<AutoSensingTargetType> {
    public static final /* enum */ AutoSensingTargetType UNKNOWN = new AutoSensingTargetType(SmartTrackTrackingObjType.TRACK_UNKNOWN.value());
    public static final /* enum */ AutoSensingTargetType PERSON = new AutoSensingTargetType(SmartTrackTrackingObjType.TRACK_PERSON.value());
    public static final /* enum */ AutoSensingTargetType CAR = new AutoSensingTargetType(SmartTrackTrackingObjType.TRACK_CAR.value());
    public static final /* enum */ AutoSensingTargetType BOAT = new AutoSensingTargetType(SmartTrackTrackingObjType.TRACK_BOAT.value());
    public static final /* enum */ AutoSensingTargetType CUSTOM = new AutoSensingTargetType(65534);
    private int value;
    private static final AutoSensingTargetType[] allValues;
    private static final /* synthetic */ AutoSensingTargetType[] $VALUES;

    public static AutoSensingTargetType[] values() {
        return null;
    }

    public static AutoSensingTargetType valueOf(String string2) {
        return null;
    }

    private AutoSensingTargetType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AutoSensingTargetType find(int n) {
        return null;
    }

    public static AutoSensingTargetType find(MultipleTrackDetectedType multipleTrackDetectedType) {
        return null;
    }

    private static /* synthetic */ AutoSensingTargetType[] $values() {
        return null;
    }

    static {
        $VALUES = AutoSensingTargetType.$values();
        allValues = AutoSensingTargetType.values();
    }
}

