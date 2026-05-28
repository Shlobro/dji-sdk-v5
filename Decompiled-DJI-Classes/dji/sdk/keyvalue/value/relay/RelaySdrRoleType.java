/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;

public final class RelaySdrRoleType
extends Enum<RelaySdrRoleType>
implements JNIProguardKeepTag {
    public static final /* enum */ RelaySdrRoleType NONE = new RelaySdrRoleType(0);
    public static final /* enum */ RelaySdrRoleType WORK_UAV_ROLE = new RelaySdrRoleType(1);
    public static final /* enum */ RelaySdrRoleType RELAY_UAV_ROLE = new RelaySdrRoleType(2);
    public static final /* enum */ RelaySdrRoleType RELAY_STATION = new RelaySdrRoleType(3);
    public static final /* enum */ RelaySdrRoleType WORK_RC_ROLE = new RelaySdrRoleType(4);
    public static final /* enum */ RelaySdrRoleType RELAY_RC_ROLE = new RelaySdrRoleType(5);
    public static final /* enum */ RelaySdrRoleType UNKNOWN = new RelaySdrRoleType(65535);
    private int value;
    private static final RelaySdrRoleType[] allValues;
    private static final /* synthetic */ RelaySdrRoleType[] $VALUES;

    public static RelaySdrRoleType[] values() {
        return null;
    }

    public static RelaySdrRoleType valueOf(String string) {
        return null;
    }

    private RelaySdrRoleType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelaySdrRoleType find(int n) {
        return null;
    }

    private static /* synthetic */ RelaySdrRoleType[] $values() {
        return null;
    }

    static {
        $VALUES = RelaySdrRoleType.$values();
        allValues = RelaySdrRoleType.values();
    }
}

