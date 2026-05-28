/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.data;

public enum MissionType {
    Waypoint(0),
    Mapping2D(1),
    Mapping3D(2),
    Strip(3),
    UNKNOWN(4);

    private int value;

    private MissionType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean _equals(int value) {
        return this.value == value;
    }

    public static MissionType find(int value) {
        MissionType result = Waypoint;
        for (int i = 0; i < MissionType.values().length; ++i) {
            if (!MissionType.values()[i]._equals(value)) continue;
            result = MissionType.values()[i];
            break;
        }
        return result;
    }
}

