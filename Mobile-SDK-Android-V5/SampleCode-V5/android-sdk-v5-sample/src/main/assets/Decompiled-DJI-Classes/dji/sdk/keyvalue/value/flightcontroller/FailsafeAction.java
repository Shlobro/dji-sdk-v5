/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FailsafeAction
extends Enum<FailsafeAction>
implements JNIProguardKeepTag {
    public static final /* enum */ FailsafeAction HOVER = new FailsafeAction(0);
    public static final /* enum */ FailsafeAction LANDING = new FailsafeAction(1);
    public static final /* enum */ FailsafeAction GOHOME = new FailsafeAction(2);
    public static final /* enum */ FailsafeAction UNKNOWN = new FailsafeAction(65535);
    private int value;
    private static final FailsafeAction[] allValues;
    private static final /* synthetic */ FailsafeAction[] $VALUES;

    public static FailsafeAction[] values() {
        return null;
    }

    public static FailsafeAction valueOf(String string) {
        return null;
    }

    private FailsafeAction(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FailsafeAction find(int n) {
        return null;
    }

    private static /* synthetic */ FailsafeAction[] $values() {
        return null;
    }

    static {
        $VALUES = FailsafeAction.$values();
        allValues = FailsafeAction.values();
    }
}

