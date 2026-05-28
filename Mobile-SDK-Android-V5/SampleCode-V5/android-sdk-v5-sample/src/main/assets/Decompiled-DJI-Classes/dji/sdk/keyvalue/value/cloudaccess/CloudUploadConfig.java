/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class CloudUploadConfig
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer result;
    Integer expire;
    String accessKeyId;
    String accessKeySecret;
    String securityToken;
    String bucket;
    String objectKey;
    String endPoint;
    String localPath;
    String provider;
    String region;

    public CloudUploadConfig() {
    }

    public CloudUploadConfig(Integer n, Integer n2, String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
    }

    public static CloudUploadConfig fromJson(String string) {
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

    public Integer getResult() {
        return null;
    }

    public void setResult(Integer n) {
    }

    public Integer getExpire() {
        return null;
    }

    public void setExpire(Integer n) {
    }

    public String getAccessKeyId() {
        return null;
    }

    public void setAccessKeyId(String string) {
    }

    public String getAccessKeySecret() {
        return null;
    }

    public void setAccessKeySecret(String string) {
    }

    public String getSecurityToken() {
        return null;
    }

    public void setSecurityToken(String string) {
    }

    public String getBucket() {
        return null;
    }

    public void setBucket(String string) {
    }

    public String getObjectKey() {
        return null;
    }

    public void setObjectKey(String string) {
    }

    public String getEndPoint() {
        return null;
    }

    public void setEndPoint(String string) {
    }

    public String getLocalPath() {
        return null;
    }

    public void setLocalPath(String string) {
    }

    public String getProvider() {
        return null;
    }

    public void setProvider(String string) {
    }

    public String getRegion() {
        return null;
    }

    public void setRegion(String string) {
    }

    public String toString() {
        return null;
    }
}

