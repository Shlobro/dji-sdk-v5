/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.inner.aircraft.uas.industry;

import dji.sdk.keyvalue.value.flightcontroller.RealNameRegistrationState;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.aircraft.uas.industry.AmericaUASDelegateForIndustry;
import dji.v5.manager.aircraft.uas.AreaStrategy;
import dji.v5.manager.aircraft.uas.RealNameRegistrationStatus;
import dji.v5.manager.aircraft.uas.RealNameRegistrationStatusListener;
import java.util.List;

public class ChinaUASDelegateForIndustry
extends AmericaUASDelegateForIndustry {
    public List<RealNameRegistrationStatusListener> realNameRegistrationStatusListenerList;
    private final RealNameRegistrationStatus realNameRegistrationStatus;
    private boolean isHasAutoSync;

    public ChinaUASDelegateForIndustry(boolean bl, AreaStrategy areaStrategy) {
    }

    @Override
    public void init() {
    }

    @Override
    protected void addKeyListener() {
    }

    @Override
    public void addRealNameRegistrationStatusListener(RealNameRegistrationStatusListener realNameRegistrationStatusListener) {
    }

    @Override
    public void removeRealNameRegistrationStatusListener(RealNameRegistrationStatusListener realNameRegistrationStatusListener) {
    }

    @Override
    public void clearAllRealNameRegistrationStatusListener() {
    }

    @Override
    public void updateRealNameRegistrationStateFromUOM(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void setRealNameTag(String string2, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getRealNameTag(CommonCallbacks.CompletionCallbackWithParam<String> completionCallbackWithParam) {
    }

    private void updateRealNameRegistrationStatus() {
    }

    private void startAutoSync() {
    }

    private boolean needAutoSync(RealNameRegistrationState realNameRegistrationState) {
        return false;
    }

    @Override
    public void destroy() {
    }

    private /* synthetic */ void lambda$addKeyListener$1(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$addKeyListener$0(RealNameRegistrationState realNameRegistrationState, RealNameRegistrationState realNameRegistrationState2) {
    }

    static /* synthetic */ boolean access$002(ChinaUASDelegateForIndustry chinaUASDelegateForIndustry, boolean bl) {
        return false;
    }
}

