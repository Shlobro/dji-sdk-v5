/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.squareup.wire.Message
 *  com.squareup.wire.Message$Builder
 *  com.squareup.wire.ProtoAdapter
 *  com.squareup.wire.ProtoReader
 *  com.squareup.wire.ProtoWriter
 *  com.squareup.wire.WireField
 *  okio.ByteString
 */
package com.dji.industry.mission.waypointv2.common.waypointv2;

import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraCustomNameParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraFocusModeParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraFocusParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraShootPhotoParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraStartIntervalShotParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraStartRecordVideoParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraStopIntervalShotParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraStopRecordVideoParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraZoomLengthParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.CameraActionType;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class WaypointActionOperatorCamera
extends Message<WaypointActionOperatorCamera, Builder> {
    public static final ProtoAdapter<WaypointActionOperatorCamera> ADAPTER = new ProtoAdapter_WaypointActionOperatorCamera();
    private static final long serialVersionUID = 0L;
    public static final CameraActionType DEFAULT_ACTION_TYPE = CameraActionType.CameraActionTypeUnknown;
    @WireField(tag=1, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.CameraActionType#ADAPTER")
    public final CameraActionType action_type;
    @WireField(tag=2, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraShootPhotoParam#ADAPTER")
    public final ActuatorCameraShootPhotoParam shootphoto_param;
    @WireField(tag=3, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraStartRecordVideoParam#ADAPTER")
    public final ActuatorCameraStartRecordVideoParam start_record_video_param;
    @WireField(tag=4, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraStopRecordVideoParam#ADAPTER")
    public final ActuatorCameraStopRecordVideoParam stop_record_video_param;
    @WireField(tag=5, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraFocusParam#ADAPTER")
    public final ActuatorCameraFocusParam focus_param;
    @WireField(tag=6, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraZoomLengthParam#ADAPTER")
    public final ActuatorCameraZoomLengthParam zoom_length_param;
    @WireField(tag=7, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraCustomNameParam#ADAPTER")
    public final ActuatorCameraCustomNameParam custom_name_param;
    @WireField(tag=8, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraFocusModeParam#ADAPTER")
    public final ActuatorCameraFocusModeParam focus_mode_param;
    @WireField(tag=9, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraStartIntervalShotParam#ADAPTER")
    public final ActuatorCameraStartIntervalShotParam start_interval_shot_param;
    @WireField(tag=10, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraStopIntervalShotParam#ADAPTER")
    public final ActuatorCameraStopIntervalShotParam stop_interval_shot_param;

    public WaypointActionOperatorCamera(CameraActionType cameraActionType, ActuatorCameraShootPhotoParam actuatorCameraShootPhotoParam, ActuatorCameraStartRecordVideoParam actuatorCameraStartRecordVideoParam, ActuatorCameraStopRecordVideoParam actuatorCameraStopRecordVideoParam, ActuatorCameraFocusParam actuatorCameraFocusParam, ActuatorCameraZoomLengthParam actuatorCameraZoomLengthParam, ActuatorCameraCustomNameParam actuatorCameraCustomNameParam, ActuatorCameraFocusModeParam actuatorCameraFocusModeParam, ActuatorCameraStartIntervalShotParam actuatorCameraStartIntervalShotParam, ActuatorCameraStopIntervalShotParam actuatorCameraStopIntervalShotParam) {
    }

    public WaypointActionOperatorCamera(CameraActionType cameraActionType, ActuatorCameraShootPhotoParam actuatorCameraShootPhotoParam, ActuatorCameraStartRecordVideoParam actuatorCameraStartRecordVideoParam, ActuatorCameraStopRecordVideoParam actuatorCameraStopRecordVideoParam, ActuatorCameraFocusParam actuatorCameraFocusParam, ActuatorCameraZoomLengthParam actuatorCameraZoomLengthParam, ActuatorCameraCustomNameParam actuatorCameraCustomNameParam, ActuatorCameraFocusModeParam actuatorCameraFocusModeParam, ActuatorCameraStartIntervalShotParam actuatorCameraStartIntervalShotParam, ActuatorCameraStopIntervalShotParam actuatorCameraStopIntervalShotParam, ByteString byteString) {
    }

    public Builder newBuilder() {
        return null;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return null;
    }

    public static final class Builder
    extends Message.Builder<WaypointActionOperatorCamera, Builder> {
        public CameraActionType action_type;
        public ActuatorCameraShootPhotoParam shootphoto_param;
        public ActuatorCameraStartRecordVideoParam start_record_video_param;
        public ActuatorCameraStopRecordVideoParam stop_record_video_param;
        public ActuatorCameraFocusParam focus_param;
        public ActuatorCameraZoomLengthParam zoom_length_param;
        public ActuatorCameraCustomNameParam custom_name_param;
        public ActuatorCameraFocusModeParam focus_mode_param;
        public ActuatorCameraStartIntervalShotParam start_interval_shot_param;
        public ActuatorCameraStopIntervalShotParam stop_interval_shot_param;

        public Builder action_type(CameraActionType cameraActionType) {
            return null;
        }

        public Builder shootphoto_param(ActuatorCameraShootPhotoParam actuatorCameraShootPhotoParam) {
            return null;
        }

        public Builder start_record_video_param(ActuatorCameraStartRecordVideoParam actuatorCameraStartRecordVideoParam) {
            return null;
        }

        public Builder stop_record_video_param(ActuatorCameraStopRecordVideoParam actuatorCameraStopRecordVideoParam) {
            return null;
        }

        public Builder focus_param(ActuatorCameraFocusParam actuatorCameraFocusParam) {
            return null;
        }

        public Builder zoom_length_param(ActuatorCameraZoomLengthParam actuatorCameraZoomLengthParam) {
            return null;
        }

        public Builder custom_name_param(ActuatorCameraCustomNameParam actuatorCameraCustomNameParam) {
            return null;
        }

        public Builder focus_mode_param(ActuatorCameraFocusModeParam actuatorCameraFocusModeParam) {
            return null;
        }

        public Builder start_interval_shot_param(ActuatorCameraStartIntervalShotParam actuatorCameraStartIntervalShotParam) {
            return null;
        }

        public Builder stop_interval_shot_param(ActuatorCameraStopIntervalShotParam actuatorCameraStopIntervalShotParam) {
            return null;
        }

        public WaypointActionOperatorCamera build() {
            return null;
        }
    }

    private static final class ProtoAdapter_WaypointActionOperatorCamera
    extends ProtoAdapter<WaypointActionOperatorCamera> {
        ProtoAdapter_WaypointActionOperatorCamera() {
        }

        public int encodedSize(WaypointActionOperatorCamera waypointActionOperatorCamera) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, WaypointActionOperatorCamera waypointActionOperatorCamera) throws IOException {
        }

        public WaypointActionOperatorCamera decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public WaypointActionOperatorCamera redact(WaypointActionOperatorCamera waypointActionOperatorCamera) {
            return null;
        }
    }
}

