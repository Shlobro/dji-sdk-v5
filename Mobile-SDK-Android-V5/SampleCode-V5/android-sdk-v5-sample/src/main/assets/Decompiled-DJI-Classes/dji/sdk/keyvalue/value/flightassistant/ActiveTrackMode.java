/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class ActiveTrackMode
extends Enum<ActiveTrackMode>
implements JNIProguardKeepTag {
    public static final /* enum */ ActiveTrackMode TRACE = new ActiveTrackMode(0);
    public static final /* enum */ ActiveTrackMode PROFILE = new ActiveTrackMode(1);
    public static final /* enum */ ActiveTrackMode SPOTLIGHT = new ActiveTrackMode(2);
    public static final /* enum */ ActiveTrackMode SPOTLIGHT_PRO = new ActiveTrackMode(3);
    public static final /* enum */ ActiveTrackMode QUICK_SHOT = new ActiveTrackMode(4);
    public static final /* enum */ ActiveTrackMode SPOTLIGHT_HEAT_POINT = new ActiveTrackMode(5);
    public static final /* enum */ ActiveTrackMode UNKNOWN = new ActiveTrackMode(65535);
    private int value;
    private static final ActiveTrackMode[] allValues;
    private static final /* synthetic */ ActiveTrackMode[] $VALUES;

    public static ActiveTrackMode[] values() {
        return null;
    }

    public static ActiveTrackMode valueOf(String string) {
        return null;
    }

    private ActiveTrackMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ActiveTrackMode find(int n) {
        return null;
    }

    private static /* synthetic */ ActiveTrackMode[] $values() {
        return null;
    }

    static {
        $VALUES = ActiveTrackMode.$values();
        allValues = ActiveTrackMode.values();
    }
}

