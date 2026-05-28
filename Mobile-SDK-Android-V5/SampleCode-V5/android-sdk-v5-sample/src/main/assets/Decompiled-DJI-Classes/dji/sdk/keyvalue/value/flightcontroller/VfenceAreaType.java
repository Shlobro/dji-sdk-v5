/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class VfenceAreaType
extends Enum<VfenceAreaType>
implements JNIProguardKeepTag {
    public static final /* enum */ VfenceAreaType NO_FLY_ZONE = new VfenceAreaType(0);
    public static final /* enum */ VfenceAreaType FENCED_AREA = new VfenceAreaType(1);
    public static final /* enum */ VfenceAreaType UNKNOWN = new VfenceAreaType(65535);
    private int value;
    private static final VfenceAreaType[] allValues;
    private static final /* synthetic */ VfenceAreaType[] $VALUES;

    public static VfenceAreaType[] values() {
        return null;
    }

    public static VfenceAreaType valueOf(String string) {
        return null;
    }

    private VfenceAreaType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VfenceAreaType find(int n) {
        return null;
    }

    private static /* synthetic */ VfenceAreaType[] $values() {
        return null;
    }

    static {
        $VALUES = VfenceAreaType.$values();
        allValues = VfenceAreaType.values();
    }
}

