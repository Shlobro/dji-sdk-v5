/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylineActionsRelationType
extends Enum<WaylineActionsRelationType>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineActionsRelationType LEAF = new WaylineActionsRelationType(0);
    public static final /* enum */ WaylineActionsRelationType SEQUENCE = new WaylineActionsRelationType(1);
    public static final /* enum */ WaylineActionsRelationType PARALLEL = new WaylineActionsRelationType(2);
    public static final /* enum */ WaylineActionsRelationType UNKNOWN = new WaylineActionsRelationType(65535);
    private int value;
    private static final WaylineActionsRelationType[] allValues;
    private static final /* synthetic */ WaylineActionsRelationType[] $VALUES;

    public static WaylineActionsRelationType[] values() {
        return null;
    }

    public static WaylineActionsRelationType valueOf(String string) {
        return null;
    }

    private WaylineActionsRelationType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineActionsRelationType find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineActionsRelationType[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineActionsRelationType.$values();
        allValues = WaylineActionsRelationType.values();
    }
}

