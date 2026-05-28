/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.interfaces;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.payload.WidgetValue;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.payload.listener.PayloadBasicInfoListener;
import dji.v5.manager.aircraft.payload.listener.PayloadDataListener;
import dji.v5.manager.aircraft.payload.listener.PayloadWidgetInfoListener;

public interface IPayloadManager {
    public void init();

    public void destroy();

    public void addPayloadBasicInfoListener(@NonNull PayloadBasicInfoListener var1);

    public void removePayloadBasicInfoListener(@NonNull PayloadBasicInfoListener var1);

    public void clearAllPayloadBasicInfoListener();

    public void addPayloadWidgetInfoListener(@NonNull PayloadWidgetInfoListener var1);

    public void removePayloadWidgetInfoListener(@NonNull PayloadWidgetInfoListener var1);

    public void clearAllPayloadWidgetInfoListener();

    public void addPayloadDataListener(@NonNull PayloadDataListener var1);

    public void removePayloadDataListener(@NonNull PayloadDataListener var1);

    public void clearAllPayloadDataListener();

    public void pullWidgetInfoFromPayload(@NonNull CommonCallbacks.CompletionCallback var1);

    public void setWidgetValue(@NonNull WidgetValue var1, @NonNull CommonCallbacks.CompletionCallback var2);

    public void sendDataToPayload(byte[] var1, @NonNull CommonCallbacks.CompletionCallback var2);
}

