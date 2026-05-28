/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.component.flysafe.listener;

import androidx.annotation.Keep;
import dji.jni.JNIProguardKeepTag;

@Keep
public class JNICommonCallbacks
implements JNIProguardKeepTag {
    private static int PackManagerUnknownError = 300;

    static /* synthetic */ int access$004() {
        return 0;
    }

    @Keep
    public static interface JNICommonCallbackWithErrorInfo<T> {
        public void onSuccess(T var1);

        public void onFailure(int var1);
    }

    @Keep
    public static interface JNICommonCallbackWith<T> {
        public void onResult(T var1);
    }

    @Keep
    public static interface JNIEnumCallback {
        public void onSuccess();

        public void onFailure(DatabaseErrorJni var1);
    }

    @Keep
    public static interface JNICommonCallback {
        public void onSuccess();

        public void onFailure(int var1);
    }

    @Keep
    public static final class DatabaseErrorJni
    extends Enum<DatabaseErrorJni> {
        public static final /* enum */ DatabaseErrorJni DataBaseErrorStart = new DatabaseErrorJni(JNICommonCallbacks.access$004());
        public static final /* enum */ DatabaseErrorJni DataBaseFileError = new DatabaseErrorJni(JNICommonCallbacks.access$004());
        public static final /* enum */ DatabaseErrorJni DataBaseInvalidParams = new DatabaseErrorJni(JNICommonCallbacks.access$004());
        public static final /* enum */ DatabaseErrorJni DataBaseNotReady = new DatabaseErrorJni(JNICommonCallbacks.access$004());
        public static final /* enum */ DatabaseErrorJni DataBaseFileUnknownError = new DatabaseErrorJni(JNICommonCallbacks.access$004());
        public static final /* enum */ DatabaseErrorJni OTHER = new DatabaseErrorJni(10000);
        int mValue;
        private static volatile DatabaseErrorJni[] sValues;
        private static final /* synthetic */ DatabaseErrorJni[] $VALUES;

        public static DatabaseErrorJni[] values() {
            return null;
        }

        public static DatabaseErrorJni valueOf(String string) {
            return null;
        }

        private DatabaseErrorJni(int n2) {
        }

        public int getValue() {
            return 0;
        }

        public static DatabaseErrorJni ofValue(int n) {
            return null;
        }

        private static /* synthetic */ DatabaseErrorJni[] $values() {
            return null;
        }

        static {
            $VALUES = DatabaseErrorJni.$values();
            sValues = null;
        }
    }
}

