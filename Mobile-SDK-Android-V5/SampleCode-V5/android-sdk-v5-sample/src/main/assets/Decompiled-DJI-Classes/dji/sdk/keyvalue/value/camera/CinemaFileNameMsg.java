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
import org.json.JSONObject;

public class CinemaFileNameMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String camera_index;
    Integer reel_counter;
    Integer clip_counter;
    Integer next_reel_counter;

    public CinemaFileNameMsg() {
    }

    public CinemaFileNameMsg(String string, Integer n, Integer n2, Integer n3) {
    }

    public static CinemaFileNameMsg fromJson(String string) {
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

    public String getCamera_index() {
        return null;
    }

    public void setCamera_index(String string) {
    }

    public Integer getReel_counter() {
        return null;
    }

    public void setReel_counter(Integer n) {
    }

    public Integer getClip_counter() {
        return null;
    }

    public void setClip_counter(Integer n) {
    }

    public Integer getNext_reel_counter() {
        return null;
    }

    public void setNext_reel_counter(Integer n) {
    }

    public String toString() {
        return null;
    }
}

