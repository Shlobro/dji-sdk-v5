/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class QuickShotMLState
extends Enum<QuickShotMLState>
implements JNIProguardKeepTag {
    public static final /* enum */ QuickShotMLState PROPOSAL = new QuickShotMLState(0);
    public static final /* enum */ QuickShotMLState TRACKING = new QuickShotMLState(1);
    public static final /* enum */ QuickShotMLState UNKNOWN = new QuickShotMLState(65535);
    private int value;
    private static final QuickShotMLState[] allValues;
    private static final /* synthetic */ QuickShotMLState[] $VALUES;

    public static QuickShotMLState[] values() {
        return null;
    }

    public static QuickShotMLState valueOf(String string) {
        return null;
    }

    private QuickShotMLState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static QuickShotMLState find(int n) {
        return null;
    }

    private static /* synthetic */ QuickShotMLState[] $values() {
        return null;
    }

    static {
        $VALUES = QuickShotMLState.$values();
        allValues = QuickShotMLState.values();
    }
}

