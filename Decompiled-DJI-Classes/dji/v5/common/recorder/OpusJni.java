/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.common.recorder;

import dji.v5.utils.common.LogUtils;

public class OpusJni {
    private static final String TAG = OpusJni.class.getSimpleName();

    public static OpusJni getInstance() {
        return null;
    }

    public native long createEncoder(int var1, int var2, int var3);

    public native long createDecoder(int var1, int var2);

    public native int encode(long var1, short[] var3, int var4, byte[] var5);

    public native int decode(long var1, byte[] var3, short[] var4);

    public native void destroyEncoder(long var1);

    public native void destroyDecoder(long var1);

    public native void agcHandler(short[] var1);

    public native long initPcmDecoder(String var1, String var2);

    public native void destroyPcmDecoder();

    public native long decodeToPcm();

    static {
        try {
            System.loadLibrary("DJIOpus");
        }
        catch (UnsatisfiedLinkError e2) {
            LogUtils.e(TAG, "can not load native library DJIOpus");
        }
    }

    private static class LazyHolder {
        private static final OpusJni INSTANCE = new OpusJni();

        private LazyHolder() {
        }

        static /* synthetic */ OpusJni access$000() {
            return null;
        }
    }
}

