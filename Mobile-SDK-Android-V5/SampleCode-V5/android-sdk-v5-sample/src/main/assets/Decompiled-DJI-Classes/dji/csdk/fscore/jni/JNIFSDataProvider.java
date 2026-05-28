/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  androidx.annotation.Keep
 */
package dji.csdk.fscore.jni;

import android.content.Context;
import android.location.Location;
import androidx.annotation.Keep;
import com.dji.flysafe.util.ContextUtil;

@Keep
public class JNIFSDataProvider {
    private Location mCurPhoneLoc;

    public static JNIFSDataProvider getInstance() {
        return null;
    }

    private JNIFSDataProvider(Context context) {
    }

    public void setFakeGps(double d2, double d3) {
    }

    private Location getCurPhoneLoc() {
        return null;
    }

    public static LatLngJni getPhoneGpsJni() {
        return null;
    }

    private static void setCurrentDeviceIdJni(int n) {
    }

    /* synthetic */ JNIFSDataProvider(Context context, 1 var2_2) {
    }

    @Keep
    private static class LazyHolder {
        private static final JNIFSDataProvider INSTANCE = new JNIFSDataProvider(ContextUtil.getContext(), null);

        private LazyHolder() {
        }

        static /* synthetic */ JNIFSDataProvider access$100() {
            return null;
        }
    }

    @Keep
    public static class LatLngJni {
        private double lat;
        private double lng;

        public LatLngJni(double d2, double d3) {
        }

        public String toString() {
            return null;
        }
    }
}

