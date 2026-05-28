/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class JoystickControlSpeed
extends Enum<JoystickControlSpeed>
implements JNIProguardKeepTag {
    public static final /* enum */ JoystickControlSpeed CUSTOM = new JoystickControlSpeed(0);
    public static final /* enum */ JoystickControlSpeed SLOW = new JoystickControlSpeed(1);
    public static final /* enum */ JoystickControlSpeed MEDIUM = new JoystickControlSpeed(2);
    public static final /* enum */ JoystickControlSpeed FAST = new JoystickControlSpeed(3);
    public static final /* enum */ JoystickControlSpeed UNKNOWN = new JoystickControlSpeed(65535);
    private int value;
    private static final JoystickControlSpeed[] allValues;
    private static final /* synthetic */ JoystickControlSpeed[] $VALUES;

    public static JoystickControlSpeed[] values() {
        return null;
    }

    public static JoystickControlSpeed valueOf(String string) {
        return null;
    }

    private JoystickControlSpeed(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static JoystickControlSpeed find(int n) {
        return null;
    }

    private static /* synthetic */ JoystickControlSpeed[] $values() {
        return null;
    }

    static {
        $VALUES = JoystickControlSpeed.$values();
        allValues = JoystickControlSpeed.values();
    }
}

