/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.mcs;

import dji.sdk.common.ClientIdResultCallback;
import dji.sdk.common.GetAllClientsMapCallback;
import dji.sdk.common.GetAllTimeDeltaCacheCallback;
import dji.sdk.common.ListenerResultCallback;
import dji.sdk.common.RequireNumberCallback;
import dji.sdk.common.RetCodeCallback;
import dji.sdk.keyvalue.value.channel.ChannelMode;
import dji.sdk.keyvalue.value.multiclientsync.MCSDataModel;
import dji.sdk.mcs.ClearAllDataModelCallback;
import dji.sdk.mcs.DataChangeNotificationObserver;
import dji.sdk.mcs.GetAllDataModelsCallback;
import dji.sdk.mcs.TimeDeltaNotificationObserver;
import java.util.List;
import java.util.Map;

public class DJIMultiClientSyncManager {
    private static DJIMultiClientSyncManager instance = null;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DJIMultiClientSyncManager getInstance() {
        return null;
    }

    public void getAllDataModel(long l2, GetAllDataModelsCallback getAllDataModelsCallback) {
    }

    public void addDataModel(long l2, MCSDataModel mCSDataModel, RetCodeCallback retCodeCallback) {
    }

    public void clearAllDataModels(ClearAllDataModelCallback clearAllDataModelCallback) {
    }

    public void addDataChangeNotification(long l2, ListenerResultCallback listenerResultCallback, DataChangeNotificationObserver dataChangeNotificationObserver) {
    }

    public void removeDataChangeNotification(long l2, long l3, RetCodeCallback retCodeCallback) {
    }

    public void getLocalClientId(ClientIdResultCallback clientIdResultCallback) {
    }

    public void createCustomClient(ClientIdResultCallback clientIdResultCallback) {
    }

    public void destoryCustomClient(long l2, RetCodeCallback retCodeCallback) {
    }

    public void getAllClientsMap(GetAllClientsMapCallback getAllClientsMapCallback) {
    }

    public void addTimeDeltaNotificationListener(ListenerResultCallback listenerResultCallback, TimeDeltaNotificationObserver timeDeltaNotificationObserver) {
    }

    public void removeTimeDeltaNotificationListener(long l2) {
    }

    public void requireTimeDelta(RequireNumberCallback requireNumberCallback, TimeDeltaNotificationObserver timeDeltaNotificationObserver) {
    }

    public void getAllTimeDeltaCache(GetAllTimeDeltaCacheCallback getAllTimeDeltaCacheCallback) {
    }

    private static /* synthetic */ void lambda$getAllTimeDeltaCache$29(GetAllTimeDeltaCacheCallback getAllTimeDeltaCacheCallback, List list) {
    }

    private static /* synthetic */ void lambda$getAllTimeDeltaCache$28(GetAllTimeDeltaCacheCallback getAllTimeDeltaCacheCallback, List list) {
    }

    private static /* synthetic */ void lambda$requireTimeDelta$27(TimeDeltaNotificationObserver timeDeltaNotificationObserver, ChannelMode channelMode, long l2, int n) {
    }

    private static /* synthetic */ void lambda$requireTimeDelta$26(TimeDeltaNotificationObserver timeDeltaNotificationObserver, ChannelMode channelMode, long l2, int n) {
    }

    private static /* synthetic */ void lambda$requireTimeDelta$25(RequireNumberCallback requireNumberCallback, int n) {
    }

    private static /* synthetic */ void lambda$requireTimeDelta$24(RequireNumberCallback requireNumberCallback, int n) {
    }

    private static /* synthetic */ void lambda$addTimeDeltaNotificationListener$23(TimeDeltaNotificationObserver timeDeltaNotificationObserver, ChannelMode channelMode, long l2, int n) {
    }

    private static /* synthetic */ void lambda$addTimeDeltaNotificationListener$22(TimeDeltaNotificationObserver timeDeltaNotificationObserver, ChannelMode channelMode, long l2, int n) {
    }

    private static /* synthetic */ void lambda$addTimeDeltaNotificationListener$21(ListenerResultCallback listenerResultCallback, int n, long l2) {
    }

    private static /* synthetic */ void lambda$addTimeDeltaNotificationListener$20(ListenerResultCallback listenerResultCallback, int n, long l2) {
    }

    private static /* synthetic */ void lambda$getAllClientsMap$19(GetAllClientsMapCallback getAllClientsMapCallback, Map map) {
    }

    private static /* synthetic */ void lambda$getAllClientsMap$18(GetAllClientsMapCallback getAllClientsMapCallback, Map map) {
    }

    private static /* synthetic */ void lambda$destoryCustomClient$17(RetCodeCallback retCodeCallback, int n) {
    }

    private static /* synthetic */ void lambda$destoryCustomClient$16(RetCodeCallback retCodeCallback, int n) {
    }

    private static /* synthetic */ void lambda$createCustomClient$15(ClientIdResultCallback clientIdResultCallback, int n, long l2) {
    }

    private static /* synthetic */ void lambda$createCustomClient$14(ClientIdResultCallback clientIdResultCallback, int n, long l2) {
    }

    private static /* synthetic */ void lambda$getLocalClientId$13(ClientIdResultCallback clientIdResultCallback, int n, long l2) {
    }

    private static /* synthetic */ void lambda$getLocalClientId$12(ClientIdResultCallback clientIdResultCallback, int n, long l2) {
    }

    private static /* synthetic */ void lambda$removeDataChangeNotification$11(RetCodeCallback retCodeCallback, int n) {
    }

    private static /* synthetic */ void lambda$removeDataChangeNotification$10(RetCodeCallback retCodeCallback, int n) {
    }

    private static /* synthetic */ void lambda$addDataChangeNotification$9(DataChangeNotificationObserver dataChangeNotificationObserver, MCSDataModel mCSDataModel, boolean bl) {
    }

    private static /* synthetic */ void lambda$addDataChangeNotification$8(DataChangeNotificationObserver dataChangeNotificationObserver, MCSDataModel mCSDataModel, boolean bl) {
    }

    private static /* synthetic */ void lambda$addDataChangeNotification$7(ListenerResultCallback listenerResultCallback, int n, long l2) {
    }

    private static /* synthetic */ void lambda$addDataChangeNotification$6(ListenerResultCallback listenerResultCallback, int n, long l2) {
    }

    private static /* synthetic */ void lambda$clearAllDataModels$5(ClearAllDataModelCallback clearAllDataModelCallback, Map map) {
    }

    private static /* synthetic */ void lambda$clearAllDataModels$4(ClearAllDataModelCallback clearAllDataModelCallback, Map map) {
    }

    private static /* synthetic */ void lambda$addDataModel$3(RetCodeCallback retCodeCallback, int n) {
    }

    private static /* synthetic */ void lambda$addDataModel$2(RetCodeCallback retCodeCallback, int n) {
    }

    private static /* synthetic */ void lambda$getAllDataModel$1(GetAllDataModelsCallback getAllDataModelsCallback, List list) {
    }

    private static /* synthetic */ void lambda$getAllDataModel$0(GetAllDataModelsCallback getAllDataModelsCallback, List list) {
    }
}

