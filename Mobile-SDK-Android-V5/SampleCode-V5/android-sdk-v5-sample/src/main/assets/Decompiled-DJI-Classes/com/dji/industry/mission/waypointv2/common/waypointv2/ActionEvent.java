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

public final class ActionEvent
extends Enum<ActionEvent>
implements WireEnum {
    public static final /* enum */ ActionEvent ACTION_EVENT_INITIALIZED = new ActionEvent(0);
    public static final /* enum */ ActionEvent ACTION_EVENT_WAYPOINT_UPLOAD = new ActionEvent(1);
    public static final /* enum */ ActionEvent ACTION_EVENT_DISCONNECTED = new ActionEvent(2);
    public static final /* enum */ ActionEvent ACTION_EVENT_UPLOAD_FAILED = new ActionEvent(3);
    public static final /* enum */ ActionEvent ACTION_EVENT_UPLOAD_PROGRESS_UPDATE = new ActionEvent(4);
    public static final /* enum */ ActionEvent ACTION_EVENT_UPLOAD_DONE = new ActionEvent(5);
    public static final /* enum */ ActionEvent ACTION_EVENT_DOWNLOAD_FAILED = new ActionEvent(6);
    public static final /* enum */ ActionEvent ACTION_EVENT_DOWNLOAD_PROGRESS_UPDATE = new ActionEvent(7);
    public static final /* enum */ ActionEvent ACTION_EVENT_DOWNLOAD_DONE = new ActionEvent(8);
    public static final /* enum */ ActionEvent ACTION_EVENT_EXECUTION_STARTED = new ActionEvent(9);
    public static final /* enum */ ActionEvent ACTION_EVENT_EXECUTION_START_FAILED = new ActionEvent(10);
    public static final /* enum */ ActionEvent ACTION_EVENT_EXECUTION_FINISHED = new ActionEvent(11);
    public static final /* enum */ ActionEvent ACTION_EVENT_EXECUTION_FAILED = new ActionEvent(12);
    public static final /* enum */ ActionEvent ACTION_EVENT_MISSION_STARTED = new ActionEvent(13);
    public static final /* enum */ ActionEvent ACTION_EVENT_MISSION_STOPED = new ActionEvent(14);
    public static final /* enum */ ActionEvent ACTION_UPLOAD_CANCELLED = new ActionEvent(15);
    public static final /* enum */ ActionEvent ACTION_EVENT_COUNT = new ActionEvent(16);
    public static final ProtoAdapter<ActionEvent> ADAPTER;
    private final int value;
    private static final /* synthetic */ ActionEvent[] $VALUES;

    public static ActionEvent[] values() {
        return null;
    }

    public static ActionEvent valueOf(String string) {
        return null;
    }

    private ActionEvent(int n2) {
    }

    public static ActionEvent fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ ActionEvent[] $values() {
        return null;
    }

    static {
        $VALUES = ActionEvent.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(ActionEvent.class);
    }
}

