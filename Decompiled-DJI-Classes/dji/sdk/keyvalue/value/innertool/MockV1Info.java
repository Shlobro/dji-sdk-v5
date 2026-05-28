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

public class MockV1Info
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer id;
    String name;
    String comment;
    Boolean isAdd;
    Integer cmdSet;
    Integer cmdID;
    Integer senderType;
    Integer senderIndex;
    String rule;

    public MockV1Info() {
    }

    public MockV1Info(Integer n, String string, String string2, Boolean bl, Integer n2, Integer n3, Integer n4, Integer n5, String string3) {
    }

    public static MockV1Info fromJson(String string) {
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

    public Integer getId() {
        return null;
    }

    public void setId(Integer n) {
    }

    public String getName() {
        return null;
    }

    public void setName(String string) {
    }

    public String getComment() {
        return null;
    }

    public void setComment(String string) {
    }

    public Boolean getIsAdd() {
        return null;
    }

    public void setIsAdd(Boolean bl) {
    }

    public Integer getCmdSet() {
        return null;
    }

    public void setCmdSet(Integer n) {
    }

    public Integer getCmdID() {
        return null;
    }

    public void setCmdID(Integer n) {
    }

    public Integer getSenderType() {
        return null;
    }

    public void setSenderType(Integer n) {
    }

    public Integer getSenderIndex() {
        return null;
    }

    public void setSenderIndex(Integer n) {
    }

    public String getRule() {
        return null;
    }

    public void setRule(String string) {
    }

    public String toString() {
        return null;
    }
}

