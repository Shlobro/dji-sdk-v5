/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.Nullable
 */
package com.dji.industry.pilot.data.cache.model;

import com.dji.wpmzsdk.common.utils.kml.model.WaypointActionType;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010'\u001a\u00020(R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001a\u00a8\u0006)"}, d2={"Lcom/dji/industry/pilot/data/cache/model/WaypointActionModelGreenDao;", "", "()V", "accuracy", "", "getAccuracy", "()I", "setAccuracy", "(I)V", "actionType", "Lcom/dji/wpmzsdk/common/utils/kml/model/WaypointActionType;", "getActionType", "()Lcom/dji/wpmzsdk/common/utils/kml/model/WaypointActionType;", "setActionType", "(Lcom/dji/wpmzsdk/common/utils/kml/model/WaypointActionType;)V", "cameraIndex", "getCameraIndex", "setCameraIndex", "index", "getIndex", "setIndex", "mediaPathName", "", "getMediaPathName", "()Ljava/lang/String;", "setMediaPathName", "(Ljava/lang/String;)V", "param", "getParam", "setParam", "payloadIndex", "getPayloadIndex", "setPayloadIndex", "payloadType", "getPayloadType", "setPayloadType", "preciseInfoName", "getPreciseInfoName", "setPreciseInfoName", "getRealParam", "", "wpmzsdk_release"})
public final class WaypointActionModelGreenDao {
    private int index;
    @Nullable
    private WaypointActionType actionType;
    private int param;
    private int accuracy;
    private int cameraIndex;
    private int payloadType;
    private int payloadIndex;
    @Nullable
    private String preciseInfoName;
    @Nullable
    private String mediaPathName;

    public final int getIndex() {
        return this.index;
    }

    public final void setIndex(int n) {
        this.index = n;
    }

    @Nullable
    public final WaypointActionType getActionType() {
        return this.actionType;
    }

    public final void setActionType(@Nullable WaypointActionType waypointActionType) {
        this.actionType = waypointActionType;
    }

    public final int getParam() {
        return this.param;
    }

    public final void setParam(int n) {
        this.param = n;
    }

    public final int getAccuracy() {
        return this.accuracy;
    }

    public final void setAccuracy(int n) {
        this.accuracy = n;
    }

    public final int getCameraIndex() {
        return this.cameraIndex;
    }

    public final void setCameraIndex(int n) {
        this.cameraIndex = n;
    }

    public final int getPayloadType() {
        return this.payloadType;
    }

    public final void setPayloadType(int n) {
        this.payloadType = n;
    }

    public final int getPayloadIndex() {
        return this.payloadIndex;
    }

    public final void setPayloadIndex(int n) {
        this.payloadIndex = n;
    }

    @Nullable
    public final String getPreciseInfoName() {
        return this.preciseInfoName;
    }

    public final void setPreciseInfoName(@Nullable String string) {
        this.preciseInfoName = string;
    }

    @Nullable
    public final String getMediaPathName() {
        return this.mediaPathName;
    }

    public final void setMediaPathName(@Nullable String string) {
        this.mediaPathName = string;
    }

    public final float getRealParam() {
        return this.accuracy != 0 ? (float)((double)this.param / Math.pow(10.0, this.accuracy)) : (float)this.param;
    }
}

