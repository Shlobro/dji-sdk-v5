/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission;

import dji.v5.manager.interfaces.IWaypointMissionManager;
import java.util.List;

public interface IWaypointMissionOperator
extends IWaypointMissionManager {
    public void destroy();

    @Override
    default public List<Integer> getAvailableWaylineIDs(String string) {
        return null;
    }
}

