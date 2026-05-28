/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.dji.industry.pilot.data.cache.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b\u00a8\u0006!"}, d2={"Lcom/dji/industry/pilot/data/cache/model/MappingCameraModelGreenDao;", "", "()V", "focalLength", "", "getFocalLength", "()F", "setFocalLength", "(F)V", "imageHeight", "", "getImageHeight", "()I", "setImageHeight", "(I)V", "imageWidth", "getImageWidth", "setImageWidth", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "sensorHeight", "getSensorHeight", "setSensorHeight", "sensorWidth", "getSensorWidth", "setSensorWidth", "shotInterval", "getShotInterval", "setShotInterval", "wpmzsdk_release"})
public final class MappingCameraModelGreenDao {
    @NotNull
    private String name = "";
    private float focalLength;
    private float sensorWidth;
    private float sensorHeight;
    private int imageWidth;
    private int imageHeight;
    private float shotInterval;

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setName(@NotNull String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        this.name = string;
    }

    public final float getFocalLength() {
        return this.focalLength;
    }

    public final void setFocalLength(float f) {
        this.focalLength = f;
    }

    public final float getSensorWidth() {
        return this.sensorWidth;
    }

    public final void setSensorWidth(float f) {
        this.sensorWidth = f;
    }

    public final float getSensorHeight() {
        return this.sensorHeight;
    }

    public final void setSensorHeight(float f) {
        this.sensorHeight = f;
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }

    public final void setImageWidth(int n) {
        this.imageWidth = n;
    }

    public final int getImageHeight() {
        return this.imageHeight;
    }

    public final void setImageHeight(int n) {
        this.imageHeight = n;
    }

    public final float getShotInterval() {
        return this.shotInterval;
    }

    public final void setShotInterval(float f) {
        this.shotInterval = f;
    }
}

