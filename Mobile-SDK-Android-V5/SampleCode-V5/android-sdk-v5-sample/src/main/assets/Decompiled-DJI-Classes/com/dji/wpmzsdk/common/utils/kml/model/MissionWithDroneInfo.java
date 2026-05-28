/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import com.dji.wpmzsdk.common.utils.kml.mission.MissionInfoModel;
import java.util.List;

public class MissionWithDroneInfo {
    private MissionInfoModel missionInfo;
    private String droneName;
    private List<String> droneCameras;

    public MissionInfoModel getMissionInfo() {
        return this.missionInfo;
    }

    public void setMissionInfo(MissionInfoModel missionInfo) {
        this.missionInfo = missionInfo;
    }

    public String getDroneName() {
        return this.droneName;
    }

    public void setDroneName(String droneName) {
        this.droneName = droneName;
    }

    public List<String> getDroneCameras() {
        return this.droneCameras;
    }

    public void setDroneCameras(List<String> droneCameras) {
        this.droneCameras = droneCameras;
    }
}

