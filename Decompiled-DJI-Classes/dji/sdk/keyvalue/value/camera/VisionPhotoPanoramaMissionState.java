/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class VisionPhotoPanoramaMissionState
extends Enum<VisionPhotoPanoramaMissionState>
implements JNIProguardKeepTag {
    public static final /* enum */ VisionPhotoPanoramaMissionState IDLE = new VisionPhotoPanoramaMissionState(0);
    public static final /* enum */ VisionPhotoPanoramaMissionState PREPARE = new VisionPhotoPanoramaMissionState(1);
    public static final /* enum */ VisionPhotoPanoramaMissionState RUNNING = new VisionPhotoPanoramaMissionState(2);
    public static final /* enum */ VisionPhotoPanoramaMissionState RELEASE = new VisionPhotoPanoramaMissionState(3);
    public static final /* enum */ VisionPhotoPanoramaMissionState FORBIDDEN = new VisionPhotoPanoramaMissionState(4);
    public static final /* enum */ VisionPhotoPanoramaMissionState PROCESSING = new VisionPhotoPanoramaMissionState(5);
    public static final /* enum */ VisionPhotoPanoramaMissionState UNKNOWN = new VisionPhotoPanoramaMissionState(65535);
    private int value;
    private static final VisionPhotoPanoramaMissionState[] allValues;
    private static final /* synthetic */ VisionPhotoPanoramaMissionState[] $VALUES;

    public static VisionPhotoPanoramaMissionState[] values() {
        return null;
    }

    public static VisionPhotoPanoramaMissionState valueOf(String string) {
        return null;
    }

    private VisionPhotoPanoramaMissionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VisionPhotoPanoramaMissionState find(int n) {
        return null;
    }

    private static /* synthetic */ VisionPhotoPanoramaMissionState[] $values() {
        return null;
    }

    static {
        $VALUES = VisionPhotoPanoramaMissionState.$values();
        allValues = VisionPhotoPanoramaMissionState.values();
    }
}

