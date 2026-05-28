/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Pair
 *  kotlin.TuplesKt
 *  kotlin.collections.MapsKt
 *  org.jetbrains.annotations.NotNull
 */
package dji.sdk.keyvalue.utils;

import dji.sdk.keyvalue.value.flightcontroller.CountDownLandingType;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R-\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Ldji/sdk/keyvalue/utils/KeyValueCacheUtil;", "", "<init>", "()V", "keyCountDownLandingActionMap", "Ljava/util/HashMap;", "Ldji/sdk/keyvalue/value/flightcontroller/CountDownLandingType;", "", "Lkotlin/collections/HashMap;", "getKeyCountDownLandingActionMap", "()Ljava/util/HashMap;", "aircraft_release"})
public final class KeyValueCacheUtil {
    @NotNull
    public static final KeyValueCacheUtil INSTANCE = new KeyValueCacheUtil();
    @NotNull
    private static final HashMap<CountDownLandingType, Integer> keyCountDownLandingActionMap;

    private KeyValueCacheUtil() {
    }

    @NotNull
    public final HashMap<CountDownLandingType, Integer> getKeyCountDownLandingActionMap() {
        return null;
    }

    static {
        Pair[] pairArray = new Pair[]{TuplesKt.to((Object)CountDownLandingType.LOW_BAT_LANDING, (Object)0), TuplesKt.to((Object)CountDownLandingType.PAUSE_GOHOME_FOR_USER_CONFIRM, (Object)0)};
        keyCountDownLandingActionMap = MapsKt.hashMapOf((Pair[])pairArray);
    }
}

