/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.mission;

public enum RTKReferenceStationSource {
    NONE(0),
    QX_NETWORK_SERVICE(1),
    BASE_STATION(2),
    DPS(3),
    CUSTOM_NETWORK_SERVICE(4),
    NTRIP_NETWORK_SERVICE(5),
    DOCK_BASE(6),
    RSV_RTK_SERVICE2(7),
    RSV_RTK_SERVICE3(8),
    UNKNOWN(65535);

    private int value;
    private static final RTKReferenceStationSource[] allValues;

    private RTKReferenceStationSource(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static RTKReferenceStationSource find(int value) {
        RTKReferenceStationSource result = null;
        for (int i = 0; i < allValues.length; ++i) {
            if (!allValues[i].equals(value)) continue;
            result = allValues[i];
            break;
        }
        if (null == result) {
            result = UNKNOWN;
            result.value = value;
        }
        return result;
    }

    static {
        allValues = RTKReferenceStationSource.values();
    }
}

