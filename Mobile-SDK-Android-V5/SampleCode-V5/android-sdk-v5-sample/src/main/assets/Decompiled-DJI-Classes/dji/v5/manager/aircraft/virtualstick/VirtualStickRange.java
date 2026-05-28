/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.virtualstick;

public class VirtualStickRange {
    public static final float VERTICAL_CONTROL_MIN_VELOCITY = -6.0f;
    public static final float VERTICAL_CONTROL_MAX_VELOCITY = 6.0f;
    public static final float VERTICAL_CONTROL_MIN_HEIGHT = 0.0f;
    public static final float VERTICAL_CONTROL_MAX_HEIGHT = 5000.0f;
    public static final float ROLL_PITCH_CONTROL_MAX_VELOCITY = 23.0f;
    public static final float ROLL_PITCH_CONTROL_MIN_VELOCITY = -23.0f;
    public static final float ROLL_PITCH_CONTROL_MAX_ANGLE = 30.0f;
    public static final float ROLL_PITCH_CONTROL_MIN_ANGLE = -30.0f;
    public static final float YAW_CONTROL_MAX_ANGLE = 180.0f;
    public static final float YAW_CONTROL_MIN_ANGLE = -180.0f;
    public static final float YAW_CONTROL_MAX_ANGULAR_VELOCITY = 100.0f;
    public static final float YAW_CONTROL_MIN_ANGULAR_VELOCITY = -100.0f;

    private VirtualStickRange() {
    }
}

