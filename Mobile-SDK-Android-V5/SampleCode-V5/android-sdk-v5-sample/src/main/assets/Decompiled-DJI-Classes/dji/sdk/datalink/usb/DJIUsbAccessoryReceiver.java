/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.hardware.usb.UsbAccessory
 *  android.hardware.usb.UsbManager
 *  android.os.Handler
 *  android.os.Message
 *  android.os.ParcelFileDescriptor
 */
package dji.sdk.datalink.usb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbAccessory;
import android.hardware.usb.UsbManager;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import dji.sdk.common.BoolCallback;
import dji.sdk.datalink.usb.ProductUsbInfo;
import java.util.List;

public class DJIUsbAccessoryReceiver
extends BroadcastReceiver {
    public static final String ACTION_USB_PERMISSION = "com.dji.v4.accessory.USB";
    public static final String ACTION_USB_ACCESSORY_ATTACHED = "com.dji.v4.accessory.USB_ACCESSORY_ATTACHED";
    public static final String ACTION_USB_STATE = "android.hardware.usb.action.USB_STATE";
    public static final String ACTION_USB_ACCESSORY_DETACHED = "android.hardware.usb.action.USB_ACCESSORY_DETACHED";
    public static final int MSG_TRIGGER_CHECK_TIMER = 0;
    public static final int MSG_TRIGGER_CONNECT_TIMER = 1;
    public static final int MSG_TRIGGER_CHECK_NOW = 2;
    private final String TAG;
    private UsbManager usbManager;
    private Context context;
    private UsbAccessory myAccessory;
    private ParcelFileDescriptor mFileDescriptor;
    private List<ProductUsbInfo> mProductUsbInfoList;
    private boolean isAccessoryDetached;
    private int aoaInvalidCounter;
    private String lastCheckUsbAccessoryInfo;
    private boolean usbAccessoryConnected;
    private boolean aoaConnectEnable;
    private BoolCallback usbAccessoryAttachedCallback;
    private long mReceivedUsbStateTime;
    private Handler connectHandler;
    private Handler checkHandler;

    public DJIUsbAccessoryReceiver(List<ProductUsbInfo> list) {
    }

    public DJIUsbAccessoryReceiver() {
    }

    public void start(Context context) {
    }

    public void onReceive(Context context, Intent intent) {
    }

    public void destroy() {
    }

    private synchronized boolean tryConnect() {
        return false;
    }

    private void connected() {
    }

    private synchronized void disconnected() {
    }

    protected void destroySession() {
    }

    private synchronized boolean checkMyDevice() {
        return false;
    }

    private boolean isDataLinkAvailable() {
        return false;
    }

    private void clearConnectTimer() {
    }

    private void delayStartConnectTimer(int n) {
    }

    private void clearCheckMessage() {
    }

    private void delayStartCheckTimer(int n) {
    }

    public boolean startAoaConnect() {
        return false;
    }

    public void stopAoaConnect() {
    }

    private void handleUsbAccessoryConnectMsg(boolean bl) {
    }

    public void setUsbAccessoryAttachedCallback(BoolCallback boolCallback) {
    }

    private /* synthetic */ boolean lambda$new$0(Message message) {
        return false;
    }

    static /* synthetic */ String access$000(DJIUsbAccessoryReceiver dJIUsbAccessoryReceiver) {
        return null;
    }

    static /* synthetic */ UsbAccessory access$100(DJIUsbAccessoryReceiver dJIUsbAccessoryReceiver) {
        return null;
    }

    static /* synthetic */ boolean access$200(DJIUsbAccessoryReceiver dJIUsbAccessoryReceiver) {
        return false;
    }

    static /* synthetic */ boolean access$300(DJIUsbAccessoryReceiver dJIUsbAccessoryReceiver) {
        return false;
    }

    static /* synthetic */ void access$400(DJIUsbAccessoryReceiver dJIUsbAccessoryReceiver, int n) {
    }
}

