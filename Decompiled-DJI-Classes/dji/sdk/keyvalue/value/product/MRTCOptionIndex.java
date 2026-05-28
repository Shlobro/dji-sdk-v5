/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;

public final class MRTCOptionIndex
extends Enum<MRTCOptionIndex>
implements JNIProguardKeepTag {
    public static final /* enum */ MRTCOptionIndex DJI_MRTC_OPT_START_UNUSED = new MRTCOptionIndex(0x1000000);
    public static final /* enum */ MRTCOptionIndex DJI_MRTC_OPT_REMOTE_IP_ATTR = new MRTCOptionIndex(0x10000001);
    public static final /* enum */ MRTCOptionIndex DJI_MRTC_OPT_LOCAL_IP_ATTR = new MRTCOptionIndex(0x10000002);
    public static final /* enum */ MRTCOptionIndex DJI_MRTC_OPT_LIVE_STATUS = new MRTCOptionIndex(0x10000003);
    public static final /* enum */ MRTCOptionIndex DJI_MRTC_OPT_LIVE_VIDEO_PARAM = new MRTCOptionIndex(0x10000004);
    public static final /* enum */ MRTCOptionIndex DJI_MRTC_OPT_LIVE_ADAPTIVE_VIDEO_PARAM = new MRTCOptionIndex(0x10000005);
    public static final /* enum */ MRTCOptionIndex DJI_MRTC_OPT_LIVE_USER_SETTED_VIDEO_ATTRIBUTE = new MRTCOptionIndex(0x10000006);
    public static final /* enum */ MRTCOptionIndex DJI_MRTC_OPT_MAX = new MRTCOptionIndex(Integer.MAX_VALUE);
    public static final /* enum */ MRTCOptionIndex UNKNOWN = new MRTCOptionIndex(65535);
    private int value;
    private static final MRTCOptionIndex[] allValues;
    private static final /* synthetic */ MRTCOptionIndex[] $VALUES;

    public static MRTCOptionIndex[] values() {
        return null;
    }

    public static MRTCOptionIndex valueOf(String string) {
        return null;
    }

    private MRTCOptionIndex(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MRTCOptionIndex find(int n) {
        return null;
    }

    private static /* synthetic */ MRTCOptionIndex[] $values() {
        return null;
    }

    static {
        $VALUES = MRTCOptionIndex.$values();
        allValues = MRTCOptionIndex.values();
    }
}

