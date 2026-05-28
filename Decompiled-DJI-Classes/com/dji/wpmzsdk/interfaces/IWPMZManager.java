/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.interfaces;

import com.dji.wpmzsdk.common.data.HeightMode;
import com.dji.wpmzsdk.common.data.KMZInfo;
import com.dji.wpmzsdk.common.data.Template;
import dji.sdk.wpmz.value.mission.Wayline;
import dji.sdk.wpmz.value.mission.WaylineCheckErrorMsg;
import dji.sdk.wpmz.value.mission.WaylineMission;
import dji.sdk.wpmz.value.mission.WaylineMissionConfig;

public interface IWPMZManager {
    public KMZInfo getKMZInfo(String var1);

    public void generateKMZFile(String var1, WaylineMission var2, WaylineMissionConfig var3, Template var4);

    public void generateKMZFile(String var1, WaylineMission var2, WaylineMissionConfig var3, Wayline var4);

    public WaylineCheckErrorMsg checkValidation(String var1);

    public boolean transKMLtoKMZ(String var1, String var2);

    public boolean transKMLtoKMZ(String var1, String var2, HeightMode var3);
}

