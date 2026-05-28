/*
 * Decompiled with CFR 0.152.
 */
package dji.areacode;

import dji.areacode.AreaCodeChangedCallback;
import dji.areacode.AreaCodeEvent;
import dji.areacode.AreaCodeHandler;
import dji.areacode.AreaCodeStrategy;
import dji.areacode.CityInfo;
import dji.jni.JNIProguardKeepTag;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class AreaCodeMgr
implements JNIProguardKeepTag {
    public abstract AreaCodeEvent GetAreaCode(int var1, int var2);

    public abstract CityInfo GetLastCityInfo(int var1, int var2);

    public abstract int AddAreaCodeObserver(int var1, int var2, AreaCodeChangedCallback var3);

    public abstract void RemoveAreaCodeObserver(int var1);

    public abstract void RemoveAllAreaCodeObserver();

    public abstract void SetAreacodeHandle(AreaCodeHandler var1);

    public abstract void UpdateAreaCode(int var1, int var2, AreaCodeStrategy var3, String var4);

    public abstract void TriggerAreaCodecCompute(int var1, int var2, AreaCodeChangedCallback var3);

    public abstract void CancelAreaCodeMockStatus(int var1, int var2);

    public abstract boolean RemoveAreaCodeCacheFile();

    public static AreaCodeMgr Create() {
        return null;
    }

    private static final class CppProxy
    extends AreaCodeMgr
    implements JNIProguardKeepTag {
        private final long nativeRef;
        private final AtomicBoolean destroyed;

        private CppProxy(long l2) {
        }

        private native void nativeDestroy(long var1);

        public void _djinni_private_destroy() {
        }

        protected void finalize() throws Throwable {
        }

        @Override
        public AreaCodeEvent GetAreaCode(int n, int n2) {
            return null;
        }

        private native AreaCodeEvent native_GetAreaCode(long var1, int var3, int var4);

        @Override
        public CityInfo GetLastCityInfo(int n, int n2) {
            return null;
        }

        private native CityInfo native_GetLastCityInfo(long var1, int var3, int var4);

        @Override
        public int AddAreaCodeObserver(int n, int n2, AreaCodeChangedCallback areaCodeChangedCallback) {
            return 0;
        }

        private native int native_AddAreaCodeObserver(long var1, int var3, int var4, AreaCodeChangedCallback var5);

        @Override
        public void RemoveAreaCodeObserver(int n) {
        }

        private native void native_RemoveAreaCodeObserver(long var1, int var3);

        @Override
        public void RemoveAllAreaCodeObserver() {
        }

        private native void native_RemoveAllAreaCodeObserver(long var1);

        @Override
        public void SetAreacodeHandle(AreaCodeHandler areaCodeHandler) {
        }

        private native void native_SetAreacodeHandle(long var1, AreaCodeHandler var3);

        @Override
        public void UpdateAreaCode(int n, int n2, AreaCodeStrategy areaCodeStrategy, String string2) {
        }

        private native void native_UpdateAreaCode(long var1, int var3, int var4, AreaCodeStrategy var5, String var6);

        @Override
        public void TriggerAreaCodecCompute(int n, int n2, AreaCodeChangedCallback areaCodeChangedCallback) {
        }

        private native void native_TriggerAreaCodecCompute(long var1, int var3, int var4, AreaCodeChangedCallback var5);

        @Override
        public void CancelAreaCodeMockStatus(int n, int n2) {
        }

        private native void native_CancelAreaCodeMockStatus(long var1, int var3, int var4);

        @Override
        public boolean RemoveAreaCodeCacheFile() {
            return false;
        }

        private native boolean native_RemoveAreaCodeCacheFile(long var1);

        public static native AreaCodeMgr Create();
    }
}

