/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class MissionType
extends Enum<MissionType>
implements JNIProguardKeepTag {
    public static final /* enum */ MissionType TRACKING = new MissionType(0);
    public static final /* enum */ MissionType WAYPOINT = new MissionType(1);
    public static final /* enum */ MissionType UNKNOWN = new MissionType(65535);
    private int value;
    private static final MissionType[] allValues;
    private static final /* synthetic */ MissionType[] $VALUES;

    public static MissionType[] values() {
        return null;
    }

    public static MissionType valueOf(String string) {
        return null;
    }

    private MissionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MissionType find(int n) {
        return null;
    }

    private static /* synthetic */ MissionType[] $values() {
        return null;
    }

    static {
        $VALUES = MissionType.$values();
        allValues = MissionType.values();
    }
}

