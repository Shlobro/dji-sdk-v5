/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class GoHomePathMode
extends Enum<GoHomePathMode>
implements JNIProguardKeepTag {
    public static final /* enum */ GoHomePathMode HEIGHT_NEAR_GROUND = new GoHomePathMode(0);
    public static final /* enum */ GoHomePathMode HEIGHT_FIXED = new GoHomePathMode(1);
    public static final /* enum */ GoHomePathMode UNKNOWN = new GoHomePathMode(65535);
    private int value;
    private static final GoHomePathMode[] allValues;
    private static final /* synthetic */ GoHomePathMode[] $VALUES;

    public static GoHomePathMode[] values() {
        return null;
    }

    public static GoHomePathMode valueOf(String string) {
        return null;
    }

    private GoHomePathMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GoHomePathMode find(int n) {
        return null;
    }

    private static /* synthetic */ GoHomePathMode[] $values() {
        return null;
    }

    static {
        $VALUES = GoHomePathMode.$values();
        allValues = GoHomePathMode.values();
    }
}

