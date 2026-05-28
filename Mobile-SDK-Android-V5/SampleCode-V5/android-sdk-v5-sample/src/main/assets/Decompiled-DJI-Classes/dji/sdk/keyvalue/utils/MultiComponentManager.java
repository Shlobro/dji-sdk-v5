/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Pair
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.SourceDebugExtension
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package dji.sdk.keyvalue.utils;

import dji.sdk.keyvalue.key.ComponentType;
import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.product.AIBoxInfo;
import dji.sdk.keyvalue.value.product.CameraComponentInfo;
import dji.sdk.keyvalue.value.product.GimbalComponentInfo;
import dji.sdk.keyvalue.value.product.PSDKComponentInfo;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.sdk.keyvalue.value.product.RadarComponentInfo;
import dji.v5.common.callback.CommonCallbacks;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u00016B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u000bH\u0002J\u000e\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u000bJ\u0006\u0010\u001f\u001a\u00020\u001aJ\u000e\u0010 \u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000bJ\u000e\u0010!\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000bJ\u000e\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000bJ\u000e\u0010#\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u000bJ\u000e\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0017J\u000e\u0010&\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u000bJ\u000e\u0010'\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u000bJ\u000e\u0010(\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u000bJ\u000e\u0010)\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u000bJ\u001a\u0010*\u001a\u00020\u001a\"\u0004\b\u0000\u0010+2\f\u0010,\u001a\b\u0012\u0004\u0012\u0002H+0\u0015J\u001a\u0010-\u001a\u00020\u001a2\n\u0010.\u001a\u0006\u0012\u0002\b\u00030/2\u0006\u00100\u001a\u00020\u0001J\u0012\u0010-\u001a\u00020\u001a2\n\u0010.\u001a\u0006\u0012\u0002\b\u00030/J\u000e\u0010-\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\u0001J \u00101\u001a\b\u0012\u0004\u0012\u0002H20/\"\u0004\b\u0000\u001022\f\u0010.\u001a\b\u0012\u0004\u0012\u0002H20/J2\u00101\u001a\u000e\u0012\u0004\u0012\u0002H2\u0012\u0004\u0012\u0002H+03\"\u0004\b\u0000\u00102\"\u0004\b\u0001\u0010+2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u0002H2\u0012\u0004\u0012\u0002H+03J\u0010\u00104\u001a\u00020\u001a2\u0006\u0010%\u001a\u000205H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\n0\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2={"Ldji/sdk/keyvalue/utils/MultiComponentManager;", "", "<init>", "()V", "currentCameraList", "", "Ldji/sdk/keyvalue/value/product/CameraComponentInfo;", "currentGimbalList", "Ldji/sdk/keyvalue/value/product/GimbalComponentInfo;", "currentPayloadList", "Lkotlin/Pair;", "Ldji/sdk/keyvalue/value/common/ComponentIndexType;", "Ldji/sdk/keyvalue/value/product/PSDKComponentInfo;", "currentRadarList", "Ldji/sdk/keyvalue/value/product/RadarComponentInfo;", "currentAIBoxInfo", "Ldji/sdk/keyvalue/value/product/AIBoxInfo;", "isSupportDynamicComponent", "", "cacheKeyMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Ldji/sdk/keyvalue/utils/MultiComponentManager$ListenKey;", "COMPONENT_ID_MIN_V3_VALUE", "", "LOW_16_POS_ID", "init", "", "listenMultiDevicesOverview", "isInDynamicComponentIndex", "index", "isValidIndex", "destroy", "converterIndexVideoToNormal", "converterToMSDKIndex", "converterToCSDKIndex", "converterToMOPIndex", "isMultiKey", "type", "getCameraComponentIndex", "getGimbalComponentIndex", "getPayloadComponentIndex", "getAIBoxComponentIndex", "listen", "R", "listenKey", "cancelListen", "key", "Ldji/sdk/keyvalue/key/DJIKey;", "listenHolder", "toMultiKey", "T", "Ldji/sdk/keyvalue/key/DJIKey$ActionKey;", "refreshKeyListener", "Ldji/sdk/keyvalue/key/ComponentType;", "ListenKey", "aircraft_release"})
@SourceDebugExtension(value={"SMAP\nMultiComponentManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiComponentManager.kt\ndji/sdk/keyvalue/utils/MultiComponentManager\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,373:1\n216#2,2:374\n1557#3:376\n1628#3,3:377\n1557#3:380\n1628#3,3:381\n1557#3:384\n1628#3,3:385\n1557#3:388\n1628#3,3:389\n*S KotlinDebug\n*F\n+ 1 MultiComponentManager.kt\ndji/sdk/keyvalue/utils/MultiComponentManager\n*L\n325#1:374,2\n51#1:376\n51#1:377,3\n61#1:380\n61#1:381,3\n70#1:384\n70#1:385,3\n90#1:388\n90#1:389,3\n*E\n"})
public final class MultiComponentManager {
    @NotNull
    public static final MultiComponentManager INSTANCE = new MultiComponentManager();
    @NotNull
    private static List<? extends CameraComponentInfo> currentCameraList = CollectionsKt.emptyList();
    @NotNull
    private static List<? extends GimbalComponentInfo> currentGimbalList = CollectionsKt.emptyList();
    @NotNull
    private static List<? extends Pair<? extends ComponentIndexType, ? extends PSDKComponentInfo>> currentPayloadList = CollectionsKt.emptyList();
    @NotNull
    private static List<? extends RadarComponentInfo> currentRadarList = CollectionsKt.emptyList();
    @NotNull
    private static List<? extends Pair<? extends ComponentIndexType, ? extends AIBoxInfo>> currentAIBoxInfo = CollectionsKt.emptyList();
    private static boolean isSupportDynamicComponent;
    @NotNull
    private static final ConcurrentHashMap<ListenKey<?>, ListenKey<?>> cacheKeyMap;
    private static final int COMPONENT_ID_MIN_V3_VALUE = 65536;
    private static final int LOW_16_POS_ID = 65535;

    private MultiComponentManager() {
    }

    public final void init() {
    }

    private final void listenMultiDevicesOverview() {
    }

    private final boolean isInDynamicComponentIndex(ComponentIndexType componentIndexType) {
        return false;
    }

    public final boolean isValidIndex(@NotNull ComponentIndexType componentIndexType) {
        return false;
    }

    public final void destroy() {
    }

    @NotNull
    public final ComponentIndexType converterIndexVideoToNormal(@NotNull ComponentIndexType componentIndexType) {
        return null;
    }

    @NotNull
    public final ComponentIndexType converterToMSDKIndex(@NotNull ComponentIndexType componentIndexType) {
        return null;
    }

    @NotNull
    public final ComponentIndexType converterToCSDKIndex(@NotNull ComponentIndexType componentIndexType) {
        return null;
    }

    public final int converterToMOPIndex(@NotNull ComponentIndexType componentIndexType) {
        return 0;
    }

    public final boolean isMultiKey(int n) {
        return false;
    }

    public final int getCameraComponentIndex(@NotNull ComponentIndexType componentIndexType) {
        return 0;
    }

    public final int getGimbalComponentIndex(@NotNull ComponentIndexType componentIndexType) {
        return 0;
    }

    public final int getPayloadComponentIndex(@NotNull ComponentIndexType componentIndexType) {
        return 0;
    }

    public final int getAIBoxComponentIndex(@NotNull ComponentIndexType componentIndexType) {
        return 0;
    }

    public final <R> void listen(@NotNull ListenKey<R> listenKey) {
    }

    public final void cancelListen(@NotNull DJIKey<?> dJIKey, @NotNull Object object) {
    }

    public final void cancelListen(@NotNull DJIKey<?> dJIKey) {
    }

    public final void cancelListen(@NotNull Object object) {
    }

    @NotNull
    public final <T> DJIKey<T> toMultiKey(@NotNull DJIKey<T> dJIKey) {
        return null;
    }

    @NotNull
    public final <T, R> DJIKey.ActionKey<T, R> toMultiKey(@NotNull DJIKey.ActionKey<T, R> actionKey) {
        return null;
    }

    private final void refreshKeyListener(ComponentType componentType) {
    }

    private static final Unit init$lambda$0(ProductType productType) {
        return null;
    }

    private static final Unit listenMultiDevicesOverview$lambda$3(List list) {
        return null;
    }

    private static final Unit listenMultiDevicesOverview$lambda$6(List list) {
        return null;
    }

    private static final Unit listenMultiDevicesOverview$lambda$9(List list) {
        return null;
    }

    private static final Unit listenMultiDevicesOverview$lambda$11(List list) {
        return null;
    }

    private static final Unit listenMultiDevicesOverview$lambda$14(List list) {
        return null;
    }

    static {
        cacheKeyMap = new ConcurrentHashMap();
    }

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B3\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001c"}, d2={"Ldji/sdk/keyvalue/utils/MultiComponentManager$ListenKey;", "R", "", "key", "Ldji/sdk/keyvalue/key/DJIKey;", "listenHolder", "callback", "Ldji/v5/common/callback/CommonCallbacks$KeyListener;", "getOnce", "", "<init>", "(Ldji/sdk/keyvalue/key/DJIKey;Ljava/lang/Object;Ldji/v5/common/callback/CommonCallbacks$KeyListener;Z)V", "getKey", "()Ldji/sdk/keyvalue/key/DJIKey;", "getListenHolder", "()Ljava/lang/Object;", "getCallback", "()Ldji/v5/common/callback/CommonCallbacks$KeyListener;", "getGetOnce", "()Z", "cancelListen", "", "cancelListenOnKey", "doListen", "equals", "other", "hashCode", "", "aircraft_release"})
    public static final class ListenKey<R> {
        @NotNull
        private final DJIKey<R> key;
        @NotNull
        private final Object listenHolder;
        @NotNull
        private final CommonCallbacks.KeyListener<R> callback;
        private final boolean getOnce;

        public ListenKey(@NotNull DJIKey<R> dJIKey, @NotNull Object object, @NotNull CommonCallbacks.KeyListener<R> keyListener, boolean bl) {
        }

        @NotNull
        public final DJIKey<R> getKey() {
            return null;
        }

        @NotNull
        public final Object getListenHolder() {
            return null;
        }

        @NotNull
        public final CommonCallbacks.KeyListener<R> getCallback() {
            return null;
        }

        public final boolean getGetOnce() {
            return false;
        }

        public final void cancelListen() {
        }

        public final void cancelListenOnKey() {
        }

        public final void doListen() {
        }

        public boolean equals(@Nullable Object object) {
            return false;
        }

        public int hashCode() {
            return 0;
        }

        private static final void doListen$lambda$0(ListenKey listenKey, DJIKey dJIKey, Object object, Object object2) {
        }
    }

    @Metadata(mv={2, 1, 0}, k=3, xi=48)
    public final class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] nArray = new int[ComponentIndexType.values().length];
            try {
                nArray[ComponentIndexType.LEFT_OR_MAIN.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[ComponentIndexType.RIGHT.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[ComponentIndexType.UP.ordinal()] = 3;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[ComponentIndexType.INDEX_3.ordinal()] = 4;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[ComponentIndexType.UP_TYPE_C.ordinal()] = 5;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[ComponentIndexType.UP_TYPE_C_EXT_ONE.ordinal()] = 6;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[ComponentIndexType.INDEX_6.ordinal()] = 7;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[ComponentIndexType.FPV.ordinal()] = 8;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[ComponentIndexType.INDEX_8.ordinal()] = 9;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[ComponentIndexType.PORT_1.ordinal()] = 10;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[ComponentIndexType.PORT_2.ordinal()] = 11;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[ComponentIndexType.PORT_3.ordinal()] = 12;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[ComponentIndexType.PORT_4.ordinal()] = 13;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[ComponentIndexType.PORT_5.ordinal()] = 14;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[ComponentIndexType.PORT_6.ordinal()] = 15;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[ComponentIndexType.PORT_7.ordinal()] = 16;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[ComponentIndexType.PORT_8.ordinal()] = 17;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            $EnumSwitchMapping$0 = nArray;
        }
    }
}

