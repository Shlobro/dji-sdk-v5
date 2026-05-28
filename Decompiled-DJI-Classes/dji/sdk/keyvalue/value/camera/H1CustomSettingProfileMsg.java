/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class H1CustomSettingProfileMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    List<Integer> name;

    public H1CustomSettingProfileMsg() {
    }

    public H1CustomSettingProfileMsg(Integer n, List<Integer> list) {
    }

    public static H1CustomSettingProfileMsg fromJson(String string) {
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

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public List<Integer> getName() {
        return null;
    }

    public void setName(List<Integer> list) {
    }

    public String toString() {
        return null;
    }
}

