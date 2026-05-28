/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.aircraft.lte;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.airlink.WlmLinkMode;
import dji.sdk.keyvalue.value.airlink.WlmLiveServiceMode;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.lte.BaseLTEManagerDelegate;
import dji.v5.manager.aircraft.lte.LTELinkType;
import dji.v5.manager.aircraft.lte.LTEPrivatizationServerInfo;

class IndustryLTEManagerDelegate
extends BaseLTEManagerDelegate {
    private boolean isWlmServiceModeSupport;
    private WlmLinkMode wlmLinkMode;
    private WlmLiveServiceMode wlmLiveServiceMode;

    IndustryLTEManagerDelegate() {
    }

    @Override
    public void init() {
    }

    private void updateCurrentLTELinkType() {
    }

    @Override
    public void setLTEEnhancedTransmissionType(@NonNull LTELinkType lTELinkType, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getLTEEnhancedTransmissionType(CommonCallbacks.CompletionCallbackWithParam<LTELinkType> completionCallbackWithParam) {
    }

    @Override
    public void setLTEAircraftPrivatizationServerInfo(@NonNull LTEPrivatizationServerInfo lTEPrivatizationServerInfo, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void setLTERemoteControllerPrivatizationServerInfo(@NonNull LTEPrivatizationServerInfo lTEPrivatizationServerInfo, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void clearLTEAircraftPrivatizationServer(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void clearLTERemoteControllerPrivatizationServer(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    private /* synthetic */ void lambda$init$2(WlmLiveServiceMode wlmLiveServiceMode, WlmLiveServiceMode wlmLiveServiceMode2) {
    }

    private /* synthetic */ void lambda$init$1(WlmLinkMode wlmLinkMode, WlmLinkMode wlmLinkMode2) {
    }

    private /* synthetic */ void lambda$init$0(Boolean bl, Boolean bl2) {
    }
}

