/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.file;

import dji.jni.JNIProguardKeepTag;

public final class FileListRequestFilter
extends Enum<FileListRequestFilter>
implements JNIProguardKeepTag {
    public static final /* enum */ FileListRequestFilter ALL = new FileListRequestFilter(0);
    public static final /* enum */ FileListRequestFilter LIKED = new FileListRequestFilter(1);
    public static final /* enum */ FileListRequestFilter DISLIKED = new FileListRequestFilter(2);
    public static final /* enum */ FileListRequestFilter PHOTO_NORMAL = new FileListRequestFilter(4);
    public static final /* enum */ FileListRequestFilter PHOTO_HDR = new FileListRequestFilter(5);
    public static final /* enum */ FileListRequestFilter PHOTO_AEB = new FileListRequestFilter(6);
    public static final /* enum */ FileListRequestFilter PHOTO_BURST = new FileListRequestFilter(7);
    public static final /* enum */ FileListRequestFilter PHOTO_INTERVAL = new FileListRequestFilter(8);
    public static final /* enum */ FileListRequestFilter PHOTO_PANO = new FileListRequestFilter(9);
    public static final /* enum */ FileListRequestFilter VIDEO_NORMAL = new FileListRequestFilter(16);
    public static final /* enum */ FileListRequestFilter VIDEO_SLOWMOTION = new FileListRequestFilter(17);
    public static final /* enum */ FileListRequestFilter VIDEO_TIMELAPSE = new FileListRequestFilter(18);
    public static final /* enum */ FileListRequestFilter VIDEO_HYPERLAPSE = new FileListRequestFilter(19);
    public static final /* enum */ FileListRequestFilter VIDEO_HDR = new FileListRequestFilter(20);
    public static final /* enum */ FileListRequestFilter VIDEO_LOOP = new FileListRequestFilter(21);
    public static final /* enum */ FileListRequestFilter VIDEO_MACHINE_NORMAL_STORY = new FileListRequestFilter(22);
    public static final /* enum */ FileListRequestFilter VIDEO_QUICKSHOT = new FileListRequestFilter(23);
    public static final /* enum */ FileListRequestFilter VIDEO_SHORTVIDEO = new FileListRequestFilter(24);
    public static final /* enum */ FileListRequestFilter ALL_PHOTO = new FileListRequestFilter(25);
    public static final /* enum */ FileListRequestFilter ALL_VIDEO = new FileListRequestFilter(26);
    public static final /* enum */ FileListRequestFilter SURVEY_ALL = new FileListRequestFilter(27);
    public static final /* enum */ FileListRequestFilter SURVEY_PCD_LDRT = new FileListRequestFilter(28);
    public static final /* enum */ FileListRequestFilter SURVEY_RPT = new FileListRequestFilter(29);
    public static final /* enum */ FileListRequestFilter UNKNOWN = new FileListRequestFilter(65535);
    private int value;
    private static final FileListRequestFilter[] allValues;
    private static final /* synthetic */ FileListRequestFilter[] $VALUES;

    public static FileListRequestFilter[] values() {
        return null;
    }

    public static FileListRequestFilter valueOf(String string) {
        return null;
    }

    private FileListRequestFilter(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FileListRequestFilter find(int n) {
        return null;
    }

    private static /* synthetic */ FileListRequestFilter[] $values() {
        return null;
    }

    static {
        $VALUES = FileListRequestFilter.$values();
        allValues = FileListRequestFilter.values();
    }
}

