/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.Keep
 */
package dji.csdk.fscore.jni.db;

import android.content.Context;
import androidx.annotation.Keep;
import dji.csdk.fscore.jni.db.JNIFSBasicDbConfigManager;
import dji.csdk.fscore.jni.db.JNIFSPreciseDbConfigManager;

@Keep
public class JNIFSDatabaseConfigManager {
    private static final String BASIC_TFR_DB_NAME_JNI = "flysafe_app_dynamic_areas.db";
    private static final String PRECISE_TFR_DB_NAME_JNI = "flysafe_dji_flight_dynamic_areas.db";
    private static final String UNLOCK_DB_NAME_JNI = "geo_unlock.db";
    private static final String UNLOCK_LICENSE_DB_NAME_JNI = "flysafe_license_unlock.db";
    private static final String WHITE_LIST_UNLOCK_DB_NAME_JNI = "white_list_unlock.db";
    private static final String SPECIAL_WARNING_DB_NAME_JNI = "special_warning.db";
    private static final String UTMISS_WARNING_DB_NAME_JNI = "utmiss_special_warning.db";
    private static final String CE_NAME_JNI = "ce.db";
    private Context mContext;
    private JNIFSBasicDbConfigManager mJNIFSBasicDbConfigManager;
    private JNIFSPreciseDbConfigManager mJNIFSPreciseDbConfigManager;

    public static JNIFSDatabaseConfigManager getInstance() {
        return null;
    }

    private JNIFSDatabaseConfigManager() {
    }

    public String getBasicStaticDbNameJni() {
        return null;
    }

    public String getBasicStaticDbSignatureNameJni() {
        return null;
    }

    public String getBasicTfrDbNameJni() {
        return null;
    }

    public String getPreciseStaticDbNameJni() {
        return null;
    }

    public String getPreciseTfrDbNameJni() {
        return null;
    }

    public String getUnlockDbNameJni() {
        return null;
    }

    public String getUnlockLicenseDbNameJni() {
        return null;
    }

    public String getWhiteListUnlockDbNameJni() {
        return null;
    }

    public String getSpecialWarningDbNameJni() {
        return null;
    }

    public String getUtmissWarningDbNameJni() {
        return null;
    }

    public String getCEDbNameJni() {
        return null;
    }

    private String checkDbFileExistNRetPath(String string) {
        return null;
    }

    /* synthetic */ JNIFSDatabaseConfigManager(1 var1_1) {
    }

    @Keep
    private static final class LazyHolder {
        private static final JNIFSDatabaseConfigManager INSTANCE = new JNIFSDatabaseConfigManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ JNIFSDatabaseConfigManager access$100() {
            return null;
        }
    }
}

