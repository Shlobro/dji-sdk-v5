/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.accessory;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class SpeakerAudioDeleteFilesInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<Integer> indexs;
    Boolean isDeleteAll;

    public SpeakerAudioDeleteFilesInfo() {
    }

    public SpeakerAudioDeleteFilesInfo(List<Integer> list, Boolean bl) {
    }

    public static SpeakerAudioDeleteFilesInfo fromJson(String string) {
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

    public List<Integer> getIndexs() {
        return null;
    }

    public void setIndexs(List<Integer> list) {
    }

    public Boolean getIsDeleteAll() {
        return null;
    }

    public void setIsDeleteAll(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

