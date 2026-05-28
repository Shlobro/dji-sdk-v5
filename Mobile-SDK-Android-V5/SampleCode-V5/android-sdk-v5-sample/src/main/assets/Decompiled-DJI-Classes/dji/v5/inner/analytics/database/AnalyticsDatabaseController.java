/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  io.reactivex.rxjava3.subjects.PublishSubject
 */
package dji.v5.inner.analytics.database;

import android.annotation.SuppressLint;
import android.content.Context;
import dji.v5.inner.analytics.database.AnalyticsDatabase;
import dji.v5.inner.analytics.database.entities.Analytics;
import dji.v5.inner.analytics.event.DJIAnalyticsEvent;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public class AnalyticsDatabaseController {
    private static final String TAG = AnalyticsDatabaseController.class.getSimpleName();
    private AnalyticsDatabase database;
    private int databaseMaxSize;
    private AtomicLong databaseCurrentSize;
    private int eventBlockSize;
    private int eventBufferSize;
    private int syncThreshold;
    private AtomicBoolean isSavingToDatabase;
    private AtomicBoolean isNoticed;
    private List<DJIAnalyticsEvent> firstBlock;
    ConcurrentLinkedQueue<DJIAnalyticsEvent> eventBuffer;
    PublishSubject<DJIAnalyticsEvent> publishSubject;
    private final List<OnCacheStatusChangeListener> listeners;

    private AnalyticsDatabaseController() {
    }

    public static AnalyticsDatabaseController getInstance() {
        return null;
    }

    public void init(Context context) {
    }

    public void destroy() {
    }

    @SuppressLint(value={"CheckResult"})
    public void saveBufferToDatabase(DJIAnalyticsEvent dJIAnalyticsEvent) {
    }

    @SuppressLint(value={"CheckResult"})
    public PublishSubject<DJIAnalyticsEvent> getPublishSubject() {
        return null;
    }

    public synchronized List<DJIAnalyticsEvent> getFirstBlock() {
        return null;
    }

    public synchronized List<DJIAnalyticsEvent> removeFirstBlock() {
        return null;
    }

    public synchronized List<DJIAnalyticsEvent> getAllBlock() {
        return null;
    }

    public synchronized void setEventBlockSize(int n) {
    }

    @SuppressLint(value={"CheckResult"})
    private void noticeWithLocal() {
    }

    public void setOnStatusChangeListener(OnCacheStatusChangeListener onCacheStatusChangeListener) {
    }

    public void removeOnStatusChangeListener(OnCacheStatusChangeListener onCacheStatusChangeListener) {
    }

    public void removeAllOnStatusChangeListener() {
    }

    private void notifyListenersOnEmpty() {
    }

    private void notifyListenersOnShouldSync() {
    }

    private void notifyListenersOnSizeChanges(long l2) {
    }

    private List<Analytics> getAnalytics(Queue<DJIAnalyticsEvent> queue) {
        return null;
    }

    private List<DJIAnalyticsEvent> getDJiAnalytics(List<Analytics> list) {
        return null;
    }

    private /* synthetic */ void lambda$noticeWithLocal$6(List list) throws Throwable {
    }

    private /* synthetic */ void lambda$getAllBlock$5(List list) throws Throwable {
    }

    private static /* synthetic */ void lambda$getPublishSubject$4(Throwable throwable) throws Throwable {
    }

    private /* synthetic */ void lambda$getPublishSubject$3(List list) throws Throwable {
    }

    private /* synthetic */ boolean lambda$getPublishSubject$2(DJIAnalyticsEvent dJIAnalyticsEvent) throws Throwable {
        return false;
    }

    private /* synthetic */ void lambda$saveBufferToDatabase$1(DJIAnalyticsEvent dJIAnalyticsEvent, Boolean bl) throws Throwable {
    }

    private /* synthetic */ void lambda$saveBufferToDatabase$0() throws Throwable {
    }

    /* synthetic */ AnalyticsDatabaseController(1 var1_1) {
    }

    static /* synthetic */ AtomicBoolean access$200(AnalyticsDatabaseController analyticsDatabaseController) {
        return null;
    }

    static /* synthetic */ AnalyticsDatabase access$300(AnalyticsDatabaseController analyticsDatabaseController) {
        return null;
    }

    static /* synthetic */ AtomicLong access$400(AnalyticsDatabaseController analyticsDatabaseController) {
        return null;
    }

    private static class Holder {
        private static AnalyticsDatabaseController instance = new AnalyticsDatabaseController(null);

        private Holder() {
        }

        static /* synthetic */ AnalyticsDatabaseController access$100() {
            return null;
        }
    }

    public static interface OnCacheStatusChangeListener {
        public void onShouldSync();

        public void onEmpty();

        public void onSizeChanges(long var1);
    }
}

