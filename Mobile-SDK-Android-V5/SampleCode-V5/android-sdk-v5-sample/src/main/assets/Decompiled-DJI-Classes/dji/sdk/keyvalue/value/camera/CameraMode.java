/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

public final class CameraMode
extends Enum<CameraMode> {
    public static final /* enum */ CameraMode PHOTO_NORMAL = new CameraMode(0);
    public static final /* enum */ CameraMode VIDEO_NORMAL = new CameraMode(1);
    public static final /* enum */ CameraMode PHOTO_AEB = new CameraMode(4);
    public static final /* enum */ CameraMode PHOTO_BURST = new CameraMode(6);
    public static final /* enum */ CameraMode PHOTO_INTERVAL = new CameraMode(8);
    public static final /* enum */ CameraMode PHOTO_HYPER_LIGHT = new CameraMode(11);
    public static final /* enum */ CameraMode PHOTO_PANORAMA = new CameraMode(12);
    public static final /* enum */ CameraMode PHOTO_HIGH_RESOLUTION = new CameraMode(21);
    public static final /* enum */ CameraMode PHOTO_SUPER_RESOLUTION = new CameraMode(22);
    public static final /* enum */ CameraMode UNKNOWN = new CameraMode(65535);
    private int value;
    private static final CameraMode[] allValues;
    private static final /* synthetic */ CameraMode[] $VALUES;

    public static CameraMode[] values() {
        return null;
    }

    public static CameraMode valueOf(String string) {
        return null;
    }

    private CameraMode(int n2) {
    }

    private boolean compareValue(int n) {
        return false;
    }

    public int value() {
        return 0;
    }

    public static CameraMode find(int n) {
        return null;
    }

    public boolean isPhotoMode() {
        return false;
    }

    public boolean isVideoMode() {
        return false;
    }

    private static /* synthetic */ CameraMode[] $values() {
        return null;
    }

    static {
        $VALUES = CameraMode.$values();
        allValues = CameraMode.values();
    }
}

