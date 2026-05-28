/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RCMode
extends Enum<RCMode>
implements JNIProguardKeepTag {
    public static final /* enum */ RCMode HOST = new RCMode(0);
    public static final /* enum */ RCMode SLAVE = new RCMode(1);
    public static final /* enum */ RCMode MASTER_SUB = new RCMode(2);
    public static final /* enum */ RCMode SLAVE_SUB = new RCMode(3);
    public static final /* enum */ RCMode CHANNEL_A = new RCMode(4);
    public static final /* enum */ RCMode CHANNEL_B = new RCMode(5);
    public static final /* enum */ RCMode NORMAL = new RCMode(10);
    public static final /* enum */ RCMode UNKNOWN = new RCMode(15);
    private int value;
    private static final RCMode[] allValues;
    private static final /* synthetic */ RCMode[] $VALUES;

    public static RCMode[] values() {
        return null;
    }

    public static RCMode valueOf(String string) {
        return null;
    }

    private RCMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RCMode find(int n) {
        return null;
    }

    private static /* synthetic */ RCMode[] $values() {
        return null;
    }

    static {
        $VALUES = RCMode.$values();
        allValues = RCMode.values();
    }
}

