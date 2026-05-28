/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class SwitchType
extends Enum<SwitchType>
implements JNIProguardKeepTag {
    public static final /* enum */ SwitchType OFF = new SwitchType(0);
    public static final /* enum */ SwitchType ON = new SwitchType(1);
    public static final /* enum */ SwitchType UNKNOWN = new SwitchType(65535);
    private int value;
    private static final SwitchType[] allValues;
    private static final /* synthetic */ SwitchType[] $VALUES;

    public static SwitchType[] values() {
        return null;
    }

    public static SwitchType valueOf(String string) {
        return null;
    }

    private SwitchType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SwitchType find(int n) {
        return null;
    }

    private static /* synthetic */ SwitchType[] $values() {
        return null;
    }

    static {
        $VALUES = SwitchType.$values();
        allValues = SwitchType.values();
    }
}

