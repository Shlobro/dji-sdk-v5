/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Message
 */
package dji.v5.inner.live;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

public class VideoBitRateManager {
    private static final int UPLOAD_EVENT = 1;
    private static final int DELAY_TIME = 10000;
    private static final int KB = 8192;
    private static final double BAD_NETWORK_THRESHOLD = 0.08;
    private static final double TAY_ADJUST_THRESHOLD = 0.3;
    private static final double DEVIATION = 0.08;
    private static final int DEFAULT_VIDEO_BIT_RATE = 0x200000;
    private static final int MAX_VIDEO_BIT_RATE = 0x380000;
    private static final int MIN_VIDEO_BIT_RATE = 524288;
    private long totalUploadData;
    private HandlerThread mHandlerThread;
    private Handler mHandler;
    private float mDesiredVideoBitRate;
    private float mLastNetworkSpeed;

    public static VideoBitRateManager getInstance() {
        return null;
    }

    private VideoBitRateManager() {
    }

    public void startAutoVideoBitRate() {
    }

    public void stopAutoVideoBitRate() {
    }

    private void sendUploadEvent(long l2) {
    }

    private int getUploadNetworkAverageSpeed() {
        return 0;
    }

    private void autoAdjustVideoBitRate(int n) {
    }

    private void performBadNetworkThreshold(float f2, int n, float f3) {
    }

    private int getMaxSetBitRate(float f2) {
        return 0;
    }

    private int getMinSetBitRate(float f2) {
        return 0;
    }

    public void setVideoBitRate(int n) {
    }

    public int getVideoBitRate() {
        return 0;
    }

    private /* synthetic */ boolean lambda$new$0(Message message) {
        return false;
    }

    /* synthetic */ VideoBitRateManager(1 var1_1) {
    }

    private static class LazyHolder {
        private static final VideoBitRateManager INSTANCE = new VideoBitRateManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ VideoBitRateManager access$100() {
            return null;
        }
    }
}

