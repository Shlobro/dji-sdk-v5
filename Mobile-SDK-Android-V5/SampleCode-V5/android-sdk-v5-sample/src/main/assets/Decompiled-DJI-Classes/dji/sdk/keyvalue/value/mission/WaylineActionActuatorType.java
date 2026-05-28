/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylineActionActuatorType
extends Enum<WaylineActionActuatorType>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineActionActuatorType UNKNOWN = new WaylineActionActuatorType(0);
    public static final /* enum */ WaylineActionActuatorType CAMERA = new WaylineActionActuatorType(1);
    public static final /* enum */ WaylineActionActuatorType GIMBAL = new WaylineActionActuatorType(2);
    public static final /* enum */ WaylineActionActuatorType SPRAY = new WaylineActionActuatorType(3);
    public static final /* enum */ WaylineActionActuatorType AIRCRAFT = new WaylineActionActuatorType(4);
    public static final /* enum */ WaylineActionActuatorType PSDK = new WaylineActionActuatorType(5);
    public static final /* enum */ WaylineActionActuatorType NAVIGATION = new WaylineActionActuatorType(6);
    public static final /* enum */ WaylineActionActuatorType DELEGATE = new WaylineActionActuatorType(7);
    private int value;
    private static final WaylineActionActuatorType[] allValues;
    private static final /* synthetic */ WaylineActionActuatorType[] $VALUES;

    public static WaylineActionActuatorType[] values() {
        return null;
    }

    public static WaylineActionActuatorType valueOf(String string) {
        return null;
    }

    private WaylineActionActuatorType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineActionActuatorType find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineActionActuatorType[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineActionActuatorType.$values();
        allValues = WaylineActionActuatorType.values();
    }
}

