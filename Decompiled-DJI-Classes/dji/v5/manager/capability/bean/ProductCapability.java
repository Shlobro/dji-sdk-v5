/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package dji.v5.manager.capability.bean;

import com.google.gson.annotations.SerializedName;
import dji.v5.common.KeepProguard;
import dji.v5.manager.capability.bean.CapabilityIndexBean;
import dji.v5.manager.capability.bean.ManagerBean;
import java.util.List;

public class ProductCapability
implements KeepProguard {
    @SerializedName(value="supportedMSDKVersion")
    private String supportedMSDKVersion;
    @SerializedName(value="productType")
    private String productType;
    @SerializedName(value="supportedMinFirmwareVersion")
    private String supportedMinFirmwareVersion;
    @SerializedName(value="airLink")
    private List<CapabilityIndexBean> airLink;
    @SerializedName(value="camera")
    private List<CapabilityIndexBean> camera;
    @SerializedName(value="gimbal")
    private List<CapabilityIndexBean> gimbal;
    @SerializedName(value="remoteController")
    private List<CapabilityIndexBean> remoteController;
    @SerializedName(value="flightController")
    private List<CapabilityIndexBean> flightController;
    @SerializedName(value="battery")
    private List<CapabilityIndexBean> battery;
    @SerializedName(value="simulator")
    private ManagerBean simulator;
    @SerializedName(value="mediaDataCenter")
    private ManagerBean mediaDataCenter;
    @SerializedName(value="videoStreamManager")
    private ManagerBean videoStreamManager;
    @SerializedName(value="waypointMissionManager")
    private ManagerBean waypointMissionManager;
    @SerializedName(value="RTKCenter")
    private ManagerBean rTKCenter;
    @SerializedName(value="networkRTKManager")
    private ManagerBean networkRTKManager;
    @SerializedName(value="RTKStationManager")
    private ManagerBean rTKStationManager;
    @SerializedName(value="virtualStick")
    private ManagerBean virtualStick;
    @SerializedName(value="LDM")
    private ManagerBean ldm;
    @SerializedName(value="flightRecord")
    private ManagerBean flightRecord;
    @SerializedName(value="megaphone")
    private ManagerBean megaphone;
    @SerializedName(value="deviceStatus")
    private ManagerBean deviceStatus;
    @SerializedName(value="deviceHealth")
    private ManagerBean deviceHealth;

    public String getSupportedMSDKVersion() {
        return null;
    }

    public void setSupportedMSDKVersion(String string2) {
    }

    public String getProductType() {
        return null;
    }

    public void setProductType(String string2) {
    }

    public String getSupportedMinFirmwareVersion() {
        return null;
    }

    public void setSupportedMinFirmwareVersion(String string2) {
    }

    public List<CapabilityIndexBean> getAirLink() {
        return null;
    }

    public void setAirLink(List<CapabilityIndexBean> list) {
    }

    public List<CapabilityIndexBean> getCamera() {
        return null;
    }

    public void setCamera(List<CapabilityIndexBean> list) {
    }

    public List<CapabilityIndexBean> getGimbal() {
        return null;
    }

    public void setGimbal(List<CapabilityIndexBean> list) {
    }

    public List<CapabilityIndexBean> getRemoteController() {
        return null;
    }

    public void setRemoteController(List<CapabilityIndexBean> list) {
    }

    public List<CapabilityIndexBean> getFlightController() {
        return null;
    }

    public void setFlightController(List<CapabilityIndexBean> list) {
    }

    public List<CapabilityIndexBean> getBattery() {
        return null;
    }

    public void setBattery(List<CapabilityIndexBean> list) {
    }

    public ManagerBean getSimulator() {
        return null;
    }

    public void setSimulator(ManagerBean managerBean) {
    }

    public ManagerBean getMediaDataCenter() {
        return null;
    }

    public void setMediaDataCenter(ManagerBean managerBean) {
    }

    public ManagerBean getVideoStreamManager() {
        return null;
    }

    public void setVideoStreamManager(ManagerBean managerBean) {
    }

    public ManagerBean getWaypointMissionManager() {
        return null;
    }

    public void setWaypointMissionManager(ManagerBean managerBean) {
    }

    public ManagerBean getRTKCenter() {
        return null;
    }

    public void setRTKCenter(ManagerBean managerBean) {
    }

    public ManagerBean getNetworkRTKManager() {
        return null;
    }

    public void setNetworkRTKManager(ManagerBean managerBean) {
    }

    public ManagerBean getRTKStationManager() {
        return null;
    }

    public void setRTKStationManager(ManagerBean managerBean) {
    }

    public ManagerBean getVirtualStick() {
        return null;
    }

    public void setVirtualStick(ManagerBean managerBean) {
    }

    public ManagerBean getLdm() {
        return null;
    }

    public void setLdm(ManagerBean managerBean) {
    }

    public ManagerBean getFlightRecord() {
        return null;
    }

    public void setFlightRecord(ManagerBean managerBean) {
    }

    public ManagerBean getMegaphone() {
        return null;
    }

    public void setMegaphone(ManagerBean managerBean) {
    }

    public ManagerBean getDeviceStatus() {
        return null;
    }

    public void setDeviceStatus(ManagerBean managerBean) {
    }

    public ManagerBean getDeviceHealth() {
        return null;
    }

    public void setDeviceHealth(ManagerBean managerBean) {
    }
}

