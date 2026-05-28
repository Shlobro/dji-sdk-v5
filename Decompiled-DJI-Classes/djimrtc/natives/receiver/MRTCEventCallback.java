/*
 * Decompiled with CFR 0.152.
 */
package djimrtc.natives.receiver;

import djimrtc.natives.receiver.MRTCCtrlPtzEvent;
import djimrtc.natives.receiver.MRTCCtrlStreamEvent;
import djimrtc.natives.receiver.MRTCLiveStatus;
import djimrtc.natives.receiver.MRTCLiveVideoStreamInfo;
import djimrtc.natives.receiver.MRTCPinPointEvent;
import djimrtc.natives.receiver.MRTCPlayEvent;
import djimrtc.natives.receiver.MRTCReadyEvent;
import djimrtc.natives.receiver.MRTCRegisterEvent;
import djimrtc.natives.receiver.MRTCVideoAttributeEvent;

public interface MRTCEventCallback {
    public void onCtrlStreamEvent(MRTCCtrlStreamEvent var1);

    public void onMRTCPlayEvent(MRTCPlayEvent var1);

    public void onMRTCRegisterEvent(MRTCRegisterEvent var1);

    public void onMRTCCtrlPtzEvent(MRTCCtrlPtzEvent var1);

    public void onMRTCPinPointEvent(MRTCPinPointEvent var1);

    public void onMRTCVideoAttributeEvent(MRTCVideoAttributeEvent var1);

    public void onMRTCLiveStatusEvent(MRTCLiveStatus var1);

    public void onMRTCLiveVideoParamInfoEvent(MRTCLiveVideoStreamInfo var1);

    public void onMRTCReadyEvent(MRTCReadyEvent var1);
}

