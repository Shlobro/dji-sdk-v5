/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class BuzzerActionType
extends Enum<BuzzerActionType>
implements JNIProguardKeepTag {
    public static final /* enum */ BuzzerActionType BUZZER_ACTION_TAKEOFF = new BuzzerActionType(0);
    public static final /* enum */ BuzzerActionType BUZZER_ACTION_LANDING = new BuzzerActionType(1);
    public static final /* enum */ BuzzerActionType UNKNOWN = new BuzzerActionType(65535);
    private int value;
    private static final BuzzerActionType[] allValues;
    private static final /* synthetic */ BuzzerActionType[] $VALUES;

    public static BuzzerActionType[] values() {
        return null;
    }

    public static BuzzerActionType valueOf(String string) {
        return null;
    }

    private BuzzerActionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BuzzerActionType find(int n) {
        return null;
    }

    private static /* synthetic */ BuzzerActionType[] $values() {
        return null;
    }

    static {
        $VALUES = BuzzerActionType.$values();
        allValues = BuzzerActionType.values();
    }
}

