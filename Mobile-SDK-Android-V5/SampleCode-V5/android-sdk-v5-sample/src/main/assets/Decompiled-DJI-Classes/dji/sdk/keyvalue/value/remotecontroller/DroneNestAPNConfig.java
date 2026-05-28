/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.APNAuthenticationType;
import dji.sdk.keyvalue.value.common.APNProtocol;
import org.json.JSONObject;

public class DroneNestAPNConfig
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String name;
    APNProtocol protocol;
    String data;
    String userName;
    String password;
    APNAuthenticationType authenticationType;

    public DroneNestAPNConfig() {
    }

    public DroneNestAPNConfig(String string, APNProtocol aPNProtocol, String string2, String string3, String string4, APNAuthenticationType aPNAuthenticationType) {
    }

    public static DroneNestAPNConfig fromJson(String string) {
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

    public String getName() {
        return null;
    }

    public void setName(String string) {
    }

    public APNProtocol getProtocol() {
        return null;
    }

    public void setProtocol(APNProtocol aPNProtocol) {
    }

    public String getData() {
        return null;
    }

    public void setData(String string) {
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

    public APNAuthenticationType getAuthenticationType() {
        return null;
    }

    public void setAuthenticationType(APNAuthenticationType aPNAuthenticationType) {
    }

    public String toString() {
        return null;
    }
}

