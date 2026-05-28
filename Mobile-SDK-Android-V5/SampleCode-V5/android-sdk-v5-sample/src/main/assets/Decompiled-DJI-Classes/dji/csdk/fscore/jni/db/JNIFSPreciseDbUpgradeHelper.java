/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.csdk.fscore.jni.db;

import androidx.annotation.Keep;
import dji.component.flysafe.listener.JNICommonCallbacks;
import dji.component.flysafe.listener.OnDatabaseChangedListener;
import java.util.List;

@Keep
public class JNIFSPreciseDbUpgradeHelper {
    public static final String DEFAULT_VERSION_APP_POLYGON_DB = "00.00.00.01";
    private String mDbVersion;
    private List<OnDatabaseChangedListener> mOnPreciseDbJniListeners;

    public static JNIFSPreciseDbUpgradeHelper getInstance() {
        return null;
    }

    public void addOnPreciseDbListener(OnDatabaseChangedListener onDatabaseChangedListener) {
    }

    public void removeOnPreciseDbListener(OnDatabaseChangedListener onDatabaseChangedListener) {
    }

    public String getDbVersion() {
        return null;
    }

    public static void replacePreciseDatabaseFile(String string, JNICommonCallbacks.JNIEnumCallback jNIEnumCallback) {
    }

    private static void onPreciseDBVersionChangedJni(String string) {
    }

    public static native void native_getPreciseDbVersion(JNICommonCallbacks.JNICommonCallbackWith<String> var0);

    private static native void native_replacePreciseDatabaseFile(String var0, JNICommonCallbacks.JNICommonCallback var1);

    @Keep
    private static final class LazyHolder {
        private static final JNIFSPreciseDbUpgradeHelper INSTANCE = new JNIFSPreciseDbUpgradeHelper();

        private LazyHolder() {
        }

        static /* synthetic */ JNIFSPreciseDbUpgradeHelper access$000() {
            return null;
        }
    }

    public static interface OnPreciseDbJniListener {
        public void onDbVersionChanged(String var1);
    }
}

