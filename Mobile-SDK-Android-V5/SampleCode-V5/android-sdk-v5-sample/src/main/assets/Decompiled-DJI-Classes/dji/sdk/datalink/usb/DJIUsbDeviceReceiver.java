/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.hardware.usb.UsbManager
 */
package dji.sdk.datalink.usb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbManager;
import dji.jni.JNIProguardKeepTag;

public class DJIUsbDeviceReceiver
extends BroadcastReceiver
implements JNIProguardKeepTag {
    public static final int BATTERY_BOX_CH320_PRODUCT_ID = 8;
    private static final String TAG = "[DJIUsbDeviceReceiver] ";
    private UsbManager usbManager;

    public DJIUsbDeviceReceiver(Context context) {
    }

    public void onReceive(Context context, Intent intent) {
    }

    private void UpdateDeviceAttached(boolean bl, int n, String string) {
    }
}

