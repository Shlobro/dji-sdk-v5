/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.bluetooth.BluetoothGatt
 *  android.bluetooth.BluetoothGattCallback
 *  android.bluetooth.BluetoothGattCharacteristic
 *  android.bluetooth.BluetoothGattService
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Message
 */
package dji.bluetooth.javalib.base;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import dji.bluetooth.javalib.BleCallback;
import dji.bluetooth.javalib.base.BleDataInterface;
import dji.bluetooth.javalib.base.BleDataReceiveListener;
import dji.bluetooth.javalib.base.BleDevice;
import dji.bluetooth.javalib.base.BleError;
import dji.bluetooth.javalib.base.BleState;
import java.lang.ref.WeakReference;

@TargetApi(value=18)
public class BleConnector
extends BluetoothGattCallback
implements BleDataInterface {
    private static final String LOG_TAG = "[BLELib-Connector]";
    private BluetoothGatt mBluetoothGatt;
    private WeakReference<Context> mWeakContext;
    private BleCallback mStateCallback;
    private BleDevice mDevice;
    private BluetoothGattService mGattService;
    private BluetoothGattCharacteristic mWriteCharacteristic;
    private BluetoothGattCharacteristic mExternalDataWriteCharacteristic;
    private RetryHandler mRetryHandler;
    private BleDataReceiveListener mDataListener;
    private BleState mState;
    private int mConnectTimeout;
    private int mMaxDataLength;
    private int mRetryWriteReadDescriptorTime;
    private boolean mRetryConnectService;
    boolean mReceiveServices;
    boolean mConnectProtectSleepEnable;
    private int mLogCharacteristicsChangeTimes;
    private static final int MSG_RETRY_WRITE_READ_DESCRIPTOR = 1;
    private static final int MSG_TIMEOUT_CONNECT = 3;
    private static final int MSG_TIMEOUT_DISCONNECT = 4;

    public BleConnector(Context context, BleCallback bleCallback) {
    }

    public BleConnector(Context context, BleCallback bleCallback, int n) {
    }

    public BleState getState() {
        return null;
    }

    public BluetoothGatt connect(BleDevice bleDevice, boolean bl) {
        return null;
    }

    public void disconnect() {
    }

    public boolean isConnectAlive() {
        return false;
    }

    @Override
    public int getMTU() {
        return 0;
    }

    @Override
    public boolean sendData(byte[] byArray) {
        return false;
    }

    @Override
    public void listenReceiveData(BleDataReceiveListener bleDataReceiveListener) {
    }

    @Override
    public boolean sendExternalData(byte[] byArray) {
        return false;
    }

    public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int n, int n2) {
    }

    public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int n) {
    }

    public void onMtuChanged(BluetoothGatt bluetoothGatt, int n, int n2) {
    }

    public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
    }

    private void enableWriteChar() {
    }

    private void enableNotification() {
    }

    private boolean enableReadChar() {
        return false;
    }

    private boolean enableServiceChangeChar(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return false;
    }

    private BluetoothGattCharacteristic getServiceChangeChar() {
        return null;
    }

    private void connectStart(BleDevice bleDevice) {
    }

    private void connectFailed(BleError bleError) {
    }

    private void connectFailed(BleError bleError, boolean bl) {
    }

    private void startDisconnect() {
    }

    private void connectSuccess() {
    }

    private void disconnectFailed(BleError bleError) {
    }

    private void disconnectFailed(BleError bleError, boolean bl) {
    }

    private void disconnectSuccess() {
    }

    public void reset() {
    }

    static /* synthetic */ void access$000(BleConnector bleConnector, BleError bleError) {
    }

    static /* synthetic */ BleDevice access$100(BleConnector bleConnector) {
        return null;
    }

    static /* synthetic */ BluetoothGatt access$200(BleConnector bleConnector) {
        return null;
    }

    static /* synthetic */ int access$308(BleConnector bleConnector) {
        return 0;
    }

    static /* synthetic */ void access$400(BleConnector bleConnector) {
    }

    static /* synthetic */ void access$500(BleConnector bleConnector, BleError bleError) {
    }

    private static class RetryHandler
    extends Handler {
        private WeakReference<BleConnector> weak_connector;

        public RetryHandler(BleConnector bleConnector) {
        }

        public void handleMessage(Message message) {
        }
    }
}

