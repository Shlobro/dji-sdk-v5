/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.LongSparseArray
 *  io.reactivex.rxjava3.core.Scheduler
 *  io.reactivex.rxjava3.disposables.Disposable
 */
package dji.v5.common.utils;

import android.util.LongSparseArray;
import dji.v5.common.utils.FetchCompleteCallback;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;

public class MediaFetcher
implements FetchCompleteCallback {
    private volatile long id;
    private Scheduler mFetchScheduler;
    private Scheduler mNextScheduler;
    private Scheduler mTimeoutScheduler;
    private List<FetchRunnable> mPendingList;
    private Map<FetchRunnable, Long> mRunnableMap;
    private LongSparseArray<FetchRunnable> mIdMap;
    private FetchRunnable mCurrentRunnable;
    private long mFetchingId;
    private Lock mLock;
    private long mTaskTimeout;
    private Disposable mTimeoutDispose;

    public MediaFetcher() {
    }

    public MediaFetcher(long l2) {
    }

    public long post(FetchRunnable fetchRunnable) {
        return 0L;
    }

    public void remove(long l2) {
    }

    public void clear() {
    }

    public boolean contains(long l2) {
        return false;
    }

    private void next() {
    }

    private void dispatchNextRunnable(FetchRunnable fetchRunnable) {
    }

    private synchronized long generateId() {
        return 0L;
    }

    @Override
    public void onComplete() {
    }

    private void onTimeout() {
    }

    private /* synthetic */ void lambda$onTimeout$3() {
    }

    private /* synthetic */ void lambda$onComplete$2() {
    }

    private /* synthetic */ void lambda$dispatchNextRunnable$1(FetchRunnable fetchRunnable) {
    }

    private /* synthetic */ void lambda$next$0() {
    }

    public static interface FetchRunnable {
        public void run(FetchCompleteCallback var1);
    }
}

