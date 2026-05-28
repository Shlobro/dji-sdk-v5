/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package dji.v5.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class NetWorkStateReceiver
extends BroadcastReceiver {
    private final StatusCallback callback;

    NetWorkStateReceiver(StatusCallback statusCallback) {
    }

    public void onReceive(Context context, Intent intent) {
    }

    static interface StatusCallback {
        public void onChanged();
    }
}

