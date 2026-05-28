/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.inner.aircraft.uas.industry;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.flightcontroller.RIDResultState;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.aircraft.uas.DefaultUASDelegate;
import dji.v5.manager.aircraft.uas.AreaStrategy;
import dji.v5.manager.aircraft.uas.UARegistrationNumberStatus;
import dji.v5.manager.aircraft.uas.UARegistrationNumberStatusListener;
import dji.v5.manager.aircraft.uas.UASRemoteIDStatus;
import java.util.List;

public class JPUASDelegateForIndustry
extends DefaultUASDelegate {
    private List<UARegistrationNumberStatusListener> registrationNumberStatusList;
    private UARegistrationNumberStatus uaRegistrationNumberStatus;

    public JPUASDelegateForIndustry(boolean bl, AreaStrategy areaStrategy) {
    }

    @Override
    public void init() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void setUARegistrationNumber(String string2, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getUARegistrationNumber(@NonNull CommonCallbacks.CompletionCallbackWithParam<String> completionCallbackWithParam) {
    }

    @Override
    public void addUARegistrationNumberStatusListener(UARegistrationNumberStatusListener uARegistrationNumberStatusListener) {
    }

    @Override
    public void clearAllUARegistrationNumberStatusListener() {
    }

    @Override
    public void removeUARegistrationNumberStatusListener(UARegistrationNumberStatusListener uARegistrationNumberStatusListener) {
    }

    @Override
    public UASRemoteIDStatus getUASRemoteIDStatus() {
        return null;
    }

    @Override
    protected void addKeyListener() {
    }

    private void updateRegistrationNumberStatus() {
    }

    @Override
    public void furtherUpdateRemoteIDStatus() {
    }

    private /* synthetic */ void lambda$addKeyListener$0(RIDResultState rIDResultState, RIDResultState rIDResultState2) {
    }
}

