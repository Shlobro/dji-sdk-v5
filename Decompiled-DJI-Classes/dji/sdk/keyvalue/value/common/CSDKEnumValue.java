/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class CSDKEnumValue
extends Enum<CSDKEnumValue>
implements JNIProguardKeepTag {
    public static final /* enum */ CSDKEnumValue SECTION_IGNORE = new CSDKEnumValue(65534);
    public static final /* enum */ CSDKEnumValue UNKNOWN = new CSDKEnumValue(65535);
    private int value;
    private static final CSDKEnumValue[] allValues;
    private static final /* synthetic */ CSDKEnumValue[] $VALUES;

    public static CSDKEnumValue[] values() {
        return null;
    }

    public static CSDKEnumValue valueOf(String string) {
        return null;
    }

    private CSDKEnumValue(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CSDKEnumValue find(int n) {
        return null;
    }

    private static /* synthetic */ CSDKEnumValue[] $values() {
        return null;
    }

    static {
        $VALUES = CSDKEnumValue.$values();
        allValues = CSDKEnumValue.values();
    }
}

