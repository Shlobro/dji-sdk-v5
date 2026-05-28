/*
 * Decompiled with CFR 0.152.
 */
package dji.mission.jni;

import dji.jni.JNIProguardKeepTag;
import dji.jni.callback.JNIRetCodeCallback;
import dji.sdk.jni.LibraryLoader;
import dji.sdk.keyvalue.value.mission.WaypointMission;

public class JNIWaypointV2
implements JNIProguardKeepTag {
    public static int loadWaypointMission(int n, int n2, byte[] byArray) {
        return 0;
    }

    public static void performWaypointMissionAction(int n, int n2, WaypointMissionActionType waypointMissionActionType, JNIRetCodeCallback jNIRetCodeCallback) {
    }

    public static WaypointMission getWaypointMission(int n, int n2) {
        return null;
    }

    private static native int native_load_waypoint_mission(int var0, int var1, byte[] var2);

    private static native void native_waypoint_mission_perform_action(int var0, int var1, int var2, JNIRetCodeCallback var3);

    private static native byte[] native_get_waypoint_string_msg(int var0, int var1, int var2);

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

    public static final class StringMsgType
    extends Enum<StringMsgType> {
        public static final /* enum */ StringMsgType MISSION = new StringMsgType(0);
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

