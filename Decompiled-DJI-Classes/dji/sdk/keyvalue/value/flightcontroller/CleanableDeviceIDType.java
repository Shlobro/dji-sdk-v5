/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class CleanableDeviceIDType
extends Enum<CleanableDeviceIDType>
implements JNIProguardKeepTag {
    public static final /* enum */ CleanableDeviceIDType USE_COMPONENT_INDEX = new CleanableDeviceIDType(1);
    public static final /* enum */ CleanableDeviceIDType AIRCRAFT = new CleanableDeviceIDType(2049);
    public static final /* enum */ CleanableDeviceIDType PAYLOAD1 = new CleanableDeviceIDType(4865);
    public static final /* enum */ CleanableDeviceIDType PAYLOAD2 = new CleanableDeviceIDType(4866);
    public static final /* enum */ CleanableDeviceIDType PAYLOAD3 = new CleanableDeviceIDType(4867);
    public static final /* enum */ CleanableDeviceIDType UNKNOWN = new CleanableDeviceIDType(65535);
    private int value;
    private static final CleanableDeviceIDType[] allValues;
    private static final /* synthetic */ CleanableDeviceIDType[] $VALUES;

    public static CleanableDeviceIDType[] values() {
        return null;
    }

    public static CleanableDeviceIDType valueOf(String string) {
        return null;
    }

    private CleanableDeviceIDType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CleanableDeviceIDType find(int n) {
        return null;
    }

    private static /* synthetic */ CleanableDeviceIDType[] $values() {
        return null;
    }

    static {
        $VALUES = CleanableDeviceIDType.$values();
        allValues = CleanableDeviceIDType.values();
    }
}

