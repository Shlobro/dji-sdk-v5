/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class MasterShotIndexType
extends Enum<MasterShotIndexType>
implements JNIProguardKeepTag {
    public static final /* enum */ MasterShotIndexType INDEX_ACTION_TYPE = new MasterShotIndexType(0);
    public static final /* enum */ MasterShotIndexType INDEX_IS_START = new MasterShotIndexType(1);
    public static final /* enum */ MasterShotIndexType INDEX_MAX_LENGTH = new MasterShotIndexType(2);
    public static final /* enum */ MasterShotIndexType INDEX_MAX_WIDTH = new MasterShotIndexType(3);
    public static final /* enum */ MasterShotIndexType INDEX_MAX_HEIGHT = new MasterShotIndexType(4);
    public static final /* enum */ MasterShotIndexType INDEX_FLIP = new MasterShotIndexType(5);
    public static final /* enum */ MasterShotIndexType INDEX_PERSON_ADJUST = new MasterShotIndexType(6);
    public static final /* enum */ MasterShotIndexType INDEX_AVOID_ON = new MasterShotIndexType(7);
    public static final /* enum */ MasterShotIndexType UNKNOWN = new MasterShotIndexType(255);
    private int value;
    private static final MasterShotIndexType[] allValues;
    private static final /* synthetic */ MasterShotIndexType[] $VALUES;

    public static MasterShotIndexType[] values() {
        return null;
    }

    public static MasterShotIndexType valueOf(String string) {
        return null;
    }

    private MasterShotIndexType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MasterShotIndexType find(int n) {
        return null;
    }

    private static /* synthetic */ MasterShotIndexType[] $values() {
        return null;
    }

    static {
        $VALUES = MasterShotIndexType.$values();
        allValues = MasterShotIndexType.values();
    }
}

