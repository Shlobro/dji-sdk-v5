/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class PanoShotState
extends Enum<PanoShotState>
implements JNIProguardKeepTag {
    public static final /* enum */ PanoShotState WAIT_SHOT = new PanoShotState(0);
    public static final /* enum */ PanoShotState SHOOTING = new PanoShotState(1);
    public static final /* enum */ PanoShotState SHOT_END = new PanoShotState(2);
    public static final /* enum */ PanoShotState RECORDING_VIDEO = new PanoShotState(3);
    public static final /* enum */ PanoShotState VIDEO_END = new PanoShotState(4);
    public static final /* enum */ PanoShotState PROCESSING = new PanoShotState(5);
    public static final /* enum */ PanoShotState IDLE = new PanoShotState(6);
    public static final /* enum */ PanoShotState UNKNOWN = new PanoShotState(65535);
    private int value;
    private static final PanoShotState[] allValues;
    private static final /* synthetic */ PanoShotState[] $VALUES;

    public static PanoShotState[] values() {
        return null;
    }

    public static PanoShotState valueOf(String string) {
        return null;
    }

    private PanoShotState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PanoShotState find(int n) {
        return null;
    }

    private static /* synthetic */ PanoShotState[] $values() {
        return null;
    }

    static {
        $VALUES = PanoShotState.$values();
        allValues = PanoShotState.values();
    }
}

