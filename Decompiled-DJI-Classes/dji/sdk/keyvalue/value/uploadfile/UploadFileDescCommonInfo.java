/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.uploadfile;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class UploadFileDescCommonInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String appType;
    String appVersion;
    String build;
    String country;
    String dataTimeTz;
    Long dataTimestamp;
    String key;
    String osType;
    String osVersion;
    String phoneModel;
    String productType;
    String userToken;
    String cloudControlSecretId;
    String cloudControlSecretKey;

    public UploadFileDescCommonInfo() {
    }

    public UploadFileDescCommonInfo(String string, String string2, String string3, String string4, String string5, Long l2, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13) {
    }

    public static UploadFileDescCommonInfo fromJson(String string) {
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

    public String getAppType() {
        return null;
    }

    public void setAppType(String string) {
    }

    public String getAppVersion() {
        return null;
    }

    public void setAppVersion(String string) {
    }

    public String getBuild() {
        return null;
    }

    public void setBuild(String string) {
    }

    public String getCountry() {
        return null;
    }

    public void setCountry(String string) {
    }

    public String getDataTimeTz() {
        return null;
    }

    public void setDataTimeTz(String string) {
    }

    public Long getDataTimestamp() {
        return null;
    }

    public void setDataTimestamp(Long l2) {
    }

    public String getKey() {
        return null;
    }

    public void setKey(String string) {
    }

    public String getOsType() {
        return null;
    }

    public void setOsType(String string) {
    }

    public String getOsVersion() {
        return null;
    }

    public void setOsVersion(String string) {
    }

    public String getPhoneModel() {
        return null;
    }

    public void setPhoneModel(String string) {
    }

    public String getProductType() {
        return null;
    }

    public void setProductType(String string) {
    }

    public String getUserToken() {
        return null;
    }

    public void setUserToken(String string) {
    }

    public String getCloudControlSecretId() {
        return null;
    }

    public void setCloudControlSecretId(String string) {
    }

    public String getCloudControlSecretKey() {
        return null;
    }

    public void setCloudControlSecretKey(String string) {
    }

    public String toString() {
        return null;
    }
}

