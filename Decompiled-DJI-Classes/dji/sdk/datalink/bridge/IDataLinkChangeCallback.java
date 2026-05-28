/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.datalink.bridge;

import dji.sdk.keyvalue.value.common.BridgeDataLinkInfo;
import java.util.List;

public interface IDataLinkChangeCallback {
    public void OnChanged(List<BridgeDataLinkInfo> var1);
}

