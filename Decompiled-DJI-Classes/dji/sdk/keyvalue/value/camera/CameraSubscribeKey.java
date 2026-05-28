/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraSubscribeKey
extends Enum<CameraSubscribeKey>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraSubscribeKey START_UP = new CameraSubscribeKey(10001);
    public static final /* enum */ CameraSubscribeKey CAPTURE_STATUS = new CameraSubscribeKey(10002);
    public static final /* enum */ CameraSubscribeKey UNKNOWN = new CameraSubscribeKey(65535);
    private int value;
    private static final CameraSubscribeKey[] allValues;
    private static final /* synthetic */ CameraSubscribeKey[] $VALUES;

    public static CameraSubscribeKey[] values() {
        return null;
    }

    public static CameraSubscribeKey valueOf(String string) {
        return null;
    }

    private CameraSubscribeKey(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraSubscribeKey find(int n) {
        return null;
    }

    private static /* synthetic */ CameraSubscribeKey[] $values() {
        return null;
    }

    static {
        $VALUES = CameraSubscribeKey.$values();
        allValues = CameraSubscribeKey.values();
    }
}

