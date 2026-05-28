/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.csdk.flysafe;

import android.content.Context;
import dji.sdk.common.CallBack;
import dji.sdk.common.CallBack2;
import dji.sdk.keyvalue.value.common.LocationCoordinate2D;
import dji.sdk.keyvalue.value.flightcontroller.FlysafeLicenseGroup;
import dji.sdk.keyvalue.value.flightcontroller.FlysafeLicenseGroupMsg;
import dji.sdk.keyvalue.value.flightcontroller.FlysafeLimitAreaMsg;
import java.util.HashMap;
import java.util.Map;

public class DJIFlysafeManager {
    private static Map<Integer, DJIFlysafeManager> flysafeManagerRecorder = new HashMap<Integer, DJIFlysafeManager>();
    private int mDeviceID;
    private int mProductID;
    private static final String flysafeAssestPath = "dji_sdk_flysafe";

    public DJIFlysafeManager(int n, int n2) {
    }

    public static void init(Context context, String string) {
    }

    public void updateProductConnection(boolean bl) {
    }

    public void getShowingAreas(CallBack<FlysafeLimitAreaMsg> callBack) {
    }

    public void fetchLimitAreas(LocationCoordinate2D locationCoordinate2D, int n, boolean bl, CallBack<FlysafeLimitAreaMsg> callBack) {
    }

    public void unlockLimitAreasAndEnableLicense(int[] nArray, CallBack<Integer> callBack) {
    }

    public void downloadLicenseFromServerToLocal(CallBack2<Integer, FlysafeLicenseGroupMsg> callBack2) {
    }

    public void getLocalLicense(CallBack<FlysafeLicenseGroupMsg> callBack) {
    }

    public void uploadLocalLicenseToFC(CallBack<Integer> callBack) {
    }

    public void uploadLocalLicenseToFC(int n, CallBack<Integer> callBack) {
    }

    public void queryLicenseFromFC(CallBack2<Integer, FlysafeLicenseGroup> callBack2) {
    }

    public void setLicenseEnable(boolean bl, int n, CallBack<Integer> callBack) {
    }

    public void queryPreciseDBVersion(CallBack<String> callBack) {
    }

    public void updatePreciseDB(String string, CallBack<Boolean> callBack) {
    }

    public void setPreciseDBVersionChangedCallback(CallBack<String> callBack) {
    }

    private static /* synthetic */ void lambda$setPreciseDBVersionChangedCallback$27(CallBack callBack, String string) {
    }

    private static /* synthetic */ void lambda$setPreciseDBVersionChangedCallback$26(CallBack callBack, String string) {
    }

    private static /* synthetic */ void lambda$updatePreciseDB$25(CallBack callBack, boolean bl) {
    }

    private static /* synthetic */ void lambda$updatePreciseDB$24(CallBack callBack, boolean bl) {
    }

    private static /* synthetic */ void lambda$queryPreciseDBVersion$23(CallBack callBack, String string) {
    }

    private static /* synthetic */ void lambda$queryPreciseDBVersion$22(CallBack callBack, String string) {
    }

    private static /* synthetic */ void lambda$setLicenseEnable$21(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$setLicenseEnable$20(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$queryLicenseFromFC$19(CallBack2 callBack2, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$queryLicenseFromFC$18(CallBack2 callBack2, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$queryLicenseFromFC$17(CallBack2 callBack2, int n) {
    }

    private static /* synthetic */ void lambda$queryLicenseFromFC$16(CallBack2 callBack2, int n) {
    }

    private static /* synthetic */ void lambda$uploadLocalLicenseToFC$15(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$uploadLocalLicenseToFC$14(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$uploadLocalLicenseToFC$13(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$uploadLocalLicenseToFC$12(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$getLocalLicense$11(CallBack callBack, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$getLocalLicense$10(CallBack callBack, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$downloadLicenseFromServerToLocal$9(CallBack2 callBack2, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$downloadLicenseFromServerToLocal$8(CallBack2 callBack2, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$downloadLicenseFromServerToLocal$7(CallBack2 callBack2, int n) {
    }

    private static /* synthetic */ void lambda$downloadLicenseFromServerToLocal$6(CallBack2 callBack2, int n) {
    }

    private static /* synthetic */ void lambda$unlockLimitAreasAndEnableLicense$5(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$unlockLimitAreasAndEnableLicense$4(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$fetchLimitAreas$3(CallBack callBack, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$fetchLimitAreas$2(CallBack callBack, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$getShowingAreas$1(CallBack callBack, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$getShowingAreas$0(CallBack callBack, byte[] byArray) {
    }
}

