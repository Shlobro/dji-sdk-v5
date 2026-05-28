/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.waypointv2.action;

public class NavigationAccurateShootPhotoOperationParam {
    private int actionID;
    private int retryTimes;
    private float imageWidth;
    private float imageHeight;
    private AccurateShootPhotoTargetRect targetRect;
    private AccurateShootPhotoCameraStateInfo cameraStateInfo;
    private AccurateShootPhotoGimbalStateInfo gimbalStateInfo;
    private AccurateShootPhotoDeviceInfo deviceInfo;
    private AccurateShootPhotoFileInfo fileInfo;

    private NavigationAccurateShootPhotoOperationParam(Builder builder) {
    }

    public int getActionID() {
        return 0;
    }

    public int getRetryTimes() {
        return 0;
    }

    public float getImageWidth() {
        return 0.0f;
    }

    public float getImageHeight() {
        return 0.0f;
    }

    public AccurateShootPhotoTargetRect getTargetRect() {
        return null;
    }

    public AccurateShootPhotoCameraStateInfo getCameraStateInfo() {
        return null;
    }

    public AccurateShootPhotoGimbalStateInfo getGimbalStateInfo() {
        return null;
    }

    public AccurateShootPhotoDeviceInfo getDeviceInfo() {
        return null;
    }

    public AccurateShootPhotoFileInfo getFileInfo() {
        return null;
    }

    /* synthetic */ NavigationAccurateShootPhotoOperationParam(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private int actionID;
        private int retryTimes;
        private float imageWidth;
        private float imageHeight;
        private AccurateShootPhotoTargetRect targetRect;
        private AccurateShootPhotoCameraStateInfo cameraStateInfo;
        private AccurateShootPhotoGimbalStateInfo gimbalStateInfo;
        private AccurateShootPhotoDeviceInfo deviceInfo;
        private AccurateShootPhotoFileInfo fileInfo;

        public Builder actionID(int n) {
            return null;
        }

        public Builder retryTimes(int n) {
            return null;
        }

        public Builder imageWidth(float f2) {
            return null;
        }

        public Builder imageHeight(float f2) {
            return null;
        }

        public Builder targetRect(AccurateShootPhotoTargetRect accurateShootPhotoTargetRect) {
            return null;
        }

        public Builder cameraStateInfo(AccurateShootPhotoCameraStateInfo accurateShootPhotoCameraStateInfo) {
            return null;
        }

        public Builder gimbalStateInfo(AccurateShootPhotoGimbalStateInfo accurateShootPhotoGimbalStateInfo) {
            return null;
        }

        public Builder deviceInfo(AccurateShootPhotoDeviceInfo accurateShootPhotoDeviceInfo) {
            return null;
        }

        public Builder fileInfo(AccurateShootPhotoFileInfo accurateShootPhotoFileInfo) {
            return null;
        }

        public NavigationAccurateShootPhotoOperationParam build() {
            return null;
        }

        static /* synthetic */ int access$000(Builder builder) {
            return 0;
        }

        static /* synthetic */ int access$100(Builder builder) {
            return 0;
        }

        static /* synthetic */ float access$200(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ float access$300(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ AccurateShootPhotoTargetRect access$400(Builder builder) {
            return null;
        }

        static /* synthetic */ AccurateShootPhotoCameraStateInfo access$500(Builder builder) {
            return null;
        }

        static /* synthetic */ AccurateShootPhotoGimbalStateInfo access$600(Builder builder) {
            return null;
        }

        static /* synthetic */ AccurateShootPhotoDeviceInfo access$700(Builder builder) {
            return null;
        }

        static /* synthetic */ AccurateShootPhotoFileInfo access$800(Builder builder) {
            return null;
        }
    }

    public static class AccurateShootPhotoTargetRect {
        private float positionX;
        private float positionY;
        private float width;
        private float height;
        private float angle;

        private AccurateShootPhotoTargetRect(Builder builder) {
        }

        public float getPositionX() {
            return 0.0f;
        }

        public float getPositionY() {
            return 0.0f;
        }

        public float getWidth() {
            return 0.0f;
        }

        public float getHeight() {
            return 0.0f;
        }

        public float getAngle() {
            return 0.0f;
        }

        /* synthetic */ AccurateShootPhotoTargetRect(Builder builder, 1 var2_2) {
        }

        public static final class Builder {
            private float positionX;
            private float positionY;
            private float width;
            private float height;
            private float angle;

            public Builder positionX(float f2) {
                return null;
            }

            public Builder positionY(float f2) {
                return null;
            }

            public Builder width(float f2) {
                return null;
            }

            public Builder height(float f2) {
                return null;
            }

            public Builder angle(float f2) {
                return null;
            }

            public AccurateShootPhotoTargetRect build() {
                return null;
            }

            static /* synthetic */ float access$900(Builder builder) {
                return 0.0f;
            }

            static /* synthetic */ float access$1000(Builder builder) {
                return 0.0f;
            }

            static /* synthetic */ float access$1100(Builder builder) {
                return 0.0f;
            }

            static /* synthetic */ float access$1200(Builder builder) {
                return 0.0f;
            }

            static /* synthetic */ float access$1300(Builder builder) {
                return 0.0f;
            }
        }
    }

    public static class AccurateShootPhotoCameraStateInfo {
        private int focalDistance;
        private int AFPosition;

        private AccurateShootPhotoCameraStateInfo(Builder builder) {
        }

        public int getFocalDistance() {
            return 0;
        }

        public int getAFPosition() {
            return 0;
        }

        /* synthetic */ AccurateShootPhotoCameraStateInfo(Builder builder, 1 var2_2) {
        }

        public static final class Builder {
            private int focalDistance;
            private int AFPosition;

            public Builder focalDistance(int n) {
                return null;
            }

            public Builder AFPosition(int n) {
                return null;
            }

            public AccurateShootPhotoCameraStateInfo build() {
                return null;
            }

            static /* synthetic */ int access$1500(Builder builder) {
                return 0;
            }

            static /* synthetic */ int access$1600(Builder builder) {
                return 0;
            }
        }
    }

    public static class AccurateShootPhotoGimbalStateInfo {
        private float pitch;
        private float roll;
        private float yaw;

        private AccurateShootPhotoGimbalStateInfo(Builder builder) {
        }

        public float getPitch() {
            return 0.0f;
        }

        public float getRoll() {
            return 0.0f;
        }

        public float getYaw() {
            return 0.0f;
        }

        /* synthetic */ AccurateShootPhotoGimbalStateInfo(Builder builder, 1 var2_2) {
        }

        public static final class Builder {
            private float pitch;
            private float roll;
            private float yaw;

            public Builder pitch(float f2) {
                return null;
            }

            public Builder roll(float f2) {
                return null;
            }

            public Builder yaw(float f2) {
                return null;
            }

            public AccurateShootPhotoGimbalStateInfo build() {
                return null;
            }

            static /* synthetic */ float access$1800(Builder builder) {
                return 0.0f;
            }

            static /* synthetic */ float access$1900(Builder builder) {
                return 0.0f;
            }

            static /* synthetic */ float access$2000(Builder builder) {
                return 0.0f;
            }
        }
    }

    public static class AccurateShootPhotoDeviceInfo {
        private int cameraType;
        private int gimbalPort;

        public int getCameraType() {
            return 0;
        }

        public int getGimbalPort() {
            return 0;
        }

        private AccurateShootPhotoDeviceInfo(Builder builder) {
        }

        /* synthetic */ AccurateShootPhotoDeviceInfo(Builder builder, 1 var2_2) {
        }

        public static final class Builder {
            private int cameraType;
            private int gimbalPort;

            public Builder cameraType(int n) {
                return null;
            }

            public Builder gimbalPort(int n) {
                return null;
            }

            public AccurateShootPhotoDeviceInfo build() {
                return null;
            }

            static /* synthetic */ int access$2200(Builder builder) {
                return 0;
            }

            static /* synthetic */ int access$2300(Builder builder) {
                return 0;
            }
        }
    }

    public static class AccurateShootPhotoFileInfo {
        private int fileNameLength;
        private int fileSize;
        private String fileName;
        private String fileMd5;

        private AccurateShootPhotoFileInfo(Builder builder) {
        }

        public int getFileNameLength() {
            return 0;
        }

        public int getFileSize() {
            return 0;
        }

        public String getFileName() {
            return null;
        }

        public String getFileMd5() {
            return null;
        }

        /* synthetic */ AccurateShootPhotoFileInfo(Builder builder, 1 var2_2) {
        }

        public static final class Builder {
            private int fileNameLength;
            private int fileSize;
            private String fileName;
            private String fileMd5;

            public Builder fileNameLength(int n) {
                return null;
            }

            public Builder fileSize(int n) {
                return null;
            }

            public Builder fileName(String string) {
                return null;
            }

            public Builder fileMd5(String string) {
                return null;
            }

            public AccurateShootPhotoFileInfo build() {
                return null;
            }

            static /* synthetic */ int access$2500(Builder builder) {
                return 0;
            }

            static /* synthetic */ int access$2600(Builder builder) {
                return 0;
            }

            static /* synthetic */ String access$2700(Builder builder) {
                return null;
            }

            static /* synthetic */ String access$2800(Builder builder) {
                return null;
            }
        }
    }
}

