/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dji.sdk.wpmz.value.mission.Wayline
 *  dji.sdk.wpmz.value.mission.WaylineMission
 */
package com.dji.industry.mission;

import com.dji.industry.pilot.mission.KMZPathWrapper;
import dji.sdk.wpmz.value.mission.Wayline;
import dji.sdk.wpmz.value.mission.WaylineMission;
import dji.v5.utils.common.ContextUtil;
import dji.v5.utils.common.DiskUtil;
import java.util.List;

public class WPMZFileOperator {
    private static final String PATH = DiskUtil.getExternalCacheDirPath(ContextUtil.getContext(), "waypoint/");
    private static final String VERSION = "1.0.0";
    private final String TAG;

    private WPMZFileOperator() {
    }

    public static WaylineMission getWaylineMission(String string) {
        return null;
    }

    public static List<Wayline> getWaylines(String string) {
        return null;
    }

    public static KMZPathWrapper getKMZPathWrapper(String string) {
        return null;
    }
}

