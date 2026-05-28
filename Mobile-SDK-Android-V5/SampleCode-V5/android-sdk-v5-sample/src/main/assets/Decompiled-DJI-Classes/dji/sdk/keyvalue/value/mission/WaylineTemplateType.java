/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylineTemplateType
extends Enum<WaylineTemplateType>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineTemplateType WAYPOINT = new WaylineTemplateType(0);
    public static final /* enum */ WaylineTemplateType MAPPING2D = new WaylineTemplateType(1);
    public static final /* enum */ WaylineTemplateType MAPPING3D = new WaylineTemplateType(2);
    public static final /* enum */ WaylineTemplateType MAPPINGSTRIP = new WaylineTemplateType(3);
    public static final /* enum */ WaylineTemplateType UNKNOWN = new WaylineTemplateType(65535);
    private int value;
    private static final WaylineTemplateType[] allValues;
    private static final /* synthetic */ WaylineTemplateType[] $VALUES;

    public static WaylineTemplateType[] values() {
        return null;
    }

    public static WaylineTemplateType valueOf(String string) {
        return null;
    }

    private WaylineTemplateType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineTemplateType find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineTemplateType[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineTemplateType.$values();
        allValues = WaylineTemplateType.values();
    }
}

