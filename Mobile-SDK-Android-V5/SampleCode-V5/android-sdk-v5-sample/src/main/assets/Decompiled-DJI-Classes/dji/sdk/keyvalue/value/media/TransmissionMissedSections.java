/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.media.TransmissionMissedSection;
import java.util.List;
import org.json.JSONObject;

public class TransmissionMissedSections
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer ackSeq;
    Integer count;
    List<TransmissionMissedSection> sections;

    public TransmissionMissedSections() {
    }

    public TransmissionMissedSections(Integer n, Integer n2, List<TransmissionMissedSection> list) {
    }

    public static TransmissionMissedSections fromJson(String string) {
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

    public Integer getAckSeq() {
        return null;
    }

    public void setAckSeq(Integer n) {
    }

    public Integer getCount() {
        return null;
    }

    public void setCount(Integer n) {
    }

    public List<TransmissionMissedSection> getSections() {
        return null;
    }

    public void setSections(List<TransmissionMissedSection> list) {
    }

    public String toString() {
        return null;
    }
}

