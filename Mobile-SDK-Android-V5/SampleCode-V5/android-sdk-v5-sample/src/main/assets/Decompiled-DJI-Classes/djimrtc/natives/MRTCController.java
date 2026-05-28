/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 */
package djimrtc.natives;

import android.content.Context;
import android.util.Log;
import djimrtc.natives.model.MRTCAgentConfig;
import djimrtc.natives.model.MRTCAgentOptionConfig;
import djimrtc.natives.model.MRTCChannelConfig;
import djimrtc.natives.model.MRTCFlightState;
import djimrtc.natives.model.MRTCFlightWindState;
import djimrtc.natives.model.MRTCGPSInfo;
import djimrtc.natives.model.MRTCGimbalState;
import djimrtc.natives.model.MRTCInherentInfo;
import djimrtc.natives.model.MRTCRealTimeTargetPointInfos;
import djimrtc.natives.receiver.MRTCEventCallback;
import djimrtc.natives.receiver.MRTCLiveStatus;
import djimrtc.natives.receiver.MRTCLiveVideoStreamInfo;
import djimrtc.natives.receiver.MRTCLog;
import djimrtc.natives.receiver.MRTCRtspUrl;

public class MRTCController {
    private static final String TAG = "MRTCController";
    public static final int SUCCEESS = 0;
    public static final int MRTC_ERR_NOT_IMPLEMENT = 0x19100011;

    private static String findNativeLibraryPath(Context context) {
        return null;
    }

    public static int initNativeCoreMRTC(Context context) {
        return 0;
    }

    public static native int initNativeMRTCCore(String var0);

    public static native int destroyNativeCoreMRTC();

    public static native int initNativeMRTCAgent(MRTCAgentConfig var0, MRTCEventCallback var1);

    public static native int setNativeMRTCAgentOption(MRTCAgentOptionConfig var0);

    public static native int destroyNativeMRTCAgent();

    public static native int connectNativeMRTCAgent();

    public static native int disconnectNativeMRTCAgent();

    public static native int addNativeMRTCAgentchannel(MRTCChannelConfig var0);

    public static native int delNativeMRTCAgentchannel(MRTCChannelConfig var0);

    public static native int sendNativeMRTCAgentVideoData(byte[] var0, int var1, byte[] var2, int var3, long var4, long var6, int var8, int var9);

    public static native int sendNativeMRTCAgentAudioData(byte[] var0, int var1, long var2, long var4, int var6);

    public static native int setNativePayloadInherentInfo(MRTCInherentInfo var0, int var1, int var2);

    public static native int setNativeFlightInherentInfo(MRTCInherentInfo var0, int var1);

    public static native int setNativeFlightOrderId(String var0, int var1);

    public static native int setNativeFlightHomePointInfoData(MRTCGPSInfo var0, int var1);

    public static native int sendNativeFlightGPSInfoData(MRTCGPSInfo var0, int var1);

    public static native int sendNativeFlightStateData(MRTCFlightState var0, int var1);

    public static native int sendNativeFlightWindStateData(MRTCFlightWindState var0, int var1);

    public static native int sendNativeGimbalStateData(MRTCGimbalState var0, int var1);

    public static native int setNativeRCInherentInfo(MRTCInherentInfo var0, int var1, int var2);

    public static native int sendNativeRCGPSInfoData(MRTCGPSInfo var0, int var1);

    public static native int setNativeRealTimeTargetPointInfos(MRTCRealTimeTargetPointInfos var0, int var1);

    public static native MRTCLiveStatus getNativeMRTCLiveStatus();

    public static native MRTCLiveVideoStreamInfo getNativeMRTCLiveVideoStreamInfo();

    public static native MRTCRtspUrl getNativeMRTCRtspUrl();

    public static native MRTCLog getNativeMRTCLog();

    static {
        try {
            System.loadLibrary("mrtc_core_jni");
        }
        catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            Log.e((String)TAG, (String)("Couldn't load lib" + e2.getMessage()));
        }
    }
}

