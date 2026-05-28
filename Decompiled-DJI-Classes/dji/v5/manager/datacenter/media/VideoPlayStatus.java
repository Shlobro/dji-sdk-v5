/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.datacenter.media;

import dji.v5.manager.datacenter.media.VideoPlayState;

public class VideoPlayStatus {
    private Integer fileIndex;
    private VideoPlayState state;
    private double playingPosition;
    private double totalDuration;

    public VideoPlayStatus(Builder builder) {
    }

    public Integer getFileIndex() {
        return null;
    }

    public void setFileIndex(Integer n) {
    }

    public VideoPlayState getState() {
        return null;
    }

    public void setState(VideoPlayState videoPlayState) {
    }

    public double getPlayingPosition() {
        return 0.0;
    }

    public void setPlayingPosition(Double d2) {
    }

    public double getTotalDuration() {
        return 0.0;
    }

    public void setTotalDuration(Double d2) {
    }

    public static class Builder {
        private Integer fileIndex;
        private VideoPlayState state;
        private double playPosition;
        private double totalDuration;

        Builder setPlayPosition(double d2) {
            return null;
        }

        Builder setFileIndex(Integer n) {
            return null;
        }

        Builder setVideoPlayBackState(VideoPlayState videoPlayState) {
            return null;
        }

        Builder setTotalDuration(double d2) {
            return null;
        }

        public VideoPlayStatus build() {
            return null;
        }

        static /* synthetic */ Integer access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ VideoPlayState access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ double access$200(Builder builder) {
            return 0.0;
        }

        static /* synthetic */ double access$300(Builder builder) {
            return 0.0;
        }
    }
}

