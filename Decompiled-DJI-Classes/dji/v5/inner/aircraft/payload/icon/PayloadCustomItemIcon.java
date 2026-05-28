/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package dji.v5.inner.aircraft.payload.icon;

import dji.v5.inner.aircraft.payload.icon.IconParam;
import dji.v5.manager.aircraft.payload.widget.PayloadWidget;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015\u00a8\u0006#"}, d2={"Ldji/v5/inner/aircraft/payload/icon/PayloadCustomItemIcon;", "", "payloadWidget", "Ldji/v5/manager/aircraft/payload/widget/PayloadWidget;", "isHasSubIcon", "", "selectIconParam", "Ldji/v5/inner/aircraft/payload/icon/IconParam;", "unselectIconParam", "<init>", "(Ldji/v5/manager/aircraft/payload/widget/PayloadWidget;ZLdji/v5/inner/aircraft/payload/icon/IconParam;Ldji/v5/inner/aircraft/payload/icon/IconParam;)V", "getPayloadWidget", "()Ldji/v5/manager/aircraft/payload/widget/PayloadWidget;", "setPayloadWidget", "(Ldji/v5/manager/aircraft/payload/widget/PayloadWidget;)V", "()Z", "setHasSubIcon", "(Z)V", "getSelectIconParam", "()Ldji/v5/inner/aircraft/payload/icon/IconParam;", "setSelectIconParam", "(Ldji/v5/inner/aircraft/payload/icon/IconParam;)V", "getUnselectIconParam", "setUnselectIconParam", "toString", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "aircraft_release"})
public final class PayloadCustomItemIcon {
    @NotNull
    private PayloadWidget payloadWidget;
    private boolean isHasSubIcon;
    @NotNull
    private IconParam selectIconParam;
    @NotNull
    private IconParam unselectIconParam;

    public PayloadCustomItemIcon(@NotNull PayloadWidget payloadWidget, boolean bl, @NotNull IconParam iconParam, @NotNull IconParam iconParam2) {
    }

    public /* synthetic */ PayloadCustomItemIcon(PayloadWidget payloadWidget, boolean bl, IconParam iconParam, IconParam iconParam2, int n, DefaultConstructorMarker defaultConstructorMarker) {
    }

    @NotNull
    public final PayloadWidget getPayloadWidget() {
        return null;
    }

    public final void setPayloadWidget(@NotNull PayloadWidget payloadWidget) {
    }

    public final boolean isHasSubIcon() {
        return false;
    }

    public final void setHasSubIcon(boolean bl) {
    }

    @NotNull
    public final IconParam getSelectIconParam() {
        return null;
    }

    public final void setSelectIconParam(@NotNull IconParam iconParam) {
    }

    @NotNull
    public final IconParam getUnselectIconParam() {
        return null;
    }

    public final void setUnselectIconParam(@NotNull IconParam iconParam) {
    }

    @NotNull
    public String toString() {
        return null;
    }

    @NotNull
    public final PayloadWidget component1() {
        return null;
    }

    public final boolean component2() {
        return false;
    }

    @NotNull
    public final IconParam component3() {
        return null;
    }

    @NotNull
    public final IconParam component4() {
        return null;
    }

    @NotNull
    public final PayloadCustomItemIcon copy(@NotNull PayloadWidget payloadWidget, boolean bl, @NotNull IconParam iconParam, @NotNull IconParam iconParam2) {
        return null;
    }

    public static /* synthetic */ PayloadCustomItemIcon copy$default(PayloadCustomItemIcon payloadCustomItemIcon, PayloadWidget payloadWidget, boolean bl, IconParam iconParam, IconParam iconParam2, int n, Object object) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean equals(@Nullable Object object) {
        return false;
    }

    public PayloadCustomItemIcon() {
    }
}

