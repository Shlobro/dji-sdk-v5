/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.manager.datacenter.camera;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.common.SourceMajorType;
import dji.sdk.keyvalue.value.media.VideoBufferInfo;
import dji.v5.manager.datacenter.camera.StreamSource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AircraftStreamSource
extends StreamSource {
    private static final Map<ComponentIndexType, Integer> sourceTimesMap = new ConcurrentHashMap<ComponentIndexType, Integer>();
    private final int mChannelId;
    private final ComponentIndexType cameraIndex;
    private final SourceMajorType majorType;
    private StreamStateCallback callback;
    private volatile boolean hasReceivedData;
    private static final int MSG_TIMEOUT = 1;
    private final Handler handler;

    public AircraftStreamSource(ComponentIndexType componentIndexType, SourceMajorType sourceMajorType, int n, int n2, StreamStateCallback streamStateCallback) {
    }

    @Override
    public synchronized void start() {
    }

    private void setupVideoObserver() {
    }

    private void startTimeoutCheck() {
    }

    @Override
    public synchronized void stop() {
    }

    @Override
    @NonNull
    public String toString() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean equals(@Nullable Object object) {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void destroy() {
    }

    private static /* synthetic */ Integer lambda$startTimeoutCheck$1(ComponentIndexType componentIndexType) {
        return null;
    }

    private /* synthetic */ void lambda$setupVideoObserver$0(VideoBufferInfo videoBufferInfo, byte[] byArray) {
    }

    static /* synthetic */ ComponentIndexType access$000(AircraftStreamSource aircraftStreamSource) {
        return null;
    }

    static /* synthetic */ boolean access$100(AircraftStreamSource aircraftStreamSource) {
        return false;
    }

    static /* synthetic */ Map access$200() {
        return null;
    }

    static /* synthetic */ StreamStateCallback access$300(AircraftStreamSource aircraftStreamSource) {
        return null;
    }

    public static interface StreamStateCallback {
        public void onStreamDisconnected(ComponentIndexType var1);
    }
}

