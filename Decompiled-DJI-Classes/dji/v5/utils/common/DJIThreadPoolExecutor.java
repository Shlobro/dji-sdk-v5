/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.utils.common;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DJIThreadPoolExecutor
extends ThreadPoolExecutor {
    public DJIThreadPoolExecutor(int n, int n2, long l2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
    }

    public DJIThreadPoolExecutor(int n, int n2, long l2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
    }

    public DJIThreadPoolExecutor(int n, int n2, long l2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, RejectedExecutionHandler rejectedExecutionHandler) {
    }

    public DJIThreadPoolExecutor(int n, int n2, long l2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
    }

    @Override
    public void execute(Runnable runnable) {
    }
}

