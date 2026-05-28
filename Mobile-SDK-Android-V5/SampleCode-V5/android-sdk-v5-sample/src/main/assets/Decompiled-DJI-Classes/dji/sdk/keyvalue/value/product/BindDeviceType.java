/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;

public final class BindDeviceType
extends Enum<BindDeviceType>
implements JNIProguardKeepTag {
    public static final /* enum */ BindDeviceType RC = new BindDeviceType(0);
    public static final /* enum */ BindDeviceType GLASSES = new BindDeviceType(1);
    public static final /* enum */ BindDeviceType UNKNOWN = new BindDeviceType(65535);
    private int value;
    private static final BindDeviceType[] allValues;
    private static final /* synthetic */ BindDeviceType[] $VALUES;

    public static BindDeviceType[] values() {
        return null;
    }

    public static BindDeviceType valueOf(String string) {
        return null;
    }

    private BindDeviceType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BindDeviceType find(int n) {
        return null;
    }

    private static /* synthetic */ BindDeviceType[] $values() {
        return null;
    }

    static {
        $VALUES = BindDeviceType.$values();
        allValues = BindDeviceType.values();
    }
}

