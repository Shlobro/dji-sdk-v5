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
import dji.v5.manager.aircraft.aibox.IntelligentBoxInfoListener;

public interface IIntelligentBoxManager {
    public void init();

    public void destroy();

    public void addBoxInfoListener(@NonNull IntelligentBoxInfoListener var1);

    public void removeBoxInfoListener(@NonNull IntelligentBoxInfoListener var1);

    public void clearAllBoxInfoListener();

    public void getBoxSerialNumber(@NonNull CommonCallbacks.CompletionCallbackWithParam<String> var1);

    public void enableApp(String var1, @Nullable CommonCallbacks.CompletionCallback var2);

    public void disableApp(String var1, @Nullable CommonCallbacks.CompletionCallback var2);

    public void uninstallApp(String var1, @Nullable CommonCallbacks.CompletionCallback var2);
}

