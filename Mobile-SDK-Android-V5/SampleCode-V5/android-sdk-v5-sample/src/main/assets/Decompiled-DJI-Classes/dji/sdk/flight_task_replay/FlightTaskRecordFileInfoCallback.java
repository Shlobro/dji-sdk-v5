/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.flight_task_replay;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.flighttaskreplay.FlightTaskRecordErrorCde;

public interface FlightTaskRecordFileInfoCallback
extends JNIProguardKeepTag {
    public void invoke(long var1, FlightTaskRecordErrorCde var3, String var4, String var5, String var6);
}

