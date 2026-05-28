/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class PhotoFileFormat
extends Enum<PhotoFileFormat>
implements JNIProguardKeepTag {
    public static final /* enum */ PhotoFileFormat RAW = new PhotoFileFormat(0);
    public static final /* enum */ PhotoFileFormat JPEG = new PhotoFileFormat(1);
    public static final /* enum */ PhotoFileFormat RAW_JPEG = new PhotoFileFormat(2);
    public static final /* enum */ PhotoFileFormat TIFF_8_BIT = new PhotoFileFormat(3);
    public static final /* enum */ PhotoFileFormat TIFF_14_BIT = new PhotoFileFormat(4);
    public static final /* enum */ PhotoFileFormat TIFF_14_BIT_LINEAR_LOW_TEMP_RESOLUTION = new PhotoFileFormat(5);
    public static final /* enum */ PhotoFileFormat TIFF_14_BIT_LINEAR_HIGH_TEMP_RESOLUTION = new PhotoFileFormat(6);
    public static final /* enum */ PhotoFileFormat RADIOMETRIC_JPEG = new PhotoFileFormat(7);
    public static final /* enum */ PhotoFileFormat YUV_RAW = new PhotoFileFormat(8);
    public static final /* enum */ PhotoFileFormat HEIC = new PhotoFileFormat(9);
    public static final /* enum */ PhotoFileFormat RAW_HEIC = new PhotoFileFormat(10);
    public static final /* enum */ PhotoFileFormat RAW_8_BIT = new PhotoFileFormat(15);
    public static final /* enum */ PhotoFileFormat DLT664 = new PhotoFileFormat(16);
    public static final /* enum */ PhotoFileFormat JLS_HEIC = new PhotoFileFormat(17);
    public static final /* enum */ PhotoFileFormat UNKNOWN = new PhotoFileFormat(65535);
    private int value;
    private static final PhotoFileFormat[] allValues;
    private static final /* synthetic */ PhotoFileFormat[] $VALUES;

    public static PhotoFileFormat[] values() {
        return null;
    }

    public static PhotoFileFormat valueOf(String string) {
        return null;
    }

    private PhotoFileFormat(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PhotoFileFormat find(int n) {
        return null;
    }

    private static /* synthetic */ PhotoFileFormat[] $values() {
        return null;
    }

    static {
        $VALUES = PhotoFileFormat.$values();
        allValues = PhotoFileFormat.values();
    }
}

