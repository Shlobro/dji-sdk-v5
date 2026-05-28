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

import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorNavigationAccurateShootPhotoOperatingParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.NavigationActionType;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class WaypointActionOperatorNavigation
extends Message<WaypointActionOperatorNavigation, Builder> {
    public static final ProtoAdapter<WaypointActionOperatorNavigation> ADAPTER = new ProtoAdapter_WaypointActionOperatorNavigation();
    private static final long serialVersionUID = 0L;
    public static final NavigationActionType DEFAULT_ACTION_TYPE = NavigationActionType.NavigationActionUnknown;
    @WireField(tag=1, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.NavigationActionType#ADAPTER")
    public final NavigationActionType action_type;
    @WireField(tag=2, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorNavigationAccurateShootPhotoOperatingParam#ADAPTER")
    public final ActuatorNavigationAccurateShootPhotoOperatingParam accurate_shootphoto_param;

    public WaypointActionOperatorNavigation(NavigationActionType navigationActionType, ActuatorNavigationAccurateShootPhotoOperatingParam actuatorNavigationAccurateShootPhotoOperatingParam) {
    }

    public WaypointActionOperatorNavigation(NavigationActionType navigationActionType, ActuatorNavigationAccurateShootPhotoOperatingParam actuatorNavigationAccurateShootPhotoOperatingParam, ByteString byteString) {
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
    extends Message.Builder<WaypointActionOperatorNavigation, Builder> {
        public NavigationActionType action_type;
        public ActuatorNavigationAccurateShootPhotoOperatingParam accurate_shootphoto_param;

        public Builder action_type(NavigationActionType navigationActionType) {
            return null;
        }

        public Builder accurate_shootphoto_param(ActuatorNavigationAccurateShootPhotoOperatingParam actuatorNavigationAccurateShootPhotoOperatingParam) {
            return null;
        }

        public WaypointActionOperatorNavigation build() {
            return null;
        }
    }

    private static final class ProtoAdapter_WaypointActionOperatorNavigation
    extends ProtoAdapter<WaypointActionOperatorNavigation> {
        ProtoAdapter_WaypointActionOperatorNavigation() {
        }

        public int encodedSize(WaypointActionOperatorNavigation waypointActionOperatorNavigation) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, WaypointActionOperatorNavigation waypointActionOperatorNavigation) throws IOException {
        }

        public WaypointActionOperatorNavigation decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public WaypointActionOperatorNavigation redact(WaypointActionOperatorNavigation waypointActionOperatorNavigation) {
            return null;
        }
    }
}

