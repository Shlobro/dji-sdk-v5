/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.dji.industry.ppal;

import android.util.Log;
import com.dji.industry.ppal.MappingMaxSpeedInfo;
import com.dji.industry.ppal.PPALBreakPointInfo;
import com.dji.industry.ppal.StripAreaInfo;
import com.dji.industry.ppal.WaylineGenerateResult;
import com.dji.industry.ppal.WaypointInfo;
import java.util.List;

public class PPALController {
    private static final String TAG = "PPALController";

    private PPALController() {
    }

    public static native void initLogPath(String var0);

    public static native WaylineGenerateResult generate(byte[] var0, byte[] var1, List<byte[]> var2);

    public static native List<byte[]> parseDsmArea(List<String> var0);

    public static native void clearDsmArea();

    public static native void forceStopDsmCalculate();

    public static native MappingMaxSpeedInfo calMaxSpeed(byte[] var0, byte[] var1);

    public static native int calFlightAngle(byte[] var0);

    public static native WaypointInfo getWaypointInfo(byte[] var0, byte[] var1, byte[] var2);

    public static native byte[] getDsmRenderWayline(byte[] var0);

    public static native List<byte[]> getDsmRenderWaylines(List<byte[]> var0);

    public static native boolean isRegionValid(byte[] var0);

    public static native StripAreaInfo getStripAreaInfo(byte[] var0, byte[] var1);

    public static native float getStripSingleLineLowestHeight(byte[] var0, byte[] var1);

    public static native List<byte[]> generateBreakPointWayline(byte[] var0, byte[] var1, List<byte[]> var2, int var3, int var4, byte[] var5);

    public static native byte[] getTurningPoints(byte[] var0, byte[] var1);

    public static native PPALBreakPointInfo getBreakPointInfoByPercent(byte[] var0, byte[] var1, byte[] var2, float var3);

    public static native PPALBreakPointInfo getBreakPointInfoByDistance(byte[] var0, byte[] var1, byte[] var2, float var3);

    public static native PPALBreakPointInfo getBreakPointInfoByWaypointIndex(byte[] var0, byte[] var1, byte[] var2, int var3, float var4);

    public static native int getObjectMappingCalculatePercent();

    public static native void forceStopObjectMappingCalculate();

    static {
        try {
            System.loadLibrary("ppal-jni");
        }
        catch (UnsatisfiedLinkError e) {
            Log.e((String)TAG, (String)("Couldn't load lib-ppal-jni! e=" + e.getMessage()));
        }
    }
}

