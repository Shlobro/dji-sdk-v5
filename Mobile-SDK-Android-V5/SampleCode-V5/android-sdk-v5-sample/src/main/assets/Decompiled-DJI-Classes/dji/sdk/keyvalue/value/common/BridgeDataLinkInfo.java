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
import dji.sdk.keyvalue.value.common.DataLinkType;
import org.json.JSONObject;

public class BridgeDataLinkInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String dataLinkID;
    DataLinkType type;
    Boolean isMainDataLink;
    Boolean isLogicLink;
    String ipLocalSocket;
    Integer port;

    public BridgeDataLinkInfo() {
    }

    public BridgeDataLinkInfo(String string, DataLinkType dataLinkType, Boolean bl, Boolean bl2, String string2, Integer n) {
    }

    public static BridgeDataLinkInfo fromJson(String string) {
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

    public String getDataLinkID() {
        return null;
    }

    public void setDataLinkID(String string) {
    }

    public DataLinkType getType() {
        return null;
    }

    public void setType(DataLinkType dataLinkType) {
    }

    public Boolean getIsMainDataLink() {
        return null;
    }

    public void setIsMainDataLink(Boolean bl) {
    }

    public Boolean getIsLogicLink() {
        return null;
    }

    public void setIsLogicLink(Boolean bl) {
    }

    public String getIpLocalSocket() {
        return null;
    }

    public void setIpLocalSocket(String string) {
    }

    public Integer getPort() {
        return null;
    }

    public void setPort(Integer n) {
    }

    public String toString() {
        return null;
    }
}

