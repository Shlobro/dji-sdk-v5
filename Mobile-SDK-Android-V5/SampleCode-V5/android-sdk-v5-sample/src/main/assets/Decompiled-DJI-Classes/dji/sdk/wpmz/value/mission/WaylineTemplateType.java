/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineTemplateType implements JNIProguardKeepTag
{
    WAYPOINT(0),
    MAPPING2D(1),
    MAPPING3D(2),
    MAPPINGSTRIP(3),
    MAPPINGPRISM(4),
    MAPPINGCYLINDER(5),
    DEPARTURE(6),
    MAPPINGOBJECT(7),
    UNKNOWN(65535);

    private int value;
    private static final WaylineTemplateType[] allValues;

    private WaylineTemplateType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineTemplateType find(int value) {
        WaylineTemplateType result = null;
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
        allValues = WaylineTemplateType.values();
    }
}

