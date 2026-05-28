/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class MGMultiDevicesWorkModeType
extends Enum<MGMultiDevicesWorkModeType>
implements JNIProguardKeepTag {
    public static final /* enum */ MGMultiDevicesWorkModeType STAND_ALONE = new MGMultiDevicesWorkModeType(0);
    public static final /* enum */ MGMultiDevicesWorkModeType MULTI_DEVICE = new MGMultiDevicesWorkModeType(1);
    public static final /* enum */ MGMultiDevicesWorkModeType UNKNOWN = new MGMultiDevicesWorkModeType(65535);
    private int value;
    private static final MGMultiDevicesWorkModeType[] allValues;
    private static final /* synthetic */ MGMultiDevicesWorkModeType[] $VALUES;

    public static MGMultiDevicesWorkModeType[] values() {
        return null;
    }

    public static MGMultiDevicesWorkModeType valueOf(String string) {
        return null;
    }

    private MGMultiDevicesWorkModeType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGMultiDevicesWorkModeType find(int n) {
        return null;
    }

    private static /* synthetic */ MGMultiDevicesWorkModeType[] $values() {
        return null;
    }

    static {
        $VALUES = MGMultiDevicesWorkModeType.$values();
        allValues = MGMultiDevicesWorkModeType.values();
    }
}

