/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package com.dji.industry.mission.waypointv2.action;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dji.industry.mission.waypointv2.action.ActionState;
import com.dji.industry.mission.waypointv2.action.ActionUploadProgress;
import com.dji.industry.mission.waypointv2.error.DJIWaypointV2Error;

public interface ActionUploadEvent {
    @Nullable
    public ActionState getPreviousState();

    @NonNull
    public ActionState getCurrentState();

    @Nullable
    public ActionUploadProgress getProgress();

    @Nullable
    public DJIWaypointV2Error getError();
}

