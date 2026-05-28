/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  io.reactivex.rxjava3.core.Completable
 *  io.reactivex.rxjava3.core.CompletableEmitter
 *  io.reactivex.rxjava3.core.Flowable
 *  io.reactivex.rxjava3.core.FlowableEmitter
 *  io.reactivex.rxjava3.core.Single
 *  io.reactivex.rxjava3.core.SingleEmitter
 *  io.reactivex.rxjava3.functions.Function
 *  io.reactivex.rxjava3.plugins.RxJavaPlugins
 */
package dji.v5.common.utils;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.key.DJIKey;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

public class RxUtil {
    public static void removeListener(@NonNull Object object) {
    }

    public static void removeListener(@NonNull DJIKey<?> dJIKey, @NonNull Object object) {
    }

    @NonNull
    public static <T> Flowable<T> addListener(@NonNull DJIKey<T> dJIKey, @NonNull Object object) {
        return null;
    }

    @NonNull
    public static <T> Flowable<T> addListener(@NonNull DJIKey<T> dJIKey, @NonNull Object object, boolean bl) {
        return null;
    }

    @NonNull
    public static <T> Single<T> getValue(@NonNull DJIKey<T> dJIKey) {
        return null;
    }

    @NonNull
    public static <T> Completable setValue(@NonNull DJIKey<T> dJIKey, @NonNull T t) {
        return null;
    }

    @NonNull
    public static <Param, Result> Completable performActionWithOutResult(@NonNull DJIKey.ActionKey<Param, Result> actionKey, Param Param) {
        return null;
    }

    @NonNull
    public static <Param, Result> Completable performActionWithOutResult(@NonNull DJIKey.ActionKey<Param, Result> actionKey) {
        return null;
    }

    @NonNull
    public static <Param, Result> Single<Result> performActionSingWithResult(@NonNull DJIKey.ActionKey<Param, Result> actionKey, Param Param) {
        return null;
    }

    @NonNull
    public static <Param, Result> Single<Result> performActionSingWithResult(@NonNull DJIKey.ActionKey<Param, Result> actionKey) {
        return null;
    }

    @NonNull
    public static <Param, Result> Flowable<Result> performActionFlowableWithResult(@NonNull DJIKey.ActionKey<Param, Result> actionKey) {
        return null;
    }

    @NonNull
    public static <Param, Result> Flowable<Result> performActionFlowableWithResult(@NonNull DJIKey.ActionKey<Param, Result> actionKey, Param Param) {
        return null;
    }

    private static <T> void registerKey(@NonNull FlowableEmitter<T> flowableEmitter, @NonNull DJIKey<T> dJIKey, boolean bl, @NonNull Object object) {
    }

    public static Function<Flowable<Throwable>, Flowable<Long>> retryTimes(int n, int n2, TimeUnit timeUnit) {
        return null;
    }

    private RxUtil() {
    }

    private static /* synthetic */ void lambda$registerKey$9(FlowableEmitter flowableEmitter, DJIKey dJIKey, Object object, Object object2, Object object3) {
    }

    private static /* synthetic */ void lambda$registerKey$8(DJIKey dJIKey, Object object) throws Throwable {
    }

    private static /* synthetic */ void lambda$performActionFlowableWithResult$7(DJIKey.ActionKey actionKey, Object object, FlowableEmitter flowableEmitter) throws Throwable {
    }

    private static /* synthetic */ void lambda$performActionFlowableWithResult$6(DJIKey.ActionKey actionKey, FlowableEmitter flowableEmitter) throws Throwable {
    }

    private static /* synthetic */ void lambda$performActionSingWithResult$5(DJIKey.ActionKey actionKey, SingleEmitter singleEmitter) throws Throwable {
    }

    private static /* synthetic */ void lambda$performActionSingWithResult$4(DJIKey.ActionKey actionKey, Object object, SingleEmitter singleEmitter) throws Throwable {
    }

    private static /* synthetic */ void lambda$performActionWithOutResult$3(DJIKey.ActionKey actionKey, Object object, CompletableEmitter completableEmitter) throws Throwable {
    }

    private static /* synthetic */ void lambda$setValue$2(DJIKey dJIKey, Object object, CompletableEmitter completableEmitter) throws Throwable {
    }

    private static /* synthetic */ void lambda$getValue$1(DJIKey dJIKey, SingleEmitter singleEmitter) throws Throwable {
    }

    private static /* synthetic */ void lambda$addListener$0(DJIKey dJIKey, boolean bl, Object object, FlowableEmitter flowableEmitter) throws Throwable {
    }

    static {
        RxJavaPlugins.setErrorHandler(throwable -> {});
    }
}

