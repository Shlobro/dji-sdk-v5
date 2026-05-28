/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.manager.intelligent;

import androidx.annotation.Keep;
import dji.v5.manager.intelligent.MissionType;
import java.util.List;

@Keep
public class IntelligentFlightInfo {
    private List<MissionType> supportedMissions;
    private MissionType runningMission;
    private boolean isAutoSensingEnabled;

    public List<MissionType> getSupportedMissions() {
        return null;
    }

    public void setSupportedMissions(List<MissionType> list) {
    }

    public MissionType getRunningMission() {
        return null;
    }

    public void setRunningMission(MissionType missionType) {
    }

    public boolean isAutoSensingEnabled() {
        return false;
    }

    public void setAutoSensingEnabled(boolean bl) {
    }

    public String toString() {
        return null;
    }
}

