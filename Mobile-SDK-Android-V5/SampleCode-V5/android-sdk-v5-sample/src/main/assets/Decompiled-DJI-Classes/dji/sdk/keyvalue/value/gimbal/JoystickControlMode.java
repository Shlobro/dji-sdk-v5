/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class JoystickControlMode
extends Enum<JoystickControlMode>
implements JNIProguardKeepTag {
    public static final /* enum */ JoystickControlMode ONE_AXIS = new JoystickControlMode(0);
    public static final /* enum */ JoystickControlMode TWO_AXIS = new JoystickControlMode(1);
    public static final /* enum */ JoystickControlMode UNKNOWN = new JoystickControlMode(65535);
    private int value;
    private static final JoystickControlMode[] allValues;
    private static final /* synthetic */ JoystickControlMode[] $VALUES;

    public static JoystickControlMode[] values() {
        return null;
    }

    public static JoystickControlMode valueOf(String string) {
        return null;
    }

    private JoystickControlMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static JoystickControlMode find(int n) {
        return null;
    }

    private static /* synthetic */ JoystickControlMode[] $values() {
        return null;
    }

    static {
        $VALUES = JoystickControlMode.$values();
        allValues = JoystickControlMode.values();
    }
}

