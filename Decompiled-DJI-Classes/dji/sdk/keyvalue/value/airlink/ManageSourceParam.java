/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.ManageSourceAction;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class ManageSourceParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer sourceId;
    ManageSourceAction action;

    public ManageSourceParam() {
    }

    public ManageSourceParam(Integer n, ManageSourceAction manageSourceAction) {
    }

    public static ManageSourceParam fromJson(String string) {
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

    public Integer getSourceId() {
        return null;
    }

    public void setSourceId(Integer n) {
    }

    public ManageSourceAction getAction() {
        return null;
    }

    public void setAction(ManageSourceAction manageSourceAction) {
    }

    public String toString() {
        return null;
    }
}

