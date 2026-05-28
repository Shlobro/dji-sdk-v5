/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  androidx.annotation.IntRange
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  org.aspectj.lang.JoinPoint$StaticPart
 */
package dji.v5.manager.aircraft.megaphone;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.payload.MegaphoneErrorCodeMsg;
import dji.sdk.keyvalue.value.payload.MegaphonePlayStateMsg;
import dji.sdk.keyvalue.value.payload.MegaphonePosition;
import dji.sdk.keyvalue.value.payload.MegaphoneUploadFileType;
import dji.sdk.keyvalue.value.payload.MegaphoneUploadProgressMsg;
import dji.sdk.payload.callback.MegaphoneUploadProgressCallback;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.analytics.annotation.TrackElements;
import dji.v5.inner.analytics.annotation.TrackEvent;
import dji.v5.inner.analytics.helper.DJIAnalyticsPerformHelper;
import dji.v5.manager.aircraft.megaphone.FileInfo;
import dji.v5.manager.aircraft.megaphone.MegaphoneIndex;
import dji.v5.manager.aircraft.megaphone.MegaphoneInfo;
import dji.v5.manager.aircraft.megaphone.MegaphoneInfoListener;
import dji.v5.manager.aircraft.megaphone.MegaphoneStatus;
import dji.v5.manager.aircraft.megaphone.PlayMode;
import dji.v5.manager.aircraft.megaphone.RealTimeTransimissionStateListener;
import dji.v5.manager.aircraft.megaphone.WorkMode;
import dji.v5.manager.interfaces.IMegaphoneManager;
import java.io.File;
import java.security.MessageDigest;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import org.aspectj.lang.JoinPoint;

public class MegaphoneManager
implements IMegaphoneManager {
    private static final String DEFAULT_UID = "01aa709533144c89983dd04d9a8a86ba";
    private static final String DEFAULT_FILE_NAME = "megaphone_file";
    private final ExecutorService pool;
    private final DJIAnalyticsPerformHelper analyticsPerformHelper;
    private MessageDigest md5;
    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 100;
    private MegaphoneListenerHandler handler;
    private static final int MSG_REMOVE_LISTENER = 100;
    private boolean isFileChannelOpen;
    private boolean isRealTimeChannelOpened;
    private final TreeMap<MegaphoneIndex, Boolean> megaphoneConnectMap;
    private MegaphoneIndex curMegaphoneIndex;
    private final List<RealTimeTransimissionStateListener> realTimeTransimissionStateListeners;
    private final List<MegaphoneInfoListener> megaphoneInfoListeners;
    private MegaphoneInfo curMegaphoneInfo;
    private final MegaphoneUploadProgressCallback megaphoneUploadProgressCallback;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;

    private MegaphoneManager() {
    }

    public static IMegaphoneManager getInstance() {
        return null;
    }

    @Override
    public void init() {
    }

    private void startListenMegaphoneStatus(MegaphoneIndex megaphoneIndex) {
    }

    private void stopListenMegaphoneStatus(MegaphoneIndex megaphoneIndex) {
    }

    private void convertToMegaphoneStatus(MegaphonePlayStateMsg megaphonePlayStateMsg) {
    }

    @Override
    public void destroy() {
    }

    @Override
    @TrackEvent(eventName="setVolume", category="ManagerAnnotation")
    public void setVolume(@TrackElements(value="volume") @IntRange(from=0L, to=100L) @NonNull int n, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getVolume(@Nullable CommonCallbacks.CompletionCallbackWithParam<Integer> completionCallbackWithParam) {
    }

    @Override
    @TrackEvent(eventName="setMegaphoneIndex", category="ManagerAnnotation")
    public void setMegaphoneIndex(@TrackElements(value="megaphoneIndex") @NonNull MegaphoneIndex megaphoneIndex, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getMegaphoneIndex(@NonNull CommonCallbacks.CompletionCallbackWithParam<MegaphoneIndex> completionCallbackWithParam) {
    }

    @Override
    @TrackEvent(eventName="setPlayMode", category="ManagerAnnotation")
    public void setPlayMode(@TrackElements(value="playMode") @NonNull PlayMode playMode, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getPlayMode(@Nullable CommonCallbacks.CompletionCallbackWithParam<PlayMode> completionCallbackWithParam) {
    }

    @Override
    @TrackEvent(eventName="setWorkMode", category="ManagerAnnotation")
    public void setWorkMode(@TrackElements(value="workMode") @NonNull WorkMode workMode, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getWorkMode(@Nullable CommonCallbacks.CompletionCallbackWithParam<WorkMode> completionCallbackWithParam) {
    }

    @Override
    public void getStatus(@Nullable CommonCallbacks.CompletionCallbackWithParam<MegaphoneStatus> completionCallbackWithParam) {
    }

    @Override
    public void startPlay(@Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="stopPlay", category="ManagerAnnotation")
    public void stopPlay(@Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void startPushingFileToMegaphone(@Nullable FileInfo fileInfo, @Nullable CommonCallbacks.CompletionCallbackWithProgress<Integer> completionCallbackWithProgress) {
    }

    @Override
    @TrackEvent(eventName="cancelPushingFileToMegaphone", category="ManagerAnnotation")
    public void cancelPushingFileToMegaphone(@Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void startRealTimeTransmission(@Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="sendRealTimeDataToMegaphone", category="ManagerAnnotation")
    public void sendRealTimeDataToMegaphone(byte[] byArray, int n, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="appendEOFToRealTimeData", category="ManagerAnnotation")
    public void appendEOFToRealTimeData(@Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="cancelRealTimeTransmission", category="ManagerAnnotation")
    public void cancelRealTimeTransmission(@Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void addRealTimeTransmissionStateListener(@Nullable RealTimeTransimissionStateListener realTimeTransimissionStateListener) {
    }

    @Override
    public void removeRealTimeTransmissionStateListener(@Nullable RealTimeTransimissionStateListener realTimeTransimissionStateListener) {
    }

    @Override
    public void clearAllRealTimeTransmissionStateListener() {
    }

    @Override
    public void addMegaphoneInfoListener(MegaphoneInfoListener megaphoneInfoListener) {
    }

    @Override
    public void removeMegaphoneInfoListener(MegaphoneInfoListener megaphoneInfoListener) {
    }

    @Override
    public void clearAllMegaphoneInfoListener() {
    }

    private void notifyMegaphoneInfo() {
    }

    private String uniqueId() {
        return null;
    }

    private void startUpload(FileInfo fileInfo, CommonCallbacks.CompletionCallbackWithProgress<Integer> completionCallbackWithProgress) {
    }

    private void startUploadTTS(FileInfo fileInfo, CommonCallbacks.CompletionCallbackWithProgress<Integer> completionCallbackWithProgress) {
    }

    private void setUploadListener(CommonCallbacks.CompletionCallbackWithProgress<Integer> completionCallbackWithProgress) {
    }

    private void noticeRemoveListener() {
    }

    private void cancelTransmission(@Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    private MegaphonePosition convertIndexToPosition(MegaphoneIndex megaphoneIndex) {
        return null;
    }

    private ComponentIndexType getIndexType(@NonNull MegaphoneIndex megaphoneIndex) {
        return null;
    }

    private boolean isCurMegaphoneConnected() {
        return false;
    }

    private void updateFileName(String string2) {
    }

    private static /* synthetic */ void lambda$cancelTransmission$20(CommonCallbacks.CompletionCallback completionCallback, boolean bl) {
    }

    private /* synthetic */ void lambda$setUploadListener$19(CommonCallbacks.CompletionCallbackWithProgress completionCallbackWithProgress, MegaphoneUploadProgressMsg megaphoneUploadProgressMsg) {
    }

    private /* synthetic */ void lambda$startUploadTTS$18(CommonCallbacks.CompletionCallbackWithProgress completionCallbackWithProgress, FileInfo fileInfo, MegaphoneErrorCodeMsg megaphoneErrorCodeMsg) {
    }

    private /* synthetic */ void lambda$startUploadTTS$17(CommonCallbacks.CompletionCallbackWithProgress completionCallbackWithProgress, MegaphoneErrorCodeMsg megaphoneErrorCodeMsg) {
    }

    private /* synthetic */ void lambda$startUpload$16(CommonCallbacks.CompletionCallbackWithProgress completionCallbackWithProgress, MegaphoneUploadFileType megaphoneUploadFileType, FileInfo fileInfo, MegaphoneErrorCodeMsg megaphoneErrorCodeMsg) {
    }

    private /* synthetic */ void lambda$appendEOFToRealTimeData$15(CommonCallbacks.CompletionCallback completionCallback, MegaphoneErrorCodeMsg megaphoneErrorCodeMsg) {
    }

    private static /* synthetic */ void lambda$sendRealTimeDataToMegaphone$14(CommonCallbacks.CompletionCallback completionCallback, MegaphoneErrorCodeMsg megaphoneErrorCodeMsg) {
    }

    private /* synthetic */ void lambda$startRealTimeTransmission$13(CommonCallbacks.CompletionCallback completionCallback, MegaphoneErrorCodeMsg megaphoneErrorCodeMsg) {
    }

    private /* synthetic */ void lambda$startListenMegaphoneStatus$12(MegaphonePlayStateMsg megaphonePlayStateMsg, MegaphonePlayStateMsg megaphonePlayStateMsg2) {
    }

    private /* synthetic */ void lambda$startListenMegaphoneStatus$11(MegaphonePlayStateMsg megaphonePlayStateMsg, MegaphonePlayStateMsg megaphonePlayStateMsg2) {
    }

    private /* synthetic */ void lambda$init$10() {
    }

    private /* synthetic */ void lambda$init$9(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$init$8(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$init$7(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$init$6(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$init$5(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$init$4(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$init$3(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$init$2(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$new$1(MegaphoneUploadProgressMsg megaphoneUploadProgressMsg) {
    }

    private static /* synthetic */ int lambda$new$0(MegaphoneIndex megaphoneIndex, MegaphoneIndex megaphoneIndex2) {
        return 0;
    }

    /* synthetic */ MegaphoneManager(1 var1_1) {
    }

    static /* synthetic */ DJIAnalyticsPerformHelper access$200(MegaphoneManager megaphoneManager) {
        return null;
    }

    static {
        MegaphoneManager.ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
    }

    private static class MegaphoneListenerHandler
    extends Handler {
        public MegaphoneListenerHandler(@NonNull Looper looper) {
        }

        public void handleMessage(@NonNull Message message) {
        }
    }

    private static class LazyHolder {
        private static final MegaphoneManager INSTANCE = new MegaphoneManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ MegaphoneManager access$100() {
            return null;
        }
    }

    private class FileReadRunnable
    implements Runnable {
        private File file;
        private CommonCallbacks.CompletionCallbackWithProgress<?> callback;
        final /* synthetic */ MegaphoneManager this$0;

        FileReadRunnable(MegaphoneManager megaphoneManager, File file, CommonCallbacks.CompletionCallbackWithProgress<?> completionCallbackWithProgress) {
        }

        @Override
        public void run() {
        }

        private /* synthetic */ void lambda$run$1(MegaphoneErrorCodeMsg megaphoneErrorCodeMsg) {
        }

        private /* synthetic */ void lambda$run$0(MegaphoneErrorCodeMsg megaphoneErrorCodeMsg) {
        }
    }
}

