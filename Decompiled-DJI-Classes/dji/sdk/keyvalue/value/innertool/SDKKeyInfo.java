/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.innertool;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class SDKKeyInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String component;
    String name;
    Boolean canGet;
    Boolean canSet;
    Boolean canAction;
    Boolean canListen;
    String comment;

    public SDKKeyInfo() {
    }

    public SDKKeyInfo(String string, String string2, Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, String string3) {
    }

    public static SDKKeyInfo fromJson(String string) {
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

    public String getComponent() {
        return null;
    }

    public void setComponent(String string) {
    }

    public String getName() {
        return null;
    }

    public void setName(String string) {
    }

    public Boolean getCanGet() {
        return null;
    }

    public void setCanGet(Boolean bl) {
    }

    public Boolean getCanSet() {
        return null;
    }

    public void setCanSet(Boolean bl) {
    }

    public Boolean getCanAction() {
        return null;
    }

    public void setCanAction(Boolean bl) {
    }

    public Boolean getCanListen() {
        return null;
    }

    public void setCanListen(Boolean bl) {
    }

    public String getComment() {
        return null;
    }

    public void setComment(String string) {
    }

    public String toString() {
        return null;
    }
}

