/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.StringRes
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package dji.v5.inner.diagnostic.fly;

import androidx.annotation.StringRes;
import dji.v5.inner.diagnostic.fly.Capsule;
import dji.v5.inner.diagnostic.fly.Checklist;
import dji.v5.inner.diagnostic.fly.CodeConfig;
import dji.v5.inner.diagnostic.fly.InfoTip;
import dji.v5.inner.diagnostic.fly.Level;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0003J \u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u0003J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0003J\u0006\u0010\u0016\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2={"Ldji/v5/inner/diagnostic/fly/CodeConfigBuilder;", "", "code", "", "<init>", "(I)V", "getCode", "()I", "infoTipRule", "Ldji/v5/inner/diagnostic/fly/InfoTip;", "capsuleRule", "Ldji/v5/inner/diagnostic/fly/Capsule;", "checklistRule", "Ldji/v5/inner/diagnostic/fly/Checklist;", "infoTip", "", "level", "Ldji/v5/inner/diagnostic/fly/Level;", "stringId", "capsule", "group", "checklist", "build", "Ldji/v5/inner/diagnostic/fly/CodeConfig;", "aircraft_release"})
public final class CodeConfigBuilder {
    private final int code;
    @Nullable
    private InfoTip infoTipRule;
    @Nullable
    private Capsule capsuleRule;
    @Nullable
    private Checklist checklistRule;

    public CodeConfigBuilder(int n) {
    }

    public final int getCode() {
        return 0;
    }

    public final void infoTip(@NotNull Level level, @StringRes int n) {
    }

    public final void capsule(@NotNull Level level, int n, @StringRes int n2) {
    }

    public final void checklist(@NotNull Level level, @StringRes int n) {
    }

    @NotNull
    public final CodeConfig build() {
        return null;
    }
}

