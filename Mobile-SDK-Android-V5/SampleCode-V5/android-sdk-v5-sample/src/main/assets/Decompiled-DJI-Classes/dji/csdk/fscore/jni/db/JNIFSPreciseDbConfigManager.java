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
public class JNIFSPreciseDbConfigManager {
    private static final String PRECISE_STATIC_DB_NAME_JNI = "flysafe_areas_djigo.db.confumix";
    private static final String KEY_PRECISE_DB_VERSION_FOR_APP_JNI = "key_precise_db_version_for_app_jni";
    private static final int VERSION_PRECISE_DB_FOR_APP_JNI = 16;
    private Context mContext;

    JNIFSPreciseDbConfigManager() {
    }

    public String getPreciseStaticDbNameJni() {
        return null;
    }
}

