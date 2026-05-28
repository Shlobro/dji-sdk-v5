/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class GoHomeNfzState
extends Enum<GoHomeNfzState>
implements JNIProguardKeepTag {
    public static final /* enum */ GoHomeNfzState NONE = new GoHomeNfzState(0);
    public static final /* enum */ GoHomeNfzState NEAR_NFZ = new GoHomeNfzState(1);
    public static final /* enum */ GoHomeNfzState COVER = new GoHomeNfzState(2);
    public static final /* enum */ GoHomeNfzState UNKNOWN = new GoHomeNfzState(65535);
    private int value;
    private static final GoHomeNfzState[] allValues;
    private static final /* synthetic */ GoHomeNfzState[] $VALUES;

    public static GoHomeNfzState[] values() {
        return null;
    }

    public static GoHomeNfzState valueOf(String string) {
        return null;
    }

    private GoHomeNfzState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GoHomeNfzState find(int n) {
        return null;
    }

    private static /* synthetic */ GoHomeNfzState[] $values() {
        return null;
    }

    static {
        $VALUES = GoHomeNfzState.$values();
        allValues = GoHomeNfzState.values();
    }
}

