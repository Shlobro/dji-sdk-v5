/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RCFlightModeSwitch
extends Enum<RCFlightModeSwitch>
implements JNIProguardKeepTag {
    public static final /* enum */ RCFlightModeSwitch SWITCH_ONE = new RCFlightModeSwitch(0);
    public static final /* enum */ RCFlightModeSwitch SWITCH_TWO = new RCFlightModeSwitch(1);
    public static final /* enum */ RCFlightModeSwitch SWITCH_THREE = new RCFlightModeSwitch(2);
    public static final /* enum */ RCFlightModeSwitch UNKNOWN = new RCFlightModeSwitch(65535);
    private int value;
    private static final RCFlightModeSwitch[] allValues;
    private static final /* synthetic */ RCFlightModeSwitch[] $VALUES;

    public static RCFlightModeSwitch[] values() {
        return null;
    }

    public static RCFlightModeSwitch valueOf(String string) {
        return null;
    }

    private RCFlightModeSwitch(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RCFlightModeSwitch find(int n) {
        return null;
    }

    private static /* synthetic */ RCFlightModeSwitch[] $values() {
        return null;
    }

    static {
        $VALUES = RCFlightModeSwitch.$values();
        allValues = RCFlightModeSwitch.values();
    }
}

