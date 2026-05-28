/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.sdk;

import android.content.Context;
import dji.sdk.common.BoolCallback;
import dji.sdk.datalink.usb.DJIUsbAccessoryReceiver;
import dji.sdk.datalink.usb.ProductUsbInfo;
import java.util.ArrayList;
import java.util.List;

public class DataLinkManager {
    private static volatile DataLinkManager instance;
    private static List<ProductUsbInfo> mProductUsbInfoList;
    private boolean isInitialized;
    private DJIUsbAccessoryReceiver sUsbReceiver;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DataLinkManager getInstance() {
        return null;
    }

    public void setProductUsbInfo(List<ProductUsbInfo> list) {
    }

    public void initialize(Context context, boolean bl) {
    }

    private void registerUsbReceiver(Context context) {
    }

    private void registerWiFiReceiver(Context context) {
    }

    private void registerUsbDeviceReceiver(Context context) {
    }

    public void destroy() {
    }

    public void setUsbAccessoryAttachedCallback(BoolCallback boolCallback) {
    }

    public boolean startAoaConnect() {
        return false;
    }

    public boolean stopAoaConnect() {
        return false;
    }

    private /* synthetic */ void lambda$initialize$0(Context context) {
    }

    static {
        mProductUsbInfoList = new ArrayList<ProductUsbInfo>();
    }
}

