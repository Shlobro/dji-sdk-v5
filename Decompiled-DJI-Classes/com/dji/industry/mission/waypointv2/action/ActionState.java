/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.waypointv2.action;

public final class ActionState
extends Enum<ActionState> {
    public static final /* enum */ ActionState DISCONNECTED = new ActionState(1);
    public static final /* enum */ ActionState RECOVERING = new ActionState(2);
    public static final /* enum */ ActionState NOT_SUPPORTED = new ActionState(3);
    public static final /* enum */ ActionState READY_TO_UPLOAD = new ActionState(4);
    public static final /* enum */ ActionState UPLOADING = new ActionState(6);
    public static final /* enum */ ActionState READY_TO_EXECUTE = new ActionState(7);
    public static final /* enum */ ActionState Executing = new ActionState(9);
    public static final /* enum */ ActionState UploadCancel = new ActionState(12);
    public static final /* enum */ ActionState Interrupted = new ActionState(13);
    public static final /* enum */ ActionState UNKNOWN = new ActionState(255);
    private int value;
    private static ActionState[] VALUES;
    private static final /* synthetic */ ActionState[] $VALUES;

    public static ActionState[] values() {
        return null;
    }

    public static ActionState valueOf(String string) {
        return null;
    }

    private ActionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean _equals(int n) {
        return false;
    }

    public static ActionState find(int n) {
        return null;
    }

    private static /* synthetic */ ActionState[] $values() {
        return null;
    }

    static {
        $VALUES = ActionState.$values();
        VALUES = null;
    }
}

