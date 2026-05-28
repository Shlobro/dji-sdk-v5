/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.CallSuper
 *  androidx.annotation.Keep
 *  androidx.annotation.NonNull
 *  io.reactivex.rxjava3.disposables.Disposable
 */
package dji.v5.inner.aircraft.uas;

import androidx.annotation.CallSuper;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;
import dji.v5.manager.aircraft.flysafe.info.RidUnlockType;
import dji.v5.manager.aircraft.uas.AreaStrategy;
import dji.v5.manager.aircraft.uas.CClassStatusListener;
import dji.v5.manager.aircraft.uas.ElectronicIDStatusListener;
import dji.v5.manager.aircraft.uas.OperatorRegistrationNumberStatusListener;
import dji.v5.manager.aircraft.uas.RealNameRegistrationStatusListener;
import dji.v5.manager.aircraft.uas.RemoteIdWorkingState;
import dji.v5.manager.aircraft.uas.UARegistrationNumberStatusListener;
import dji.v5.manager.aircraft.uas.UASRemoteIDStatus;
import dji.v5.manager.aircraft.uas.UASRemoteIDStatusListener;
import dji.v5.manager.areacode.AreaCode;
import dji.v5.manager.interfaces.IUASRemoteIDManager;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@Keep
public abstract class DefaultUASDelegate
implements IUASRemoteIDManager {
    private final AtomicBoolean isInit;
    public List<UASRemoteIDStatusListener> uasRemoteIDStatusListenerList;
    protected RemoteIdWorkingState remoteIdWorkingState;
    protected UASRemoteIDStatus uasRemoteIDStatus;
    protected static final int NO_ERROR = 0;
    protected static final int LOCATION_MISSION = 1;
    protected static final int FIRMWARE_ERROR = 2;
    private Disposable disposable;
    protected boolean isRidLicenseOpened;
    protected boolean isRidLicenseSupport;
    protected AreaStrategy areaStrategy;

    protected DefaultUASDelegate(boolean bl, AreaStrategy areaStrategy) {
    }

    @Override
    @CallSuper
    public void init() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public IDJIError setAreaCode(AreaCode areaCode) {
        return null;
    }

    @Override
    public IDJIError setUASRemoteIDAreaStrategy(AreaStrategy areaStrategy) {
        return null;
    }

    @Override
    public void setElectronicIDEnabled(boolean bl, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getElectronicIDEnabled(@NonNull CommonCallbacks.CompletionCallbackWithParam<Boolean> completionCallbackWithParam) {
    }

    @Override
    public void addElectronicIDStatusListener(ElectronicIDStatusListener electronicIDStatusListener) {
    }

    @Override
    public void removeElectronicIDStatusListener(ElectronicIDStatusListener electronicIDStatusListener) {
    }

    @Override
    public void clearAllElectronicIDStatusListener() {
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
    public void removeUARegistrationNumberStatusListener(UARegistrationNumberStatusListener uARegistrationNumberStatusListener) {
    }

    @Override
    public void clearAllUARegistrationNumberStatusListener() {
    }

    @Override
    public UASRemoteIDStatus getUASRemoteIDStatus() {
        return null;
    }

    @Override
    public void addUASRemoteIDStatusListener(UASRemoteIDStatusListener uASRemoteIDStatusListener) {
    }

    protected void updateRemoteIDStatus() {
    }

    private void notifyRemoteIDStatus() {
    }

    public abstract void furtherUpdateRemoteIDStatus();

    @Override
    public void removeUASRemoteIDStatusListener(UASRemoteIDStatusListener uASRemoteIDStatusListener) {
    }

    @Override
    public void clearUASRemoteIDStatusListener() {
    }

    @Override
    public void setOperatorRegistrationNumber(String string2, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getOperatorRegistrationNumber(@NonNull CommonCallbacks.CompletionCallbackWithParam<String> completionCallbackWithParam) {
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

    @Override
    public void addCClassStatusListener(CClassStatusListener cClassStatusListener) {
    }

    @Override
    public void removeCClassStatusListener(CClassStatusListener cClassStatusListener) {
    }

    @Override
    public void clearAllCClassStatusListener() {
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

    protected void notifyCClassStatusListener() {
    }

    protected void notifyOperatorRegistrationNumberStatus() {
    }

    protected void addKeyListener() {
    }

    protected void cancelListener() {
    }

    protected boolean isRidLicenseSuitable(RidUnlockType ridUnlockType) {
        return false;
    }

    private /* synthetic */ void lambda$init$0(List list) throws Throwable {
    }
}

