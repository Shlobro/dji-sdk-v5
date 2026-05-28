/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RcSoftSwitchMode
extends Enum<RcSoftSwitchMode>
implements JNIProguardKeepTag {
    public static final /* enum */ RcSoftSwitchMode SPORT = new RcSoftSwitchMode(0);
    public static final /* enum */ RcSoftSwitchMode POSITION = new RcSoftSwitchMode(1);
    public static final /* enum */ RcSoftSwitchMode TRIPOD = new RcSoftSwitchMode(2);
    public static final /* enum */ RcSoftSwitchMode UNKNOWN = new RcSoftSwitchMode(65535);
    private int value;
    private static final RcSoftSwitchMode[] allValues;
    private static final /* synthetic */ RcSoftSwitchMode[] $VALUES;

    public static RcSoftSwitchMode[] values() {
        return null;
    }

    public static RcSoftSwitchMode valueOf(String string) {
        return null;
    }

    private RcSoftSwitchMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RcSoftSwitchMode find(int n) {
        return null;
    }

    private static /* synthetic */ RcSoftSwitchMode[] $values() {
        return null;
    }

    static {
        $VALUES = RcSoftSwitchMode.$values();
        allValues = RcSoftSwitchMode.values();
    }
}

