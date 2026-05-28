/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmOverloads
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package dji.upgrade;

import dji.upgrade.component.firmware.UpgradeComponent;
import dji.upgrade.generate.ImageType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2={"Ldji/upgrade/UpgradeInformation;", "", "component", "Ldji/upgrade/component/firmware/UpgradeComponent;", "version", "", "imageType", "Ldji/upgrade/generate/ImageType;", "(Ldji/upgrade/component/firmware/UpgradeComponent;Ljava/lang/String;Ldji/upgrade/generate/ImageType;)V", "getComponent", "()Ldji/upgrade/component/firmware/UpgradeComponent;", "getImageType", "()Ldji/upgrade/generate/ImageType;", "getVersion", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "djisdk_release"})
public final class UpgradeInformation {
    @NotNull
    private final UpgradeComponent component;
    @NotNull
    private final String version;
    @NotNull
    private final ImageType imageType;

    @JvmOverloads
    public UpgradeInformation(@NotNull UpgradeComponent upgradeComponent, @NotNull String string2, @NotNull ImageType imageType) {
    }

    public /* synthetic */ UpgradeInformation(UpgradeComponent upgradeComponent, String string2, ImageType imageType, int n, DefaultConstructorMarker defaultConstructorMarker) {
    }

    @NotNull
    public final UpgradeComponent getComponent() {
        return null;
    }

    @NotNull
    public final String getVersion() {
        return null;
    }

    @NotNull
    public final ImageType getImageType() {
        return null;
    }

    @NotNull
    public final UpgradeComponent component1() {
        return null;
    }

    @NotNull
    public final String component2() {
        return null;
    }

    @NotNull
    public final ImageType component3() {
        return null;
    }

    @NotNull
    public final UpgradeInformation copy(@NotNull UpgradeComponent upgradeComponent, @NotNull String string2, @NotNull ImageType imageType) {
        return null;
    }

    public static /* synthetic */ UpgradeInformation copy$default(UpgradeInformation upgradeInformation, UpgradeComponent upgradeComponent, String string2, ImageType imageType, int n, Object object) {
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

    @JvmOverloads
    public UpgradeInformation(@NotNull UpgradeComponent upgradeComponent, @NotNull String string2) {
    }
}

