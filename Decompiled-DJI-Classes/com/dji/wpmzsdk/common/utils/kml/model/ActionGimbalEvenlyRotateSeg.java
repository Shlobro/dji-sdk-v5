/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import android.content.Context;
import com.dji.wpmzsdk.common.utils.kml.model.MissionFaultSegment;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000b"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/model/ActionGimbalEvenlyRotateSeg;", "Lcom/dji/wpmzsdk/common/utils/kml/model/MissionFaultSegment;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "setValue", "getContent", "context", "Landroid/content/Context;", "wpmzsdk_release"})
public final class ActionGimbalEvenlyRotateSeg
extends MissionFaultSegment {
    @NotNull
    private String value;

    public ActionGimbalEvenlyRotateSeg(@NotNull String value) {
        Intrinsics.checkNotNullParameter((Object)value, (String)"value");
        super(null);
        this.value = value;
        try {
            String string = new BigDecimal(this.value).setScale(1, 4).toString();
            Intrinsics.checkNotNullExpressionValue((Object)string, (String)"BigDecimal(value).setSca\u2026ROUND_HALF_UP).toString()");
            this.value = string;
        }
        catch (Throwable throwable) {
        }
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public final void setValue(@NotNull String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        this.value = string;
    }

    @Override
    @NotNull
    public String getContent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        return Intrinsics.stringPlus((String)"Gimbal Control Gimbal Pitch Rotation ", (Object)this.value);
    }
}

