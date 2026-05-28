/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class CareDeviceType
extends Enum<CareDeviceType>
implements JNIProguardKeepTag {
    public static final /* enum */ CareDeviceType AIRCRAFT = new CareDeviceType(0);
    public static final /* enum */ CareDeviceType CAMERA = new CareDeviceType(1);
    public static final /* enum */ CareDeviceType UNKNOWN = new CareDeviceType(65535);
    private int value;
    private static final CareDeviceType[] allValues;
    private static final /* synthetic */ CareDeviceType[] $VALUES;

    public static CareDeviceType[] values() {
        return null;
    }

    public static CareDeviceType valueOf(String string) {
        return null;
    }

    private CareDeviceType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CareDeviceType find(int n) {
        return null;
    }

    private static /* synthetic */ CareDeviceType[] $values() {
        return null;
    }

    static {
        $VALUES = CareDeviceType.$values();
        allValues = CareDeviceType.values();
    }
}

