/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.glass;

import dji.jni.JNIProguardKeepTag;

public final class GlassType
extends Enum<GlassType>
implements JNIProguardKeepTag {
    public static final /* enum */ GlassType NONE = new GlassType(0);
    public static final /* enum */ GlassType DJI_FPV = new GlassType(78);
    public static final /* enum */ GlassType DJI_FPV_GLASS_V2 = new GlassType(79);
    public static final /* enum */ GlassType UNKNOWN = new GlassType(65535);
    private int value;
    private static final GlassType[] allValues;
    private static final /* synthetic */ GlassType[] $VALUES;

    public static GlassType[] values() {
        return null;
    }

    public static GlassType valueOf(String string) {
        return null;
    }

    private GlassType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GlassType find(int n) {
        return null;
    }

    private static /* synthetic */ GlassType[] $values() {
        return null;
    }

    static {
        $VALUES = GlassType.$values();
        allValues = GlassType.values();
    }
}

