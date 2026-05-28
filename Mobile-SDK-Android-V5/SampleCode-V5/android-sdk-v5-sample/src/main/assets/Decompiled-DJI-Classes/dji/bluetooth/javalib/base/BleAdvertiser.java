/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.bluetooth.BluetoothAdapter
 *  android.bluetooth.le.AdvertiseCallback
 *  android.bluetooth.le.BluetoothLeAdvertiser
 */
package dji.bluetooth.javalib.base;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.BluetoothLeAdvertiser;

public class BleAdvertiser {
    private static final String LOG_TAG = "[BLELib-Advertiser]";
    private static BluetoothLeAdvertiser mAdvertiser;
    private BluetoothAdapter mBluetoothAdapter;
    private static boolean advertising;
    private static AdvertiseCallback callback;

    private BleAdvertiser() {
    }

    public static BleAdvertiser getInstance() {
        return null;
    }

    public void init(BluetoothAdapter bluetoothAdapter) {
    }

    private boolean isOK() {
        return false;
    }

    public boolean setLocalName(String string2) {
        return false;
    }

    public void stopAdvertising() {
    }

    public void startAdvertising() {
    }

    /* synthetic */ BleAdvertiser(1 var1_1) {
    }

    static /* synthetic */ boolean access$102(boolean bl) {
        return false;
    }

    static /* synthetic */ boolean access$100() {
        return false;
    }

    static {
        advertising = false;
        callback = new AdvertiseCallback(){

            public void onStartFailure(int n) {
            }
        };
    }

    private static class SingletonHolder {
        public static BleAdvertiser instance = new BleAdvertiser(null);

        private SingletonHolder() {
        }
    }
}

