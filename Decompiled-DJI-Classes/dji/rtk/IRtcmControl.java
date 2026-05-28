/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.rtk;

import android.content.Context;
import dji.rtk.CoordinateSystem;
import dji.rtk.IRtcmPack;
import dji.rtk.callback.RTKCoordinateSystemCallback;
import dji.sdk.common.DJIErrorCodeCallback;
import dji.sdk.keyvalue.value.rtkbasestation.GGALocation;
import dji.sdk.keyvalue.value.rtkbasestation.RemoteServiceState;
import java.util.Map;

public interface IRtcmControl {
    public void initRtcmService(Context var1);

    public void requestRtcmUpdate(DRtcmListener var1, GGALocation var2, Map<String, String> var3) throws Exception;

    public void requestRtcmUpdate(DRtcmListener var1);

    public void close(boolean var1);

    public void sendGGA(String var1) throws Exception;

    public String getGGA(GGALocation var1);

    public void removeUpdate(DRtcmListener var1) throws Exception;

    public void setCoordinateSystem(CoordinateSystem var1, DJIErrorCodeCallback var2);

    public void getCoordinateSystem(RTKCoordinateSystemCallback var1);

    public static interface DRtcmListener {
        public void onRtcmDatachanged(IRtcmPack var1);

        public void onStatusChanaged(RemoteServiceState var1, String var2);
    }
}

