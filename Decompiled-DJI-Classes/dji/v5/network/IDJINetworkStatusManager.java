/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.Keep
 */
package dji.v5.network;

import android.content.Context;
import androidx.annotation.Keep;
import dji.v5.network.IDJINetworkStatusListener;

@Keep
public interface IDJINetworkStatusManager {
    public void initNetworkStatusManager(Context var1);

    public void releaseNetworkStatusManager(Context var1);

    public void addNetworkStatusListener(IDJINetworkStatusListener var1);

    public void removeNetworkStatusListener(IDJINetworkStatusListener var1);
}

