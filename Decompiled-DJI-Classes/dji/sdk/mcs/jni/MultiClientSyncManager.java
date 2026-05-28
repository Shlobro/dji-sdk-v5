/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.mcs.jni;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.common.ClientIdResultCallback;
import dji.sdk.common.GetAllClientsMapCallback;
import dji.sdk.common.GetAllTimeDeltaCacheCallback;
import dji.sdk.common.ListenerResultCallback;
import dji.sdk.common.RequireNumberCallback;
import dji.sdk.common.RetCodeCallback;
import dji.sdk.keyvalue.value.multiclientsync.MCSDataModel;
import dji.sdk.mcs.ClearAllDataModelCallback;
import dji.sdk.mcs.DataChangeNotificationObserver;
import dji.sdk.mcs.GetAllDataModelsCallback;
import dji.sdk.mcs.TimeDeltaNotificationObserver;

public class MultiClientSyncManager
implements JNIProguardKeepTag {
    public static void getAllDataModel(long l2, GetAllDataModelsCallback getAllDataModelsCallback) {
    }

    public static void addDataModel(long l2, MCSDataModel mCSDataModel, RetCodeCallback retCodeCallback) {
    }

    public static void clearAllDataModels(ClearAllDataModelCallback clearAllDataModelCallback) {
    }

    public static void addDataChangeNotification(long l2, ListenerResultCallback listenerResultCallback, DataChangeNotificationObserver dataChangeNotificationObserver) {
    }

    public static void removeDataChangeNotification(long l2, long l3, RetCodeCallback retCodeCallback) {
    }

    public static void getLocalClientId(ClientIdResultCallback clientIdResultCallback) {
    }

    public static void createCustomClient(ClientIdResultCallback clientIdResultCallback) {
    }

    public static void destoryCustomClient(long l2, RetCodeCallback retCodeCallback) {
    }

    public static void getAllClientsMap(GetAllClientsMapCallback getAllClientsMapCallback) {
    }

    public static void addTimeDeltaNotificationListener(ListenerResultCallback listenerResultCallback, TimeDeltaNotificationObserver timeDeltaNotificationObserver) {
    }

    public static void removeTimeDeltaNotificationListener(long l2) {
    }

    public static void requireTimeDelta(RequireNumberCallback requireNumberCallback, TimeDeltaNotificationObserver timeDeltaNotificationObserver) {
    }

    public static void getAllTimeDeltaCache(GetAllTimeDeltaCacheCallback getAllTimeDeltaCacheCallback) {
    }

    private static native void native_GetAllDataModel(long var0, GetAllDataModelsCallback var2);

    private static native void native_AddDataModel(long var0, byte[] var2, RetCodeCallback var3);

    private static native void native_ClearAllDataModels(ClearAllDataModelCallback var0);

    private static native void native_AddDataChangeNotification(long var0, ListenerResultCallback var2, DataChangeNotificationObserver var3);

    private static native void native_RemoveDataChangeNotification(long var0, long var2, RetCodeCallback var4);

    private static native void native_GetLocalClientId(ClientIdResultCallback var0);

    private static native void native_CreateCustomClient(ClientIdResultCallback var0);

    private static native void native_DestoryCustomClient(long var0, RetCodeCallback var2);

    private static native void native_GetAllClientsMap(GetAllClientsMapCallback var0);

    private static native void native_AddTimeDeltaNotificationListener(ListenerResultCallback var0, TimeDeltaNotificationObserver var1);

    private static native void native_RemoveTimeDeltaNotificationListener(long var0);

    private static native void native_RequireTimeDelta(RequireNumberCallback var0, TimeDeltaNotificationObserver var1);

    private static native void native_GetAllTimeDeltaCache(GetAllTimeDeltaCacheCallback var0);
}

