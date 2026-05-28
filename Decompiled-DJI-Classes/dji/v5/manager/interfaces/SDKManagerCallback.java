/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.interfaces;

import dji.v5.common.error.IDJIError;
import dji.v5.common.register.DJISDKInitEvent;

public interface SDKManagerCallback {
    public void onRegisterSuccess();

    public void onRegisterFailure(IDJIError var1);

    public void onProductDisconnect(int var1);

    public void onProductConnect(int var1);

    public void onProductChanged(int var1);

    public void onInitProcess(DJISDKInitEvent var1, int var2);

    public void onDatabaseDownloadProgress(long var1, long var3);
}

