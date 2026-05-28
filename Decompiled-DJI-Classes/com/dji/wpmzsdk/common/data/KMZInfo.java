/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.data;

import com.dji.wpmzsdk.common.data.TemplateParseInfo;
import dji.sdk.wpmz.value.mission.WaylineMissionConfigParseInfo;
import dji.sdk.wpmz.value.mission.WaylineMissionParseInfo;
import dji.sdk.wpmz.value.mission.WaylineWaylinesParseInfo;

public class KMZInfo {
    private WaylineMissionParseInfo waylineMissionParseInfo;
    private WaylineMissionConfigParseInfo waylineMissionConfigParseInfo;
    private TemplateParseInfo waylineTemplatesParseInfo;
    private WaylineWaylinesParseInfo waylineWaylinesParseInfo;

    public WaylineMissionParseInfo getWaylineMissionParseInfo() {
        return this.waylineMissionParseInfo;
    }

    public void setWaylineMissionParseInfo(WaylineMissionParseInfo waylineMissionParseInfo) {
        this.waylineMissionParseInfo = waylineMissionParseInfo;
    }

    public WaylineMissionConfigParseInfo getWaylineMissionConfigParseInfo() {
        return this.waylineMissionConfigParseInfo;
    }

    public void setWaylineMissionConfigParseInfo(WaylineMissionConfigParseInfo waylineMissionConfigParseInfo) {
        this.waylineMissionConfigParseInfo = waylineMissionConfigParseInfo;
    }

    public TemplateParseInfo getWaylineTemplatesParseInfo() {
        return this.waylineTemplatesParseInfo;
    }

    public void setWaylineTemplatesParseInfo(TemplateParseInfo waylineTemplatesParseInfo) {
        this.waylineTemplatesParseInfo = waylineTemplatesParseInfo;
    }

    public WaylineWaylinesParseInfo getWaylineWaylinesParseInfo() {
        return this.waylineWaylinesParseInfo;
    }

    public void setWaylineWaylinesParseInfo(WaylineWaylinesParseInfo waylineWaylinesParseInfo) {
        this.waylineWaylinesParseInfo = waylineWaylinesParseInfo;
    }
}

