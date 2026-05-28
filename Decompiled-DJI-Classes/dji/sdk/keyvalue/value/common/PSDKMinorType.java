/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class PSDKMinorType
extends Enum<PSDKMinorType>
implements JNIProguardKeepTag {
    public static final /* enum */ PSDKMinorType PSDK_V1 = new PSDKMinorType(0);
    public static final /* enum */ PSDKMinorType PSDK_V2_0 = new PSDKMinorType(1);
    public static final /* enum */ PSDKMinorType PSDK_V2_1 = new PSDKMinorType(2);
    public static final /* enum */ PSDKMinorType EP800 = new PSDKMinorType(128);
    public static final /* enum */ PSDKMinorType EP600 = new PSDKMinorType(129);
    public static final /* enum */ PSDKMinorType UNKNOWN = new PSDKMinorType(65535);
    private int value;
    private static final PSDKMinorType[] allValues;
    private static final /* synthetic */ PSDKMinorType[] $VALUES;

    public static PSDKMinorType[] values() {
        return null;
    }

    public static PSDKMinorType valueOf(String string) {
        return null;
    }

    private PSDKMinorType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PSDKMinorType find(int n) {
        return null;
    }

    private static /* synthetic */ PSDKMinorType[] $values() {
        return null;
    }

    static {
        $VALUES = PSDKMinorType.$values();
        allValues = PSDKMinorType.values();
    }
}

