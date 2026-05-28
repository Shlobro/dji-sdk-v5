/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  androidx.annotation.Nullable
 */
package dji.v5.utils.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.Nullable;
import java.net.SocketException;

public class NetworkUtils {
    private static final String STATIC_IP_IN_M300RTK_RC = "192.168.50.1";
    private static final String STATIC_IP_IN_MAVIC_RC = "192.168.42.8";

    public static boolean isNetworkAvailable() {
        return false;
    }

    public static NetworkInfo getActiveNetworkInfo(ConnectivityManager connectivityManager) {
        return null;
    }

    private static NetworkInfo getActiveNetworkInfo(Context context) {
        return null;
    }

    @TargetApi(value=23)
    private static boolean onlyHasInvalidAddress(String string2) {
        return false;
    }

    @Nullable
    public static String getIpAddress(boolean bl) throws SocketException {
        return null;
    }

    public static NetworkType getNetworkType(Context context) {
        return null;
    }

    public static final class NetworkType
    extends Enum<NetworkType> {
        public static final /* enum */ NetworkType NETWORK_ETHERNET = new NetworkType();
        public static final /* enum */ NetworkType NETWORK_WIFI = new NetworkType();
        public static final /* enum */ NetworkType NETWORK_5G = new NetworkType();
        public static final /* enum */ NetworkType NETWORK_4G = new NetworkType();
        public static final /* enum */ NetworkType NETWORK_3G = new NetworkType();
        public static final /* enum */ NetworkType NETWORK_2G = new NetworkType();
        public static final /* enum */ NetworkType NETWORK_UNKNOWN = new NetworkType();
        public static final /* enum */ NetworkType NETWORK_NO = new NetworkType();
        private static final /* synthetic */ NetworkType[] $VALUES;

        public static NetworkType[] values() {
            return null;
        }

        public static NetworkType valueOf(String string2) {
            return null;
        }

        private static /* synthetic */ NetworkType[] $values() {
            return null;
        }

        static {
            $VALUES = NetworkType.$values();
        }
    }

    public static interface NetworkChangeListener {
        public void onNetworkChange(boolean var1);
    }
}

