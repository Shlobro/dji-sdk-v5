/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraVideoSize
extends Enum<CameraVideoSize>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraVideoSize SIZE_640X480P = new CameraVideoSize(0);
    public static final /* enum */ CameraVideoSize SIZE_1280X720P = new CameraVideoSize(4);
    public static final /* enum */ CameraVideoSize SIZE_1920X1080P = new CameraVideoSize(10);
    public static final /* enum */ CameraVideoSize SIZE_3840X1920P = new CameraVideoSize(14);
    public static final /* enum */ CameraVideoSize SIZE_3840X2160P = new CameraVideoSize(16);
    public static final /* enum */ CameraVideoSize SIZE_3840X2880P = new CameraVideoSize(18);
    public static final /* enum */ CameraVideoSize SIZE_4096X2048P = new CameraVideoSize(20);
    public static final /* enum */ CameraVideoSize SIZE_4096X2160P = new CameraVideoSize(22);
    public static final /* enum */ CameraVideoSize SIZE_2704X1520P = new CameraVideoSize(24);
    public static final /* enum */ CameraVideoSize SIZE_640X512P = new CameraVideoSize(26);
    public static final /* enum */ CameraVideoSize SIZE_4608X2160P = new CameraVideoSize(27);
    public static final /* enum */ CameraVideoSize SIZE_4608X2592P = new CameraVideoSize(28);
    public static final /* enum */ CameraVideoSize SIZE_2720X1530P = new CameraVideoSize(31);
    public static final /* enum */ CameraVideoSize SIZE_5280X2160P = new CameraVideoSize(32);
    public static final /* enum */ CameraVideoSize SIZE_5280X2970P = new CameraVideoSize(33);
    public static final /* enum */ CameraVideoSize SIZE_3840X1572P = new CameraVideoSize(34);
    public static final /* enum */ CameraVideoSize SIZE_5760X3240P = new CameraVideoSize(35);
    public static final /* enum */ CameraVideoSize SIZE_6016X3200P = new CameraVideoSize(36);
    public static final /* enum */ CameraVideoSize SIZE_2048X1080P = new CameraVideoSize(37);
    public static final /* enum */ CameraVideoSize SIZE_MAXRESOLUTION = new CameraVideoSize(253);
    public static final /* enum */ CameraVideoSize SIZE_UNSET = new CameraVideoSize(254);
    public static final /* enum */ CameraVideoSize UNKNOWN = new CameraVideoSize(65535);
    private int value;
    private static final CameraVideoSize[] allValues;
    private static final /* synthetic */ CameraVideoSize[] $VALUES;

    public static CameraVideoSize[] values() {
        return null;
    }

    public static CameraVideoSize valueOf(String string) {
        return null;
    }

    private CameraVideoSize(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraVideoSize find(int n) {
        return null;
    }

    private static /* synthetic */ CameraVideoSize[] $values() {
        return null;
    }

    static {
        $VALUES = CameraVideoSize.$values();
        allValues = CameraVideoSize.values();
    }
}

