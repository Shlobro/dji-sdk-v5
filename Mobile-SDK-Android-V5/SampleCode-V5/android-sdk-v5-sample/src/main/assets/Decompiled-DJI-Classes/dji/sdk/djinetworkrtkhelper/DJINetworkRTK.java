/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.qx.wz.dj.rtcm.Options
 *  com.qx.wz.dj.rtcm.QxCoordSys
 *  com.qx.wz.dj.rtcm.QxCoordSysRsp
 *  com.qx.wz.dj.rtcm.QxRtcmListener
 */
package dji.sdk.djinetworkrtkhelper;

import com.qx.wz.dj.rtcm.Options;
import com.qx.wz.dj.rtcm.QxCoordSys;
import com.qx.wz.dj.rtcm.QxCoordSysRsp;
import com.qx.wz.dj.rtcm.QxRtcmListener;
import dji.sdk.djinetworkrtkhelper.DJINetworkRTKListener;
import dji.sdk.djinetworkrtkhelper.DJIRTKCoordinateSystem;
import dji.sdk.djinetworkrtkhelper.DJIRTKOptions;
import java.util.List;

public class DJINetworkRTK {
    private static DJINetworkRTK instance;
    private DJINetworkRTKListener listener;
    private List<QxCoordSys> coordinateSystems;
    private static final int GET_COORDINATE_SUCCESSFULLY = 1200;
    private static final int SET_COORDINATE_SUCCESSFULLY = 1202;
    private QxCoordSysRsp cachedCoordinateSysRsp;
    private static final String VERSION = "2.0.1";
    QxRtcmListener qxRtcmListener;

    public static synchronized DJINetworkRTK getInstance() {
        return null;
    }

    public void init(DJIRTKOptions dJIRTKOptions) {
    }

    public void reset(DJIRTKOptions dJIRTKOptions) {
    }

    public void stop() {
    }

    public void setCoordinateSystem(DJIRTKCoordinateSystem dJIRTKCoordinateSystem) {
    }

    public DJIRTKCoordinateSystem getCoordinateSystem() {
        return null;
    }

    private void resetCoordinateAndInitQxListener(int n) {
    }

    public void sendGga(String string) {
    }

    private Options translateOptions(DJIRTKOptions dJIRTKOptions) {
        return null;
    }

    static /* synthetic */ DJINetworkRTKListener access$000(DJINetworkRTK dJINetworkRTK) {
        return null;
    }

    static /* synthetic */ QxCoordSysRsp access$102(DJINetworkRTK dJINetworkRTK, QxCoordSysRsp qxCoordSysRsp) {
        return null;
    }

    static /* synthetic */ QxCoordSysRsp access$100(DJINetworkRTK dJINetworkRTK) {
        return null;
    }

    static /* synthetic */ List access$202(DJINetworkRTK dJINetworkRTK, List list) {
        return null;
    }
}

