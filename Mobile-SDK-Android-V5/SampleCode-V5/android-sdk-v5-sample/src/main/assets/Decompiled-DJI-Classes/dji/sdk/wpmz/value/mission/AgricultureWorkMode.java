/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum AgricultureWorkMode implements JNIProguardKeepTag
{
    DEFAULT_MISSION(0),
    SPRAY_EDGE_MISSION(1),
    FARM_FIELD_MISSION(2),
    FARM_PRESCRIPTION_MISSION(3),
    TREE_MISSION_CONTINUOUS_AUTO_EQUIDDISTANT(4),
    TREE_MISSION_FIXED_AUTO_SURROUND_TREE_CORE(5),
    TREE_MISSION_CONTINUOUS_MANUAL(6),
    TREE_MISSION_FIXED_SEMI_AUTOMATIC(7),
    TREE_MISSION_CONTINUOUS_SEMI_AUTOMATIC_SURROUND_TREE_CORE(8),
    TREE_MISSION_CONTINUOUS_AUTOMATIC_SURROUND_TREE_CORE(9),
    FARM_SURVEY_AND_MAPPING_MISSION(10),
    AB_WAYLINE(11),
    FARM_SURVEY_AND_MAPPING_SWEEP_MISSION(12),
    FARM_SURVEY_AND_MAPPING_TREE_MISSION(13),
    TREE_MISSION_FIXED_AUTO_SURROUND_TREE_CORE_CONTOUR(14),
    TREE_MISSION_CONTINUOUS_AUTOMATIC_SURROUND_TREE_CORE_CONTOUR(15),
    UNKNOWN(65535);

    private int value;
    private static final AgricultureWorkMode[] allValues;

    private AgricultureWorkMode(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static AgricultureWorkMode find(int value) {
        AgricultureWorkMode result = null;
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
        allValues = AgricultureWorkMode.values();
    }
}

