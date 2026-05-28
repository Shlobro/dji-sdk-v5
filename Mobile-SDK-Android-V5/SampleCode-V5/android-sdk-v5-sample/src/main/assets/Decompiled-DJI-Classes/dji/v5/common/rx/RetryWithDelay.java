/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.reactivex.rxjava3.core.Flowable
 *  io.reactivex.rxjava3.functions.Function
 *  org.reactivestreams.Publisher
 */
package dji.v5.common.rx;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

public class RetryWithDelay
implements Function<Flowable<? extends Throwable>, Publisher<?>> {
    private static final String TAG = "RetryWithDelay";
    AtomicInteger retryCount;
    private final int maxRetries;
    private final int retryDelayMillis;
    private final String label;

    public RetryWithDelay(int n, int n2) {
    }

    public RetryWithDelay(int n, int n2, String string2) {
    }

    public Publisher<?> apply(Flowable<? extends Throwable> flowable) throws Throwable {
        return null;
    }

    private /* synthetic */ Publisher lambda$apply$0(Throwable throwable) throws Throwable {
        return null;
    }
}

