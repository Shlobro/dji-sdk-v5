/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCIOCMode
extends Enum<FCIOCMode>
implements JNIProguardKeepTag {
    public static final /* enum */ FCIOCMode NOT_IN_IOC = new FCIOCMode(0);
    public static final /* enum */ FCIOCMode DIRECTION_LOCKED = new FCIOCMode(1);
    public static final /* enum */ FCIOCMode HOTPOINT_SURROUND = new FCIOCMode(2);
    public static final /* enum */ FCIOCMode HOMEPOINT_LOCKED = new FCIOCMode(3);
    public static final /* enum */ FCIOCMode UNKNOWN = new FCIOCMode(65535);
    private int value;
    private static final FCIOCMode[] allValues;
    private static final /* synthetic */ FCIOCMode[] $VALUES;

    public static FCIOCMode[] values() {
        return null;
    }

    public static FCIOCMode valueOf(String string) {
        return null;
    }

    private FCIOCMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCIOCMode find(int n) {
        return null;
    }

    private static /* synthetic */ FCIOCMode[] $values() {
        return null;
    }

    static {
        $VALUES = FCIOCMode.$values();
        allValues = FCIOCMode.values();
    }
}

