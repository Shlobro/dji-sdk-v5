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

public final class AbstractionEvent
extends Enum<AbstractionEvent>
implements WireEnum {
    public static final /* enum */ AbstractionEvent INITIALIZED = new AbstractionEvent(0);
    public static final /* enum */ AbstractionEvent SIMULATION_OFF = new AbstractionEvent(1);
    public static final /* enum */ AbstractionEvent EVENT_DISCONNECTED = new AbstractionEvent(2);
    public static final /* enum */ AbstractionEvent CONNECTED = new AbstractionEvent(3);
    public static final /* enum */ AbstractionEvent UPLOAD_FAILED = new AbstractionEvent(4);
    public static final /* enum */ AbstractionEvent UPLOAD_PROGRESS_UPDATE = new AbstractionEvent(5);
    public static final /* enum */ AbstractionEvent UPLOAD_DONE = new AbstractionEvent(6);
    public static final /* enum */ AbstractionEvent DOWNLOAD_FAILED = new AbstractionEvent(7);
    public static final /* enum */ AbstractionEvent DOWNLOAD_PROGRESS_UPDATE = new AbstractionEvent(8);
    public static final /* enum */ AbstractionEvent DOWNLOAD_DONE = new AbstractionEvent(9);
    public static final /* enum */ AbstractionEvent EXECUTION_STARTED = new AbstractionEvent(10);
    public static final /* enum */ AbstractionEvent EXECUTION_START_FAILED = new AbstractionEvent(11);
    public static final /* enum */ AbstractionEvent EVENT_EXECUTION_PAUSED = new AbstractionEvent(12);
    public static final /* enum */ AbstractionEvent EXECUTION_PAUSE_FAILED = new AbstractionEvent(13);
    public static final /* enum */ AbstractionEvent EXECUTION_STOPPED = new AbstractionEvent(14);
    public static final /* enum */ AbstractionEvent EXECUTION_STOP_FAILED = new AbstractionEvent(15);
    public static final /* enum */ AbstractionEvent EXECUTION_RESUMED = new AbstractionEvent(16);
    public static final /* enum */ AbstractionEvent EXECUTION_RESUME_FAILED = new AbstractionEvent(17);
    public static final /* enum */ AbstractionEvent EXECUTION_PROGRESS_UPDATE = new AbstractionEvent(18);
    public static final /* enum */ AbstractionEvent EXECUTION_INTERRUPTED_EVENT = new AbstractionEvent(19);
    public static final /* enum */ AbstractionEvent EXECUTION_FINISHED = new AbstractionEvent(20);
    public static final /* enum */ AbstractionEvent EXECUTION_INTERRUPTED_FAILED = new AbstractionEvent(21);
    public static final /* enum */ AbstractionEvent EXECUTION_RECOVERED = new AbstractionEvent(22);
    public static final /* enum */ AbstractionEvent EXECUTION_RECOVER_FAILED = new AbstractionEvent(23);
    public static final /* enum */ AbstractionEvent EXECUTION_PAUSED_BY_AVOIDANCE = new AbstractionEvent(24);
    public static final /* enum */ AbstractionEvent EXECUTION_UPLOAD_CANCELLED = new AbstractionEvent(25);
    public static final /* enum */ AbstractionEvent EXECUTION_DONE = new AbstractionEvent(26);
    public static final ProtoAdapter<AbstractionEvent> ADAPTER;
    private final int value;
    private static AbstractionEvent[] mValues;
    private static final /* synthetic */ AbstractionEvent[] $VALUES;

    public static AbstractionEvent[] values() {
        return null;
    }

    public static AbstractionEvent valueOf(String string) {
        return null;
    }

    private AbstractionEvent(int n2) {
    }

    public static AbstractionEvent fromValue(int n) {
        return null;
    }

    public static AbstractionEvent[] getValues() {
        return null;
    }

    public boolean _equals(int n) {
        return false;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ AbstractionEvent[] $values() {
        return null;
    }

    static {
        $VALUES = AbstractionEvent.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(AbstractionEvent.class);
    }
}

