/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;

public final class MRTCProtocol
extends Enum<MRTCProtocol>
implements JNIProguardKeepTag {
    public static final /* enum */ MRTCProtocol DJI_GBT28181 = new MRTCProtocol(0);
    public static final /* enum */ MRTCProtocol DJI_RTMP = new MRTCProtocol(2);
    public static final /* enum */ MRTCProtocol DJI_RTSP = new MRTCProtocol(3);
    public static final /* enum */ MRTCProtocol DJI_ONVIF = new MRTCProtocol(4);
    public static final /* enum */ MRTCProtocol UNKNOWN = new MRTCProtocol(255);
    private int value;
    private static final MRTCProtocol[] allValues;
    private static final /* synthetic */ MRTCProtocol[] $VALUES;

    public static MRTCProtocol[] values() {
        return null;
    }

    public static MRTCProtocol valueOf(String string) {
        return null;
    }

    private MRTCProtocol(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MRTCProtocol find(int n) {
        return null;
    }

    private static /* synthetic */ MRTCProtocol[] $values() {
        return null;
    }

    static {
        $VALUES = MRTCProtocol.$values();
        allValues = MRTCProtocol.values();
    }
}

