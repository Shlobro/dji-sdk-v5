/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package dji.v5.inner.diagnostic.fly;

import dji.v5.inner.diagnostic.fly.Capsule;
import dji.v5.inner.diagnostic.fly.Checklist;
import dji.v5.inner.diagnostic.fly.InfoTip;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u00c6\u0003J7\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2={"Ldji/v5/inner/diagnostic/fly/CodeConfig;", "", "code", "", "infoTip", "Ldji/v5/inner/diagnostic/fly/InfoTip;", "capsule", "Ldji/v5/inner/diagnostic/fly/Capsule;", "checklist", "Ldji/v5/inner/diagnostic/fly/Checklist;", "<init>", "(ILdji/v5/inner/diagnostic/fly/InfoTip;Ldji/v5/inner/diagnostic/fly/Capsule;Ldji/v5/inner/diagnostic/fly/Checklist;)V", "getCode", "()I", "getInfoTip", "()Ldji/v5/inner/diagnostic/fly/InfoTip;", "getCapsule", "()Ldji/v5/inner/diagnostic/fly/Capsule;", "setCapsule", "(Ldji/v5/inner/diagnostic/fly/Capsule;)V", "getChecklist", "()Ldji/v5/inner/diagnostic/fly/Checklist;", "setChecklist", "(Ldji/v5/inner/diagnostic/fly/Checklist;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "aircraft_release"})
public final class CodeConfig {
    private final int code;
    @Nullable
    private final InfoTip infoTip;
    @Nullable
    private Capsule capsule;
    @Nullable
    private Checklist checklist;

    public CodeConfig(int n, @Nullable InfoTip infoTip, @Nullable Capsule capsule, @Nullable Checklist checklist) {
    }

    public /* synthetic */ CodeConfig(int n, InfoTip infoTip, Capsule capsule, Checklist checklist, int n2, DefaultConstructorMarker defaultConstructorMarker) {
    }

    public final int getCode() {
        return 0;
    }

    @Nullable
    public final InfoTip getInfoTip() {
        return null;
    }

    @Nullable
    public final Capsule getCapsule() {
        return null;
    }

    public final void setCapsule(@Nullable Capsule capsule) {
    }

    @Nullable
    public final Checklist getChecklist() {
        return null;
    }

    public final void setChecklist(@Nullable Checklist checklist) {
    }

    public final int component1() {
        return 0;
    }

    @Nullable
    public final InfoTip component2() {
        return null;
    }

    @Nullable
    public final Capsule component3() {
        return null;
    }

    @Nullable
    public final Checklist component4() {
        return null;
    }

    @NotNull
    public final CodeConfig copy(int n, @Nullable InfoTip infoTip, @Nullable Capsule capsule, @Nullable Checklist checklist) {
        return null;
    }

    public static /* synthetic */ CodeConfig copy$default(CodeConfig codeConfig, int n, InfoTip infoTip, Capsule capsule, Checklist checklist, int n2, Object object) {
        return null;
    }

    @NotNull
    public String toString() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean equals(@Nullable Object object) {
        return false;
    }
}

