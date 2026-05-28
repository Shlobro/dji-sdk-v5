/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class MissionBreakPointcameraActionType
extends Enum<MissionBreakPointcameraActionType>
implements JNIProguardKeepTag {
    public static final /* enum */ MissionBreakPointcameraActionType NORMAL = new MissionBreakPointcameraActionType(0);
    public static final /* enum */ MissionBreakPointcameraActionType ACTION_TIME = new MissionBreakPointcameraActionType(1);
    public static final /* enum */ MissionBreakPointcameraActionType ACTION_DISTANCE = new MissionBreakPointcameraActionType(2);
    public static final /* enum */ MissionBreakPointcameraActionType ACTION_TIME_CAPTURED = new MissionBreakPointcameraActionType(3);
    public static final /* enum */ MissionBreakPointcameraActionType UNKNOWN = new MissionBreakPointcameraActionType(65535);
    private int value;
    private static final MissionBreakPointcameraActionType[] allValues;
    private static final /* synthetic */ MissionBreakPointcameraActionType[] $VALUES;

    public static MissionBreakPointcameraActionType[] values() {
        return null;
    }

    public static MissionBreakPointcameraActionType valueOf(String string) {
        return null;
    }

    private MissionBreakPointcameraActionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MissionBreakPointcameraActionType find(int n) {
        return null;
    }

    private static /* synthetic */ MissionBreakPointcameraActionType[] $values() {
        return null;
    }

    static {
        $VALUES = MissionBreakPointcameraActionType.$values();
        allValues = MissionBreakPointcameraActionType.values();
    }
}

