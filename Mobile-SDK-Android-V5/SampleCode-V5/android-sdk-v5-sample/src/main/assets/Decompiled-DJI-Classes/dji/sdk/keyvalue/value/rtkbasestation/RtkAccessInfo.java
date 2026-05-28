/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.rtkbasestation.RtkAccessPortInfo;
import dji.sdk.keyvalue.value.rtkbasestation.RtkAccountType;
import java.util.List;
import org.json.JSONObject;

public class RtkAccessInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RtkAccountType type;
    String account;
    String password;
    String deviceId;
    String host;
    String mountPoint;
    String encSn;
    String provider;
    List<RtkAccessPortInfo> ports;
    Integer version;

    public RtkAccessInfo() {
    }

    public RtkAccessInfo(RtkAccountType rtkAccountType, String string, String string2, String string3, String string4, String string5, String string6, String string7, List<RtkAccessPortInfo> list, Integer n) {
    }

    public static RtkAccessInfo fromJson(String string) {
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

    public RtkAccountType getType() {
        return null;
    }

    public void setType(RtkAccountType rtkAccountType) {
    }

    public String getAccount() {
        return null;
    }

    public void setAccount(String string) {
    }

    public String getPassword() {
        return null;
    }

    public void setPassword(String string) {
    }

    public String getDeviceId() {
        return null;
    }

    public void setDeviceId(String string) {
    }

    public String getHost() {
        return null;
    }

    public void setHost(String string) {
    }

    public String getMountPoint() {
        return null;
    }

    public void setMountPoint(String string) {
    }

    public String getEncSn() {
        return null;
    }

    public void setEncSn(String string) {
    }

    public String getProvider() {
        return null;
    }

    public void setProvider(String string) {
    }

    public List<RtkAccessPortInfo> getPorts() {
        return null;
    }

    public void setPorts(List<RtkAccessPortInfo> list) {
    }

    public Integer getVersion() {
        return null;
    }

    public void setVersion(Integer n) {
    }

    public String toString() {
        return null;
    }
}

