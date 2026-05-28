/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.flight_task_replay;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.flighttaskreplay.FlightTaskRecordErrorCde;
import dji.sdk.keyvalue.value.flighttaskreplay.FlightTaskRecordFileMsg;

public interface FlightTaskRecordFileInfoObserver
extends JNIProguardKeepTag {
    public void invoke(long var1, FlightTaskRecordFileMsg var3, FlightTaskRecordErrorCde var4);
}

