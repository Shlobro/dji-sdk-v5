/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class MultiSpectralFusionType
extends Enum<MultiSpectralFusionType>
implements JNIProguardKeepTag {
    public static final /* enum */ MultiSpectralFusionType NDVI = new MultiSpectralFusionType(0);
    public static final /* enum */ MultiSpectralFusionType GNDVI = new MultiSpectralFusionType(1);
    public static final /* enum */ MultiSpectralFusionType NDRE = new MultiSpectralFusionType(2);
    public static final /* enum */ MultiSpectralFusionType UNKNOWN = new MultiSpectralFusionType(65535);
    private int value;
    private static final MultiSpectralFusionType[] allValues;
    private static final /* synthetic */ MultiSpectralFusionType[] $VALUES;

    public static MultiSpectralFusionType[] values() {
        return null;
    }

    public static MultiSpectralFusionType valueOf(String string) {
        return null;
    }

    private MultiSpectralFusionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MultiSpectralFusionType find(int n) {
        return null;
    }

    private static /* synthetic */ MultiSpectralFusionType[] $values() {
        return null;
    }

    static {
        $VALUES = MultiSpectralFusionType.$values();
        allValues = MultiSpectralFusionType.values();
    }
}

