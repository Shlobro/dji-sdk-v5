/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class StreamSourceCameraType
extends Enum<StreamSourceCameraType>
implements JNIProguardKeepTag {
    public static final /* enum */ StreamSourceCameraType DEFAULT_CAM = new StreamSourceCameraType(0);
    public static final /* enum */ StreamSourceCameraType WIDE_CAM = new StreamSourceCameraType(1);
    public static final /* enum */ StreamSourceCameraType ZOOM_CAM = new StreamSourceCameraType(2);
    public static final /* enum */ StreamSourceCameraType IR_CAM = new StreamSourceCameraType(3);
    public static final /* enum */ StreamSourceCameraType SCREEN_CAM = new StreamSourceCameraType(4);
    public static final /* enum */ StreamSourceCameraType TOF_CAM = new StreamSourceCameraType(5);
    public static final /* enum */ StreamSourceCameraType TELE_CAM = new StreamSourceCameraType(6);
    public static final /* enum */ StreamSourceCameraType VISIBLE_CAM = new StreamSourceCameraType(7);
    public static final /* enum */ StreamSourceCameraType MEDIAN_CAM = new StreamSourceCameraType(13);
    public static final /* enum */ StreamSourceCameraType UNKNOWN = new StreamSourceCameraType(65535);
    private int value;
    private static final StreamSourceCameraType[] allValues;
    private static final /* synthetic */ StreamSourceCameraType[] $VALUES;

    public static StreamSourceCameraType[] values() {
        return null;
    }

    public static StreamSourceCameraType valueOf(String string) {
        return null;
    }

    private StreamSourceCameraType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static StreamSourceCameraType find(int n) {
        return null;
    }

    private static /* synthetic */ StreamSourceCameraType[] $values() {
        return null;
    }

    static {
        $VALUES = StreamSourceCameraType.$values();
        allValues = StreamSourceCameraType.values();
    }
}

