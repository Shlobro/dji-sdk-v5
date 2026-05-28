/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.file;

import dji.jni.JNIProguardKeepTag;

public final class FileDataType
extends Enum<FileDataType>
implements JNIProguardKeepTag {
    public static final /* enum */ FileDataType ORIGIN = new FileDataType(0);
    public static final /* enum */ FileDataType THUMBNAIL = new FileDataType(1);
    public static final /* enum */ FileDataType SCREEN = new FileDataType(2);
    public static final /* enum */ FileDataType CLIP = new FileDataType(3);
    public static final /* enum */ FileDataType STREAM = new FileDataType(4);
    public static final /* enum */ FileDataType PANO = new FileDataType(5);
    public static final /* enum */ FileDataType PANOSCREENNAIL = new FileDataType(6);
    public static final /* enum */ FileDataType PANOTHUMBNAIL = new FileDataType(7);
    public static final /* enum */ FileDataType TIMELAPSESCREENAIL = new FileDataType(8);
    public static final /* enum */ FileDataType MP4FILE = new FileDataType(9);
    public static final /* enum */ FileDataType CUSTOM_DATA = new FileDataType(10);
    public static final /* enum */ FileDataType PHOTO_METADATA = new FileDataType(11);
    public static final /* enum */ FileDataType USER_CTRL_INFO = new FileDataType(12);
    public static final /* enum */ FileDataType JSON = new FileDataType(13);
    public static final /* enum */ FileDataType PAYLOAD_WIDGET_JSON = new FileDataType(14);
    public static final /* enum */ FileDataType PROXY_MOOV = new FileDataType(15);
    public static final /* enum */ FileDataType ORIGIN_MOOV = new FileDataType(16);
    public static final /* enum */ FileDataType AIS = new FileDataType(17);
    public static final /* enum */ FileDataType PROXY = new FileDataType(18);
    public static final /* enum */ FileDataType RAW = new FileDataType(19);
    public static final /* enum */ FileDataType PSDK_CONFIG = new FileDataType(20);
    public static final /* enum */ FileDataType LDR = new FileDataType(21);
    public static final /* enum */ FileDataType SIG = new FileDataType(22);
    public static final /* enum */ FileDataType RTK = new FileDataType(23);
    public static final /* enum */ FileDataType MET = new FileDataType(24);
    public static final /* enum */ FileDataType CLC = new FileDataType(25);
    public static final /* enum */ FileDataType CLI = new FileDataType(26);
    public static final /* enum */ FileDataType IMU = new FileDataType(27);
    public static final /* enum */ FileDataType RTL = new FileDataType(28);
    public static final /* enum */ FileDataType RTB = new FileDataType(29);
    public static final /* enum */ FileDataType RTS = new FileDataType(30);
    public static final /* enum */ FileDataType RPOS = new FileDataType(31);
    public static final /* enum */ FileDataType PHOTO_AI_MOT = new FileDataType(32);
    public static final /* enum */ FileDataType PPK_OBS = new FileDataType(33);
    public static final /* enum */ FileDataType PPK_NAV = new FileDataType(34);
    public static final /* enum */ FileDataType TIMESTAMP = new FileDataType(35);
    public static final /* enum */ FileDataType PDF = new FileDataType(36);
    public static final /* enum */ FileDataType PNTS = new FileDataType(201);
    public static final /* enum */ FileDataType SCREEN_PLAYBACK = new FileDataType(65534);
    public static final /* enum */ FileDataType UNKNOWN = new FileDataType(65535);
    private int value;
    private static final FileDataType[] allValues;
    private static final /* synthetic */ FileDataType[] $VALUES;

    public static FileDataType[] values() {
        return null;
    }

    public static FileDataType valueOf(String string) {
        return null;
    }

    private FileDataType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FileDataType find(int n) {
        return null;
    }

    private static /* synthetic */ FileDataType[] $values() {
        return null;
    }

    static {
        $VALUES = FileDataType.$values();
        allValues = FileDataType.values();
    }
}

