/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.mission;

public enum MissionCreateType {
    MAP(0),
    DRONE(1);

    private int value;

    private MissionCreateType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static MissionCreateType find(int value) {
        if (value == MissionCreateType.DRONE.value) {
            return DRONE;
        }
        return MAP;
    }
}

