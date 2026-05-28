/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraRawSupportType
extends Enum<CameraRawSupportType>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraRawSupportType NOT_SUPPORTED_BY_HARDWARE = new CameraRawSupportType(0);
    public static final /* enum */ CameraRawSupportType NOT_SUPPORTED_BY_FIRMWARE = new CameraRawSupportType(1);
    public static final /* enum */ CameraRawSupportType SUPPORTED = new CameraRawSupportType(2);
    public static final /* enum */ CameraRawSupportType UNKNOWN = new CameraRawSupportType(65535);
    private int value;
    private static final CameraRawSupportType[] allValues;
    private static final /* synthetic */ CameraRawSupportType[] $VALUES;

    public static CameraRawSupportType[] values() {
        return null;
    }

    public static CameraRawSupportType valueOf(String string) {
        return null;
    }

    private CameraRawSupportType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraRawSupportType find(int n) {
        return null;
    }

    private static /* synthetic */ CameraRawSupportType[] $values() {
        return null;
    }

    static {
        $VALUES = CameraRawSupportType.$values();
        allValues = CameraRawSupportType.values();
    }
}

