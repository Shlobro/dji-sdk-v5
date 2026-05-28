/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.bluetooth.BluetoothAdapter
 *  android.bluetooth.BluetoothManager
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Handler
 *  android.os.Message
 */
package dji.bluetooth.javalib;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import dji.bluetooth.javalib.BleCallback;
import dji.bluetooth.javalib.base.BleConnector;
import dji.bluetooth.javalib.base.BleDataReceiveListener;
import dji.bluetooth.javalib.base.BleDataTransmitter;
import dji.bluetooth.javalib.base.BleDevice;
import dji.bluetooth.javalib.base.BleNotifier;
import dji.bluetooth.javalib.base.BleScanFilter;
import dji.bluetooth.javalib.base.BleScanner;
import dji.bluetooth.javalib.base.BleState;
import java.lang.ref.WeakReference;

public class BleManager {
    private static final String LOG_TAG = "[BLELib-Manager]";
    private static final String BLE_STATE_ACTION = "android.bluetooth.adapter.action.STATE_CHANGED";
    private MainHandler mMainHandler;
    private BluetoothAdapter mBleAdapter;
    private BluetoothManager mBluetoothManager;
    private BleNotifier mNotifier;
    private BleConnector mConnector;
    private BleDataTransmitter mTransmitter;
    private BleScanner mScanner;
    private boolean mAutoConnect;
    private static final int MSG_SCAN = 1;
    private static final int MSG_SCAN_STOP = 2;
    private static final int MSG_CONNECT = 3;
    private static final int MSG_DISCONNECT = 4;
    private static final int MSG_RESET = 5;
    private static final int MSG_SCAN_WAIT_ENABLE = 6;
    private static final int MSG_SCAN_WAIT_ENABLE_TIMEOUT = 7;
    private static final int MSG_BROADCAST_DATA = 8;
    private static final int MSG_BROADCAST_DATA_STOP = 9;

    private BleManager() {
    }

    public static BleManager getInstance() {
        return null;
    }

    public void init(Context context) {
    }

    public void addStateListener(BleCallback bleCallback) {
    }

    public void removeListener(BleCallback bleCallback) {
    }

    public BleState getState() {
        return null;
    }

    public void setDataListener(BleDataReceiveListener bleDataReceiveListener) {
    }

    public void startScan() {
    }

    public void startScan(int n) {
    }

    public void setScanFilter(BleScanFilter bleScanFilter) {
    }

    public void stopScan() {
    }

    public void connect(BleDevice bleDevice) {
    }

    public void connect(String string2) {
    }

    public void disconnect() {
    }

    public void startBroadcastData(String string2) {
    }

    public void stopBroadcastData() {
    }

    public boolean sendData(byte[] byArray) {
        return false;
    }

    public boolean sendExternalData(byte[] byArray) {
        return false;
    }

    private void initBroadcastReceiver(Context context) {
    }

    private void reset() {
    }

    private boolean isBleInitSuccess() {
        return false;
    }

    private boolean isBluetoothEnabled() {
        return false;
    }

    private void enableBluetooth() {
    }

    private BleDevice getDeviceWithAddress(String string2) {
        return null;
    }

    private void onBLEOpened() {
    }

    private void onBLEClosed() {
    }

    static /* synthetic */ boolean access$000(BleManager bleManager) {
        return false;
    }

    static /* synthetic */ BleScanner access$100(BleManager bleManager) {
        return null;
    }

    static /* synthetic */ boolean access$200(BleManager bleManager) {
        return false;
    }

    static /* synthetic */ BleConnector access$300(BleManager bleManager) {
        return null;
    }

    static /* synthetic */ void access$400(BleManager bleManager) {
    }

    static /* synthetic */ MainHandler access$500(BleManager bleManager) {
        return null;
    }

    static /* synthetic */ void access$600(BleManager bleManager) {
    }

    static /* synthetic */ void access$700(BleManager bleManager) {
    }

    /* synthetic */ BleManager(1 var1_1) {
    }

    private static class MainHandler
    extends Handler {
        WeakReference<BleManager> weakManager;

        MainHandler(BleManager bleManager) {
        }

        public void handleMessage(Message message) {
        }
    }

    private static class SingletonHolder {
        public static BleManager instance = new BleManager(null);

        private SingletonHolder() {
        }
    }

    private class ActionReceiver
    extends BroadcastReceiver {
        final /* synthetic */ BleManager this$0;

        private ActionReceiver(BleManager bleManager) {
        }

        public void onReceive(Context context, Intent intent) {
        }

        /* synthetic */ ActionReceiver(BleManager bleManager, 1 var2_2) {
        }
    }
}

