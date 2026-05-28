/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.interfaces;

import android.content.Context;
import androidx.annotation.NonNull;
import dji.v5.common.register.PackageProductCategory;
import dji.v5.manager.interfaces.SDKManagerCallback;

public interface ISDKManager {
    public void init(Context var1, @NonNull SDKManagerCallback var2);

    public void registerApp();

    public boolean isRegistered();

    public void destroy();

    public String getSDKVersion();

    public void enableBridgeModeWithBridgeAppIP(String var1);

    public PackageProductCategory getProductCategory();
}

