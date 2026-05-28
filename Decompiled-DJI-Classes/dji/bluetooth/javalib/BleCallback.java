/*
 * Decompiled with CFR 0.152.
 */
package dji.bluetooth.javalib;

import dji.bluetooth.javalib.base.BleDevice;
import dji.bluetooth.javalib.base.BleError;

public interface BleCallback {
    public void onStartScan();

    public void onScanning(BleDevice var1);

    public void onScanFinished();

    public void onStartConnect(BleDevice var1);

    public void onConnected(BleDevice var1);

    public void onConnectFail(BleError var1);

    public void onStartDisconnect();

    public void onDisconnectFail(BleError var1);

    public void onDisconnected(BleDevice var1);

    public void onBLESwitchTriggered(boolean var1);
}

