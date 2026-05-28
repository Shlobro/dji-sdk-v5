/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;

public final class PSDKType
extends Enum<PSDKType>
implements JNIProguardKeepTag {
    public static final /* enum */ PSDKType V1_0 = new PSDKType(0);
    public static final /* enum */ PSDKType V2_0 = new PSDKType(1);
    public static final /* enum */ PSDKType V2_1 = new PSDKType(2);
    public static final /* enum */ PSDKType UNKNOWN = new PSDKType(255);
    private int value;
    private static final PSDKType[] allValues;
    private static final /* synthetic */ PSDKType[] $VALUES;

    public static PSDKType[] values() {
        return null;
    }

    public static PSDKType valueOf(String string) {
        return null;
    }

    private PSDKType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PSDKType find(int n) {
        return null;
    }

    private static /* synthetic */ PSDKType[] $values() {
        return null;
    }

    static {
        $VALUES = PSDKType.$values();
        allValues = PSDKType.values();
    }
}

