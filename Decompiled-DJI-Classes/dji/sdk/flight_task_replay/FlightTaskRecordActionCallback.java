/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.flight_task_replay;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.flighttaskreplay.FlightTaskRecordErrorCde;

public interface FlightTaskRecordActionCallback
extends JNIProguardKeepTag {
    public void invoke(long var1, FlightTaskRecordErrorCde var3);
}

