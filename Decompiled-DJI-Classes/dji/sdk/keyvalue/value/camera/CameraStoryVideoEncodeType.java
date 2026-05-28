/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraStoryVideoEncodeType
extends Enum<CameraStoryVideoEncodeType>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraStoryVideoEncodeType H264_GDR = new CameraStoryVideoEncodeType(1);
    public static final /* enum */ CameraStoryVideoEncodeType H264_GOP = new CameraStoryVideoEncodeType(2);
    public static final /* enum */ CameraStoryVideoEncodeType H265 = new CameraStoryVideoEncodeType(3);
    public static final /* enum */ CameraStoryVideoEncodeType UNKNOWN = new CameraStoryVideoEncodeType(65535);
    private int value;
    private static final CameraStoryVideoEncodeType[] allValues;
    private static final /* synthetic */ CameraStoryVideoEncodeType[] $VALUES;

    public static CameraStoryVideoEncodeType[] values() {
        return null;
    }

    public static CameraStoryVideoEncodeType valueOf(String string) {
        return null;
    }

    private CameraStoryVideoEncodeType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraStoryVideoEncodeType find(int n) {
        return null;
    }

    private static /* synthetic */ CameraStoryVideoEncodeType[] $values() {
        return null;
    }

    static {
        $VALUES = CameraStoryVideoEncodeType.$values();
        allValues = CameraStoryVideoEncodeType.values();
    }
}

