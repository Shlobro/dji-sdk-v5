/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.datacenter.livestream;

import androidx.annotation.NonNull;
import dji.v5.manager.datacenter.livestream.LiveStreamType;
import dji.v5.manager.datacenter.livestream.settings.AgoraSettings;
import dji.v5.manager.datacenter.livestream.settings.GB28181Settings;
import dji.v5.manager.datacenter.livestream.settings.RtmpSettings;
import dji.v5.manager.datacenter.livestream.settings.RtspSettings;

public class LiveStreamSettings {
    private LiveStreamType liveStreamType;
    private RtmpSettings rtmpSettings;
    private RtspSettings rtspSettings;
    private GB28181Settings gb28181Settings;
    private AgoraSettings agoraSettings;

    private LiveStreamSettings(Builder builder) {
    }

    public LiveStreamType getLiveStreamType() {
        return null;
    }

    public RtmpSettings getRtmpSettings() {
        return null;
    }

    public RtspSettings getRtspSettings() {
        return null;
    }

    public GB28181Settings getGb28181Settings() {
        return null;
    }

    public AgoraSettings getAgoraSettings() {
        return null;
    }

    @NonNull
    public String toString() {
        return null;
    }

    /* synthetic */ LiveStreamSettings(Builder builder, 1 var2_2) {
    }

    public static class Builder {
        private LiveStreamType liveStreamType;
        private RtmpSettings rtmpSettings;
        private RtspSettings rtspSettings;
        private GB28181Settings gb28181Settings;
        private AgoraSettings agoraSettings;

        public Builder setLiveStreamType(LiveStreamType liveStreamType) {
            return null;
        }

        public Builder setRtmpSettings(RtmpSettings rtmpSettings) {
            return null;
        }

        public Builder setRtspSettings(RtspSettings rtspSettings) {
            return null;
        }

        public Builder setGB28181Settings(GB28181Settings gB28181Settings) {
            return null;
        }

        public Builder setAgoraSettings(AgoraSettings agoraSettings) {
            return null;
        }

        public LiveStreamSettings build() {
            return null;
        }

        static /* synthetic */ LiveStreamType access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ RtmpSettings access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ RtspSettings access$200(Builder builder) {
            return null;
        }

        static /* synthetic */ GB28181Settings access$300(Builder builder) {
            return null;
        }

        static /* synthetic */ AgoraSettings access$400(Builder builder) {
            return null;
        }
    }
}

