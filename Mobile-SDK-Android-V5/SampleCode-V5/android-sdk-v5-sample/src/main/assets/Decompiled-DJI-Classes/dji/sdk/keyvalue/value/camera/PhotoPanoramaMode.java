/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class PhotoPanoramaMode
extends Enum<PhotoPanoramaMode>
implements JNIProguardKeepTag {
    public static final /* enum */ PhotoPanoramaMode MODE_NONE = new PhotoPanoramaMode(2);
    public static final /* enum */ PhotoPanoramaMode MODE_3x1 = new PhotoPanoramaMode(3);
    public static final /* enum */ PhotoPanoramaMode MODE_BOKEH = new PhotoPanoramaMode(4);
    public static final /* enum */ PhotoPanoramaMode MODE_GESTURE = new PhotoPanoramaMode(5);
    public static final /* enum */ PhotoPanoramaMode MODE_1x3 = new PhotoPanoramaMode(6);
    public static final /* enum */ PhotoPanoramaMode MODE_3x3 = new PhotoPanoramaMode(7);
    public static final /* enum */ PhotoPanoramaMode MODE_SPHERE = new PhotoPanoramaMode(8);
    public static final /* enum */ PhotoPanoramaMode MODE_SCROLL_180 = new PhotoPanoramaMode(9);
    public static final /* enum */ PhotoPanoramaMode MODE_SUPER_RESOLUTION = new PhotoPanoramaMode(10);
    public static final /* enum */ PhotoPanoramaMode UNKNOWN = new PhotoPanoramaMode(65535);
    private int value;
    private static final PhotoPanoramaMode[] allValues;
    private static final /* synthetic */ PhotoPanoramaMode[] $VALUES;

    public static PhotoPanoramaMode[] values() {
        return null;
    }

    public static PhotoPanoramaMode valueOf(String string) {
        return null;
    }

    private PhotoPanoramaMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PhotoPanoramaMode find(int n) {
        return null;
    }

    private static /* synthetic */ PhotoPanoramaMode[] $values() {
        return null;
    }

    static {
        $VALUES = PhotoPanoramaMode.$values();
        allValues = PhotoPanoramaMode.values();
    }
}

