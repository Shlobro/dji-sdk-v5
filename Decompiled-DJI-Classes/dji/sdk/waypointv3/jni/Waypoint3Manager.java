/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.waypointv3.jni;

import dji.jni.JNIProguardKeepTag;
import dji.jni.waypointv3.Waypoint3CommonErrorCodeCallback;
import dji.jni.waypointv3.Waypoint3ErrorCodeCallback;
import dji.jni.waypointv3.Waypoint3TransferStateCallback;
import dji.jni.waypointv3.WaypointV3BreakPointInfoCallback;
import dji.jni.waypointv3.WaypointV3ExcutingActionInfoCallback;
import dji.jni.waypointv3.WaypointV3ExcutingWaylineInfoCallback;
import dji.jni.waypointv3.WaypointV3ExcutionResultInfoCallback;
import dji.jni.waypointv3.WaypointV3MissionStateCallback;
import dji.jni.waypointv3.WaypointV3PrecisePhotoTransferStateCallback;
import dji.sdk.keyvalue.value.waypointv3.MissionInfo;
import dji.sdk.keyvalue.value.waypointv3.PointInfo;
import dji.sdk.keyvalue.value.waypointv3.PrecisePhotoFileFileInfo;
import java.util.List;

public class Waypoint3Manager
implements JNIProguardKeepTag {
    public static void registerWaypoint3Device(long l2, long l3) {
    }

    public static void unRegisterWaypoint3Device(long l2, long l3) {
    }

    public static void uploadKMZFile(long l2, long l3, String string, Waypoint3CommonErrorCodeCallback waypoint3CommonErrorCodeCallback, Waypoint3TransferStateCallback waypoint3TransferStateCallback) {
    }

    public static void cancelUploadKMZFile(long l2, long l3, Waypoint3CommonErrorCodeCallback waypoint3CommonErrorCodeCallback) {
    }

    public static long addWaypointV3ExecutionStateChangeCallback(long l2, long l3, WaypointV3MissionStateCallback waypointV3MissionStateCallback) {
        return 0L;
    }

    public static void removeWaypointV3ExecutionStateChangeCallback(long l2, long l3, long l4) {
    }

    public static long addWaypointV3ExecutingWaylineInfoChangeCallback(long l2, long l3, WaypointV3ExcutingWaylineInfoCallback waypointV3ExcutingWaylineInfoCallback) {
        return 0L;
    }

    public static void removeWaypointV3ExecutingWaylineInfoChangeCallback(long l2, long l3, long l4) {
    }

    public static long addWaypointV3ExecutingActionInfoChangeCallback(long l2, long l3, WaypointV3ExcutingActionInfoCallback waypointV3ExcutingActionInfoCallback) {
        return 0L;
    }

    public static void removeWaypointV3ExecutingActionInfoChangeCallback(long l2, long l3, long l4) {
    }

    public static void queryWaypointV3ExecutionResult(long l2, long l3, WaypointV3ExcutionResultInfoCallback waypointV3ExcutionResultInfoCallback, Waypoint3CommonErrorCodeCallback waypoint3CommonErrorCodeCallback) {
    }

    public static void queryWaypointV3BreakPointInfo(long l2, long l3, String string, WaypointV3BreakPointInfoCallback waypointV3BreakPointInfoCallback, Waypoint3CommonErrorCodeCallback waypoint3CommonErrorCodeCallback) {
    }

    public static void v3StartMission(long l2, long l3, String string, Waypoint3ErrorCodeCallback waypoint3ErrorCodeCallback) {
    }

    public static void v3StartWayline(long l2, long l3, String string, MissionInfo missionInfo, Waypoint3ErrorCodeCallback waypoint3ErrorCodeCallback) {
    }

    public static void v3StopMission(long l2, long l3, String string, Waypoint3ErrorCodeCallback waypoint3ErrorCodeCallback) {
    }

    public static void v3InterruptWayline(long l2, long l3, Waypoint3ErrorCodeCallback waypoint3ErrorCodeCallback) {
    }

    public static void v3ResumeFromBreakPoint(long l2, long l3, Waypoint3ErrorCodeCallback waypoint3ErrorCodeCallback) {
    }

    public static void v3ResumeFromDeterminedPoint(long l2, long l3, int n, PointInfo pointInfo, Waypoint3ErrorCodeCallback waypoint3ErrorCodeCallback) {
    }

    public static void uploadPrecisePhotoFile(long l2, long l3, List<PrecisePhotoFileFileInfo> list, Waypoint3CommonErrorCodeCallback waypoint3CommonErrorCodeCallback, WaypointV3PrecisePhotoTransferStateCallback waypointV3PrecisePhotoTransferStateCallback) {
    }

    public static void cancelUploadPrecisePhotoFile(long l2, long l3, Waypoint3CommonErrorCodeCallback waypoint3CommonErrorCodeCallback) {
    }

    private static native void native_RegisterWaypoint3Device(long var0, long var2);

    private static native void native_UnRegisterWaypoint3Device(long var0, long var2);

    private static native void native_UploadKMZFile(long var0, long var2, String var4, Waypoint3CommonErrorCodeCallback var5, Waypoint3TransferStateCallback var6);

    private static native void native_CancelUploadKMZFile(long var0, long var2, Waypoint3CommonErrorCodeCallback var4);

    private static native long native_AddWaypointV3ExecutionStateChangeCallback(long var0, long var2, WaypointV3MissionStateCallback var4);

    private static native void native_RemoveWaypointV3ExecutionStateChangeCallback(long var0, long var2, long var4);

    private static native long native_AddWaypointV3ExecutingWaylineInfoChangeCallback(long var0, long var2, WaypointV3ExcutingWaylineInfoCallback var4);

    private static native void native_RemoveWaypointV3ExecutingWaylineInfoChangeCallback(long var0, long var2, long var4);

    private static native long native_AddWaypointV3ExecutingActionInfoChangeCallback(long var0, long var2, WaypointV3ExcutingActionInfoCallback var4);

    private static native void native_RemoveWaypointV3ExecutingActionInfoChangeCallback(long var0, long var2, long var4);

    private static native void native_QueryWaypointV3ExecutionResult(long var0, long var2, WaypointV3ExcutionResultInfoCallback var4, Waypoint3CommonErrorCodeCallback var5);

    private static native void native_QueryWaypointV3BreakPointInfo(long var0, long var2, String var4, WaypointV3BreakPointInfoCallback var5, Waypoint3CommonErrorCodeCallback var6);

    private static native void native_V3StartMission(long var0, long var2, String var4, Waypoint3ErrorCodeCallback var5);

    private static native void native_V3StartWayline(long var0, long var2, String var4, byte[] var5, Waypoint3ErrorCodeCallback var6);

    private static native void native_V3StopMission(long var0, long var2, String var4, Waypoint3ErrorCodeCallback var5);

    private static native void native_V3InterruptWayline(long var0, long var2, Waypoint3ErrorCodeCallback var4);

    private static native void native_V3ResumeFromBreakPoint(long var0, long var2, Waypoint3ErrorCodeCallback var4);

    private static native void native_V3ResumeFromDeterminedPoint(long var0, long var2, int var4, byte[] var5, Waypoint3ErrorCodeCallback var6);

    private static native void native_UploadPrecisePhotoFile(long var0, long var2, List<byte[]> var4, Waypoint3CommonErrorCodeCallback var5, WaypointV3PrecisePhotoTransferStateCallback var6);

    private static native void native_CancelUploadPrecisePhotoFile(long var0, long var2, Waypoint3CommonErrorCodeCallback var4);
}

