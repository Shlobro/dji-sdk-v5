/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class IOMode
extends Enum<IOMode>
implements JNIProguardKeepTag {
    public static final /* enum */ IOMode GPIO = new IOMode(0);
    public static final /* enum */ IOMode PWM = new IOMode(1);
    public static final /* enum */ IOMode UNKNOWN = new IOMode(255);
    private int value;
    private static final IOMode[] allValues;
    private static final /* synthetic */ IOMode[] $VALUES;

    public static IOMode[] values() {
        return null;
    }

    public static IOMode valueOf(String string) {
        return null;
    }

    private IOMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static IOMode find(int n) {
        return null;
    }

    private static /* synthetic */ IOMode[] $values() {
        return null;
    }

    static {
        $VALUES = IOMode.$values();
        allValues = IOMode.values();
    }
}

