/*
 * Decompiled with CFR 0.152.
 */
package dji.rtk;

import dji.rtk.callback.RTKNetworkServiceRTKParamCallback;
import dji.sdk.keyvalue.value.rtkbasestation.RTKNetworkServicePlanType;

public interface RTKNetworkService {
    public void purchaseNetworkServicePlan(RTKNetworkServiceRTKParamCallback var1);

    public void renewNetworkServicePlan(RTKNetworkServiceRTKParamCallback var1);

    public void activateNetworkService(RTKNetworkServicePlanType var1, RTKNetworkServiceRTKParamCallback var2);
}

