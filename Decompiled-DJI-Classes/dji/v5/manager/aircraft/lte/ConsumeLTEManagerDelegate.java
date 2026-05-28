/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.aircraft.lte;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.airlink.WlmLinkMode;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.lte.BaseLTEManagerDelegate;
import dji.v5.manager.aircraft.lte.LTELinkType;
import dji.v5.network.IDJINetworkStatusListener;

class ConsumeLTEManagerDelegate
extends BaseLTEManagerDelegate {
    private final IDJINetworkStatusListener networkStatusListener;

    ConsumeLTEManagerDelegate() {
    }

    @Override
    public void init() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void setLTEEnhancedTransmissionType(@NonNull LTELinkType lTELinkType, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getLTEEnhancedTransmissionType(CommonCallbacks.CompletionCallbackWithParam<LTELinkType> completionCallbackWithParam) {
    }

    private /* synthetic */ void lambda$init$1(WlmLinkMode wlmLinkMode, WlmLinkMode wlmLinkMode2) {
    }

    private static /* synthetic */ void lambda$new$0(boolean bl) {
    }
}

