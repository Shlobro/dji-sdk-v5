/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class MasterShotSeqType
extends Enum<MasterShotSeqType>
implements JNIProguardKeepTag {
    public static final /* enum */ MasterShotSeqType SLASH = new MasterShotSeqType(1);
    public static final /* enum */ MasterShotSeqType FAR_CIRCLE = new MasterShotSeqType(2);
    public static final /* enum */ MasterShotSeqType DISCOVER_CLOSE = new MasterShotSeqType(3);
    public static final /* enum */ MasterShotSeqType NEAR_CIRCLE = new MasterShotSeqType(4);
    public static final /* enum */ MasterShotSeqType MID_CIRCLE = new MasterShotSeqType(5);
    public static final /* enum */ MasterShotSeqType ROCKET = new MasterShotSeqType(6);
    public static final /* enum */ MasterShotSeqType SNAP_SHOT_CLOSE = new MasterShotSeqType(7);
    public static final /* enum */ MasterShotSeqType SNAP_SHOT_ROTATION = new MasterShotSeqType(8);
    public static final /* enum */ MasterShotSeqType FLAT_SHOT_DOWN = new MasterShotSeqType(9);
    public static final /* enum */ MasterShotSeqType SNAP_SHOT_DOWN = new MasterShotSeqType(10);
    public static final /* enum */ MasterShotSeqType ZOOM_OUT = new MasterShotSeqType(11);
    public static final /* enum */ MasterShotSeqType ASTROID = new MasterShotSeqType(12);
    public static final /* enum */ MasterShotSeqType ROLL_FROWARD = new MasterShotSeqType(13);
    public static final /* enum */ MasterShotSeqType FLAT_ROTATE = new MasterShotSeqType(14);
    public static final /* enum */ MasterShotSeqType ADJUST_ATTITUDE = new MasterShotSeqType(255);
    public static final /* enum */ MasterShotSeqType UNKNOWN = new MasterShotSeqType(65535);
    private int value;
    private static final MasterShotSeqType[] allValues;
    private static final /* synthetic */ MasterShotSeqType[] $VALUES;

    public static MasterShotSeqType[] values() {
        return null;
    }

    public static MasterShotSeqType valueOf(String string) {
        return null;
    }

    private MasterShotSeqType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MasterShotSeqType find(int n) {
        return null;
    }

    private static /* synthetic */ MasterShotSeqType[] $values() {
        return null;
    }

    static {
        $VALUES = MasterShotSeqType.$values();
        allValues = MasterShotSeqType.values();
    }
}

