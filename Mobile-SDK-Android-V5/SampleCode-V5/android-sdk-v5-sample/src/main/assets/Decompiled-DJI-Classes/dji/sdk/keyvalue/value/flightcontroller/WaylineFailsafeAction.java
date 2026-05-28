/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class WaylineFailsafeAction
extends Enum<WaylineFailsafeAction>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineFailsafeAction KEEP_MOVING = new WaylineFailsafeAction(0);
    public static final /* enum */ WaylineFailsafeAction EXIT_WAYLINE = new WaylineFailsafeAction(1);
    public static final /* enum */ WaylineFailsafeAction UNKNOWN = new WaylineFailsafeAction(65535);
    private int value;
    private static final WaylineFailsafeAction[] allValues;
    private static final /* synthetic */ WaylineFailsafeAction[] $VALUES;

    public static WaylineFailsafeAction[] values() {
        return null;
    }

    public static WaylineFailsafeAction valueOf(String string) {
        return null;
    }

    private WaylineFailsafeAction(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineFailsafeAction find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineFailsafeAction[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineFailsafeAction.$values();
        allValues = WaylineFailsafeAction.values();
    }
}

