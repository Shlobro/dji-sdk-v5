/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package com.dji.industry.mission.waypointv2.action;

import androidx.annotation.Nullable;
import com.dji.industry.mission.waypointv2.action.ActionDownloadProgress;
import com.dji.industry.mission.waypointv2.error.DJIWaypointV2Error;

public interface ActionDownloadEvent {
    @Nullable
    public ActionDownloadProgress getProgress();

    @Nullable
    public DJIWaypointV2Error getError();
}

