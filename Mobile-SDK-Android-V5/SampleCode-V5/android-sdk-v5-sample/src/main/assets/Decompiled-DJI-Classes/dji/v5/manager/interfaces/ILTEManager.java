/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.interfaces;

import androidx.annotation.NonNull;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.lte.LTEAuthenticationInfoListener;
import dji.v5.manager.aircraft.lte.LTEDongleInfoListener;
import dji.v5.manager.aircraft.lte.LTELinkInfoListener;
import dji.v5.manager.aircraft.lte.LTELinkType;
import dji.v5.manager.aircraft.lte.LTEPrivatizationServerInfo;

public interface ILTEManager {
    public void init();

    public void destroy();

    public void addLTEAuthenticationInfoListener(@NonNull LTEAuthenticationInfoListener var1);

    public void removeLTEAuthenticationInfoListener(@NonNull LTEAuthenticationInfoListener var1);

    public void clearAllLTEAuthenticationInfoListener();

    public void updateLTEAuthenticationInfo(CommonCallbacks.CompletionCallback var1);

    public void getLTEAuthenticationVerificationCode(String var1, String var2, CommonCallbacks.CompletionCallback var3);

    public void startLTEAuthentication(String var1, String var2, String var3, CommonCallbacks.CompletionCallback var4);

    public void getLTEEnhancedTransmissionType(CommonCallbacks.CompletionCallbackWithParam<LTELinkType> var1);

    public void setLTEEnhancedTransmissionType(@NonNull LTELinkType var1, CommonCallbacks.CompletionCallback var2);

    public void addLTELinkInfoListener(@NonNull LTELinkInfoListener var1);

    public void removeLTELinkInfoListener(@NonNull LTELinkInfoListener var1);

    public void clearAllLTELinkInfoListener();

    public void addLTEDongleInfoListener(@NonNull LTEDongleInfoListener var1);

    public void removeLTEDongleInfoListener(@NonNull LTEDongleInfoListener var1);

    public void clearAllLTEDongleInfoListener();

    public void setLTEAircraftPrivatizationServerInfo(@NonNull LTEPrivatizationServerInfo var1, @NonNull CommonCallbacks.CompletionCallback var2);

    public void setLTERemoteControllerPrivatizationServerInfo(@NonNull LTEPrivatizationServerInfo var1, @NonNull CommonCallbacks.CompletionCallback var2);

    public void clearLTEAircraftPrivatizationServer(@NonNull CommonCallbacks.CompletionCallback var1);

    public void clearLTERemoteControllerPrivatizationServer(@NonNull CommonCallbacks.CompletionCallback var1);
}

