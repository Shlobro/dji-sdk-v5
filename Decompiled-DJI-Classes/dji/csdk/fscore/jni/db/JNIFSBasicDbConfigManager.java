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

@Keep
public class JNIFSBasicDbConfigManager {
    private static final String BASIC_STATIC_DB_NAME_JNI = "dji.nfzdb2.confumix";
    private static final String BASIC_STATIC_DB_SIGNATURE_NAME_JNI = "dji.nfzdb2.sig";
    private static final String KEY_BASIC_DB_VERSION_FOR_APP_JNI = "key_basic_db_version_for_app_jni";
    private static final int VERSION_BASIC_DB_FOR_APP_JNI = 8;
    private Context mContext;

    JNIFSBasicDbConfigManager() {
    }

    public String getBasicStaticDbNameJni() {
        return null;
    }

    public String getBasicStaticDbSignatureNameJni() {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean verifyDbSignature() {
        return false;
    }
}

