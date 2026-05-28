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

import com.dji.industry.mission.waypointv2.common.waypointv2.AccurateShootPhotoCameraStateInformation;
import com.dji.industry.mission.waypointv2.common.waypointv2.AccurateShootPhotoDeviceInformation;
import com.dji.industry.mission.waypointv2.common.waypointv2.AccurateShootPhotoFileInformation;
import com.dji.industry.mission.waypointv2.common.waypointv2.AccurateShootPhotoGimbalStateInformation;
import com.dji.industry.mission.waypointv2.common.waypointv2.AccurateShootPhotoTargetRect;
import com.dji.industry.mission.waypointv2.common.waypointv2.Size;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class ActuatorNavigationAccurateShootPhotoOperatingParam
extends Message<ActuatorNavigationAccurateShootPhotoOperatingParam, Builder> {
    public static final ProtoAdapter<ActuatorNavigationAccurateShootPhotoOperatingParam> ADAPTER = new ProtoAdapter_ActuatorNavigationAccurateShootPhotoOperatingParam();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_ACTION_ID = 0;
    public static final Integer DEFAULT_RETRY_TIMES = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer action_id;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer retry_times;
    @WireField(tag=3, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.AccurateShootPhotoTargetRect#ADAPTER")
    public final AccurateShootPhotoTargetRect target_rect;
    @WireField(tag=4, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.Size#ADAPTER")
    public final Size image_size;
    @WireField(tag=5, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.AccurateShootPhotoCameraStateInformation#ADAPTER")
    public final AccurateShootPhotoCameraStateInformation camera_infos;
    @WireField(tag=6, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.AccurateShootPhotoGimbalStateInformation#ADAPTER")
    public final AccurateShootPhotoGimbalStateInformation gimbal_infos;
    @WireField(tag=7, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.AccurateShootPhotoDeviceInformation#ADAPTER")
    public final AccurateShootPhotoDeviceInformation device_infos;
    @WireField(tag=8, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.AccurateShootPhotoFileInformation#ADAPTER")
    public final AccurateShootPhotoFileInformation file_infos;

    public ActuatorNavigationAccurateShootPhotoOperatingParam(Integer n, Integer n2, AccurateShootPhotoTargetRect accurateShootPhotoTargetRect, Size size, AccurateShootPhotoCameraStateInformation accurateShootPhotoCameraStateInformation, AccurateShootPhotoGimbalStateInformation accurateShootPhotoGimbalStateInformation, AccurateShootPhotoDeviceInformation accurateShootPhotoDeviceInformation, AccurateShootPhotoFileInformation accurateShootPhotoFileInformation) {
    }

    public ActuatorNavigationAccurateShootPhotoOperatingParam(Integer n, Integer n2, AccurateShootPhotoTargetRect accurateShootPhotoTargetRect, Size size, AccurateShootPhotoCameraStateInformation accurateShootPhotoCameraStateInformation, AccurateShootPhotoGimbalStateInformation accurateShootPhotoGimbalStateInformation, AccurateShootPhotoDeviceInformation accurateShootPhotoDeviceInformation, AccurateShootPhotoFileInformation accurateShootPhotoFileInformation, ByteString byteString) {
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
    extends Message.Builder<ActuatorNavigationAccurateShootPhotoOperatingParam, Builder> {
        public Integer action_id;
        public Integer retry_times;
        public AccurateShootPhotoTargetRect target_rect;
        public Size image_size;
        public AccurateShootPhotoCameraStateInformation camera_infos;
        public AccurateShootPhotoGimbalStateInformation gimbal_infos;
        public AccurateShootPhotoDeviceInformation device_infos;
        public AccurateShootPhotoFileInformation file_infos;

        public Builder action_id(Integer n) {
            return null;
        }

        public Builder retry_times(Integer n) {
            return null;
        }

        public Builder target_rect(AccurateShootPhotoTargetRect accurateShootPhotoTargetRect) {
            return null;
        }

        public Builder image_size(Size size) {
            return null;
        }

        public Builder camera_infos(AccurateShootPhotoCameraStateInformation accurateShootPhotoCameraStateInformation) {
            return null;
        }

        public Builder gimbal_infos(AccurateShootPhotoGimbalStateInformation accurateShootPhotoGimbalStateInformation) {
            return null;
        }

        public Builder device_infos(AccurateShootPhotoDeviceInformation accurateShootPhotoDeviceInformation) {
            return null;
        }

        public Builder file_infos(AccurateShootPhotoFileInformation accurateShootPhotoFileInformation) {
            return null;
        }

        public ActuatorNavigationAccurateShootPhotoOperatingParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ActuatorNavigationAccurateShootPhotoOperatingParam
    extends ProtoAdapter<ActuatorNavigationAccurateShootPhotoOperatingParam> {
        ProtoAdapter_ActuatorNavigationAccurateShootPhotoOperatingParam() {
        }

        public int encodedSize(ActuatorNavigationAccurateShootPhotoOperatingParam actuatorNavigationAccurateShootPhotoOperatingParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ActuatorNavigationAccurateShootPhotoOperatingParam actuatorNavigationAccurateShootPhotoOperatingParam) throws IOException {
        }

        public ActuatorNavigationAccurateShootPhotoOperatingParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ActuatorNavigationAccurateShootPhotoOperatingParam redact(ActuatorNavigationAccurateShootPhotoOperatingParam actuatorNavigationAccurateShootPhotoOperatingParam) {
            return null;
        }
    }
}

