/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class UserAccountLoginInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String token;
    String city;
    String userID;
    String email;
    String userPhone;
    String userApiCenterID;

    public UserAccountLoginInfo() {
    }

    public UserAccountLoginInfo(String string, String string2, String string3, String string4, String string5, String string6) {
    }

    public static UserAccountLoginInfo fromJson(String string) {
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

    public String getToken() {
        return null;
    }

    public void setToken(String string) {
    }

    public String getCity() {
        return null;
    }

    public void setCity(String string) {
    }

    public String getUserID() {
        return null;
    }

    public void setUserID(String string) {
    }

    public String getEmail() {
        return null;
    }

    public void setEmail(String string) {
    }

    public String getUserPhone() {
        return null;
    }

    public void setUserPhone(String string) {
    }

    public String getUserApiCenterID() {
        return null;
    }

    public void setUserApiCenterID(String string) {
    }

    public String toString() {
        return null;
    }
}

