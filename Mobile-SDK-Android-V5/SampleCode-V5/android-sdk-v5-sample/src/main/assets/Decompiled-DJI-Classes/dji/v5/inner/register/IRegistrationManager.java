/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.inner.register;

import dji.v5.common.callback.CommonCallbacks;

public interface IRegistrationManager {
    public void registerApp(CommonCallbacks.CompletionCallback var1);

    public boolean canAccessToSDK();
}

