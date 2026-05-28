/*
 * Decompiled with CFR 0.152.
 */
package com.dji.mobileinfra.cloudcontrol;

import com.dji.mobileinfra.cloudcontrol.CloudControlConfiguration;

public interface Callback {
    public void onError(Throwable var1);

    public void onCompleted(CloudControlConfiguration var1);
}

