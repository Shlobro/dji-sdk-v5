/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class EIColor
extends Enum<EIColor>
implements JNIProguardKeepTag {
    public static final /* enum */ EIColor DLOG = new EIColor(0);
    public static final /* enum */ EIColor REC709 = new EIColor(1);
    public static final /* enum */ EIColor UNKNOWN = new EIColor(65535);
    private int value;
    private static final EIColor[] allValues;
    private static final /* synthetic */ EIColor[] $VALUES;

    public static EIColor[] values() {
        return null;
    }

    public static EIColor valueOf(String string) {
        return null;
    }

    private EIColor(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static EIColor find(int n) {
        return null;
    }

    private static /* synthetic */ EIColor[] $values() {
        return null;
    }

    static {
        $VALUES = EIColor.$values();
        allValues = EIColor.values();
    }
}

