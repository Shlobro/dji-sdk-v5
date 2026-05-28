/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class HDVTSDRMode
extends Enum<HDVTSDRMode>
implements JNIProguardKeepTag {
    public static final /* enum */ HDVTSDRMode DJI_HDVT_SDR_MODE_NORMAL = new HDVTSDRMode(0);
    public static final /* enum */ HDVTSDRMode DJI_HDVT_SDR_MODE_NORMAL_AVOID = new HDVTSDRMode(1);
    public static final /* enum */ HDVTSDRMode DJI_HDVT_SDR_MODE_SILENCE_ALL = new HDVTSDRMode(2);
    public static final /* enum */ HDVTSDRMode DJI_HDVT_SDR_MODE_AVOID_24G = new HDVTSDRMode(3);
    public static final /* enum */ HDVTSDRMode DJI_HDVT_SDR_MODE_AVOID_58G = new HDVTSDRMode(4);
    public static final /* enum */ HDVTSDRMode DJI_HDVT_SDR_MODE_AVOID_ALL = new HDVTSDRMode(5);
    public static final /* enum */ HDVTSDRMode DJI_DJI_HDVT_SDR_MODE_MAX = new HDVTSDRMode(6);
    public static final /* enum */ HDVTSDRMode DJI_HDVT_SDR_MODE_IPERF = new HDVTSDRMode(255);
    public static final /* enum */ HDVTSDRMode UNKNOWN = new HDVTSDRMode(65535);
    private int value;
    private static final HDVTSDRMode[] allValues;
    private static final /* synthetic */ HDVTSDRMode[] $VALUES;

    public static HDVTSDRMode[] values() {
        return null;
    }

    public static HDVTSDRMode valueOf(String string) {
        return null;
    }

    private HDVTSDRMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HDVTSDRMode find(int n) {
        return null;
    }

    private static /* synthetic */ HDVTSDRMode[] $values() {
        return null;
    }

    static {
        $VALUES = HDVTSDRMode.$values();
        allValues = HDVTSDRMode.values();
    }
}

