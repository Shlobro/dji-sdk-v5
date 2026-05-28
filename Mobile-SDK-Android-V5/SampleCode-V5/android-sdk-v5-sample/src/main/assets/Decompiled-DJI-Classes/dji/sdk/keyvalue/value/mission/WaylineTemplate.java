/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.mission.WaylineActionGroup;
import dji.sdk.keyvalue.value.mission.WaylineCoordinateParam;
import dji.sdk.keyvalue.value.mission.WaylineDroneInfo;
import dji.sdk.keyvalue.value.mission.WaylinePayloadInfo;
import dji.sdk.keyvalue.value.mission.WaylinePayloadParam;
import dji.sdk.keyvalue.value.mission.WaylineTemplateMapping2DInfo;
import dji.sdk.keyvalue.value.mission.WaylineTemplateMapping3DInfo;
import dji.sdk.keyvalue.value.mission.WaylineTemplateMappingStripInfo;
import dji.sdk.keyvalue.value.mission.WaylineTemplateType;
import dji.sdk.keyvalue.value.mission.WaylineWaypoint;
import dji.sdk.keyvalue.value.mission.WaylineWaypointTurnMode;
import dji.sdk.keyvalue.value.mission.WaylineWaypointYawMode;
import java.util.List;
import org.json.JSONObject;

public class WaylineTemplate
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer templateId;
    WaylineTemplateType templateType;
    WaylineCoordinateParam coordinateParam;
    List<WaylinePayloadParam> payloadParam;
    WaylineDroneInfo droneInfo;
    List<WaylinePayloadInfo> payloadInfo;
    Double globalAutoFlightSpeed;
    WaylineWaypointYawMode globalYawMode;
    WaylineWaypointTurnMode globalTurnMode;
    Double relativeDistance;
    Boolean useGlobalTransitionalSpeed;
    Double transitionalSpeed;
    List<WaylineWaypoint> waypoints;
    WaylineTemplateMapping2DInfo mapping2DInfo;
    WaylineTemplateMapping3DInfo mapping3DInfo;
    WaylineTemplateMappingStripInfo mappingStripInfo;
    List<WaylineActionGroup> actionGroups;

    public WaylineTemplate() {
    }

    public WaylineTemplate(Integer n, WaylineTemplateType waylineTemplateType, WaylineCoordinateParam waylineCoordinateParam, List<WaylinePayloadParam> list, WaylineDroneInfo waylineDroneInfo, List<WaylinePayloadInfo> list2, Double d2, WaylineWaypointYawMode waylineWaypointYawMode, WaylineWaypointTurnMode waylineWaypointTurnMode, Double d3, Boolean bl, Double d4, List<WaylineWaypoint> list3, WaylineTemplateMapping2DInfo waylineTemplateMapping2DInfo, WaylineTemplateMapping3DInfo waylineTemplateMapping3DInfo, WaylineTemplateMappingStripInfo waylineTemplateMappingStripInfo, List<WaylineActionGroup> list4) {
    }

    public static WaylineTemplate fromJson(String string) {
        return null;
    }

    @Override
    public JSONObject toJson() {
        return null;
    }

    @Override
    public int serializedLength() {
        return 0;
    }

    @Override
    public int toBytes(byte[] byArray, int n) {
        return 0;
    }

    @Override
    public byte[] toBytes() {
        return null;
    }

    @Override
    public int fromBytes(byte[] byArray, int n) {
        return 0;
    }

    public Integer getTemplateId() {
        return null;
    }

    public void setTemplateId(Integer n) {
    }

    public WaylineTemplateType getTemplateType() {
        return null;
    }

    public void setTemplateType(WaylineTemplateType waylineTemplateType) {
    }

    public WaylineCoordinateParam getCoordinateParam() {
        return null;
    }

    public void setCoordinateParam(WaylineCoordinateParam waylineCoordinateParam) {
    }

    public List<WaylinePayloadParam> getPayloadParam() {
        return null;
    }

    public void setPayloadParam(List<WaylinePayloadParam> list) {
    }

    public WaylineDroneInfo getDroneInfo() {
        return null;
    }

    public void setDroneInfo(WaylineDroneInfo waylineDroneInfo) {
    }

    public List<WaylinePayloadInfo> getPayloadInfo() {
        return null;
    }

    public void setPayloadInfo(List<WaylinePayloadInfo> list) {
    }

    public Double getGlobalAutoFlightSpeed() {
        return null;
    }

    public void setGlobalAutoFlightSpeed(Double d2) {
    }

    public WaylineWaypointYawMode getGlobalYawMode() {
        return null;
    }

    public void setGlobalYawMode(WaylineWaypointYawMode waylineWaypointYawMode) {
    }

    public WaylineWaypointTurnMode getGlobalTurnMode() {
        return null;
    }

    public void setGlobalTurnMode(WaylineWaypointTurnMode waylineWaypointTurnMode) {
    }

    public Double getRelativeDistance() {
        return null;
    }

    public void setRelativeDistance(Double d2) {
    }

    public Boolean getUseGlobalTransitionalSpeed() {
        return null;
    }

    public void setUseGlobalTransitionalSpeed(Boolean bl) {
    }

    public Double getTransitionalSpeed() {
        return null;
    }

    public void setTransitionalSpeed(Double d2) {
    }

    public List<WaylineWaypoint> getWaypoints() {
        return null;
    }

    public void setWaypoints(List<WaylineWaypoint> list) {
    }

    public WaylineTemplateMapping2DInfo getMapping2DInfo() {
        return null;
    }

    public void setMapping2DInfo(WaylineTemplateMapping2DInfo waylineTemplateMapping2DInfo) {
    }

    public WaylineTemplateMapping3DInfo getMapping3DInfo() {
        return null;
    }

    public void setMapping3DInfo(WaylineTemplateMapping3DInfo waylineTemplateMapping3DInfo) {
    }

    public WaylineTemplateMappingStripInfo getMappingStripInfo() {
        return null;
    }

    public void setMappingStripInfo(WaylineTemplateMappingStripInfo waylineTemplateMappingStripInfo) {
    }

    public List<WaylineActionGroup> getActionGroups() {
        return null;
    }

    public void setActionGroups(List<WaylineActionGroup> list) {
    }

    public String toString() {
        return null;
    }
}

