/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RCUSBMode
extends Enum<RCUSBMode>
implements JNIProguardKeepTag {
    public static final /* enum */ RCUSBMode HOST = new RCUSBMode(1);
    public static final /* enum */ RCUSBMode SLAVE = new RCUSBMode(2);
    public static final /* enum */ RCUSBMode UNKNOWN = new RCUSBMode(65535);
    private int value;
    private static final RCUSBMode[] allValues;
    private static final /* synthetic */ RCUSBMode[] $VALUES;

    public static RCUSBMode[] values() {
        return null;
    }

    public static RCUSBMode valueOf(String string) {
        return null;
    }

    private RCUSBMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RCUSBMode find(int n) {
        return null;
    }

    private static /* synthetic */ RCUSBMode[] $values() {
        return null;
    }

    static {
        $VALUES = RCUSBMode.$values();
        allValues = RCUSBMode.values();
    }
}

