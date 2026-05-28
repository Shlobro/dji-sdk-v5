/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.activate;

import dji.jni.JNIProguardKeepTag;

public final class ActivateComponentType
extends Enum<ActivateComponentType>
implements JNIProguardKeepTag {
    public static final /* enum */ ActivateComponentType AIRCRAFT_CONTROLLER = new ActivateComponentType(0);
    public static final /* enum */ ActivateComponentType REMOTE_CONTROLLER = new ActivateComponentType(1);
    public static final /* enum */ ActivateComponentType CAMERA = new ActivateComponentType(2);
    public static final /* enum */ ActivateComponentType BATTERY = new ActivateComponentType(3);
    public static final /* enum */ ActivateComponentType GIMBAL = new ActivateComponentType(4);
    public static final /* enum */ ActivateComponentType CENTER_BOARD = new ActivateComponentType(5);
    public static final /* enum */ ActivateComponentType BATTERY_BOX = new ActivateComponentType(6);
    public static final /* enum */ ActivateComponentType RADAR = new ActivateComponentType(7);
    public static final /* enum */ ActivateComponentType GLASSES = new ActivateComponentType(8);
    public static final /* enum */ ActivateComponentType LENS_TYPE = new ActivateComponentType(9);
    public static final /* enum */ ActivateComponentType ACCESSORY = new ActivateComponentType(10);
    public static final /* enum */ ActivateComponentType DONGLE = new ActivateComponentType(11);
    public static final /* enum */ ActivateComponentType RTK = new ActivateComponentType(12);
    public static final /* enum */ ActivateComponentType RELAY = new ActivateComponentType(13);
    public static final /* enum */ ActivateComponentType AI_BOX = new ActivateComponentType(14);
    public static final /* enum */ ActivateComponentType SEARCH_LIGHT = new ActivateComponentType(33);
    public static final /* enum */ ActivateComponentType MEGAPHONE = new ActivateComponentType(34);
    public static final /* enum */ ActivateComponentType ALL = new ActivateComponentType(65534);
    public static final /* enum */ ActivateComponentType UNKNOWN = new ActivateComponentType(65535);
    private int value;
    private static final ActivateComponentType[] allValues;
    private static final /* synthetic */ ActivateComponentType[] $VALUES;

    public static ActivateComponentType[] values() {
        return null;
    }

    public static ActivateComponentType valueOf(String string) {
        return null;
    }

    private ActivateComponentType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ActivateComponentType find(int n) {
        return null;
    }

    private static /* synthetic */ ActivateComponentType[] $values() {
        return null;
    }

    static {
        $VALUES = ActivateComponentType.$values();
        allValues = ActivateComponentType.values();
    }
}

