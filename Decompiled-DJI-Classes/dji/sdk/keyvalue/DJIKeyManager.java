/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue;

import dji.sdk.keyvalue.callback.IActionCallback;
import dji.sdk.keyvalue.callback.IGetCallback;
import dji.sdk.keyvalue.callback.IListenCallback;
import dji.sdk.keyvalue.callback.ISetCallback;
import dji.sdk.keyvalue.callback.KeyListener;
import dji.sdk.keyvalue.key.DJIActionKeyInfo;
import dji.sdk.keyvalue.key.DJIKey;

public class DJIKeyManager {
    private static final String TAG = "DJIKeyManager";

    public static <ResultType> ResultType get(DJIKey<ResultType> dJIKey, ResultType ResultType) {
        return null;
    }

    public static <ResultType> ResultType get(DJIKey<ResultType> dJIKey) {
        return null;
    }

    public static <ResultType> void get(DJIKey<ResultType> dJIKey, IGetCallback<ResultType> iGetCallback) {
    }

    public static <ParamType> void set(DJIKey<ParamType> dJIKey, ParamType ParamType, ISetCallback iSetCallback) {
    }

    public static <ResultType> void doAction(DJIKey.ActionKey<?, ResultType> actionKey, IActionCallback<ResultType> iActionCallback) {
    }

    public static <ParamType, ResultType> void doAction(DJIKey.ActionKey<ParamType, ResultType> actionKey, ParamType ParamType, IActionCallback<ResultType> iActionCallback) {
    }

    @Deprecated
    public static <ResultType> KeyListener listen(DJIKey<ResultType> dJIKey, IListenCallback<ResultType> iListenCallback) {
        return null;
    }

    public static <ResultType> void listen(DJIKey<ResultType> dJIKey, Object object, IListenCallback<ResultType> iListenCallback) {
    }

    public static <ResultType> void listen(DJIKey<ResultType> dJIKey, Object object, IListenCallback<ResultType> iListenCallback, boolean bl) {
    }

    public static void cancelListen(DJIKey dJIKey, Object object) {
    }

    public static void cancelListen(DJIKey dJIKey) {
    }

    public static void cancelListen(Object object) {
    }

    @Deprecated
    public static void cancelAllListen() {
    }

    private static /* synthetic */ void lambda$listen$8(IListenCallback iListenCallback, DJIKey dJIKey, Object object, Object object2) {
    }

    private static /* synthetic */ void lambda$listen$7(DJIKey dJIKey, IListenCallback iListenCallback, byte[] byArray, int n, int n2) {
    }

    private static /* synthetic */ void lambda$listen$6(DJIKey dJIKey, int n, byte[] byArray, int n2, IListenCallback iListenCallback) {
    }

    private static /* synthetic */ void lambda$doAction$5(IActionCallback iActionCallback, DJIKey.ActionKey actionKey, DJIActionKeyInfo dJIActionKeyInfo, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$doAction$4(IActionCallback iActionCallback, int n, DJIKey.ActionKey actionKey, DJIActionKeyInfo dJIActionKeyInfo, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$set$3(ISetCallback iSetCallback, DJIKey dJIKey, int n, String string) {
    }

    private static /* synthetic */ void lambda$set$2(ISetCallback iSetCallback, int n, DJIKey dJIKey) {
    }

    private static /* synthetic */ void lambda$get$1(IGetCallback iGetCallback, DJIKey dJIKey, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$get$0(int n, IGetCallback iGetCallback, DJIKey dJIKey, byte[] byArray) {
    }
}

