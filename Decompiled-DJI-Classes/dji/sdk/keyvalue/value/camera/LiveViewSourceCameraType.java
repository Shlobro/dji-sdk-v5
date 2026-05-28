/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class LiveViewSourceCameraType
extends Enum<LiveViewSourceCameraType>
implements JNIProguardKeepTag {
    public static final /* enum */ LiveViewSourceCameraType DEFAULT_CAMERA = new LiveViewSourceCameraType(0);
    public static final /* enum */ LiveViewSourceCameraType WIDE_CAMERA = new LiveViewSourceCameraType(1);
    public static final /* enum */ LiveViewSourceCameraType ZOOM_CAMERA = new LiveViewSourceCameraType(2);
    public static final /* enum */ LiveViewSourceCameraType INFRARED_CAMERA = new LiveViewSourceCameraType(3);
    public static final /* enum */ LiveViewSourceCameraType NDVI_CAMERA = new LiveViewSourceCameraType(4);
    public static final /* enum */ LiveViewSourceCameraType VISION_CAMERA = new LiveViewSourceCameraType(7);
    public static final /* enum */ LiveViewSourceCameraType MS_G_CAMERA = new LiveViewSourceCameraType(8);
    public static final /* enum */ LiveViewSourceCameraType MS_R_CAMERA = new LiveViewSourceCameraType(9);
    public static final /* enum */ LiveViewSourceCameraType MS_RE_CAMERA = new LiveViewSourceCameraType(10);
    public static final /* enum */ LiveViewSourceCameraType MS_NIR_CAMERA = new LiveViewSourceCameraType(11);
    public static final /* enum */ LiveViewSourceCameraType MS_FUSION = new LiveViewSourceCameraType(12);
    public static final /* enum */ LiveViewSourceCameraType MEDIAN_CAM = new LiveViewSourceCameraType(13);
    public static final /* enum */ LiveViewSourceCameraType PCD_CAMERA = new LiveViewSourceCameraType(14);
    public static final /* enum */ LiveViewSourceCameraType UNKNOWN = new LiveViewSourceCameraType(65535);
    private int value;
    private static final LiveViewSourceCameraType[] allValues;
    private static final /* synthetic */ LiveViewSourceCameraType[] $VALUES;

    public static LiveViewSourceCameraType[] values() {
        return null;
    }

    public static LiveViewSourceCameraType valueOf(String string) {
        return null;
    }

    private LiveViewSourceCameraType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LiveViewSourceCameraType find(int n) {
        return null;
    }

    private static /* synthetic */ LiveViewSourceCameraType[] $values() {
        return null;
    }

    static {
        $VALUES = LiveViewSourceCameraType.$values();
        allValues = LiveViewSourceCameraType.values();
    }
}

