/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.datacenter.livestream;

import androidx.annotation.NonNull;
import dji.v5.manager.datacenter.livestream.VideoResolution;

public class LiveStreamStatus {
    private int fps;
    private int vbps;
    private int packetCacheLen;
    private int packetLoss;
    private int rtt;
    private boolean isStreaming;
    private VideoResolution resolution;

    public LiveStreamStatus(int n, int n2, int n3, int n4, int n5, boolean bl, VideoResolution videoResolution) {
    }

    public int getFps() {
        return 0;
    }

    public int getVbps() {
        return 0;
    }

    public boolean isStreaming() {
        return false;
    }

    public VideoResolution getResolution() {
        return null;
    }

    public int getPacketLoss() {
        return 0;
    }

    public int getPacketCacheLen() {
        return 0;
    }

    public int getRtt() {
        return 0;
    }

    @NonNull
    public String toString() {
        return null;
    }
}

