/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylineActionCameraFocusType
extends Enum<WaylineActionCameraFocusType>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineActionCameraFocusType UNKNOWN = new WaylineActionCameraFocusType(0);
    public static final /* enum */ WaylineActionCameraFocusType MANUAL = new WaylineActionCameraFocusType(1);
    public static final /* enum */ WaylineActionCameraFocusType AUTO = new WaylineActionCameraFocusType(2);
    public static final /* enum */ WaylineActionCameraFocusType CONTINUOUS = new WaylineActionCameraFocusType(3);
    public static final /* enum */ WaylineActionCameraFocusType PRECISE = new WaylineActionCameraFocusType(4);
    private int value;
    private static final WaylineActionCameraFocusType[] allValues;
    private static final /* synthetic */ WaylineActionCameraFocusType[] $VALUES;

    public static WaylineActionCameraFocusType[] values() {
        return null;
    }

    public static WaylineActionCameraFocusType valueOf(String string) {
        return null;
    }

    private WaylineActionCameraFocusType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineActionCameraFocusType find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineActionCameraFocusType[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineActionCameraFocusType.$values();
        allValues = WaylineActionCameraFocusType.values();
    }
}

