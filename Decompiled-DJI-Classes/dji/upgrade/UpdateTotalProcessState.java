/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Pair
 *  kotlin.TuplesKt
 *  kotlin.collections.MapsKt
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.ranges.RangesKt
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package dji.upgrade;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\u000b"}, d2={"Ldji/upgrade/UpdateTotalProcessState;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "UPDATING", "UPDATE_FAILED", "UPDATE_SUCCESS", "Companion", "djisdk_release"})
@SourceDebugExtension(value={"SMAP\nUpgradeCompositeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpgradeCompositeManager.kt\ndji/upgrade/UpdateTotalProcessState\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,191:1\n8549#2,2:192\n9231#2,4:194\n*S KotlinDebug\n*F\n+ 1 UpgradeCompositeManager.kt\ndji/upgrade/UpdateTotalProcessState\n*L\n46#1:192,2\n46#1:194,4\n*E\n"})
public final class UpdateTotalProcessState
extends Enum<UpdateTotalProcessState> {
    @NotNull
    public static final Companion Companion;
    private final int value;
    @NotNull
    private static final Map<Integer, UpdateTotalProcessState> types;
    public static final /* enum */ UpdateTotalProcessState UPDATING;
    public static final /* enum */ UpdateTotalProcessState UPDATE_FAILED;
    public static final /* enum */ UpdateTotalProcessState UPDATE_SUCCESS;
    private static final /* synthetic */ UpdateTotalProcessState[] $VALUES;

    private UpdateTotalProcessState(int n2) {
    }

    public final int getValue() {
        return 0;
    }

    public static UpdateTotalProcessState[] values() {
        return null;
    }

    public static UpdateTotalProcessState valueOf(String string2) {
        return null;
    }

    private static final /* synthetic */ UpdateTotalProcessState[] $values() {
        return null;
    }

    public static final /* synthetic */ Map access$getTypes$cp() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    static {
        void $this$associateTo$iv$iv;
        UPDATING = new UpdateTotalProcessState(1);
        UPDATE_FAILED = new UpdateTotalProcessState(2);
        UPDATE_SUCCESS = new UpdateTotalProcessState(3);
        $VALUES = UpdateTotalProcessState.$values();
        Companion = new Companion(null);
        UpdateTotalProcessState[] $this$associate$iv = UpdateTotalProcessState.values();
        boolean $i$f$associate = false;
        int capacity$iv = RangesKt.coerceAtLeast((int)MapsKt.mapCapacity((int)$this$associate$iv.length), (int)16);
        UpdateTotalProcessState[] updateTotalProcessStateArray = $this$associate$iv;
        Map destination$iv$iv = new LinkedHashMap(capacity$iv);
        boolean $i$f$associateTo = false;
        for (void element$iv$iv : $this$associateTo$iv$iv) {
            Map map = destination$iv$iv;
            void it = element$iv$iv;
            boolean bl = false;
            Pair pair = TuplesKt.to((Object)it.value, (Object)it);
            map.put(pair.getFirst(), pair.getSecond());
        }
        types = destination$iv$iv;
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2={"Ldji/upgrade/UpdateTotalProcessState$Companion;", "", "()V", "types", "", "", "Ldji/upgrade/UpdateTotalProcessState;", "findByValue", "value", "djisdk_release"})
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public final UpdateTotalProcessState findByValue(int n) {
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}

