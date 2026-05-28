/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class WlmDeviceRole
extends Enum<WlmDeviceRole>
implements JNIProguardKeepTag {
    public static final /* enum */ WlmDeviceRole COMMON_UAV = new WlmDeviceRole(0);
    public static final /* enum */ WlmDeviceRole RELAY_UAV = new WlmDeviceRole(1);
    public static final /* enum */ WlmDeviceRole MASTER_RC = new WlmDeviceRole(2);
    public static final /* enum */ WlmDeviceRole SLAVE_RC = new WlmDeviceRole(3);
    public static final /* enum */ WlmDeviceRole GLASS = new WlmDeviceRole(4);
    public static final /* enum */ WlmDeviceRole INVALID = new WlmDeviceRole(255);
    public static final /* enum */ WlmDeviceRole UNKNOWN = new WlmDeviceRole(65535);
    private int value;
    private static final WlmDeviceRole[] allValues;
    private static final /* synthetic */ WlmDeviceRole[] $VALUES;

    public static WlmDeviceRole[] values() {
        return null;
    }

    public static WlmDeviceRole valueOf(String string) {
        return null;
    }

    private WlmDeviceRole(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WlmDeviceRole find(int n) {
        return null;
    }

    private static /* synthetic */ WlmDeviceRole[] $values() {
        return null;
    }

    static {
        $VALUES = WlmDeviceRole.$values();
        allValues = WlmDeviceRole.values();
    }
}

