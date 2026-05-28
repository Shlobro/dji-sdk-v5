/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.AuthenticationType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WlmDongleApnInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer apnProtocol;
    String apnName;
    String userName;
    String userPassword;
    AuthenticationType authentication;

    public WlmDongleApnInfo() {
    }

    public WlmDongleApnInfo(Integer n, String string, String string2, String string3, AuthenticationType authenticationType) {
    }

    public static WlmDongleApnInfo fromJson(String string) {
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

    public Integer getApnProtocol() {
        return null;
    }

    public void setApnProtocol(Integer n) {
    }

    public String getApnName() {
        return null;
    }

    public void setApnName(String string) {
    }

    public String getUserName() {
        return null;
    }

    public void setUserName(String string) {
    }

    public String getUserPassword() {
        return null;
    }

    public void setUserPassword(String string) {
    }

    public AuthenticationType getAuthentication() {
        return null;
    }

    public void setAuthentication(AuthenticationType authenticationType) {
    }

    public String toString() {
        return null;
    }
}

