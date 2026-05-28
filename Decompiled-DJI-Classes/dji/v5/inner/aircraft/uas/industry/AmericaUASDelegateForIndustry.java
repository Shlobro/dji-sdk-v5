/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.inner.aircraft.uas.industry;

import dji.sdk.keyvalue.value.flightcontroller.RidWorkingStatusPushMsg;
import dji.v5.inner.aircraft.uas.DefaultUASDelegate;
import dji.v5.manager.aircraft.uas.AreaStrategy;

public class AmericaUASDelegateForIndustry
extends DefaultUASDelegate {
    private RidWorkingStatusPushMsg ridWorkingStatusPushMsg;

    public AmericaUASDelegateForIndustry(boolean bl, AreaStrategy areaStrategy) {
    }

    @Override
    public void init() {
    }

    @Override
    public void furtherUpdateRemoteIDStatus() {
    }

    private boolean isSupportCNRid() {
        return false;
    }

    private /* synthetic */ void lambda$init$0(RidWorkingStatusPushMsg ridWorkingStatusPushMsg, RidWorkingStatusPushMsg ridWorkingStatusPushMsg2) {
    }
}

