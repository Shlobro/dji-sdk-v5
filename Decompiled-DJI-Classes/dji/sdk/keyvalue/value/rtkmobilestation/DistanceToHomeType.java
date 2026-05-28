/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkmobilestation;

import dji.jni.JNIProguardKeepTag;

public final class DistanceToHomeType
extends Enum<DistanceToHomeType>
implements JNIProguardKeepTag {
    public static final /* enum */ DistanceToHomeType NONE = new DistanceToHomeType(0);
    public static final /* enum */ DistanceToHomeType GPS = new DistanceToHomeType(1);
    public static final /* enum */ DistanceToHomeType RTK = new DistanceToHomeType(2);
    public static final /* enum */ DistanceToHomeType UNKNOWN = new DistanceToHomeType(65535);
    private int value;
    private static final DistanceToHomeType[] allValues;
    private static final /* synthetic */ DistanceToHomeType[] $VALUES;

    public static DistanceToHomeType[] values() {
        return null;
    }

    public static DistanceToHomeType valueOf(String string) {
        return null;
    }

    private DistanceToHomeType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DistanceToHomeType find(int n) {
        return null;
    }

    private static /* synthetic */ DistanceToHomeType[] $values() {
        return null;
    }

    static {
        $VALUES = DistanceToHomeType.$values();
        allValues = DistanceToHomeType.values();
    }
}

