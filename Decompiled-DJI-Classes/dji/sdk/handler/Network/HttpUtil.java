/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  okhttp3.MediaType
 *  okhttp3.OkHttpClient
 *  okhttp3.Request
 *  okhttp3.Response
 */
package dji.sdk.handler.Network;

import android.content.Context;
import android.net.ConnectivityManager;
import dji.sdk.keyvalue.value.common.PostParameter;
import dji.sdk.keyvalue.value.product.AppType;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpUtil {
    private static OkHttpClient okHttpClient;
    public static final String HTTP_METHOD_GET = "GET";
    public static final String HTTP_METHOD_POST = "POST";
    public static final MediaType JSON_MEDIA_TYPE;
    public static final MediaType STREAM_TYPE;
    public static final String HTTP_BLANK_BODY = "";
    public static AppType appType;
    private static final String TAG = "[HttpUtil]";

    public static Map<String, String> generateParamsMap(String string) {
        return null;
    }

    public static Map<String, String> getResponseHeaders(Response response) {
        return null;
    }

    public static Request getOkHttpRequest(String string, String string2, Map<String, String> map, String string3) {
        return null;
    }

    public static String bytesToHex(byte[] byArray) {
        return null;
    }

    public static Request getOkHttpPostRequest(String string, Map<String, String> map, byte[] byArray, PostParameter postParameter) {
        return null;
    }

    public static Request getOkHttpPostRequest(String string, Map<String, String> map, String string2, PostParameter postParameter) {
        return null;
    }

    public static synchronized OkHttpClient getOkHttpClient() {
        return null;
    }

    public static boolean getNetWorkStatus(Context context) {
        return false;
    }

    private static boolean hasInvalidAddress(ConnectivityManager connectivityManager) {
        return false;
    }

    public static String getEtherNetIP() {
        return null;
    }

    static {
        JSON_MEDIA_TYPE = MediaType.parse((String)"application/json; charset=utf-8");
        STREAM_TYPE = MediaType.parse((String)"application/octet-stream");
        appType = AppType.UNKNOWN;
    }
}

