/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class SDRQualityDetectScene
extends Enum<SDRQualityDetectScene>
implements JNIProguardKeepTag {
    public static final /* enum */ SDRQualityDetectScene PILOT = new SDRQualityDetectScene(0);
    public static final /* enum */ SDRQualityDetectScene HYAPP = new SDRQualityDetectScene(1);
    public static final /* enum */ SDRQualityDetectScene UNKNOWN = new SDRQualityDetectScene(65535);
    private int value;
    private static final SDRQualityDetectScene[] allValues;
    private static final /* synthetic */ SDRQualityDetectScene[] $VALUES;

    public static SDRQualityDetectScene[] values() {
        return null;
    }

    public static SDRQualityDetectScene valueOf(String string) {
        return null;
    }

    private SDRQualityDetectScene(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SDRQualityDetectScene find(int n) {
        return null;
    }

    private static /* synthetic */ SDRQualityDetectScene[] $values() {
        return null;
    }

    static {
        $VALUES = SDRQualityDetectScene.$values();
        allValues = SDRQualityDetectScene.values();
    }
}

