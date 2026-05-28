/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylineGimbalActuatorRotateMode
extends Enum<WaylineGimbalActuatorRotateMode>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineGimbalActuatorRotateMode RELATIVE_ANGLE = new WaylineGimbalActuatorRotateMode(0);
    public static final /* enum */ WaylineGimbalActuatorRotateMode ABSOLUTE_ANGLE = new WaylineGimbalActuatorRotateMode(1);
    public static final /* enum */ WaylineGimbalActuatorRotateMode UNKNOWN = new WaylineGimbalActuatorRotateMode(65535);
    private int value;
    private static final WaylineGimbalActuatorRotateMode[] allValues;
    private static final /* synthetic */ WaylineGimbalActuatorRotateMode[] $VALUES;

    public static WaylineGimbalActuatorRotateMode[] values() {
        return null;
    }

    public static WaylineGimbalActuatorRotateMode valueOf(String string) {
        return null;
    }

    private WaylineGimbalActuatorRotateMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineGimbalActuatorRotateMode find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineGimbalActuatorRotateMode[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineGimbalActuatorRotateMode.$values();
        allValues = WaylineGimbalActuatorRotateMode.values();
    }
}

