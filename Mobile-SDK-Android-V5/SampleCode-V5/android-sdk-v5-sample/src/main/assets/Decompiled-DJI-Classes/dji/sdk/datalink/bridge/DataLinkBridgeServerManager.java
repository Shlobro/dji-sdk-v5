/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.datalink.bridge;

import dji.sdk.datalink.bridge.DataLinkBridgeServerCallback;
import dji.sdk.datalink.bridge.IDataLinkChangeCallback;
import dji.sdk.keyvalue.value.common.BridgeDataLinkInfo;
import java.util.List;

public class DataLinkBridgeServerManager {
    private boolean mIsBridgeEnabled;
    private String mUSBModel;
    private static final String TAG = "DataLinkBridgeServerMan";
    private List<BridgeDataLinkInfo> currentDataLinks;
    private IDataLinkChangeCallback dataLinkChangeCallback;
    private DataLinkBridgeServerCallback callback;
    private static volatile DataLinkBridgeServerManager mInstance = null;

    public List<BridgeDataLinkInfo> getCurrentDataLinks() {
        return null;
    }

    public void setDataLinkChangeCallback(IDataLinkChangeCallback iDataLinkChangeCallback) {
    }

    DataLinkBridgeServerManager() {
    }

    public void registerSDKCallback() {
    }

    public void setCallback(DataLinkBridgeServerCallback dataLinkBridgeServerCallback) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DataLinkBridgeServerManager get() {
        return null;
    }

    public boolean sendRawData(BridgeDataLinkInfo bridgeDataLinkInfo, byte[] byArray) {
        return false;
    }

    public boolean isBridgeEnabled() {
        return false;
    }

    public void setBridgeEnabled(boolean bl) {
    }

    public String getUSBModel() {
        return null;
    }

    public void setUSBModel(String string) {
    }

    static /* synthetic */ DataLinkBridgeServerCallback access$000(DataLinkBridgeServerManager dataLinkBridgeServerManager) {
        return null;
    }

    static /* synthetic */ List access$100(DataLinkBridgeServerManager dataLinkBridgeServerManager) {
        return null;
    }

    static /* synthetic */ IDataLinkChangeCallback access$200(DataLinkBridgeServerManager dataLinkBridgeServerManager) {
        return null;
    }
}

