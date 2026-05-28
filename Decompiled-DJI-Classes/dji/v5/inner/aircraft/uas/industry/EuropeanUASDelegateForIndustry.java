/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.inner.aircraft.uas.industry;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.aircraft.uas.DefaultUASDelegate;
import dji.v5.manager.aircraft.uas.AreaStrategy;
import dji.v5.manager.aircraft.uas.CClassStatus;
import dji.v5.manager.aircraft.uas.CClassStatusListener;
import dji.v5.manager.aircraft.uas.OperatorRegistrationNumberStatus;
import dji.v5.manager.aircraft.uas.OperatorRegistrationNumberStatusListener;
import java.util.List;

public class EuropeanUASDelegateForIndustry
extends DefaultUASDelegate {
    protected OperatorRegistrationNumberStatus operatorRegNumberStatus;
    public List<OperatorRegistrationNumberStatusListener> operatorRegistrationNumberStatusListeners;
    protected CClassStatus cClassStatus;
    protected CClassStatusListener cClassStatusListener;
    private boolean isCEC0Support;
    private boolean isCEC1Support;
    private boolean isCEC2Support;

    public EuropeanUASDelegateForIndustry(boolean bl, AreaStrategy areaStrategy) {
    }

    @Override
    public void init() {
    }

    @Override
    protected void addKeyListener() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void setOperatorRegistrationNumber(String string2, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getOperatorRegistrationNumber(@NonNull CommonCallbacks.CompletionCallbackWithParam<String> completionCallbackWithParam) {
    }

    @Override
    public void furtherUpdateRemoteIDStatus() {
    }

    @Override
    protected void notifyOperatorRegistrationNumberStatus() {
    }

    @Override
    public void addOperatorRegistrationNumberStatusListener(OperatorRegistrationNumberStatusListener operatorRegistrationNumberStatusListener) {
    }

    @Override
    public void removeOperatorRegistrationNumberStatusListener(OperatorRegistrationNumberStatusListener operatorRegistrationNumberStatusListener) {
    }

    @Override
    public void clearAllOperatorRegistrationNumberStatusListener() {
    }

    private void updateCClassStatus() {
    }

    @Override
    protected void notifyCClassStatusListener() {
    }

    @Override
    public void clearAllCClassStatusListener() {
    }

    @Override
    public void removeCClassStatusListener(CClassStatusListener cClassStatusListener) {
    }

    @Override
    public void addCClassStatusListener(CClassStatusListener cClassStatusListener) {
    }

    private /* synthetic */ void lambda$addKeyListener$4(ProductType productType, ProductType productType2) {
    }

    private /* synthetic */ void lambda$addKeyListener$3(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$addKeyListener$2(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$addKeyListener$1(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$addKeyListener$0(String string2, String string3) {
    }
}

