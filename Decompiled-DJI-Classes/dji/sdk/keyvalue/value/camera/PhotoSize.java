/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class PhotoSize
extends Enum<PhotoSize>
implements JNIProguardKeepTag {
    public static final /* enum */ PhotoSize SIZE_DEFAULT = new PhotoSize(0);
    public static final /* enum */ PhotoSize SIZE_EXTRA_SMALL = new PhotoSize(1);
    public static final /* enum */ PhotoSize SIZE_SMALL = new PhotoSize(2);
    public static final /* enum */ PhotoSize SIZE_MEDIUM = new PhotoSize(3);
    public static final /* enum */ PhotoSize SIZE_LARGE = new PhotoSize(4);
    public static final /* enum */ PhotoSize SIZE_EXTRA_LARGE = new PhotoSize(5);
    public static final /* enum */ PhotoSize UNKNOWN = new PhotoSize(65535);
    private int value;
    private static final PhotoSize[] allValues;
    private static final /* synthetic */ PhotoSize[] $VALUES;

    public static PhotoSize[] values() {
        return null;
    }

    public static PhotoSize valueOf(String string) {
        return null;
    }

    private PhotoSize(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PhotoSize find(int n) {
        return null;
    }

    private static /* synthetic */ PhotoSize[] $values() {
        return null;
    }

    static {
        $VALUES = PhotoSize.$values();
        allValues = PhotoSize.values();
    }
}

