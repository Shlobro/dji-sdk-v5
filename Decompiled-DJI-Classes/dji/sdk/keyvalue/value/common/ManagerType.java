/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class ManagerType
extends Enum<ManagerType>
implements JNIProguardKeepTag {
    public static final /* enum */ ManagerType TRACKING = new ManagerType(0);
    public static final /* enum */ ManagerType WAYPOINT = new ManagerType(1);
    public static final /* enum */ ManagerType FLYSAFE = new ManagerType(2);
    public static final /* enum */ ManagerType WAYPOINT_V2 = new ManagerType(3);
    public static final /* enum */ ManagerType UNKNOWN = new ManagerType(65535);
    private int value;
    private static final ManagerType[] allValues;
    private static final /* synthetic */ ManagerType[] $VALUES;

    public static ManagerType[] values() {
        return null;
    }

    public static ManagerType valueOf(String string) {
        return null;
    }

    private ManagerType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ManagerType find(int n) {
        return null;
    }

    private static /* synthetic */ ManagerType[] $values() {
        return null;
    }

    static {
        $VALUES = ManagerType.$values();
        allValues = ManagerType.values();
    }
}

