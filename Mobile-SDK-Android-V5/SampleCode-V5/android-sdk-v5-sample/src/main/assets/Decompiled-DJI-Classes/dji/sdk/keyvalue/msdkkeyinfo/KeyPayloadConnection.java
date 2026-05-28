/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.internal.SourceDebugExtension
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.product.PSDKComponentInfo;
import dji.v5.common.callback.CommonCallbacks;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2={"Ldji/sdk/keyvalue/msdkkeyinfo/KeyPayloadConnection;", "Ldji/sdk/keyvalue/key/MSDKKeyInfo;", "", "<init>", "()V", "COMPONENT_ID_MIN_V3_VALUE", "", "LOW_16_POS_ID", "listen", "", "listenHolder", "", "getOnce", "callback", "Ldji/v5/common/callback/CommonCallbacks$KeyListener;", "keyParam", "Ldji/sdk/keyvalue/value/KeyParam;", "getPos", "it", "Ldji/sdk/keyvalue/value/product/PSDKComponentInfo;", "cancelListen", "aircraft_release"})
@SourceDebugExtension(value={"SMAP\nKeyPayloadConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyPayloadConnection.kt\ndji/sdk/keyvalue/msdkkeyinfo/KeyPayloadConnection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1755#2,3:60\n*S KotlinDebug\n*F\n+ 1 KeyPayloadConnection.kt\ndji/sdk/keyvalue/msdkkeyinfo/KeyPayloadConnection\n*L\n28#1:60,3\n*E\n"})
public final class KeyPayloadConnection
extends MSDKKeyInfo<Boolean> {
    private final int COMPONENT_ID_MIN_V3_VALUE;
    private final int LOW_16_POS_ID;

    @Override
    public void listen(@NotNull Object object, boolean bl, @Nullable CommonCallbacks.KeyListener<Boolean> keyListener, @NotNull KeyParam keyParam) {
    }

    public final int getPos(@NotNull PSDKComponentInfo pSDKComponentInfo) {
        return 0;
    }

    @Override
    public void listen(@NotNull Object object, @Nullable CommonCallbacks.KeyListener<Boolean> keyListener, @NotNull KeyParam keyParam) {
    }

    @Override
    public void cancelListen(@NotNull Object object, @NotNull KeyParam keyParam) {
    }

    @Override
    public void cancelListen(@NotNull KeyParam keyParam) {
    }

    private static final Unit listen$lambda$2(CommonCallbacks.KeyListener keyListener, KeyPayloadConnection keyPayloadConnection, int n, List list) {
        return null;
    }
}

