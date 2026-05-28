/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraRCDialMapping
extends Enum<CameraRCDialMapping>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraRCDialMapping ISO = new CameraRCDialMapping(0);
    public static final /* enum */ CameraRCDialMapping SHOOT_SPEED = new CameraRCDialMapping(1);
    public static final /* enum */ CameraRCDialMapping EV = new CameraRCDialMapping(2);
    public static final /* enum */ CameraRCDialMapping UNKNOWN = new CameraRCDialMapping(65535);
    private int value;
    private static final CameraRCDialMapping[] allValues;
    private static final /* synthetic */ CameraRCDialMapping[] $VALUES;

    public static CameraRCDialMapping[] values() {
        return null;
    }

    public static CameraRCDialMapping valueOf(String string) {
        return null;
    }

    private CameraRCDialMapping(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraRCDialMapping find(int n) {
        return null;
    }

    private static /* synthetic */ CameraRCDialMapping[] $values() {
        return null;
    }

    static {
        $VALUES = CameraRCDialMapping.$values();
        allValues = CameraRCDialMapping.values();
    }
}

