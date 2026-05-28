/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.manager.aircraft.aibox;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.sdk.keyvalue.value.aibox.AIBoxAppListMsg;
import dji.sdk.keyvalue.value.aibox.AIBoxAppStateListMsg;
import dji.sdk.keyvalue.value.aibox.AIBoxDeviceOperatingInfoMsg;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.aibox.IntelligentBoxAppInfo;
import dji.v5.manager.aircraft.aibox.IntelligentBoxInfo;
import dji.v5.manager.aircraft.aibox.IntelligentBoxInfoListener;
import dji.v5.manager.aircraft.payload.PayloadIndexType;
import dji.v5.manager.interfaces.IIntelligentBoxManager;
import java.util.List;
import java.util.Map;

public class IntelligentBoxManager
implements IIntelligentBoxManager {
    private final PayloadIndexType payloadIndex;
    private final List<IntelligentBoxInfoListener> intelligentBoxInfoListeners;
    private final IntelligentBoxInfo boxInfo;
    private Map<String, IntelligentBoxAppInfo> appMap;

    public IntelligentBoxManager(PayloadIndexType payloadIndexType) {
    }

    @Override
    public void init() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void addBoxInfoListener(@NonNull IntelligentBoxInfoListener intelligentBoxInfoListener) {
    }

    @Override
    public void removeBoxInfoListener(@NonNull IntelligentBoxInfoListener intelligentBoxInfoListener) {
    }

    @Override
    public void clearAllBoxInfoListener() {
    }

    @Override
    public void getBoxSerialNumber(@NonNull CommonCallbacks.CompletionCallbackWithParam<String> completionCallbackWithParam) {
    }

    @Override
    public void enableApp(String string2, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void disableApp(String string2, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void uninstallApp(String string2, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void notifyIntelligentBoxInfoListener() {
    }

    private void notifyIntelligentBoxAppInfoListener() {
    }

    private void updateAppInfo(String string2) {
    }

    private /* synthetic */ void lambda$init$2(AIBoxAppListMsg aIBoxAppListMsg, AIBoxAppListMsg aIBoxAppListMsg2) {
    }

    private /* synthetic */ void lambda$init$1(AIBoxAppStateListMsg aIBoxAppStateListMsg, AIBoxAppStateListMsg aIBoxAppStateListMsg2) {
    }

    private /* synthetic */ void lambda$init$0(AIBoxDeviceOperatingInfoMsg aIBoxDeviceOperatingInfoMsg, AIBoxDeviceOperatingInfoMsg aIBoxDeviceOperatingInfoMsg2) {
    }

    static /* synthetic */ Map access$000(IntelligentBoxManager intelligentBoxManager) {
        return null;
    }

    static /* synthetic */ void access$100(IntelligentBoxManager intelligentBoxManager) {
    }
}

