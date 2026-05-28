/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.v5.manager.interfaces;

import android.content.Context;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;
import dji.v5.common.ldm.LDMExemptModule;

public interface ILDMManager {
    public boolean isLDMLicenseLoaded();

    public boolean isLDMEnabled();

    public boolean isNetworkServiceEnabledForModule(LDMExemptModule var1);

    public void enableLDM(Context var1, CommonCallbacks.CompletionCallback var2, LDMExemptModule ... var3);

    public void disableLDM(CommonCallbacks.CompletionCallback var1);

    public IDJIError loadLocalLDMLicenseContent(String var1);

    public String getLocalLDMLicensePath(Context var1);
}

