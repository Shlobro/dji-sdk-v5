/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Surface
 *  androidx.annotation.MainThread
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.WorkerThread
 */
package dji.v5.manager.interfaces;

import android.view.Surface;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import dji.sdk.keyvalue.value.airlink.ChannelPriority;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.flightassistant.VisionAssistDirection;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.lib.codec.model.FrameInfo;
import dji.v5.manager.datacenter.camera.StreamInfo;
import dji.v5.manager.datacenter.camera.view.PinPointInfo;
import java.util.List;
import java.util.Map;

public interface ICameraStreamManager {
    public void putCameraStreamSurface(@NonNull ComponentIndexType var1, @NonNull Surface var2, int var3, int var4, @NonNull ScaleType var5);

    public void removeCameraStreamSurface(@NonNull Surface var1);

    public void addFrameListener(@NonNull ComponentIndexType var1, @NonNull FrameFormat var2, @NonNull CameraFrameListener var3);

    public void removeFrameListener(@NonNull CameraFrameListener var1);

    public void addReceiveStreamListener(@NonNull ComponentIndexType var1, @NonNull ReceiveStreamListener var2);

    public void removeReceiveStreamListener(@NonNull ReceiveStreamListener var1);

    public void addAvailableCameraUpdatedListener(@NonNull AvailableCameraUpdatedListener var1);

    public void removeAvailableCameraUpdatedListener(@NonNull AvailableCameraUpdatedListener var1);

    public void setKeepAliveDecoding(boolean var1);

    @Nullable
    public FrameInfo getAircraftStreamFrameInfo(ComponentIndexType var1);

    @NonNull
    public PinPointInfo getLiveViewLocationWithGPS(@NonNull LocationCoordinate3D var1, @NonNull ComponentIndexType var2);

    public void enableVisionAssist(boolean var1, @Nullable CommonCallbacks.CompletionCallback var2);

    public void setVisionAssistViewDirection(VisionAssistDirection var1, @Nullable CommonCallbacks.CompletionCallback var2);

    public void addVisionAssistStatusListener(@NonNull VisionAssistStatusListener var1);

    public void removeVisionAssistStatusListener(@NonNull VisionAssistStatusListener var1);

    public void setStreamEncoderBitrate(ComponentIndexType var1, int var2);

    public int getStreamEncoderBitrate(ComponentIndexType var1);

    public void setStreamPriority(ComponentIndexType var1, ChannelPriority var2);

    public ChannelPriority getStreamPriority(ComponentIndexType var1);

    public void enableStream(ComponentIndexType var1, boolean var2);

    public static final class FrameFormat
    extends Enum<FrameFormat> {
        public static final /* enum */ FrameFormat YUV420_888 = new FrameFormat(35);
        public static final /* enum */ FrameFormat YUV444_888 = new FrameFormat(40);
        public static final /* enum */ FrameFormat YUY2 = new FrameFormat(20);
        public static final /* enum */ FrameFormat NV21 = new FrameFormat(17);
        public static final /* enum */ FrameFormat RGBA_8888 = new FrameFormat(42);
        public final int value;
        private static final /* synthetic */ FrameFormat[] $VALUES;

        public static FrameFormat[] values() {
            return null;
        }

        public static FrameFormat valueOf(String string2) {
            return null;
        }

        private FrameFormat(int n2) {
        }

        @Nullable
        public static FrameFormat find(int n) {
            return null;
        }

        private static /* synthetic */ FrameFormat[] $values() {
            return null;
        }

        static {
            $VALUES = FrameFormat.$values();
        }
    }

    public static final class ScaleType
    extends Enum<ScaleType> {
        public static final /* enum */ ScaleType FIX_XY = new ScaleType(0);
        public static final /* enum */ ScaleType CENTER_CROP = new ScaleType(1);
        public static final /* enum */ ScaleType CENTER_INSIDE = new ScaleType(2);
        public final int value;
        private static final /* synthetic */ ScaleType[] $VALUES;

        public static ScaleType[] values() {
            return null;
        }

        public static ScaleType valueOf(String string2) {
            return null;
        }

        private ScaleType(int n2) {
        }

        @NonNull
        public static ScaleType find(int n) {
            return null;
        }

        private static /* synthetic */ ScaleType[] $values() {
            return null;
        }

        static {
            $VALUES = ScaleType.$values();
        }
    }

    public static final class MimeType
    extends Enum<MimeType> {
        public static final /* enum */ MimeType H264 = new MimeType("video/avc");
        public static final /* enum */ MimeType H265 = new MimeType("video/hevc");
        public final String value;
        private static final /* synthetic */ MimeType[] $VALUES;

        public static MimeType[] values() {
            return null;
        }

        public static MimeType valueOf(String string2) {
            return null;
        }

        private MimeType(String string3) {
        }

        @Nullable
        public static MimeType find(String string2) {
            return null;
        }

        private static /* synthetic */ MimeType[] $values() {
            return null;
        }

        static {
            $VALUES = MimeType.$values();
        }
    }

    public static interface VisionAssistStatusListener {
        @WorkerThread
        public void onVisionAssistEnabled(boolean var1);

        @WorkerThread
        public void onVisionAssistViewDirectionRangeUpdated(@NonNull List<VisionAssistDirection> var1);

        @WorkerThread
        public void onVisionAssistViewDirectionUpdated(@NonNull VisionAssistDirection var1);
    }

    public static interface ReceiveStreamListener {
        @WorkerThread
        public void onReceiveStream(@NonNull byte[] var1, int var2, int var3, @NonNull StreamInfo var4);
    }

    public static interface CameraFrameListener {
        @WorkerThread
        public void onFrame(@NonNull byte[] var1, int var2, int var3, int var4, int var5, @NonNull FrameFormat var6);
    }

    public static interface AvailableCameraUpdatedListener {
        @MainThread
        public void onAvailableCameraUpdated(@NonNull List<ComponentIndexType> var1);

        default public void onCameraStreamEnableUpdate(@NonNull Map<ComponentIndexType, Boolean> map) {
        }
    }
}

