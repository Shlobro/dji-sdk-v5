/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 */
package dji.rtk.qx;

import android.content.Context;
import android.os.Handler;
import dji.rtk.CoordinateSystem;
import dji.rtk.IRtcmControl;
import dji.rtk.callback.RTKCoordinateSystemCallback;
import dji.rtk.callback.RTKQxOptionsCallback;
import dji.rtk.qx.QxStatus;
import dji.sdk.common.DJIErrorCodeCallback;
import dji.sdk.djinetworkrtkhelper.DJINetworkRTKListener;
import dji.sdk.keyvalue.value.rtkbasestation.GGALocation;
import dji.sdk.keyvalue.value.rtkbasestation.RemoteServiceState;
import java.util.Map;

public class QXRtcm1860
implements IRtcmControl {
    private static final String TAG = "[RTK_LOG][QXRtcm1860]";
    private IRtcmControl.DRtcmListener dRtcmListener;
    private CoordinateSystem userCoordinateSystem;
    private RemoteServiceState lastStatus;
    private DJIErrorCodeCallback coordinateSetterCallback;
    private boolean setCoordinateSys;
    public static String DEVICE_TYPE = "MG_Android";
    private Context context;
    private QxStatus currentQxStatus;
    private static final int UPDATE_DSS = 0;
    private Handler handler;
    private DJINetworkRTKListener listener;

    @Override
    public void initRtcmService(Context context) {
    }

    public void initRTKProviderService() {
    }

    public void startQxService(RTKQxOptionsCallback rTKQxOptionsCallback, Context context) {
    }

    @Override
    public void requestRtcmUpdate(IRtcmControl.DRtcmListener dRtcmListener) {
    }

    @Override
    public void requestRtcmUpdate(IRtcmControl.DRtcmListener dRtcmListener, GGALocation gGALocation, Map<String, String> map) throws Exception {
    }

    @Override
    public void sendGGA(String string2) {
    }

    @Override
    public void removeUpdate(IRtcmControl.DRtcmListener dRtcmListener) throws Exception {
    }

    @Override
    public void close(boolean bl) {
    }

    @Override
    public String getGGA(GGALocation gGALocation) {
        return null;
    }

    @Override
    public void setCoordinateSystem(CoordinateSystem coordinateSystem, DJIErrorCodeCallback dJIErrorCodeCallback) {
    }

    @Override
    public void getCoordinateSystem(RTKCoordinateSystemCallback rTKCoordinateSystemCallback) {
    }

    private RemoteServiceState getRtcmStatus(QxStatus qxStatus) {
        return null;
    }

    static /* synthetic */ IRtcmControl.DRtcmListener access$000(QXRtcm1860 qXRtcm1860) {
        return null;
    }

    static /* synthetic */ Context access$100(QXRtcm1860 qXRtcm1860) {
        return null;
    }

    static /* synthetic */ Handler access$200(QXRtcm1860 qXRtcm1860) {
        return null;
    }

    static /* synthetic */ QxStatus access$300(QXRtcm1860 qXRtcm1860) {
        return null;
    }

    static /* synthetic */ QxStatus access$302(QXRtcm1860 qXRtcm1860, QxStatus qxStatus) {
        return null;
    }

    static /* synthetic */ RemoteServiceState access$400(QXRtcm1860 qXRtcm1860, QxStatus qxStatus) {
        return null;
    }
}

