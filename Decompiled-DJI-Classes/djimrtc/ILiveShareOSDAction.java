/*
 * Decompiled with CFR 0.152.
 */
package djimrtc;

import djimrtc.natives.model.MRTCFlightState;
import djimrtc.natives.model.MRTCFlightWindState;
import djimrtc.natives.model.MRTCGPSInfo;
import djimrtc.natives.model.MRTCGimbalState;
import djimrtc.natives.model.MRTCInherentInfo;
import djimrtc.natives.model.MRTCRealTimeTargetPointInfos;
import djimrtc.natives.model.MRTCSeiItem;

public interface ILiveShareOSDAction {
    public void sendRealTimeTargetPointInfo(MRTCRealTimeTargetPointInfos var1);

    public void sendGimbalStateData(MRTCGimbalState var1);

    public void sendFlightGPSInfoData(MRTCGPSInfo var1);

    public void sendFlightStateData(MRTCFlightState var1);

    public void sendFlightWindStateData(MRTCFlightWindState var1);

    public void sendRCGPSInfoData(MRTCGPSInfo var1);

    public void setRCInherentInfo(MRTCInherentInfo var1, int var2);

    public void setFlightInherentInfo(MRTCInherentInfo var1);

    public void setFlightOrderId(String var1);

    public void setFlightHomePointInfoData(MRTCGPSInfo var1);

    public void setPayloadInherentInfo(MRTCInherentInfo var1, int var2);

    public void putSeiItem(MRTCSeiItem var1);

    public void clearSeiItem(String var1);
}

