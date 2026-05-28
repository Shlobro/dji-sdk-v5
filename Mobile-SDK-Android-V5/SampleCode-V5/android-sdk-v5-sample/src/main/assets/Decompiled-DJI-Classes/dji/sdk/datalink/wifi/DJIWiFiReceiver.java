/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.net.ConnectivityManager
 *  android.net.Network
 */
package dji.sdk.datalink.wifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import dji.jni.JNIProguardKeepTag;

public class DJIWiFiReceiver
extends BroadcastReceiver
implements JNIProguardKeepTag {
    private static final String TAG = "[Datalink-WiFi]";
    private String mConnectedWiFiSSID;
    private static Network wifiNetwork = null;

    public void onReceive(Context context, Intent intent) {
    }

    private void onWiFiConnected(Context context, String string) {
    }

    private void onWiFiDisconnected() {
    }

    private static Network getNetworkObject(ConnectivityManager connectivityManager, int n) {
        return null;
    }

    public static void bindWiFiSocket(int n) {
    }

    private static /* synthetic */ void lambda$onWiFiConnected$0(Context context) {
    }
}

