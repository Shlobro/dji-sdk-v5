/*
 * Decompiled with CFR 0.152.
 */
package djimrtc;

import djimrtc.DJILiveShareType;
import djimrtc.config.DJIAgoraConfig;
import djimrtc.config.DJIGB28181Config;
import djimrtc.config.DJIRtmpConfig;
import djimrtc.config.DJIRtspConfig;

public class DJILiveShareOptions {
    final DJILiveShareType mLiveShareType;
    final DJIRtmpConfig mRtmpConfig;
    final DJIRtspConfig mRtspConfig;
    final DJIGB28181Config mGB28181Config;
    final DJIAgoraConfig mAgoraConfig;
    final boolean mEnableVideo;
    final boolean mEnableAudio;
    final int mCameraIndex;
    final int mQuality;

    public DJILiveShareType getLiveShareType() {
        return null;
    }

    public DJIRtmpConfig getRtmpConfig() {
        return null;
    }

    public DJIRtspConfig getRtspConfig() {
        return null;
    }

    public DJIGB28181Config getGB28181Config() {
        return null;
    }

    public DJIAgoraConfig getAgoraConfig() {
        return null;
    }

    public boolean isEnableVideo() {
        return false;
    }

    public boolean isEnableAudio() {
        return false;
    }

    public int getCameraIndex() {
        return 0;
    }

    public int getQuality() {
        return 0;
    }

    public DJILiveShareOptions() {
    }

    DJILiveShareOptions(Builder builder) {
    }

    public String toString() {
        return null;
    }

    public static final class Builder {
        DJILiveShareType mLiveShareType;
        DJIRtmpConfig mRtmpConfig;
        DJIRtspConfig mRtspConfig;
        DJIGB28181Config mGB28181Config;
        DJIAgoraConfig mAgoraConfig;
        boolean mEnableVideo;
        boolean mEnableAudio;
        int mCameraIndex;
        int mQuality;

        public Builder liveShareType(DJILiveShareType dJILiveShareType) {
            return null;
        }

        public Builder rtmpConfig(DJIRtmpConfig dJIRtmpConfig) {
            return null;
        }

        public Builder rtspConfig(DJIRtspConfig dJIRtspConfig) {
            return null;
        }

        public Builder gb28181Config(DJIGB28181Config dJIGB28181Config) {
            return null;
        }

        public Builder agoraConfig(DJIAgoraConfig dJIAgoraConfig) {
            return null;
        }

        public Builder enableVideo(boolean bl) {
            return null;
        }

        public Builder enableAudio(boolean bl) {
            return null;
        }

        public Builder cameraIndex(int n) {
            return null;
        }

        public Builder quality(int n) {
            return null;
        }

        public DJILiveShareOptions build() {
            return null;
        }
    }
}

