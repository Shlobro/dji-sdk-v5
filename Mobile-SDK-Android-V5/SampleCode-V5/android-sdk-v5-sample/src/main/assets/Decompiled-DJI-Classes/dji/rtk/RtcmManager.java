/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 */
package dji.rtk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import dji.rtk.CoordinateSystem;
import dji.rtk.IRtcmControl;
import dji.rtk.IRtcmPack;
import dji.rtk.callback.NetworkServiceState;
import dji.rtk.callback.RTKCoordinateSystemCallback;
import dji.rtk.qx.QxRtcmTransfer;
import dji.sdk.common.DJIErrorCodeCallback;
import dji.sdk.errorcode.DJIErrorCode;
import dji.sdk.keyvalue.value.common.LocationCoordinate2D;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.rtkbasestation.GGALocation;
import dji.sdk.keyvalue.value.rtkbasestation.RemoteServiceState;
import java.lang.ref.WeakReference;
import java.util.List;

public class RtcmManager
implements IRtcmControl.DRtcmListener {
    private static final String TAG = "[RtcmManager]";
    public static RtcmManager instance = null;
    private static final int SEND_GPS_TAP = 1000;
    private static final int SEND_START_TAP = 5000;
    private static final int SEND_RTCM_TAP = 100;
    private static final int DECODE_BUFF_SIZE = 30;
    private static final int MAX_BUFF_SIZE = 20480;
    private static final int MAX_WAITING_FOR_RTCM_DATA_TIME = 40000;
    private static final int SEND_START = 1;
    private static final int PREPARE_GGA = 2;
    private static final int SEND_GPS_TO_RTCM = 3;
    private static final int SEND_RTCM_DATA_TO_RTK = 4;
    private IRtcmControl iRtcmControl;
    private QxRtcmTransfer rtcmTransfer;
    private Context context;
    private Handler mSendHandler;
    private byte[] buffer;
    private RemoteServiceState mRtcmStatus;
    private volatile int dataCount;
    private boolean mStart;
    private boolean rtcmInitSuccess;
    private long lastReceiveRTCMDataSysTime;
    private List<NetworkServiceState.StateCallback> rtcmStateCallback;
    private NetworkServiceState currentNetworkServiceState;
    private Runnable setNetworkServiceStateCallback;
    private CoordinateSystem currentQxSetCooridnateSystem;
    private Runnable checkRtcmUpdate;

    @Override
    public void onRtcmDatachanged(IRtcmPack iRtcmPack) {
    }

    @Override
    public void onStatusChanaged(RemoteServiceState remoteServiceState, String string2) {
    }

    public static RtcmManager getInstance() {
        return null;
    }

    public RtcmManager(Context context) {
    }

    private boolean checkRequirementToStartNetworkRTK() {
        return false;
    }

    public void updateRtcm(DJIErrorCodeCallback dJIErrorCodeCallback, Context context) {
    }

    private void start(DJIErrorCodeCallback dJIErrorCodeCallback, Context context) {
    }

    public void stop(DJIErrorCodeCallback dJIErrorCodeCallback, DJIErrorCode dJIErrorCode) {
    }

    private synchronized void startRTCM() {
    }

    private void prepareGGA() {
    }

    private void decodeRtcmData() {
    }

    private synchronized void addData(byte[] byArray, int n, int n2) {
    }

    private GGALocation getGGALocation() {
        return null;
    }

    private boolean isLocationValid(LocationCoordinate3D locationCoordinate3D) {
        return false;
    }

    private void sendGpsToRtcm() {
    }

    private synchronized byte[] getData() {
        return null;
    }

    private int getFixQuality(int n) {
        return 0;
    }

    public LocationCoordinate3D getGGAPosition() {
        return null;
    }

    private void sendGGAEvent() {
    }

    public void addRTCMStateCallback(NetworkServiceState.StateCallback stateCallback) {
    }

    public void removeRTCMStateCallback(NetworkServiceState.StateCallback stateCallback) {
    }

    public boolean isRunning() {
        return false;
    }

    private boolean isCanHandleData() {
        return false;
    }

    private void computeServiceState(RemoteServiceState remoteServiceState, DJIErrorCode dJIErrorCode) {
    }

    private void handlerRtcmStatus(RemoteServiceState remoteServiceState, RemoteServiceState remoteServiceState2) {
    }

    public static boolean isGPSCoordinateValid(LocationCoordinate2D locationCoordinate2D) {
        return false;
    }

    public static boolean isGPSCoordinateValid(LocationCoordinate3D locationCoordinate3D) {
        return false;
    }

    public void getUserCoordinateSystem(RTKCoordinateSystemCallback rTKCoordinateSystemCallback) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void setUserCoordinateSystem(CoordinateSystem coordinateSystem, DJIErrorCodeCallback dJIErrorCodeCallback) {
    }

    public void setCurrentSetupQXCoordinate(CoordinateSystem coordinateSystem) {
    }

    static /* synthetic */ List access$000(RtcmManager rtcmManager) {
        return null;
    }

    static /* synthetic */ NetworkServiceState access$100(RtcmManager rtcmManager) {
        return null;
    }

    static /* synthetic */ Runnable access$300(RtcmManager rtcmManager) {
        return null;
    }

    static /* synthetic */ Handler access$400(RtcmManager rtcmManager) {
        return null;
    }

    static /* synthetic */ Context access$500(RtcmManager rtcmManager) {
        return null;
    }

    static /* synthetic */ void access$600(RtcmManager rtcmManager) {
    }

    static /* synthetic */ void access$700(RtcmManager rtcmManager) {
    }

    static /* synthetic */ boolean access$800(RtcmManager rtcmManager) {
        return false;
    }

    static /* synthetic */ void access$900(RtcmManager rtcmManager) {
    }

    static /* synthetic */ void access$1000(RtcmManager rtcmManager) {
    }

    static /* synthetic */ void access$1100(RtcmManager rtcmManager) {
    }

    static /* synthetic */ long access$1200(RtcmManager rtcmManager) {
        return 0L;
    }

    static /* synthetic */ RemoteServiceState access$1300(RtcmManager rtcmManager) {
        return null;
    }

    static /* synthetic */ RemoteServiceState access$1302(RtcmManager rtcmManager, RemoteServiceState remoteServiceState) {
        return null;
    }

    static /* synthetic */ void access$1400(RtcmManager rtcmManager, RemoteServiceState remoteServiceState, RemoteServiceState remoteServiceState2) {
    }

    private class SendHandler
    extends Handler {
        private WeakReference<RtcmManager> mOutCls;
        public final Object runnableLock;
        final /* synthetic */ RtcmManager this$0;

        private SendHandler(RtcmManager rtcmManager, Looper looper, RtcmManager rtcmManager2) {
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public void handleMessage(Message message) {
        }

        /* synthetic */ SendHandler(RtcmManager rtcmManager, Looper looper, RtcmManager rtcmManager2, 1 var4_4) {
        }
    }

    static final class GpsFixQuality
    extends Enum<GpsFixQuality> {
        public static final /* enum */ GpsFixQuality INVALID = new GpsFixQuality(0);
        public static final /* enum */ GpsFixQuality NORMAL = new GpsFixQuality(1);
        public static final /* enum */ GpsFixQuality DGPS = new GpsFixQuality(2);
        public static final /* enum */ GpsFixQuality PPS = new GpsFixQuality(3);
        public static final /* enum */ GpsFixQuality RTK = new GpsFixQuality(4);
        public static final /* enum */ GpsFixQuality FRTK = new GpsFixQuality(5);
        public static final /* enum */ GpsFixQuality ESTIMATED = new GpsFixQuality(6);
        public static final /* enum */ GpsFixQuality MANUAL = new GpsFixQuality(7);
        public static final /* enum */ GpsFixQuality SIMULATED = new GpsFixQuality(8);
        public static final /* enum */ GpsFixQuality INERTIAL = new GpsFixQuality(9);
        private final int value;
        private static final /* synthetic */ GpsFixQuality[] $VALUES;

        public static GpsFixQuality[] values() {
            return null;
        }

        public static GpsFixQuality valueOf(String string2) {
            return null;
        }

        private GpsFixQuality(int n2) {
        }

        public final int toInt() {
            return 0;
        }

        public static GpsFixQuality valueOf(int n) {
            return null;
        }

        private static /* synthetic */ GpsFixQuality[] $values() {
            return null;
        }

        static {
            $VALUES = GpsFixQuality.$values();
        }
    }
}

