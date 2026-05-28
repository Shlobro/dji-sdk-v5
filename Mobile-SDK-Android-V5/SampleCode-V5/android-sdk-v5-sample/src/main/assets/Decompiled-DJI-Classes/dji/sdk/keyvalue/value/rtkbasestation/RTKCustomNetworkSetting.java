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
import org.json.JSONObject;

public class RTKCustomNetworkSetting
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String serverAddress;
    Integer port;
    String userName;
    String password;
    String mountPoint;

    public RTKCustomNetworkSetting() {
    }

    public RTKCustomNetworkSetting(String string, Integer n, String string2, String string3, String string4) {
    }

    public static RTKCustomNetworkSetting fromJson(String string) {
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

    public String getServerAddress() {
        return null;
    }

    public void setServerAddress(String string) {
    }

    public Integer getPort() {
        return null;
    }

    public void setPort(Integer n) {
    }

    public String getUserName() {
        return null;
    }

    public void setUserName(String string) {
    }

    public String getPassword() {
        return null;
    }

    public void setPassword(String string) {
    }

    public String getMountPoint() {
        return null;
    }

    public void setMountPoint(String string) {
    }

    public String toString() {
        return null;
    }
}

