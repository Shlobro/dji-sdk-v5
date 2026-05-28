/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.functions.Function1
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package dji.v5.et;

import dji.sdk.keyvalue.key.DJIKey;
import dji.v5.common.error.IDJIError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=2, xi=48, d1={"\u0000D\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002\u00a2\u0006\u0002\u0010\u0003\u001a#\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0004\u001a\u0002H\u0001\u00a2\u0006\u0002\u0010\u0005\u001aH\u0010\u0000\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u0001H\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u001aM\u0010\u000b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00022\u0006\u0010\r\u001a\u0002H\f2\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u00a2\u0006\u0002\u0010\u000f\u001aJ\u0010\u0010\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0001*\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H\u00010\u00112\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u001a_\u0010\u0010\u001a\u00020\u0006\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00010\u00112\u0006\u0010\r\u001a\u0002H\f2\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0012\u001aM\u0010\u0013\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172#\u0010\u0018\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u0001H\u0001\u00a2\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00060\b\u001a\u001e\u0010\u001c\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u0016\u0010\u001c\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002\u001a\u0016\u0010\u001d\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002\u00a8\u0006\u001e"}, d2={"get", "R", "Ldji/sdk/keyvalue/key/DJIKey;", "(Ldji/sdk/keyvalue/key/DJIKey;)Ljava/lang/Object;", "defaultValue", "(Ldji/sdk/keyvalue/key/DJIKey;Ljava/lang/Object;)Ljava/lang/Object;", "", "onSuccess", "Lkotlin/Function1;", "onFailure", "Ldji/v5/common/error/IDJIError;", "set", "P", "param", "Lkotlin/Function0;", "(Ldji/sdk/keyvalue/key/DJIKey;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "action", "Ldji/sdk/keyvalue/key/DJIKey$ActionKey;", "(Ldji/sdk/keyvalue/key/DJIKey$ActionKey;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "listen", "holder", "", "getOnce", "", "onChange", "Lkotlin/ParameterName;", "name", "newValue", "cancelListen", "isKeySupported", "aircraft_release"})
public final class DJIKeyEtKt {
    @Nullable
    public static final <R> R get(@NotNull DJIKey<R> dJIKey) {
        return null;
    }

    public static final <R> R get(@NotNull DJIKey<R> dJIKey, R r) {
        return null;
    }

    public static final <R> void get(@NotNull DJIKey<R> dJIKey, @Nullable Function1<? super R, Unit> function1, @Nullable Function1<? super IDJIError, Unit> function12) {
    }

    public static /* synthetic */ void get$default(DJIKey dJIKey, Function1 function1, Function1 function12, int n, Object object) {
    }

    public static final <P> void set(@NotNull DJIKey<P> dJIKey, P p, @Nullable Function0<Unit> function0, @Nullable Function1<? super IDJIError, Unit> function1) {
    }

    public static /* synthetic */ void set$default(DJIKey dJIKey, Object object, Function0 function0, Function1 function1, int n, Object object2) {
    }

    public static final <R> void action(@NotNull DJIKey.ActionKey<?, R> actionKey, @Nullable Function1<? super R, Unit> function1, @Nullable Function1<? super IDJIError, Unit> function12) {
    }

    public static /* synthetic */ void action$default(DJIKey.ActionKey actionKey, Function1 function1, Function1 function12, int n, Object object) {
    }

    public static final <P, R> void action(@NotNull DJIKey.ActionKey<P, R> actionKey, P p, @Nullable Function1<? super R, Unit> function1, @Nullable Function1<? super IDJIError, Unit> function12) {
    }

    public static /* synthetic */ void action$default(DJIKey.ActionKey actionKey, Object object, Function1 function1, Function1 function12, int n, Object object2) {
    }

    public static final <R> void listen(@NotNull DJIKey<R> dJIKey, @NotNull Object object, boolean bl, @NotNull Function1<? super R, Unit> function1) {
    }

    public static /* synthetic */ void listen$default(DJIKey dJIKey, Object object, boolean bl, Function1 function1, int n, Object object2) {
    }

    public static final <R> void cancelListen(@NotNull DJIKey<R> dJIKey, @NotNull Object object) {
    }

    public static final <R> void cancelListen(@NotNull DJIKey<R> dJIKey) {
    }

    public static final <R> boolean isKeySupported(@NotNull DJIKey<R> dJIKey) {
        return false;
    }

    private static final void listen$lambda$0(Function1 function1, Object object, Object object2) {
    }
}

