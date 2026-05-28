/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class SIMCardType
extends Enum<SIMCardType>
implements JNIProguardKeepTag {
    public static final /* enum */ SIMCardType UNRECOGNIZED = new SIMCardType(0);
    public static final /* enum */ SIMCardType NORMAL = new SIMCardType(1);
    public static final /* enum */ SIMCardType TRISIM = new SIMCardType(2);
    public static final /* enum */ SIMCardType ESIM = new SIMCardType(3);
    public static final /* enum */ SIMCardType SMD = new SIMCardType(4);
    public static final /* enum */ SIMCardType UNKNOWN = new SIMCardType(65535);
    private int value;
    private static final SIMCardType[] allValues;
    private static final /* synthetic */ SIMCardType[] $VALUES;

    public static SIMCardType[] values() {
        return null;
    }

    public static SIMCardType valueOf(String string) {
        return null;
    }

    private SIMCardType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SIMCardType find(int n) {
        return null;
    }

    private static /* synthetic */ SIMCardType[] $values() {
        return null;
    }

    static {
        $VALUES = SIMCardType.$values();
        allValues = SIMCardType.values();
    }
}

