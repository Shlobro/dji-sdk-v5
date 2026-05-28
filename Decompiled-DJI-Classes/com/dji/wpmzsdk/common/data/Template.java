/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.data;

import dji.sdk.wpmz.value.mission.WaylineCoordinateParam;
import dji.sdk.wpmz.value.mission.WaylinePayloadParam;
import dji.sdk.wpmz.value.mission.WaylineTemplateWaypointInfo;
import java.util.List;

public class Template {
    private Integer templateId;
    private WaylineCoordinateParam coordinateParam;
    private Double transitionalSpeed;
    private Boolean useGlobalTransitionalSpeed;
    private Double autoFlightSpeed;
    private List<WaylinePayloadParam> payloadParam;
    private WaylineTemplateWaypointInfo waypointInfo;

    public Integer getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public WaylineCoordinateParam getCoordinateParam() {
        return this.coordinateParam;
    }

    public void setCoordinateParam(WaylineCoordinateParam coordinateParam) {
        this.coordinateParam = coordinateParam;
    }

    public Double getTransitionalSpeed() {
        return this.transitionalSpeed;
    }

    public void setTransitionalSpeed(Double transitionalSpeed) {
        this.transitionalSpeed = transitionalSpeed;
    }

    public Boolean getUseGlobalTransitionalSpeed() {
        return this.useGlobalTransitionalSpeed;
    }

    public void setUseGlobalTransitionalSpeed(Boolean useGlobalTransitionalSpeed) {
        this.useGlobalTransitionalSpeed = useGlobalTransitionalSpeed;
    }

    public Double getAutoFlightSpeed() {
        return this.autoFlightSpeed;
    }

    public void setAutoFlightSpeed(Double autoFlightSpeed) {
        this.autoFlightSpeed = autoFlightSpeed;
    }

    public List<WaylinePayloadParam> getPayloadParam() {
        return this.payloadParam;
    }

    public void setPayloadParam(List<WaylinePayloadParam> payloadParam) {
        this.payloadParam = payloadParam;
    }

    public WaylineTemplateWaypointInfo getWaypointInfo() {
        return this.waypointInfo;
    }

    public void setWaypointInfo(WaylineTemplateWaypointInfo waypointInfo) {
        this.waypointInfo = waypointInfo;
    }
}

