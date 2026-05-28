/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.inner.analytics.helper;

import dji.rtk.CoordinateSystem;
import dji.sdk.errorcode.DJIErrorCode;
import dji.sdk.keyvalue.key.DJIKeyInfo;
import dji.v5.common.error.IDJIError;
import dji.v5.common.ldm.LDMExemptModule;
import dji.v5.network.DJIHttpResponse;
import java.util.Map;

public class DJIAnalyticsPerformHelper {
    private DJIAnalyticsPerformHelper() {
    }

    public static DJIAnalyticsPerformHelper getInstance() {
        return null;
    }

    public void onSetValueSuccess(DJIKeyInfo<?> dJIKeyInfo) {
    }

    public void onSetValueFailed(DJIKeyInfo<?> dJIKeyInfo, int n) {
    }

    public void onPerformActionSuccess(DJIKeyInfo<?> dJIKeyInfo) {
    }

    public void onPerformActionFailed(DJIKeyInfo<?> dJIKeyInfo, int n) {
    }

    public void onCrash(Map<String, Object> map) {
    }

    public void onRemoteResponse(DJIHttpResponse dJIHttpResponse) {
    }

    public void trackSystemInfo() {
    }

    public void trackStartNetworkRTKService(CoordinateSystem coordinateSystem, DJIErrorCode dJIErrorCode) {
    }

    public void trackStartNetworkRTKService(DJIErrorCode dJIErrorCode) {
    }

    public void trackLDMEnableLDM(boolean bl, LDMExemptModule ... lDMExemptModuleArray) {
    }

    private Map<String, Object> getErrorExtrasMap(IDJIError iDJIError) {
        return null;
    }

    private Map<String, Object> getErrorExtrasMap(IDJIError iDJIError, String string, Object object) {
        return null;
    }

    private Map<String, Object> getErrorExtrasMap(IDJIError iDJIError, String string, Object object, String string2, Object object2) {
        return null;
    }

    private Map<String, Object> getExtrasMap(String string, Object object) {
        return null;
    }

    private Map<String, Object> getExtrasMap(String string, Object object, String string2, Object object2) {
        return null;
    }

    public void trackManagerMethodFailure(String string, IDJIError iDJIError) {
    }

    public void trackManagerMethodFailure(String string, IDJIError iDJIError, String string2, Object object) {
    }

    public void trackManagerMethodFailure(String string, IDJIError iDJIError, String string2, Object object, String string3, Object object2) {
    }

    public void trackManagerMethodSuccess(String string) {
    }

    public void trackManagerMethodSuccess(String string, String string2, Object object) {
    }

    public void trackManagerMethodSuccess(String string, String string2, Object object, String string3, Object object2) {
    }

    public void trackManager(String string) {
    }

    public void trackManager(String string, String string2, Object object) {
    }

    /* synthetic */ DJIAnalyticsPerformHelper(1 var1_1) {
    }

    private static class LazyHolder {
        private static final DJIAnalyticsPerformHelper INSTANCE = new DJIAnalyticsPerformHelper(null);

        private LazyHolder() {
        }

        static /* synthetic */ DJIAnalyticsPerformHelper access$100() {
            return null;
        }
    }
}

