/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class MediaFileType
extends Enum<MediaFileType>
implements JNIProguardKeepTag {
    public static final /* enum */ MediaFileType JPEG = new MediaFileType(0);
    public static final /* enum */ MediaFileType DNG = new MediaFileType(1);
    public static final /* enum */ MediaFileType MOV = new MediaFileType(2);
    public static final /* enum */ MediaFileType MP4 = new MediaFileType(3);
    public static final /* enum */ MediaFileType PANORAMA = new MediaFileType(4);
    public static final /* enum */ MediaFileType TIFF = new MediaFileType(5);
    public static final /* enum */ MediaFileType UL_CTRL_INFO = new MediaFileType(6);
    public static final /* enum */ MediaFileType UL_CTRL_INFO_LZ4 = new MediaFileType(7);
    public static final /* enum */ MediaFileType SEQ = new MediaFileType(8);
    public static final /* enum */ MediaFileType TIFF_SEQ = new MediaFileType(9);
    public static final /* enum */ MediaFileType AUDIO = new MediaFileType(10);
    public static final /* enum */ MediaFileType PAYLOAD_WIDGET_JSON = new MediaFileType(15);
    public static final /* enum */ MediaFileType PHOTO_FOLDER = new MediaFileType(16);
    public static final /* enum */ MediaFileType VIDEO_FOLDER = new MediaFileType(17);
    public static final /* enum */ MediaFileType FOLDER_ATTR = new MediaFileType(18);
    public static final /* enum */ MediaFileType LRF = new MediaFileType(19);
    public static final /* enum */ MediaFileType THM = new MediaFileType(20);
    public static final /* enum */ MediaFileType SCR = new MediaFileType(21);
    public static final /* enum */ MediaFileType CNDG = new MediaFileType(22);
    public static final /* enum */ MediaFileType LDR = new MediaFileType(23);
    public static final /* enum */ MediaFileType LDRT = new MediaFileType(24);
    public static final /* enum */ MediaFileType RPT = new MediaFileType(25);
    public static final /* enum */ MediaFileType MET = new MediaFileType(26);
    public static final /* enum */ MediaFileType RTK = new MediaFileType(27);
    public static final /* enum */ MediaFileType SIG = new MediaFileType(28);
    public static final /* enum */ MediaFileType WITHOUT_FUSION = new MediaFileType(29);
    public static final /* enum */ MediaFileType CLC = new MediaFileType(30);
    public static final /* enum */ MediaFileType CLI = new MediaFileType(31);
    public static final /* enum */ MediaFileType IMU = new MediaFileType(32);
    public static final /* enum */ MediaFileType RTL = new MediaFileType(33);
    public static final /* enum */ MediaFileType RTB = new MediaFileType(34);
    public static final /* enum */ MediaFileType RTS = new MediaFileType(35);
    public static final /* enum */ MediaFileType RPOS = new MediaFileType(36);
    public static final /* enum */ MediaFileType PPK_RAW = new MediaFileType(37);
    public static final /* enum */ MediaFileType PPK_OBS = new MediaFileType(38);
    public static final /* enum */ MediaFileType PPK_NAV = new MediaFileType(39);
    public static final /* enum */ MediaFileType TIMESTAMP = new MediaFileType(40);
    public static final /* enum */ MediaFileType TS = new MediaFileType(42);
    public static final /* enum */ MediaFileType HEIF = new MediaFileType(45);
    public static final /* enum */ MediaFileType ZIP = new MediaFileType(200);
    public static final /* enum */ MediaFileType UNKNOWN = new MediaFileType(65535);
    private int value;
    private static final MediaFileType[] allValues;
    private static final /* synthetic */ MediaFileType[] $VALUES;

    public static MediaFileType[] values() {
        return null;
    }

    public static MediaFileType valueOf(String string) {
        return null;
    }

    private MediaFileType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MediaFileType find(int n) {
        return null;
    }

    private static /* synthetic */ MediaFileType[] $values() {
        return null;
    }

    static {
        $VALUES = MediaFileType.$values();
        allValues = MediaFileType.values();
    }
}

