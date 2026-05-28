/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RCTransformationSwitchState
extends Enum<RCTransformationSwitchState>
implements JNIProguardKeepTag {
    public static final /* enum */ RCTransformationSwitchState RETRACT = new RCTransformationSwitchState(0);
    public static final /* enum */ RCTransformationSwitchState DEPLOY = new RCTransformationSwitchState(1);
    public static final /* enum */ RCTransformationSwitchState UNKNOWN = new RCTransformationSwitchState(65535);
    private int value;
    private static final RCTransformationSwitchState[] allValues;
    private static final /* synthetic */ RCTransformationSwitchState[] $VALUES;

    public static RCTransformationSwitchState[] values() {
        return null;
    }

    public static RCTransformationSwitchState valueOf(String string) {
        return null;
    }

    private RCTransformationSwitchState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RCTransformationSwitchState find(int n) {
        return null;
    }

    private static /* synthetic */ RCTransformationSwitchState[] $values() {
        return null;
    }

    static {
        $VALUES = RCTransformationSwitchState.$values();
        allValues = RCTransformationSwitchState.values();
    }
}

