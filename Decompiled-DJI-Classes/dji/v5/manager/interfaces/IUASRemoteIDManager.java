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
import dji.v5.common.error.IDJIError;
import dji.v5.manager.aircraft.uas.AreaStrategy;
import dji.v5.manager.aircraft.uas.CClassStatusListener;
import dji.v5.manager.aircraft.uas.ElectronicIDStatusListener;
import dji.v5.manager.aircraft.uas.OperatorRegistrationNumberStatusListener;
import dji.v5.manager.aircraft.uas.RealNameRegistrationStatusListener;
import dji.v5.manager.aircraft.uas.UARegistrationNumberStatusListener;
import dji.v5.manager.aircraft.uas.UASRemoteIDStatus;
import dji.v5.manager.aircraft.uas.UASRemoteIDStatusListener;
import dji.v5.manager.areacode.AreaCode;

public interface IUASRemoteIDManager {
    public void init();

    public void destroy();

    @Deprecated
    @Nullable
    public IDJIError setAreaCode(AreaCode var1);

    public IDJIError setUASRemoteIDAreaStrategy(AreaStrategy var1);

    public void setElectronicIDEnabled(boolean var1, @NonNull CommonCallbacks.CompletionCallback var2);

    public void getElectronicIDEnabled(@NonNull CommonCallbacks.CompletionCallbackWithParam<Boolean> var1);

    public void addElectronicIDStatusListener(ElectronicIDStatusListener var1);

    public void removeElectronicIDStatusListener(ElectronicIDStatusListener var1);

    public void clearAllElectronicIDStatusListener();

    public void setUARegistrationNumber(String var1, @NonNull CommonCallbacks.CompletionCallback var2);

    public void getUARegistrationNumber(@NonNull CommonCallbacks.CompletionCallbackWithParam<String> var1);

    public void addUARegistrationNumberStatusListener(UARegistrationNumberStatusListener var1);

    public void removeUARegistrationNumberStatusListener(UARegistrationNumberStatusListener var1);

    public void clearAllUARegistrationNumberStatusListener();

    public UASRemoteIDStatus getUASRemoteIDStatus();

    public void setOperatorRegistrationNumber(String var1, @NonNull CommonCallbacks.CompletionCallback var2);

    public void getOperatorRegistrationNumber(@NonNull CommonCallbacks.CompletionCallbackWithParam<String> var1);

    public void addOperatorRegistrationNumberStatusListener(OperatorRegistrationNumberStatusListener var1);

    public void removeOperatorRegistrationNumberStatusListener(OperatorRegistrationNumberStatusListener var1);

    public void clearAllOperatorRegistrationNumberStatusListener();

    public void addCClassStatusListener(CClassStatusListener var1);

    public void removeCClassStatusListener(CClassStatusListener var1);

    public void clearAllCClassStatusListener();

    public void addRealNameRegistrationStatusListener(RealNameRegistrationStatusListener var1);

    public void removeRealNameRegistrationStatusListener(RealNameRegistrationStatusListener var1);

    public void clearAllRealNameRegistrationStatusListener();

    public void updateRealNameRegistrationStateFromUOM(CommonCallbacks.CompletionCallback var1);

    public void setRealNameTag(String var1, CommonCallbacks.CompletionCallback var2);

    public void getRealNameTag(CommonCallbacks.CompletionCallbackWithParam<String> var1);

    public void addUASRemoteIDStatusListener(UASRemoteIDStatusListener var1);

    public void removeUASRemoteIDStatusListener(UASRemoteIDStatusListener var1);

    public void clearUASRemoteIDStatusListener();
}

