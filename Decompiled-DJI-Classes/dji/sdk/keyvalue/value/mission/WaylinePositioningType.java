/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylinePositioningType
extends Enum<WaylinePositioningType>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylinePositioningType GPS = new WaylinePositioningType(0);
    public static final /* enum */ WaylinePositioningType RTK_BASE_STATION = new WaylinePositioningType(1);
    public static final /* enum */ WaylinePositioningType RTK_QIANXUN = new WaylinePositioningType(2);
    public static final /* enum */ WaylinePositioningType RTK_CUSTOM = new WaylinePositioningType(3);
    public static final /* enum */ WaylinePositioningType RTK_NTRIP = new WaylinePositioningType(4);
    public static final /* enum */ WaylinePositioningType UNKNOWN = new WaylinePositioningType(65535);
    private int value;
    private static final WaylinePositioningType[] allValues;
    private static final /* synthetic */ WaylinePositioningType[] $VALUES;

    public static WaylinePositioningType[] values() {
        return null;
    }

    public static WaylinePositioningType valueOf(String string) {
        return null;
    }

    private WaylinePositioningType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylinePositioningType find(int n) {
        return null;
    }

    private static /* synthetic */ WaylinePositioningType[] $values() {
        return null;
    }

    static {
        $VALUES = WaylinePositioningType.$values();
        allValues = WaylinePositioningType.values();
    }
}

