/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class ExternalDeviceType
extends Enum<ExternalDeviceType>
implements JNIProguardKeepTag {
    public static final /* enum */ ExternalDeviceType EXTERNAL_PM430 = new ExternalDeviceType(1);
    public static final /* enum */ ExternalDeviceType EXTERNAL_PM320 = new ExternalDeviceType(2);
    public static final /* enum */ ExternalDeviceType EXTERNAL_AG602 = new ExternalDeviceType(3);
    public static final /* enum */ ExternalDeviceType EXTERNAL_WM630 = new ExternalDeviceType(4);
    public static final /* enum */ ExternalDeviceType EXTERNAL_PM431 = new ExternalDeviceType(5);
    public static final /* enum */ ExternalDeviceType EXTERNAL_PM440 = new ExternalDeviceType(6);
    public static final /* enum */ ExternalDeviceType UNKNOWN = new ExternalDeviceType(65535);
    private int value;
    private static final ExternalDeviceType[] allValues;
    private static final /* synthetic */ ExternalDeviceType[] $VALUES;

    public static ExternalDeviceType[] values() {
        return null;
    }

    public static ExternalDeviceType valueOf(String string) {
        return null;
    }

    private ExternalDeviceType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ExternalDeviceType find(int n) {
        return null;
    }

    private static /* synthetic */ ExternalDeviceType[] $values() {
        return null;
    }

    static {
        $VALUES = ExternalDeviceType.$values();
        allValues = ExternalDeviceType.values();
    }
}

