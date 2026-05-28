/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class ProductFirmwareSupportInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isApasSupported;
    Boolean isSmartEyeSupported;
    Boolean isMasterShotSupported;
    Boolean isQuickShotSupported;
    Boolean isVideoHyperlapseSupported;
    Boolean isPhotoPanoSupported;
    Boolean isTripodModeExpSupported;
    Boolean isDongleSubcribeSupported;
    Boolean isLteHybridSupported;
    Boolean isWiFiFastConnectSupported;
    Boolean isFlightControlNewParamSupported;

    public ProductFirmwareSupportInfo() {
    }

    public ProductFirmwareSupportInfo(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7, Boolean bl8, Boolean bl9, Boolean bl10, Boolean bl11) {
    }

    public static ProductFirmwareSupportInfo fromJson(String string) {
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

    public Boolean getIsApasSupported() {
        return null;
    }

    public void setIsApasSupported(Boolean bl) {
    }

    public Boolean getIsSmartEyeSupported() {
        return null;
    }

    public void setIsSmartEyeSupported(Boolean bl) {
    }

    public Boolean getIsMasterShotSupported() {
        return null;
    }

    public void setIsMasterShotSupported(Boolean bl) {
    }

    public Boolean getIsQuickShotSupported() {
        return null;
    }

    public void setIsQuickShotSupported(Boolean bl) {
    }

    public Boolean getIsVideoHyperlapseSupported() {
        return null;
    }

    public void setIsVideoHyperlapseSupported(Boolean bl) {
    }

    public Boolean getIsPhotoPanoSupported() {
        return null;
    }

    public void setIsPhotoPanoSupported(Boolean bl) {
    }

    public Boolean getIsTripodModeExpSupported() {
        return null;
    }

    public void setIsTripodModeExpSupported(Boolean bl) {
    }

    public Boolean getIsDongleSubcribeSupported() {
        return null;
    }

    public void setIsDongleSubcribeSupported(Boolean bl) {
    }

    public Boolean getIsLteHybridSupported() {
        return null;
    }

    public void setIsLteHybridSupported(Boolean bl) {
    }

    public Boolean getIsWiFiFastConnectSupported() {
        return null;
    }

    public void setIsWiFiFastConnectSupported(Boolean bl) {
    }

    public Boolean getIsFlightControlNewParamSupported() {
        return null;
    }

    public void setIsFlightControlNewParamSupported(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

