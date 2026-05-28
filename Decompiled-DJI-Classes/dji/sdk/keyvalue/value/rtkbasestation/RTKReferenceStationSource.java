/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKReferenceStationSource
extends Enum<RTKReferenceStationSource>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKReferenceStationSource NONE = new RTKReferenceStationSource(0);
    public static final /* enum */ RTKReferenceStationSource QX_NETWORK_SERVICE = new RTKReferenceStationSource(1);
    public static final /* enum */ RTKReferenceStationSource BASE_STATION = new RTKReferenceStationSource(2);
    public static final /* enum */ RTKReferenceStationSource DPS = new RTKReferenceStationSource(3);
    public static final /* enum */ RTKReferenceStationSource CUSTOM_NETWORK_SERVICE = new RTKReferenceStationSource(4);
    public static final /* enum */ RTKReferenceStationSource NTRIP_NETWORK_SERVICE = new RTKReferenceStationSource(5);
    public static final /* enum */ RTKReferenceStationSource DOCK_BASE = new RTKReferenceStationSource(6);
    public static final /* enum */ RTKReferenceStationSource RELAY = new RTKReferenceStationSource(7);
    public static final /* enum */ RTKReferenceStationSource RSV_RTK_SERVICE3 = new RTKReferenceStationSource(8);
    public static final /* enum */ RTKReferenceStationSource DRONE_RTK = new RTKReferenceStationSource(10);
    public static final /* enum */ RTKReferenceStationSource UNKNOWN = new RTKReferenceStationSource(65535);
    private int value;
    private static final RTKReferenceStationSource[] allValues;
    private static final /* synthetic */ RTKReferenceStationSource[] $VALUES;

    public static RTKReferenceStationSource[] values() {
        return null;
    }

    public static RTKReferenceStationSource valueOf(String string) {
        return null;
    }

    private RTKReferenceStationSource(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKReferenceStationSource find(int n) {
        return null;
    }

    private static /* synthetic */ RTKReferenceStationSource[] $values() {
        return null;
    }

    static {
        $VALUES = RTKReferenceStationSource.$values();
        allValues = RTKReferenceStationSource.values();
    }
}

