/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.flight_task_replay.jni;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.flight_task_replay.FlightTaskRecordActionCallback;
import dji.sdk.flight_task_replay.FlightTaskRecordFileActionCallback;
import dji.sdk.flight_task_replay.FlightTaskRecordFileInfoCallback;
import dji.sdk.flight_task_replay.FlightTaskRecordFileInfoObserver;
import dji.sdk.keyvalue.value.flighttaskreplay.FlightTaskDeviceInfo;
import dji.sdk.keyvalue.value.flighttaskreplay.FlightTaskDeviceState;
import dji.sdk.keyvalue.value.flighttaskreplay.FlightTaskInfo;
import dji.sdk.keyvalue.value.flighttaskreplay.FlightTaskRecorder;
import dji.sdk.keyvalue.value.flighttaskreplay.FlightTaskTriggerState;

public class FlightTaskReplayManager
implements JNIProguardKeepTag {
    public static void updateFlightTaskFrameState(FlightTaskDeviceState flightTaskDeviceState, String string) {
    }

    public static void updateFlightTaskFrameState(FlightTaskDeviceState flightTaskDeviceState, int n) {
    }

    public static void updateFlightTaskFrameState(FlightTaskDeviceState flightTaskDeviceState, double d2) {
    }

    public static void updateFlightTaskDeviceInfo(FlightTaskDeviceInfo flightTaskDeviceInfo) {
    }

    public static void updateFlightTaskTriggerState(FlightTaskTriggerState flightTaskTriggerState, String string) {
    }

    public static void updateFlightTaskTriggerState(FlightTaskTriggerState flightTaskTriggerState, int n) {
    }

    public static void updateFlightTaskTriggerState(FlightTaskTriggerState flightTaskTriggerState, double d2) {
    }

    public static void flightTaskStartRecord(FlightTaskInfo flightTaskInfo, FlightTaskRecordFileActionCallback flightTaskRecordFileActionCallback) {
    }

    public static void flightTaskStopRecord(long l2, int n, FlightTaskRecordActionCallback flightTaskRecordActionCallback) {
    }

    public static void configFlightTaskParams(String string, FlightTaskRecorder flightTaskRecorder) {
    }

    public static void getFlightTaskFileInfo(long l2, String string, FlightTaskRecordFileInfoCallback flightTaskRecordFileInfoCallback) {
    }

    public static long addFlightTaskFileInfoObserver(FlightTaskRecordFileInfoObserver flightTaskRecordFileInfoObserver) {
        return 0L;
    }

    public static void removeFlightTaskFileInfoObserver(long l2) {
    }

    private static native void native_UpdateFlightTaskFrameState(byte[] var0, String var1);

    private static native void native_UpdateFlightTaskFrameState(byte[] var0, int var1);

    private static native void native_UpdateFlightTaskFrameState(byte[] var0, double var1);

    private static native void native_UpdateFlightTaskDeviceInfo(byte[] var0);

    private static native void native_UpdateFlightTaskTriggerState(byte[] var0, String var1);

    private static native void native_UpdateFlightTaskTriggerState(byte[] var0, int var1);

    private static native void native_UpdateFlightTaskTriggerState(byte[] var0, double var1);

    private static native void native_FlightTaskStartRecord(byte[] var0, FlightTaskRecordFileActionCallback var1);

    private static native void native_FlightTaskStopRecord(long var0, int var2, FlightTaskRecordActionCallback var3);

    private static native void native_ConfigFlightTaskParams(String var0, int var1);

    private static native void native_GetFlightTaskFileInfo(long var0, String var2, FlightTaskRecordFileInfoCallback var3);

    private static native long native_AddFlightTaskFileInfoObserver(FlightTaskRecordFileInfoObserver var0);

    private static native void native_RemoveFlightTaskFileInfoObserver(long var0);
}

