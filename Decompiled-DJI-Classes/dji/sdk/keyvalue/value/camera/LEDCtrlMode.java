/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class LEDCtrlMode
extends Enum<LEDCtrlMode>
implements JNIProguardKeepTag {
    public static final /* enum */ LEDCtrlMode Default = new LEDCtrlMode(0);
    public static final /* enum */ LEDCtrlMode AutoTurnOff = new LEDCtrlMode(1);
    public static final /* enum */ LEDCtrlMode UNKNOWN = new LEDCtrlMode(65535);
    private int value;
    private static final LEDCtrlMode[] allValues;
    private static final /* synthetic */ LEDCtrlMode[] $VALUES;

    public static LEDCtrlMode[] values() {
        return null;
    }

    public static LEDCtrlMode valueOf(String string) {
        return null;
    }

    private LEDCtrlMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LEDCtrlMode find(int n) {
        return null;
    }

    private static /* synthetic */ LEDCtrlMode[] $values() {
        return null;
    }

    static {
        $VALUES = LEDCtrlMode.$values();
        allValues = LEDCtrlMode.values();
    }
}

