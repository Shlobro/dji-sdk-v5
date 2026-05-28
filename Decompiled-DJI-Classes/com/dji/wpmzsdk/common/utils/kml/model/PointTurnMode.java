/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

public enum PointTurnMode {
    CLOCKWISE(0),
    COUNTER_CLOCKWISE(1),
    AUTO(2);

    private int value;

    private PointTurnMode(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean _equals(int value) {
        return this.value == value;
    }

    public static PointTurnMode find(int value) {
        PointTurnMode result = CLOCKWISE;
        for (int i = 0; i < PointTurnMode.values().length; ++i) {
            if (!PointTurnMode.values()[i]._equals(value)) continue;
            result = PointTurnMode.values()[i];
            break;
        }
        return result;
    }
}

