/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class ControlMode
extends Enum<ControlMode>
implements JNIProguardKeepTag {
    public static final /* enum */ ControlMode JP = new ControlMode(1);
    public static final /* enum */ ControlMode USA = new ControlMode(2);
    public static final /* enum */ ControlMode CH = new ControlMode(3);
    public static final /* enum */ ControlMode CUSTOM = new ControlMode(4);
    public static final /* enum */ ControlMode UNKNOWN = new ControlMode(65535);
    private int value;
    private static final ControlMode[] allValues;
    private static final /* synthetic */ ControlMode[] $VALUES;

    public static ControlMode[] values() {
        return null;
    }

    public static ControlMode valueOf(String string) {
        return null;
    }

    private ControlMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ControlMode find(int n) {
        return null;
    }

    private static /* synthetic */ ControlMode[] $values() {
        return null;
    }

    static {
        $VALUES = ControlMode.$values();
        allValues = ControlMode.values();
    }
}

