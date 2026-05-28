/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkmobilestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKSingnalType
extends Enum<RTKSingnalType>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKSingnalType NA = new RTKSingnalType(0);
    public static final /* enum */ RTKSingnalType GPS = new RTKSingnalType(1);
    public static final /* enum */ RTKSingnalType GNSS_ABOVE = new RTKSingnalType(2);
    public static final /* enum */ RTKSingnalType RTK = new RTKSingnalType(3);
    public static final /* enum */ RTKSingnalType UNKNOWN = new RTKSingnalType(65535);
    private int value;
    private static final RTKSingnalType[] allValues;
    private static final /* synthetic */ RTKSingnalType[] $VALUES;

    public static RTKSingnalType[] values() {
        return null;
    }

    public static RTKSingnalType valueOf(String string) {
        return null;
    }

    private RTKSingnalType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKSingnalType find(int n) {
        return null;
    }

    private static /* synthetic */ RTKSingnalType[] $values() {
        return null;
    }

    static {
        $VALUES = RTKSingnalType.$values();
        allValues = RTKSingnalType.values();
    }
}

