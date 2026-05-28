/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.bluetooth.BluetoothAdapter
 *  android.bluetooth.BluetoothAdapter$LeScanCallback
 *  android.bluetooth.BluetoothDevice
 *  android.bluetooth.le.BluetoothLeScanner
 *  android.bluetooth.le.ScanCallback
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Message
 */
package dji.bluetooth.javalib.base;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import dji.bluetooth.javalib.BleCallback;
import dji.bluetooth.javalib.base.BleScanFilter;
import java.lang.ref.WeakReference;
import java.util.List;

public class BleScanner {
    private static final String LOG_TAG = "[BLELib-Scanner]";
    private BluetoothLeScanner mScanner;
    private BluetoothAdapter.LeScanCallback mLeScanCallback;
    private ScanCallback mScanCallback;
    private BleScanFilter scanFilter;
    private List<BluetoothDevice> foundDeviceList;
    private boolean mIsScanning;
    private WeakReference<Context> mWeakContext;
    private ScanHandler mScanHandler;
    private BleCallback mStateCallback;
    private static final int MSG_SCAN_HID = 1;

    public BleScanner(Context context, BleCallback bleCallback) {
    }

    public void setScanFilter(BleScanFilter bleScanFilter) {
    }

    private void initScanCallback() {
    }

    private boolean tryAddNewValidDevice(BluetoothDevice bluetoothDevice, int n, byte[] byArray) {
        return false;
    }

    public void scan(int n) {
    }

    public void stopScan() {
    }

    public boolean isScanning() {
        return false;
    }

    private boolean isDeviceValid(BluetoothDevice bluetoothDevice) {
        return false;
    }

    private void findConnectedHIDDevice() {
    }

    private BluetoothAdapter getBluetoothAdapter() {
        return null;
    }

    private /* synthetic */ void lambda$initScanCallback$0(BluetoothDevice bluetoothDevice, int n, byte[] byArray) {
    }

    static /* synthetic */ void access$000(BleScanner bleScanner) {
    }

    static /* synthetic */ boolean access$100(BleScanner bleScanner) {
        return false;
    }

    static /* synthetic */ boolean access$200(BleScanner bleScanner, BluetoothDevice bluetoothDevice, int n, byte[] byArray) {
        return false;
    }

    static /* synthetic */ BleCallback access$300(BleScanner bleScanner) {
        return null;
    }

    static /* synthetic */ List access$400(BleScanner bleScanner) {
        return null;
    }

    private static class ScanHandler
    extends Handler {
        private WeakReference<BleScanner> weakScanner;

        public ScanHandler(BleScanner bleScanner) {
        }

        public void handleMessage(Message message) {
        }
    }
}

