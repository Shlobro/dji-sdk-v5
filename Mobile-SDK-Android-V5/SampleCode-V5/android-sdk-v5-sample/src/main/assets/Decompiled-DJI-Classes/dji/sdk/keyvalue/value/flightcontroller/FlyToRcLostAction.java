/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FlyToRcLostAction
extends Enum<FlyToRcLostAction>
implements JNIProguardKeepTag {
    public static final /* enum */ FlyToRcLostAction KEEP_MOVING = new FlyToRcLostAction(0);
    public static final /* enum */ FlyToRcLostAction EXIT_FLYTO = new FlyToRcLostAction(1);
    public static final /* enum */ FlyToRcLostAction UNKNOWN = new FlyToRcLostAction(65535);
    private int value;
    private static final FlyToRcLostAction[] allValues;
    private static final /* synthetic */ FlyToRcLostAction[] $VALUES;

    public static FlyToRcLostAction[] values() {
        return null;
    }

    public static FlyToRcLostAction valueOf(String string) {
        return null;
    }

    private FlyToRcLostAction(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlyToRcLostAction find(int n) {
        return null;
    }

    private static /* synthetic */ FlyToRcLostAction[] $values() {
        return null;
    }

    static {
        $VALUES = FlyToRcLostAction.$values();
        allValues = FlyToRcLostAction.values();
    }
}

