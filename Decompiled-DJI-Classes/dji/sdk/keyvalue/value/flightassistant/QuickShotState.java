/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class QuickShotState
extends Enum<QuickShotState>
implements JNIProguardKeepTag {
    public static final /* enum */ QuickShotState PROPOSAL = new QuickShotState(0);
    public static final /* enum */ QuickShotState WAITING_TO_CONFIRM = new QuickShotState(1);
    public static final /* enum */ QuickShotState CAN_NOT_CONFIRM = new QuickShotState(2);
    public static final /* enum */ QuickShotState COUNTING_DOWN = new QuickShotState(3);
    public static final /* enum */ QuickShotState QUICK_SHOTING = new QuickShotState(4);
    public static final /* enum */ QuickShotState COMEBACK_NORMALLY = new QuickShotState(5);
    public static final /* enum */ QuickShotState UNKNOWN = new QuickShotState(65535);
    private int value;
    private static final QuickShotState[] allValues;
    private static final /* synthetic */ QuickShotState[] $VALUES;

    public static QuickShotState[] values() {
        return null;
    }

    public static QuickShotState valueOf(String string) {
        return null;
    }

    private QuickShotState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static QuickShotState find(int n) {
        return null;
    }

    private static /* synthetic */ QuickShotState[] $values() {
        return null;
    }

    static {
        $VALUES = QuickShotState.$values();
        allValues = QuickShotState.values();
    }
}

