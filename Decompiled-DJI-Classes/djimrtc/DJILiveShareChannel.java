/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package djimrtc;

import com.google.gson.Gson;
import djimrtc.DJILiveShareOptions;
import djimrtc.DJILiveShareType;
import djimrtc.ILiveShareAction;
import djimrtc.ILiveShareEvent;
import djimrtc.ILiveShareGetAction;
import djimrtc.ILiveShareOSDAction;
import djimrtc.event.DJILiveShareConnectionEvent;
import djimrtc.event.DJILiveShareInfoEvent;
import djimrtc.event.DJILiveSharePinPointEvent;
import djimrtc.event.DJILiveSharePlayEvent;
import djimrtc.event.DJILiveShareReadyEvent;
import djimrtc.event.DJILiveShareStatusEvent;
import djimrtc.event.DJILiveShareVideoAtrributeEvent;
import djimrtc.natives.model.MRTCAgentConfig;
import djimrtc.natives.model.MRTCAgentOptionConfig;
import djimrtc.natives.model.MRTCAudio;
import djimrtc.natives.model.MRTCChannelConfig;
import djimrtc.natives.model.MRTCFlightState;
import djimrtc.natives.model.MRTCFlightWindState;
import djimrtc.natives.model.MRTCGPSInfo;
import djimrtc.natives.model.MRTCGimbalState;
import djimrtc.natives.model.MRTCInherentInfo;
import djimrtc.natives.model.MRTCRealTimeTargetPointInfos;
import djimrtc.natives.model.MRTCSeiData;
import djimrtc.natives.model.MRTCSeiItem;
import djimrtc.natives.model.MRTCVideo;
import java.util.Map;

public class DJILiveShareChannel
implements ILiveShareAction,
ILiveShareEvent,
ILiveShareOSDAction,
ILiveShareGetAction {
    private static final String LOG_TAG = "MRTCLiveShare";
    private DJILiveShareOptions mDJILiveShareOptions;
    private MRTCVideo mVideoConfig;
    private MRTCAudio mAudioConfig;
    private DJILiveSharePlayEvent mLiveSharePlayEvent;
    private DJILiveShareReadyEvent mLiveShareReadyEvent;
    private DJILiveShareConnectionEvent mLiveShareConnectionEvent;
    private DJILiveShareStatusEvent mLiveShareStatusEvent;
    private DJILiveShareInfoEvent mLiveShareInfoEvent;
    private DJILiveSharePinPointEvent mLiveSharePinPointEvent;
    private DJILiveShareVideoAtrributeEvent mLiveShareVideoAtrributeEvent;
    private volatile boolean isRunning;
    private Map<String, MRTCSeiItem> mSeiItemMap;
    private Gson mSeiDataConverter;
    private MRTCSeiData mSeiData;
    int logCnt;

    public DJILiveShareChannel(DJILiveShareOptions dJILiveShareOptions) {
    }

    @Override
    public int startLiveShare() {
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int stopLiveShare() {
        return 0;
    }

    @Override
    public int sendVideoFrameData(byte[] byArray, long l2, long l3, int n) {
        return 0;
    }

    private String getSeiData() {
        return null;
    }

    @Override
    public int sendAudioFrameData(byte[] byArray, long l2, long l3) {
        return 0;
    }

    @Override
    public void registerPlayEvent(DJILiveSharePlayEvent dJILiveSharePlayEvent) {
    }

    @Override
    public void registerConnectionEvent(DJILiveShareConnectionEvent dJILiveShareConnectionEvent) {
    }

    @Override
    public void registerLiveStatusEvent(DJILiveShareStatusEvent dJILiveShareStatusEvent) {
    }

    @Override
    public void registerLiveShareInfoEvent(DJILiveShareInfoEvent dJILiveShareInfoEvent) {
    }

    @Override
    public void registerPinPointEvent(DJILiveSharePinPointEvent dJILiveSharePinPointEvent) {
    }

    @Override
    public void registerVideoAttributeEvent(DJILiveShareVideoAtrributeEvent dJILiveShareVideoAtrributeEvent) {
    }

    @Override
    public void registerReadyEvent(DJILiveShareReadyEvent dJILiveShareReadyEvent) {
    }

    @Override
    public void sendRealTimeTargetPointInfo(MRTCRealTimeTargetPointInfos mRTCRealTimeTargetPointInfos) {
    }

    @Override
    public void sendGimbalStateData(MRTCGimbalState mRTCGimbalState) {
    }

    @Override
    public void sendFlightGPSInfoData(MRTCGPSInfo mRTCGPSInfo) {
    }

    @Override
    public void sendFlightStateData(MRTCFlightState mRTCFlightState) {
    }

    @Override
    public void sendFlightWindStateData(MRTCFlightWindState mRTCFlightWindState) {
    }

    @Override
    public void sendRCGPSInfoData(MRTCGPSInfo mRTCGPSInfo) {
    }

    @Override
    public void setRCInherentInfo(MRTCInherentInfo mRTCInherentInfo, int n) {
    }

    @Override
    public void setFlightInherentInfo(MRTCInherentInfo mRTCInherentInfo) {
    }

    @Override
    public void setFlightOrderId(String string) {
    }

    @Override
    public void setFlightHomePointInfoData(MRTCGPSInfo mRTCGPSInfo) {
    }

    @Override
    public void setPayloadInherentInfo(MRTCInherentInfo mRTCInherentInfo, int n) {
    }

    @Override
    public void putSeiItem(MRTCSeiItem mRTCSeiItem) {
    }

    @Override
    public void clearSeiItem(String string) {
    }

    @Override
    public String getRtspUrl() {
        return null;
    }

    @Override
    public DJILiveShareType getChannelType() {
        return null;
    }

    @Override
    public boolean isRunning() {
        return false;
    }

    private void initVideoConfig() {
    }

    private boolean checkOptionsInstance() {
        return false;
    }

    private void initAudioConfig() {
    }

    private int addChannelConfig() {
        return 0;
    }

    private void deleteChannelConfig() {
    }

    private MRTCChannelConfig generateChannelConfig() {
        return null;
    }

    private MRTCChannelConfig generateChannelConfigForAgora() {
        return null;
    }

    private MRTCChannelConfig generateChannelConfigForGb28181() {
        return null;
    }

    private MRTCChannelConfig generateChannelConfigForRtmp() {
        return null;
    }

    private MRTCChannelConfig generateChannelConfigForRtsp() {
        return null;
    }

    private int setMrtcAgentOption() {
        return 0;
    }

    private MRTCAgentOptionConfig generateAgentOptionConfig() {
        return null;
    }

    private MRTCAgentOptionConfig generateAgentOptionConfigForAgora() {
        return null;
    }

    private MRTCAgentOptionConfig generateDefaultAgentOptionConfig() {
        return null;
    }

    private int initMrtcAgent() {
        return 0;
    }

    private MRTCAgentConfig generateAgentConfig() {
        return null;
    }

    private MRTCAgentConfig generateAgentConfigForRtsp() {
        return null;
    }

    private MRTCAgentConfig generateAgentConfigForRtmp() {
        return null;
    }

    private MRTCAgentConfig generateAgentConfigForGb28181() {
        return null;
    }

    private MRTCAgentConfig generateAgentConfigForAgora() {
        return null;
    }

    private void clearEvent() {
    }

    static /* synthetic */ DJILiveSharePlayEvent access$000(DJILiveShareChannel dJILiveShareChannel) {
        return null;
    }

    static /* synthetic */ DJILiveShareConnectionEvent access$100(DJILiveShareChannel dJILiveShareChannel) {
        return null;
    }

    static /* synthetic */ DJILiveSharePinPointEvent access$200(DJILiveShareChannel dJILiveShareChannel) {
        return null;
    }

    static /* synthetic */ DJILiveShareVideoAtrributeEvent access$300(DJILiveShareChannel dJILiveShareChannel) {
        return null;
    }

    static /* synthetic */ DJILiveShareStatusEvent access$400(DJILiveShareChannel dJILiveShareChannel) {
        return null;
    }

    static /* synthetic */ DJILiveShareInfoEvent access$500(DJILiveShareChannel dJILiveShareChannel) {
        return null;
    }

    static /* synthetic */ DJILiveShareReadyEvent access$600(DJILiveShareChannel dJILiveShareChannel) {
        return null;
    }
}

