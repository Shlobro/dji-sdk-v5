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

public final class AbstractionState
extends Enum<AbstractionState>
implements WireEnum {
    public static final /* enum */ AbstractionState ABSTRACTION_STATE_UNKNOWN = new AbstractionState(0);
    public static final /* enum */ AbstractionState DISCONNECTED = new AbstractionState(1);
    public static final /* enum */ AbstractionState RECOVERING = new AbstractionState(2);
    public static final /* enum */ AbstractionState NOT_SUPPORTED = new AbstractionState(3);
    public static final /* enum */ AbstractionState READY_TO_UPLOAD = new AbstractionState(4);
    public static final /* enum */ AbstractionState UPLOAD_STARTING = new AbstractionState(5);
    public static final /* enum */ AbstractionState UPLOADING = new AbstractionState(6);
    public static final /* enum */ AbstractionState READY_TO_EXECUTE = new AbstractionState(7);
    public static final /* enum */ AbstractionState EXECUTION_STARTING = new AbstractionState(8);
    public static final /* enum */ AbstractionState EXECUTING = new AbstractionState(9);
    public static final /* enum */ AbstractionState EXECUTION_PAUSING = new AbstractionState(10);
    public static final /* enum */ AbstractionState EXECUTION_PAUSED = new AbstractionState(11);
    public static final /* enum */ AbstractionState EXECUTION_RESUMING = new AbstractionState(12);
    public static final /* enum */ AbstractionState EXECUTION_STOPPING = new AbstractionState(13);
    public static final /* enum */ AbstractionState EXECUTION_INTERRUPTING = new AbstractionState(14);
    public static final /* enum */ AbstractionState EXECUTION_INTERRUPTED = new AbstractionState(15);
    public static final /* enum */ AbstractionState EXECUTION_RECOVERING = new AbstractionState(16);
    public static final /* enum */ AbstractionState READY_TO_RETRY_UPLOAD = new AbstractionState(17);
    public static final /* enum */ AbstractionState UPLOAD_CANCELING = new AbstractionState(18);
    public static final /* enum */ AbstractionState COUNT = new AbstractionState(19);
    public static final ProtoAdapter<AbstractionState> ADAPTER;
    private final int value;
    private static AbstractionState[] mValues;
    private static final /* synthetic */ AbstractionState[] $VALUES;

    public static AbstractionState[] values() {
        return null;
    }

    public static AbstractionState valueOf(String string) {
        return null;
    }

    private AbstractionState(int n2) {
    }

    public static AbstractionState fromValue(int n) {
        return null;
    }

    public static AbstractionState[] getValues() {
        return null;
    }

    public boolean _equals(int n) {
        return false;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ AbstractionState[] $values() {
        return null;
    }

    static {
        $VALUES = AbstractionState.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(AbstractionState.class);
    }
}

