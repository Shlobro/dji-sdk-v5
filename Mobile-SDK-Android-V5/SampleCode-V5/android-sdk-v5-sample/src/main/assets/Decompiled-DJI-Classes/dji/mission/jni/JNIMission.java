/*
 * Decompiled with CFR 0.152.
 */
package dji.mission.jni;

import dji.jni.JNIProguardKeepTag;
import dji.jni.callback.JNIBytesCallback;
import dji.jni.callback.JNIRetCodeCallback;
import dji.mission.jni.callback.JNIMissionActionCallback;
import dji.mission.jni.callback.JNIMissionBytesCallback;
import dji.mission.jni.callback.JNIMissionMgrUpdateCallback;
import dji.sdk.common.CallBack;
import dji.sdk.jni.LibraryLoader;
import dji.sdk.keyvalue.value.mission.WaypointMission;
import dji.sdk.keyvalue.value.mission.WaypointMissionDownloadState;
import dji.sdk.keyvalue.value.mission.WaypointMissionExecutionState;
import dji.sdk.keyvalue.value.mission.WaypointMissionFinishStateMsg;
import dji.sdk.keyvalue.value.mission.WaypointMissionState;
import dji.sdk.keyvalue.value.mission.WaypointMissionStateTransition;
import dji.sdk.keyvalue.value.mission.WaypointMissionUploadState;

public class JNIMission
implements JNIProguardKeepTag {
    public static void setTrackMissionSetting(int n, int n2, byte[] byArray, JNIMissionActionCallback jNIMissionActionCallback) {
    }

    public static void startTrackingMission(int n, int n2, byte[] byArray, JNIMissionActionCallback jNIMissionActionCallback) {
    }

    public static void stopTrackingMission(int n, int n2, JNIMissionActionCallback jNIMissionActionCallback) {
    }

    public static int startListenTrackingMissionState(int n, int n2, JNIMissionBytesCallback jNIMissionBytesCallback) {
        return 0;
    }

    public static void stopListenTrackingMissionState(int n, int n2, int n3) {
    }

    public static void startListenAppAssistedTrackingMissionState(int n, int n2, JNIMissionBytesCallback jNIMissionBytesCallback) {
    }

    public static void stopListenAppAssistedTrackingMissionState(int n, int n2) {
    }

    public static void pushAppAssistedTrackingMissionVisionBox(int n, int n2, String string2) {
    }

    public static void setAppAssistedTrackingMissionVirtualStickControl(int n, int n2, String string2) {
    }

    public static void getAppAssistedTrackingMissionState(int n, int n2, JNIMissionBytesCallback jNIMissionBytesCallback) {
    }

    public static void setMissionMgrUpdateCallback(JNIMissionMgrUpdateCallback jNIMissionMgrUpdateCallback) {
    }

    public static void resetMissionState(int n, int n2, JNIRetCodeCallback jNIRetCodeCallback) {
    }

    public static void loadWaypointMission(int n, int n2, byte[] byArray, JNIRetCodeCallback jNIRetCodeCallback) {
    }

    public static void performWaypointMissionAction(int n, int n2, WaypointMissionActionType waypointMissionActionType, JNIRetCodeCallback jNIRetCodeCallback) {
    }

    public static int addWaypointUploadEventListener(int n, int n2, CallBack<WaypointMissionUploadState> callBack) {
        return 0;
    }

    public static int addWaypointDownloadEventListener(int n, int n2, CallBack<WaypointMissionDownloadState> callBack) {
        return 0;
    }

    public static int addWaypointExecutionEventListener(int n, int n2, CallBack<WaypointMissionExecutionState> callBack) {
        return 0;
    }

    public static int addWaypointFinishEventListener(int n, int n2, CallBack<WaypointMissionFinishStateMsg> callBack) {
        return 0;
    }

    public static int addWaypointStateListener(int n, int n2, CallBack<WaypointMissionStateTransition> callBack) {
        return 0;
    }

    public static void removeWaypointExecutionEventListener(int n, int n2, int n3) {
    }

    public static void removeWaypointUploadEventListener(int n, int n2, int n3) {
    }

    public static void removeWaypointDownloadEventListener(int n, int n2, int n3) {
    }

    public static void removeWaypointFinishEventListener(int n, int n2, int n3) {
    }

    public static void removeWaypointStateListener(int n, int n2, int n3) {
    }

    public static WaypointMissionState getWaypointState(int n, int n2) {
        return null;
    }

    public static WaypointMission getWaypointMission(int n, int n2) {
        return null;
    }

    public static WaypointMissionExecutionState getWaypointMissionExecutionState(int n, int n2) {
        return null;
    }

    private static native void native_set_tracking_mission_setting(int var0, int var1, byte[] var2, JNIMissionActionCallback var3);

    private static native void native_start_tracking_mission(int var0, int var1, byte[] var2, JNIMissionActionCallback var3);

    private static native void native_stop_tracking_mission(int var0, int var1, JNIMissionActionCallback var2);

    private static native int native_start_listen_tracking_state(int var0, int var1, JNIMissionBytesCallback var2);

    private static native void native_stop_listen_tracking_mission_state(int var0, int var1, int var2);

    private static native void native_start_listen_app_assisted_tracking_mission_state(int var0, int var1, JNIMissionBytesCallback var2);

    private static native void native_stop_listen_app_assisted_tracking_mission_state(int var0, int var1);

    private static native void native_push_app_assisted_tracking_vision_box(int var0, int var1, String var2);

    private static native void native_set_app_assisted_tracking_virtual_stick_control(int var0, int var1, String var2);

    private static native void native_get_app_assisted_tracking_mission_state(int var0, int var1, JNIMissionBytesCallback var2);

    private static native void native_set_mission_mgr_update_callback(JNIMissionMgrUpdateCallback var0);

    private static native void native_reset_mission_state(int var0, int var1, JNIRetCodeCallback var2);

    private static native void native_load_waypoint_mission(int var0, int var1, byte[] var2, JNIRetCodeCallback var3);

    private static native void native_waypoint_mission_perform_action(int var0, int var1, int var2, JNIRetCodeCallback var3);

    private static native int native_add_waypoint_listener(int var0, int var1, int var2, JNIBytesCallback var3);

    private static native void native_remove_waypoint_listener(int var0, int var1, int var2, int var3);

    private static native int native_get_waypoint_mission_state(int var0, int var1);

    private static native byte[] native_get_waypoint_string_msg(int var0, int var1, int var2);

    private static /* synthetic */ void lambda$addWaypointStateListener$4(CallBack callBack, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$addWaypointFinishEventListener$3(CallBack callBack, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$addWaypointExecutionEventListener$2(CallBack callBack, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$addWaypointDownloadEventListener$1(CallBack callBack, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$addWaypointUploadEventListener$0(CallBack callBack, byte[] byArray) {
    }

    static {
        LibraryLoader.load();
    }

    public static final class WaypointMissionActionType
    extends Enum<WaypointMissionActionType> {
        public static final /* enum */ WaypointMissionActionType UPLOAD_MISSION = new WaypointMissionActionType(0);
        public static final /* enum */ WaypointMissionActionType RETRY_UPLOAD_MISSION = new WaypointMissionActionType(1);
        public static final /* enum */ WaypointMissionActionType CANCEL_UPLOAD_MISSION = new WaypointMissionActionType(2);
        public static final /* enum */ WaypointMissionActionType DOWNLOAD_MISSION = new WaypointMissionActionType(3);
        public static final /* enum */ WaypointMissionActionType RETRY_DOWNLOAD_MISSION = new WaypointMissionActionType(4);
        public static final /* enum */ WaypointMissionActionType CANCEL_DOWNLOAD_MISSION = new WaypointMissionActionType(5);
        public static final /* enum */ WaypointMissionActionType START_MISSION = new WaypointMissionActionType(6);
        public static final /* enum */ WaypointMissionActionType STOP_MISSION = new WaypointMissionActionType(7);
        public static final /* enum */ WaypointMissionActionType PAUSE_MISSION = new WaypointMissionActionType(8);
        public static final /* enum */ WaypointMissionActionType RESUME_MISSION = new WaypointMissionActionType(9);
        public static final /* enum */ WaypointMissionActionType UNKNOWN = new WaypointMissionActionType(65535);
        private int value;
        private static final /* synthetic */ WaypointMissionActionType[] $VALUES;

        public static WaypointMissionActionType[] values() {
            return null;
        }

        public static WaypointMissionActionType valueOf(String string2) {
            return null;
        }

        private WaypointMissionActionType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean equals(int n) {
            return false;
        }

        public static WaypointMissionActionType find(int n) {
            return null;
        }

        private static /* synthetic */ WaypointMissionActionType[] $values() {
            return null;
        }

        static {
            $VALUES = WaypointMissionActionType.$values();
        }
    }

    public static final class WaypointListenerType
    extends Enum<WaypointListenerType> {
        public static final /* enum */ WaypointListenerType UPLOAD = new WaypointListenerType(0);
        public static final /* enum */ WaypointListenerType DOWNLOAD = new WaypointListenerType(1);
        public static final /* enum */ WaypointListenerType EXECUTION = new WaypointListenerType(2);
        public static final /* enum */ WaypointListenerType GLOBAL_STATE = new WaypointListenerType(3);
        public static final /* enum */ WaypointListenerType FINISH_STATE = new WaypointListenerType(4);
        public static final /* enum */ WaypointListenerType UNKNOWN = new WaypointListenerType(65535);
        private int value;
        private static final /* synthetic */ WaypointListenerType[] $VALUES;

        public static WaypointListenerType[] values() {
            return null;
        }

        public static WaypointListenerType valueOf(String string2) {
            return null;
        }

        private WaypointListenerType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean equals(int n) {
            return false;
        }

        public static WaypointListenerType find(int n) {
            return null;
        }

        private static /* synthetic */ WaypointListenerType[] $values() {
            return null;
        }

        static {
            $VALUES = WaypointListenerType.$values();
        }
    }

    public static final class StringMsgType
    extends Enum<StringMsgType> {
        public static final /* enum */ StringMsgType MISSION = new StringMsgType(0);
        public static final /* enum */ StringMsgType EXECUTION_EVENT = new StringMsgType(1);
        public static final /* enum */ StringMsgType UNKNOWN = new StringMsgType(65535);
        private int value;
        private static final /* synthetic */ StringMsgType[] $VALUES;

        public static StringMsgType[] values() {
            return null;
        }

        public static StringMsgType valueOf(String string2) {
            return null;
        }

        private StringMsgType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean equals(int n) {
            return false;
        }

        public static StringMsgType find(int n) {
            return null;
        }

        static /* synthetic */ int access$000(StringMsgType stringMsgType) {
            return 0;
        }

        private static /* synthetic */ StringMsgType[] $values() {
            return null;
        }

        static {
            $VALUES = StringMsgType.$values();
        }
    }
}

