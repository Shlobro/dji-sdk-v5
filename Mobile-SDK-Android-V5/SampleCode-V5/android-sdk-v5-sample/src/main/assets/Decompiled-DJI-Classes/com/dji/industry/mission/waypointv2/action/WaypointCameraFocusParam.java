/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 */
package com.dji.industry.mission.waypointv2.action;

import android.graphics.PointF;
import com.dji.industry.mission.waypointv2.action.CameraFocusRegionType;

public class WaypointCameraFocusParam {
    private final PointF focusTarget;
    private final CameraFocusRegionType cameraFocusRegionType;
    private final float width;
    private final float height;
    private final int attribute;
    private final int focusDelayTime;

    public WaypointCameraFocusParam(Builder builder) {
    }

    public PointF getFocusTarget() {
        return null;
    }

    public CameraFocusRegionType getCameraFocusRegionType() {
        return null;
    }

    public float getWidth() {
        return 0.0f;
    }

    public float getHeight() {
        return 0.0f;
    }

    public int getAttribute() {
        return 0;
    }

    public int getFocusDelayTime() {
        return 0;
    }

    public static final class Builder {
        private PointF focusTarget;
        private CameraFocusRegionType cameraFocusRegionType;
        private float width;
        private float height;
        private int attribute;
        private int focusDelayTime;

        public Builder focusTarget(PointF pointF) {
            return null;
        }

        public Builder setCameraFocusRegionType(CameraFocusRegionType cameraFocusRegionType) {
            return null;
        }

        public Builder width(float f2) {
            return null;
        }

        public Builder height(float f2) {
            return null;
        }

        public Builder attribute(int n) {
            return null;
        }

        public Builder setFocusDelayTime(int n) {
            return null;
        }

        public WaypointCameraFocusParam build() {
            return null;
        }

        static /* synthetic */ PointF access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ CameraFocusRegionType access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ float access$200(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ float access$300(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ int access$400(Builder builder) {
            return 0;
        }

        static /* synthetic */ int access$500(Builder builder) {
            return 0;
        }
    }
}

