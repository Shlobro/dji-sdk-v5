/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class CameraVideoStreamType
extends Enum<CameraVideoStreamType>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraVideoStreamType NONE = new CameraVideoStreamType(0);
    public static final /* enum */ CameraVideoStreamType H264 = new CameraVideoStreamType(1);
    public static final /* enum */ CameraVideoStreamType H265 = new CameraVideoStreamType(2);
    public static final /* enum */ CameraVideoStreamType UNKNOWN = new CameraVideoStreamType(65535);
    private int value;
    private static final CameraVideoStreamType[] allValues;
    private static final /* synthetic */ CameraVideoStreamType[] $VALUES;

    public static CameraVideoStreamType[] values() {
        return null;
    }

    public static CameraVideoStreamType valueOf(String string) {
        return null;
    }

    private CameraVideoStreamType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraVideoStreamType find(int n) {
        return null;
    }

    private static /* synthetic */ CameraVideoStreamType[] $values() {
        return null;
    }

    static {
        $VALUES = CameraVideoStreamType.$values();
        allValues = CameraVideoStreamType.values();
    }
}

