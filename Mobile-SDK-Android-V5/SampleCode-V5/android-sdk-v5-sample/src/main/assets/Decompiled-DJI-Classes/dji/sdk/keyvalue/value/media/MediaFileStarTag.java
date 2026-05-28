/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;

public final class MediaFileStarTag
extends Enum<MediaFileStarTag>
implements JNIProguardKeepTag {
    public static final /* enum */ MediaFileStarTag NONE = new MediaFileStarTag(0);
    public static final /* enum */ MediaFileStarTag TAGGED = new MediaFileStarTag(1);
    public static final /* enum */ MediaFileStarTag UNKNOWN = new MediaFileStarTag(255);
    private int value;
    private static final MediaFileStarTag[] allValues;
    private static final /* synthetic */ MediaFileStarTag[] $VALUES;

    public static MediaFileStarTag[] values() {
        return null;
    }

    public static MediaFileStarTag valueOf(String string) {
        return null;
    }

    private MediaFileStarTag(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MediaFileStarTag find(int n) {
        return null;
    }

    private static /* synthetic */ MediaFileStarTag[] $values() {
        return null;
    }

    static {
        $VALUES = MediaFileStarTag.$values();
        allValues = MediaFileStarTag.values();
    }
}

