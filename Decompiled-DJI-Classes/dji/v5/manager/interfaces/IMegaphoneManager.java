/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.manager.interfaces;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.megaphone.FileInfo;
import dji.v5.manager.aircraft.megaphone.MegaphoneIndex;
import dji.v5.manager.aircraft.megaphone.MegaphoneInfoListener;
import dji.v5.manager.aircraft.megaphone.MegaphoneStatus;
import dji.v5.manager.aircraft.megaphone.PlayMode;
import dji.v5.manager.aircraft.megaphone.RealTimeTransimissionStateListener;
import dji.v5.manager.aircraft.megaphone.WorkMode;

public interface IMegaphoneManager {
    public void init();

    public void destroy();

    public void setMegaphoneIndex(@NonNull MegaphoneIndex var1, @NonNull CommonCallbacks.CompletionCallback var2);

    public void getMegaphoneIndex(@NonNull CommonCallbacks.CompletionCallbackWithParam<MegaphoneIndex> var1);

    public void setVolume(@NonNull int var1, @Nullable CommonCallbacks.CompletionCallback var2);

    public void getVolume(@Nullable CommonCallbacks.CompletionCallbackWithParam<Integer> var1);

    public void setPlayMode(@NonNull PlayMode var1, @Nullable CommonCallbacks.CompletionCallback var2);

    public void getPlayMode(@Nullable CommonCallbacks.CompletionCallbackWithParam<PlayMode> var1);

    public void setWorkMode(@NonNull WorkMode var1, @Nullable CommonCallbacks.CompletionCallback var2);

    public void getWorkMode(@Nullable CommonCallbacks.CompletionCallbackWithParam<WorkMode> var1);

    public void getStatus(@Nullable CommonCallbacks.CompletionCallbackWithParam<MegaphoneStatus> var1);

    public void startPlay(@Nullable CommonCallbacks.CompletionCallback var1);

    public void stopPlay(@Nullable CommonCallbacks.CompletionCallback var1);

    public void startPushingFileToMegaphone(@NonNull FileInfo var1, @Nullable CommonCallbacks.CompletionCallbackWithProgress<Integer> var2);

    public void cancelPushingFileToMegaphone(@Nullable CommonCallbacks.CompletionCallback var1);

    public void startRealTimeTransmission(@Nullable CommonCallbacks.CompletionCallback var1);

    public void sendRealTimeDataToMegaphone(byte[] var1, int var2, @Nullable CommonCallbacks.CompletionCallback var3);

    public void appendEOFToRealTimeData(@Nullable CommonCallbacks.CompletionCallback var1);

    public void cancelRealTimeTransmission(@Nullable CommonCallbacks.CompletionCallback var1);

    public void addRealTimeTransmissionStateListener(@Nullable RealTimeTransimissionStateListener var1);

    public void removeRealTimeTransmissionStateListener(@Nullable RealTimeTransimissionStateListener var1);

    public void clearAllRealTimeTransmissionStateListener();

    public void addMegaphoneInfoListener(MegaphoneInfoListener var1);

    public void removeMegaphoneInfoListener(MegaphoneInfoListener var1);

    public void clearAllMegaphoneInfoListener();
}

