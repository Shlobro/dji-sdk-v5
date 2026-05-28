/*
 * Decompiled with CFR 0.152.
 */
package dji.raw;

import dji.raw.jni.callback.Listener;
import dji.raw.jni.callback.SendInterface;

public final class DJIRawDataManager {
    public static long SendData(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, byte[] byArray, SendInterface sendInterface) {
        return 0L;
    }

    public static long SendData(int n, int n2, int n3, int n4, int n5, int n6, boolean bl, int n7, int n8, int n9, int n10, int n11, int n12, byte[] byArray, SendInterface sendInterface) {
        return 0L;
    }

    public static long SendDataWithTcpPort(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, byte[] byArray, SendInterface sendInterface) {
        return 0L;
    }

    public static void CancelSend(long l2) {
    }

    public static long RegisterObserver(int n, int n2, int n3, int n4, int n5, Listener listener) {
        return 0L;
    }

    public static void UnregisterObserver(long l2) {
    }
}

