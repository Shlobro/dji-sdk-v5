/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.bluetooth;

import android.content.Context;
import dji.bluetooth.javalib.BleCallback;
import dji.bluetooth.javalib.base.BleDevice;
import dji.bluetooth.javalib.base.BleScanFilter;
import dji.bluetooth.jni.JNIBleActionHandler;
import dji.bluetooth.jni.JNIBleSendDataHandler;
import dji.sdk.InnerDJIBluetoothManager;
import dji.sdk.common.CallBack;
import dji.sdk.common.CallBack2;
import dji.sdk.common.Callback4;
import dji.sdk.errorcode.DJIErrorCode;
import dji.sdk.keyvalue.value.ble.BLEPeripheral;
import dji.sdk.keyvalue.value.ble.BLEPeripheralListMsg;
import dji.sdk.keyvalue.value.ble.BLEPeripheralState;
import dji.sdk.keyvalue.value.ble.FilterResult;
import dji.sdk.keyvalue.value.common.VerifyDeviceResult;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.sdk.keyvalue.value.wifi.WiFiFrequencyBand;
import java.util.ArrayList;

public final class DJIBluetoothManager
extends InnerDJIBluetoothManager {
    private static volatile DJIBluetoothManager sInstance;
    private CallBack2<BLEPeripheralState, BLEPeripheral> mDeviceStateListener;
    private CallBack<Boolean> mScanningStateListener;
    private CallBack<BLEPeripheralListMsg> mUpdateListCallback;
    private Callback4<Integer, FilterResult> mBleScannerFilterCallback;
    private ArrayList<BleDevice> mBleDeviceList;
    private BleDevice mConnectingBleDevice;
    private BLEPeripheral mCurrentPeripheral;
    private BLEPeripheralState mBLEPeripheralState;
    private boolean mIsScanning;
    private final double mDefaultScanTimeout = 20.0;
    private double mScanTimeout;
    private BleScanFilter mScanFilter;
    private BleCallback mBleStateCallback;
    private JNIBleActionHandler mActionHandler;
    private JNIBleSendDataHandler mSendDataHandler;
    private JNIBleSendDataHandler mSendExternalDataHandler;

    private DJIBluetoothManager() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DJIBluetoothManager getInstance() {
        return null;
    }

    @Override
    protected void init(Context context) {
    }

    @Override
    protected void uninit() {
    }

    public void startBleScan(CallBack<Integer> callBack) {
    }

    public void startBleScan(double d2, CallBack<Integer> callBack) {
    }

    public void stopBleScan(CallBack<Integer> callBack) {
    }

    public void connect(BLEPeripheral bLEPeripheral, CallBack<Integer> callBack) {
    }

    public void disconnect(CallBack<Integer> callBack) {
    }

    public void sendExternalData(byte[] byArray) {
    }

    public void setUpdateListCallback(CallBack<BLEPeripheralListMsg> callBack) {
    }

    public void setBleScannerFilterCallback(Callback4<Integer, FilterResult> callback4) {
    }

    public void setStateListener(CallBack2<BLEPeripheralState, BLEPeripheral> callBack2) {
    }

    public void setScanningStateListener(CallBack<Boolean> callBack) {
    }

    public BLEPeripheral getCurrentPeripheral() {
        return null;
    }

    public BLEPeripheralState getBLEPeripheralState() {
        return null;
    }

    public boolean isScanning() {
        return false;
    }

    public void getWifiSsidThroughBle(CallBack<String> callBack) {
    }

    public void getWifiPwdThroughBle(CallBack<String> callBack) {
    }

    public void getWifiMacThroughBle(CallBack<String> callBack) {
    }

    public void startAwakeBleDevice(String string2, ProductType productType, CallBack<Integer> callBack) {
    }

    public void stopAwakeBleDevice(CallBack<Integer> callBack) {
    }

    public void verifyDevice(String string2, String string3, int n, CallBack<VerifyDeviceResult> callBack) {
    }

    public void cancelVerifyDevice(CallBack<Integer> callBack) {
    }

    public void cancelVerifyDeviceEnable(CallBack<Boolean> callBack) {
    }

    public void setCountryCodeThroughBle(String string2, CallBack<Integer> callBack) {
    }

    public void getWiFiFrequencyBand(CallBack2<DJIErrorCode, WiFiFrequencyBand> callBack2) {
    }

    public void setWiFiFrequencyBand(WiFiFrequencyBand wiFiFrequencyBand, CallBack<DJIErrorCode> callBack) {
    }

    private void sendBluetoothList(ArrayList<BleDevice> arrayList) {
    }

    private static /* synthetic */ boolean lambda$new$37(byte[] byArray) {
        return false;
    }

    private static /* synthetic */ boolean lambda$new$36(byte[] byArray) {
        return false;
    }

    private /* synthetic */ void lambda$new$35(int n, byte[] byArray) {
    }

    private /* synthetic */ void lambda$new$34(int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$setWiFiFrequencyBand$33(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$setWiFiFrequencyBand$32(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$getWiFiFrequencyBand$31(CallBack2 callBack2, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$getWiFiFrequencyBand$30(CallBack2 callBack2, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$setCountryCodeThroughBle$29(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$setCountryCodeThroughBle$28(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$cancelVerifyDeviceEnable$27(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$cancelVerifyDeviceEnable$26(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$cancelVerifyDevice$25(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$cancelVerifyDevice$24(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$verifyDevice$23(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$verifyDevice$22(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$stopAwakeBleDevice$21(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$stopAwakeBleDevice$20(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$startAwakeBleDevice$19(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$startAwakeBleDevice$18(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$getWifiMacThroughBle$17(CallBack callBack, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$getWifiMacThroughBle$16(int n, byte[] byArray, CallBack callBack) {
    }

    private static /* synthetic */ void lambda$getWifiPwdThroughBle$15(CallBack callBack, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$getWifiPwdThroughBle$14(int n, byte[] byArray, CallBack callBack) {
    }

    private static /* synthetic */ void lambda$getWifiSsidThroughBle$13(CallBack callBack, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$getWifiSsidThroughBle$12(int n, byte[] byArray, CallBack callBack) {
    }

    private static /* synthetic */ void lambda$disconnect$11(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$disconnect$10(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$connect$9(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$connect$8(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$stopBleScan$7(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$stopBleScan$6(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$startBleScan$5(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$startBleScan$4(CallBack callBack, int n) {
    }

    private /* synthetic */ void lambda$init$3(byte[] byArray) {
    }

    private /* synthetic */ void lambda$init$2(byte[] byArray) {
    }

    private /* synthetic */ void lambda$init$1(boolean bl, int n, byte[] byArray) {
    }

    private /* synthetic */ void lambda$init$0(int n, byte[] byArray, boolean bl) {
    }

    static /* synthetic */ Callback4 access$000(DJIBluetoothManager dJIBluetoothManager) {
        return null;
    }

    static /* synthetic */ BLEPeripheral access$100(DJIBluetoothManager dJIBluetoothManager) {
        return null;
    }

    static /* synthetic */ BLEPeripheralState access$200(DJIBluetoothManager dJIBluetoothManager) {
        return null;
    }

    static /* synthetic */ ArrayList access$300(DJIBluetoothManager dJIBluetoothManager) {
        return null;
    }

    static /* synthetic */ void access$400(DJIBluetoothManager dJIBluetoothManager, ArrayList arrayList) {
    }

    static /* synthetic */ BleDevice access$500(DJIBluetoothManager dJIBluetoothManager) {
        return null;
    }

    static /* synthetic */ BleDevice access$502(DJIBluetoothManager dJIBluetoothManager, BleDevice bleDevice) {
        return null;
    }
}

