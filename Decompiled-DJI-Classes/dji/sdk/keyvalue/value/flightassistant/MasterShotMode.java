/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class MasterShotMode
extends Enum<MasterShotMode>
implements JNIProguardKeepTag {
    public static final /* enum */ MasterShotMode MASTER_SHOT_NORMAL = new MasterShotMode(65);
    public static final /* enum */ MasterShotMode MASTER_SHOT_BIG_OBJECT = new MasterShotMode(66);
    public static final /* enum */ MasterShotMode MASTER_SHOT_PANO = new MasterShotMode(67);
    public static final /* enum */ MasterShotMode MASTER_SHOT_PERSON = new MasterShotMode(68);
    public static final /* enum */ MasterShotMode UNKNOWN = new MasterShotMode(65535);
    private int value;
    private static final MasterShotMode[] allValues;
    private static final /* synthetic */ MasterShotMode[] $VALUES;

    public static MasterShotMode[] values() {
        return null;
    }

    public static MasterShotMode valueOf(String string) {
        return null;
    }

    private MasterShotMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MasterShotMode find(int n) {
        return null;
    }

    private static /* synthetic */ MasterShotMode[] $values() {
        return null;
    }

    static {
        $VALUES = MasterShotMode.$values();
        allValues = MasterShotMode.values();
    }
}

