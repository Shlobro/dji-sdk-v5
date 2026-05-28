/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.network;

import androidx.annotation.NonNull;
import dji.v5.common.ldm.LDMExemptModule;
import dji.v5.network.DJIHttpCallback;
import dji.v5.network.DJIHttpRequest;
import dji.v5.network.DJIHttpResponse;

interface IDJINetworkManager {
    public String getSign();

    public void enqueue(@NonNull DJIHttpRequest var1, DJIHttpCallback<DJIHttpResponse> var2);

    public DJIHttpResponse execute(@NonNull DJIHttpRequest var1);

    public void cancel(@NonNull DJIHttpRequest var1);

    public void cancel(@NonNull LDMExemptModule var1);

    public void cancelAll();
}

