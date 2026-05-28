/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.push;

import dji.sdk.keyvalue.callback.IListenCallback;
import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.push.PushRecorder;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PushProcessor {
    private static Map<PushKey, PushRecorder> recorderMap = new ConcurrentHashMap<PushKey, PushRecorder>();

    public static <R> void processListen(DJIKey dJIKey, Object object, IListenCallback<R> iListenCallback, boolean bl) {
    }

    public static void processCancelListen(DJIKey dJIKey) {
    }

    public static void processCancelListen(Object object) {
    }

    public static void processCancelListen(DJIKey<?> dJIKey, Object object) {
    }

    public static void cancelAll() {
    }

    private static void removeKeys(List<PushKey> list) {
    }

    private static class PushKey<R> {
        public DJIKey<R> key;
        public Object holder;

        public PushKey(DJIKey<R> dJIKey, Object object) {
        }

        public boolean equals(Object object) {
            return false;
        }

        public int hashCode() {
            return 0;
        }
    }
}

