/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.squareup.wire.ProtoAdapter
 *  com.squareup.wire.WireEnum
 */
package com.dji.industry.mission.waypointv2.common.waypointv2;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public final class ActionState
extends Enum<ActionState>
implements WireEnum {
    public static final /* enum */ ActionState ACTION_STATE_UNKNOWN = new ActionState(0);
    public static final /* enum */ ActionState ACTION_STATE_DISCONNECTED = new ActionState(1);
    public static final /* enum */ ActionState ACTION_STATE_RECOVERING = new ActionState(2);
    public static final /* enum */ ActionState ACTION_STATE_NOT_SUPPORTED = new ActionState(3);
    public static final /* enum */ ActionState ACTION_STATE_READY_TO_UPLOAD = new ActionState(4);
    public static final /* enum */ ActionState ACTION_STATE_UPLOAD_STARTING = new ActionState(5);
    public static final /* enum */ ActionState ACTION_STATE_UPLOADING = new ActionState(6);
    public static final /* enum */ ActionState ACTION_STATE_READY_TO_EXECUTE = new ActionState(7);
    public static final /* enum */ ActionState ACTION_STATE_EXECUTE_STARTING = new ActionState(8);
    public static final /* enum */ ActionState ACTION_STATE_EXECUTING = new ActionState(9);
    public static final /* enum */ ActionState ACTION_STATE_READY_TO_RETRY_UPLOAD = new ActionState(10);
    public static final /* enum */ ActionState ACTION_STATE_NOT_READY = new ActionState(11);
    public static final /* enum */ ActionState ACTION_UPLOAD_CANCELING = new ActionState(12);
    public static final /* enum */ ActionState ACTION_STATE_COUNT = new ActionState(13);
    public static final ProtoAdapter<ActionState> ADAPTER;
    private final int value;
    private static ActionState[] mValues;
    private static final /* synthetic */ ActionState[] $VALUES;

    public static ActionState[] values() {
        return null;
    }

    public static ActionState valueOf(String string) {
        return null;
    }

    private ActionState(int n2) {
    }

    public static ActionState fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    public static ActionState[] getValues() {
        return null;
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
        ADAPTER = ProtoAdapter.newEnumAdapter(ActionState.class);
    }
}

