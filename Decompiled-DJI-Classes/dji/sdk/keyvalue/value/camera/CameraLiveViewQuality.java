/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraLiveViewQuality
extends Enum<CameraLiveViewQuality>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraLiveViewQuality NORMAL = new CameraLiveViewQuality(0);
    public static final /* enum */ CameraLiveViewQuality FINE = new CameraLiveViewQuality(1);
    public static final /* enum */ CameraLiveViewQuality SFINE = new CameraLiveViewQuality(2);
    public static final /* enum */ CameraLiveViewQuality UNKNOWN = new CameraLiveViewQuality(65535);
    private int value;
    private static final CameraLiveViewQuality[] allValues;
    private static final /* synthetic */ CameraLiveViewQuality[] $VALUES;

    public static CameraLiveViewQuality[] values() {
        return null;
    }

    public static CameraLiveViewQuality valueOf(String string) {
        return null;
    }

    private CameraLiveViewQuality(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraLiveViewQuality find(int n) {
        return null;
    }

    private static /* synthetic */ CameraLiveViewQuality[] $values() {
        return null;
    }

    static {
        $VALUES = CameraLiveViewQuality.$values();
        allValues = CameraLiveViewQuality.values();
    }
}

