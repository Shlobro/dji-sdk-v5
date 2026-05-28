/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class PhotoAEBPhotoCount
extends Enum<PhotoAEBPhotoCount>
implements JNIProguardKeepTag {
    public static final /* enum */ PhotoAEBPhotoCount COUNT_3 = new PhotoAEBPhotoCount(3);
    public static final /* enum */ PhotoAEBPhotoCount COUNT_5 = new PhotoAEBPhotoCount(5);
    public static final /* enum */ PhotoAEBPhotoCount COUNT_7 = new PhotoAEBPhotoCount(7);
    public static final /* enum */ PhotoAEBPhotoCount UNKNOWN = new PhotoAEBPhotoCount(65535);
    private int value;
    private static final PhotoAEBPhotoCount[] allValues;
    private static final /* synthetic */ PhotoAEBPhotoCount[] $VALUES;

    public static PhotoAEBPhotoCount[] values() {
        return null;
    }

    public static PhotoAEBPhotoCount valueOf(String string) {
        return null;
    }

    private PhotoAEBPhotoCount(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PhotoAEBPhotoCount find(int n) {
        return null;
    }

    private static /* synthetic */ PhotoAEBPhotoCount[] $values() {
        return null;
    }

    static {
        $VALUES = PhotoAEBPhotoCount.$values();
        allValues = PhotoAEBPhotoCount.values();
    }
}

