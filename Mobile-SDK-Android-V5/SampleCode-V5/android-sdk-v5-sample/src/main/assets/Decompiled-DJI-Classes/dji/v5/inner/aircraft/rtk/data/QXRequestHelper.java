/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 */
package dji.v5.inner.aircraft.rtk.data;

import android.annotation.SuppressLint;
import dji.rtk.qx.QxRtkDssInfo;
import dji.sdk.keyvalue.value.rtkbasestation.NetworkRTKParam;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.ErrorImp;
import java.util.Map;

public class QXRequestHelper {
    public static final String TAG = "QXRequestHelper";

    @SuppressLint(value={"HardwareIds"})
    public static void fetchQxRtkDssInfo(NetworkRTKParam networkRTKParam, CommonCallbacks.CompletionCallbackWithParam<QxRtkDssInfo> completionCallbackWithParam) {
    }

    private static Map<String, String> getHeaders(String string2) {
        return null;
    }

    private static String getSignature(String string2, String string3, String string4, String string5) {
        return null;
    }

    private QXRequestHelper() {
    }

    private static ErrorImp getSystemError(int n, String string2) {
        return null;
    }

    private static String getToken() {
        return null;
    }

    static /* synthetic */ ErrorImp access$000(int n, String string2) {
        return null;
    }
}

