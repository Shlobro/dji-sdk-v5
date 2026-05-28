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

public final class ExecuteState
extends Enum<ExecuteState>
implements WireEnum {
    public static final /* enum */ ExecuteState EXECUTE_STATE_PREPAREING = new ExecuteState(0);
    public static final /* enum */ ExecuteState EXECUTE_STATE_ENTER_LINE = new ExecuteState(1);
    public static final /* enum */ ExecuteState EXECUTE_STATE_EXECUTING_LINE = new ExecuteState(2);
    public static final /* enum */ ExecuteState EXECUTE_STATE_PAUSED = new ExecuteState(3);
    public static final /* enum */ ExecuteState EXECUTE_STATE_INTERRUPTING = new ExecuteState(4);
    public static final /* enum */ ExecuteState EXECUTE_STATE_EXITING = new ExecuteState(5);
    public static final /* enum */ ExecuteState EXECUTE_STATE_FINISHED_GO_HOME = new ExecuteState(6);
    public static final /* enum */ ExecuteState EXECUTE_STATE_FINISHED_LANDING = new ExecuteState(7);
    public static final /* enum */ ExecuteState EXECUTE_STATE_FINISHED_GOTO_FIRST_POINT = new ExecuteState(8);
    public static final ProtoAdapter<ExecuteState> ADAPTER;
    private final int value;
    private static final /* synthetic */ ExecuteState[] $VALUES;

    public static ExecuteState[] values() {
        return null;
    }

    public static ExecuteState valueOf(String string) {
        return null;
    }

    private ExecuteState(int n2) {
    }

    public static ExecuteState fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ ExecuteState[] $values() {
        return null;
    }

    static {
        $VALUES = ExecuteState.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(ExecuteState.class);
    }
}

