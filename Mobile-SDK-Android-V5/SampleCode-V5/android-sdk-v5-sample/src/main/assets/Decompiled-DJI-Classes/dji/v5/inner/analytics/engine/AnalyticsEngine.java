/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.os.Handler
 *  io.reactivex.rxjava3.subjects.PublishSubject
 */
package dji.v5.inner.analytics.engine;

import android.annotation.SuppressLint;
import android.os.Handler;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.analytics.database.AnalyticsDatabaseController;
import dji.v5.inner.analytics.engine.IDJIAnalyticsEngine;
import dji.v5.inner.analytics.event.AnalyticsCacheEntry;
import dji.v5.inner.analytics.event.DJIAnalyticsEvent;
import dji.v5.inner.analytics.remote.RemoteServerController;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

public class AnalyticsEngine
implements IDJIAnalyticsEngine {
    private static final String PRODUCT_SN = "product_sn";
    private static final String EVENT_ID = "event_id";
    private static final String MODEL_SN = "model_num";
    private static final String M_UUID = UUID.randomUUID().toString().replace("-", "");
    private static final ArrayList<String> PSDK_EVENT_ID = new ArrayList<String>(Arrays.asList("fw_0a06_psdk_func_usage", "fw_0a06_psdk_product_info", "DJI_SDK_Base_info", "DJI_SDK_Agent_flight_time", "DJI_SDK_Agent_flight_duration", "DJI_SDK_Agent_sdk_info", "DJI_OSDK_statistic_info", "DJI_OSDK_statistic_flight_time", "DJI_OSDK_Agent_osdk_info"));
    private AnalyticsDatabaseController databaseEngine;
    private PublishSubject<DJIAnalyticsEvent> databaseEngineSubject;
    private boolean isAnalyticsEngineInit;
    RemoteServerController serverController;
    private final AtomicBoolean isSendingToServer;
    private static final AtomicBoolean isEnabled = new AtomicBoolean(true);
    public static final boolean CAN_WRITE_TO_WEBSOCKET = false;
    private AnalyticsEngineCallBack analyticsEngineCallBack;
    private final Handler handler;
    private final long initTime;
    private final List<AnalyticsCacheEntry> headCache;
    private final AtomicBoolean cacheToList;
    private final AnalyticsDatabaseController.OnCacheStatusChangeListener onCacheStatusChangeListener;

    private AnalyticsEngine() {
    }

    public static AnalyticsEngine getInstance() {
        return null;
    }

    @Override
    public void init() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void setAnalyticsEnable(boolean bl) {
    }

    @Override
    public void track(String string, String string2) {
    }

    @Override
    public void track(String string, String string2, Map<String, Object> map) {
    }

    @Override
    public void track(String string, String string2, Map<String, Object> map, CommonCallbacks.CompletionCallback completionCallback) {
    }

    private boolean cacheToList(String string, String string2, Map<String, Object> map) {
        return false;
    }

    @SuppressLint(value={"CheckResult"})
    private void notifyHandleCache() {
    }

    private void sendLocalEventsToServer(DJIAnalyticsEvent dJIAnalyticsEvent, CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void sendLocalEventsToServer(List<DJIAnalyticsEvent> list, CommonCallbacks.CompletionCallback completionCallback) {
    }

    private boolean shouldTrack(String string) {
        return false;
    }

    @SuppressLint(value={"CheckResult"})
    public void initListener() {
    }

    private /* synthetic */ void lambda$initListener$8(String string) throws Throwable {
    }

    private static /* synthetic */ void lambda$initListener$7(Boolean bl) throws Throwable {
    }

    private static /* synthetic */ void lambda$initListener$6(Throwable throwable) throws Throwable {
    }

    private static /* synthetic */ void lambda$initListener$5() throws Throwable {
    }

    private static /* synthetic */ void lambda$notifyHandleCache$4(Throwable throwable) throws Throwable {
    }

    private static /* synthetic */ void lambda$notifyHandleCache$3(AnalyticsCacheEntry analyticsCacheEntry) throws Throwable {
    }

    private /* synthetic */ void lambda$notifyHandleCache$2(AnalyticsCacheEntry analyticsCacheEntry) throws Throwable {
    }

    private static /* synthetic */ AnalyticsCacheEntry lambda$notifyHandleCache$1(AnalyticsCacheEntry analyticsCacheEntry, Long l2) throws Throwable {
        return null;
    }

    private /* synthetic */ void lambda$track$0(DJIAnalyticsEvent dJIAnalyticsEvent) {
    }

    static /* synthetic */ AtomicBoolean access$000(AnalyticsEngine analyticsEngine) {
        return null;
    }

    static /* synthetic */ void access$100(AnalyticsEngine analyticsEngine, List list, CommonCallbacks.CompletionCallback completionCallback) {
    }

    static /* synthetic */ AnalyticsDatabaseController access$200(AnalyticsEngine analyticsEngine) {
        return null;
    }

    /* synthetic */ AnalyticsEngine(1 var1_1) {
    }

    private static class Holder {
        public static final AnalyticsEngine instance = new AnalyticsEngine(null);

        private Holder() {
        }
    }

    public static interface AnalyticsEngineCallBack {
        public void onUpdate(DJIAnalyticsEvent var1);
    }
}

