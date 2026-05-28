/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class PropellerRotationCommand
extends Enum<PropellerRotationCommand>
implements JNIProguardKeepTag {
    public static final /* enum */ PropellerRotationCommand QUERY_STATUS = new PropellerRotationCommand(0);
    public static final /* enum */ PropellerRotationCommand LOW_SPEED_ROTATION = new PropellerRotationCommand(1);
    public static final /* enum */ PropellerRotationCommand LOW_SPEED_REVERSE_ROTATION = new PropellerRotationCommand(2);
    public static final /* enum */ PropellerRotationCommand EXIT_LOW_SPEED_ROTATION = new PropellerRotationCommand(3);
    public static final /* enum */ PropellerRotationCommand UNKNOWN = new PropellerRotationCommand(65535);
    private int value;
    private static final PropellerRotationCommand[] allValues;
    private static final /* synthetic */ PropellerRotationCommand[] $VALUES;

    public static PropellerRotationCommand[] values() {
        return null;
    }

    public static PropellerRotationCommand valueOf(String string) {
        return null;
    }

    private PropellerRotationCommand(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PropellerRotationCommand find(int n) {
        return null;
    }

    private static /* synthetic */ PropellerRotationCommand[] $values() {
        return null;
    }

    static {
        $VALUES = PropellerRotationCommand.$values();
        allValues = PropellerRotationCommand.values();
    }
}

