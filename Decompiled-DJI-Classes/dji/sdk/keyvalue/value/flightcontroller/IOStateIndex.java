/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class IOStateIndex
extends Enum<IOStateIndex>
implements JNIProguardKeepTag {
    public static final /* enum */ IOStateIndex IO_STATE_0 = new IOStateIndex(0);
    public static final /* enum */ IOStateIndex IO_STATE_1 = new IOStateIndex(1);
    public static final /* enum */ IOStateIndex IO_STATE_2 = new IOStateIndex(2);
    public static final /* enum */ IOStateIndex IO_STATE_3 = new IOStateIndex(3);
    public static final /* enum */ IOStateIndex IO_STATE_4 = new IOStateIndex(4);
    public static final /* enum */ IOStateIndex UNKNOWN = new IOStateIndex(255);
    private int value;
    private static final IOStateIndex[] allValues;
    private static final /* synthetic */ IOStateIndex[] $VALUES;

    public static IOStateIndex[] values() {
        return null;
    }

    public static IOStateIndex valueOf(String string) {
        return null;
    }

    private IOStateIndex(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static IOStateIndex find(int n) {
        return null;
    }

    private static /* synthetic */ IOStateIndex[] $values() {
        return null;
    }

    static {
        $VALUES = IOStateIndex.$values();
        allValues = IOStateIndex.values();
    }
}

