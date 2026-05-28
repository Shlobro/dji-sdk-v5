/*
 * Decompiled with CFR 0.152.
 */
package dji.bluetooth.javalib.base;

import dji.bluetooth.javalib.BleCallback;
import dji.bluetooth.javalib.base.BleDataInterface;
import dji.bluetooth.javalib.base.BleDevice;
import dji.bluetooth.javalib.base.BleError;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;

public class BleDataTransmitter
implements BleCallback {
    private static final String LOG_TAG = "[BLELib-Transmitter]";
    private BleDataInterface dataSender;
    private Thread mTransmitterThread;
    private volatile LinkedList<BleRequest> mRequestQueue;
    private final Lock mRequestQueueLock;
    private int mSleepTime;
    private final int BLT_TIMEOUT;
    private long mPreTime;
    private int mSendBits;
    private volatile boolean mIsConnected;

    public BleDataTransmitter(BleDataInterface bleDataInterface) {
    }

    private void start() {
    }

    private void stop() {
    }

    private boolean executeQueue() {
        return false;
    }

    public boolean sendData(byte[] byArray) {
        return false;
    }

    public boolean sendExternalData(byte[] byArray) {
        return false;
    }

    private boolean sendNonBlockingWriteRequest(BleRequest bleRequest) {
        return false;
    }

    private void countSendSpeed() {
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

    static /* synthetic */ boolean access$000(BleDataTransmitter bleDataTransmitter) {
        return false;
    }

    static /* synthetic */ void access$100(BleDataTransmitter bleDataTransmitter) {
    }

    static /* synthetic */ boolean access$200(BleDataTransmitter bleDataTransmitter) {
        return false;
    }

    static /* synthetic */ int access$300(BleDataTransmitter bleDataTransmitter) {
        return 0;
    }

    static /* synthetic */ LinkedList access$400(BleDataTransmitter bleDataTransmitter) {
        return null;
    }

    public class BleRequest {
        public byte[] data;
        public long time;
        final /* synthetic */ BleDataTransmitter this$0;

        public BleRequest(BleDataTransmitter bleDataTransmitter, byte[] byArray, long l2) {
        }
    }
}

