/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package com.dji.industry.mission.waypointv2.action;

import androidx.annotation.Nullable;
import com.dji.industry.mission.waypointv2.action.ActionTypes;
import com.dji.industry.mission.waypointv2.action.WaypointCameraCustomNameParam;
import com.dji.industry.mission.waypointv2.action.WaypointCameraFocusModeParam;
import com.dji.industry.mission.waypointv2.action.WaypointCameraFocusParam;
import com.dji.industry.mission.waypointv2.action.WaypointCameraStartIntervalShotParam;
import com.dji.industry.mission.waypointv2.action.WaypointCameraStopIntervalShotParam;
import com.dji.industry.mission.waypointv2.action.WaypointCameraZoomParam;

public class WaypointCameraActuatorParam {
    private final ActionTypes.CameraOperationType cameraOperationType;
    private final int retryTimes;
    private final WaypointCameraFocusParam focusParam;
    private final WaypointCameraZoomParam zoomParam;
    private final WaypointCameraFocusModeParam focusModeParam;
    private final WaypointCameraCustomNameParam customNameParam;
    private final WaypointCameraStartIntervalShotParam startIntervalShotParam;
    private final WaypointCameraStopIntervalShotParam stopIntervalShotParam;

    public WaypointCameraActuatorParam(Builder builder) {
    }

    public ActionTypes.CameraOperationType getCameraOperationType() {
        return null;
    }

    public int getRetryTimes() {
        return 0;
    }

    @Nullable
    public WaypointCameraFocusParam getFocusParam() {
        return null;
    }

    @Nullable
    public WaypointCameraZoomParam getZoomParam() {
        return null;
    }

    public WaypointCameraFocusModeParam getFocusModeParam() {
        return null;
    }

    public WaypointCameraStartIntervalShotParam getStartIntervalShotParam() {
        return null;
    }

    public WaypointCameraStopIntervalShotParam getStopIntervalShotParam() {
        return null;
    }

    @Nullable
    public WaypointCameraCustomNameParam getCustomNameParam() {
        return null;
    }

    public static final class Builder {
        private ActionTypes.CameraOperationType cameraOperationType;
        private int retryTime;
        WaypointCameraFocusParam focusParam;
        WaypointCameraZoomParam zoomParam;
        WaypointCameraCustomNameParam customNameParam;
        private WaypointCameraFocusModeParam focusModeParam;
        private WaypointCameraStartIntervalShotParam startIntervalShotParam;
        private WaypointCameraStopIntervalShotParam stopIntervalShotParam;

        public Builder setCameraOperationType(ActionTypes.CameraOperationType cameraOperationType) {
            return null;
        }

        public Builder setRetryTime(int n) {
            return null;
        }

        public Builder setFocusParam(WaypointCameraFocusParam waypointCameraFocusParam) {
            return null;
        }

        public Builder setZoomParam(WaypointCameraZoomParam waypointCameraZoomParam) {
            return null;
        }

        public Builder setFocusModeParam(WaypointCameraFocusModeParam waypointCameraFocusModeParam) {
            return null;
        }

        public Builder setCustomNameParam(WaypointCameraCustomNameParam waypointCameraCustomNameParam) {
            return null;
        }

        public Builder setStartIntervalShotParam(WaypointCameraStartIntervalShotParam waypointCameraStartIntervalShotParam) {
            return null;
        }

        public Builder setStopIntervalShotParam(WaypointCameraStopIntervalShotParam waypointCameraStopIntervalShotParam) {
            return null;
        }

        public WaypointCameraActuatorParam build() {
            return null;
        }

        static /* synthetic */ ActionTypes.CameraOperationType access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$100(Builder builder) {
            return 0;
        }

        static /* synthetic */ WaypointCameraFocusModeParam access$200(Builder builder) {
            return null;
        }

        static /* synthetic */ WaypointCameraStartIntervalShotParam access$300(Builder builder) {
            return null;
        }

        static /* synthetic */ WaypointCameraStopIntervalShotParam access$400(Builder builder) {
            return null;
        }
    }
}

