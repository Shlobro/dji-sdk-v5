/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package dji.bluetooth.javalib.base;

import android.os.Handler;
import dji.bluetooth.javalib.BleCallback;
import dji.bluetooth.javalib.base.BleDevice;
import dji.bluetooth.javalib.base.BleError;
import java.lang.ref.WeakReference;
import java.util.List;

public class BleNotifier
implements BleCallback {
    private List<WeakReference<BleCallback>> mCallbacks;
    private Handler mMainHandler;

    public void addListener(BleCallback bleCallback) {
    }

    public void removeListener(BleCallback bleCallback) {
    }

    @Override
    public void onStartScan() {
    }

    @Override
    public void onScanning(BleDevice bleDevice) {
    }

    @Override
    public void onScanFinished() {
    }

    @Override
    public void onStartConnect(BleDevice bleDevice) {
    }

    @Override
    public void onConnected(BleDevice bleDevice) {
    }

    @Override
    public void onConnectFail(BleError bleError) {
    }

    @Override
    public void onStartDisconnect() {
    }

    @Override
    public void onDisconnectFail(BleError bleError) {
    }

    @Override
    public void onDisconnected(BleDevice bleDevice) {
    }

    @Override
    public void onBLESwitchTriggered(boolean bl) {
    }

    private /* synthetic */ void lambda$onBLESwitchTriggered$9(boolean bl) {
    }

    private /* synthetic */ void lambda$onDisconnected$8(BleDevice bleDevice) {
    }

    private /* synthetic */ void lambda$onDisconnectFail$7(BleError bleError) {
    }

    private /* synthetic */ void lambda$onStartDisconnect$6() {
    }

    private /* synthetic */ void lambda$onConnectFail$5(BleError bleError) {
    }

    private /* synthetic */ void lambda$onConnected$4(BleDevice bleDevice) {
    }

    private /* synthetic */ void lambda$onStartConnect$3(BleDevice bleDevice) {
    }

    private /* synthetic */ void lambda$onScanFinished$2() {
    }

    private /* synthetic */ void lambda$onScanning$1(BleDevice bleDevice) {
    }

    private /* synthetic */ void lambda$onStartScan$0() {
    }
}

