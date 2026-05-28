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
import java.util.List;
import org.json.JSONObject;

public class V1Filter
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<Integer> cmdSets;
    List<Integer> cmdIDs;
    List<Integer> sendTypes;
    List<Integer> sendIndexs;
    Boolean isInput;
    Boolean isValid;

    public V1Filter() {
    }

    public V1Filter(List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, Boolean bl, Boolean bl2) {
    }

    public static V1Filter fromJson(String string) {
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

    public List<Integer> getCmdSets() {
        return null;
    }

    public void setCmdSets(List<Integer> list) {
    }

    public List<Integer> getCmdIDs() {
        return null;
    }

    public void setCmdIDs(List<Integer> list) {
    }

    public List<Integer> getSendTypes() {
        return null;
    }

    public void setSendTypes(List<Integer> list) {
    }

    public List<Integer> getSendIndexs() {
        return null;
    }

    public void setSendIndexs(List<Integer> list) {
    }

    public Boolean getIsInput() {
        return null;
    }

    public void setIsInput(Boolean bl) {
    }

    public Boolean getIsValid() {
        return null;
    }

    public void setIsValid(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

