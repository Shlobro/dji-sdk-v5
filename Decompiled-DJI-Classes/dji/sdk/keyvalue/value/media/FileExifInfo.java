/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.media.PhysicalPathInfo;
import dji.sdk.keyvalue.value.media.ProxyInfo;
import java.util.List;
import org.json.JSONObject;

public class FileExifInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean focalLength35mmFormatEnabled;
    Boolean lightSourceEnabled;
    Boolean meteringModeEnabled;
    Boolean exposureCompensationEnabled;
    Boolean isoEnabled;
    Boolean exposureProgramEnabled;
    Boolean fNumberEnabled;
    Boolean exposureTimeEnabled;
    Integer exposureProgram;
    Integer iso;
    Integer meteringMode;
    Integer lightSource;
    Integer focalLength35mmFormat;
    Integer shutterNumerator;
    Integer shutterDenominator;
    String shutterSpeedText;
    String apertureText;
    String exposureCompensationText;
    Boolean hasProxy;
    ProxyInfo proxyInfo;
    List<PhysicalPathInfo> physicalPathInfo;

    public FileExifInfo() {
    }

    public FileExifInfo(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7, Boolean bl8, Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, Integer n7, String string, String string2, String string3, Boolean bl9, ProxyInfo proxyInfo, List<PhysicalPathInfo> list) {
    }

    public static FileExifInfo fromJson(String string) {
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

    public Boolean getFocalLength35mmFormatEnabled() {
        return null;
    }

    public void setFocalLength35mmFormatEnabled(Boolean bl) {
    }

    public Boolean getLightSourceEnabled() {
        return null;
    }

    public void setLightSourceEnabled(Boolean bl) {
    }

    public Boolean getMeteringModeEnabled() {
        return null;
    }

    public void setMeteringModeEnabled(Boolean bl) {
    }

    public Boolean getExposureCompensationEnabled() {
        return null;
    }

    public void setExposureCompensationEnabled(Boolean bl) {
    }

    public Boolean getIsoEnabled() {
        return null;
    }

    public void setIsoEnabled(Boolean bl) {
    }

    public Boolean getExposureProgramEnabled() {
        return null;
    }

    public void setExposureProgramEnabled(Boolean bl) {
    }

    public Boolean getFNumberEnabled() {
        return null;
    }

    public void setFNumberEnabled(Boolean bl) {
    }

    public Boolean getExposureTimeEnabled() {
        return null;
    }

    public void setExposureTimeEnabled(Boolean bl) {
    }

    public Integer getExposureProgram() {
        return null;
    }

    public void setExposureProgram(Integer n) {
    }

    public Integer getIso() {
        return null;
    }

    public void setIso(Integer n) {
    }

    public Integer getMeteringMode() {
        return null;
    }

    public void setMeteringMode(Integer n) {
    }

    public Integer getLightSource() {
        return null;
    }

    public void setLightSource(Integer n) {
    }

    public Integer getFocalLength35mmFormat() {
        return null;
    }

    public void setFocalLength35mmFormat(Integer n) {
    }

    public Integer getShutterNumerator() {
        return null;
    }

    public void setShutterNumerator(Integer n) {
    }

    public Integer getShutterDenominator() {
        return null;
    }

    public void setShutterDenominator(Integer n) {
    }

    public String getShutterSpeedText() {
        return null;
    }

    public void setShutterSpeedText(String string) {
    }

    public String getApertureText() {
        return null;
    }

    public void setApertureText(String string) {
    }

    public String getExposureCompensationText() {
        return null;
    }

    public void setExposureCompensationText(String string) {
    }

    public Boolean getHasProxy() {
        return null;
    }

    public void setHasProxy(Boolean bl) {
    }

    public ProxyInfo getProxyInfo() {
        return null;
    }

    public void setProxyInfo(ProxyInfo proxyInfo) {
    }

    public List<PhysicalPathInfo> getPhysicalPathInfo() {
        return null;
    }

    public void setPhysicalPathInfo(List<PhysicalPathInfo> list) {
    }

    public String toString() {
        return null;
    }
}

