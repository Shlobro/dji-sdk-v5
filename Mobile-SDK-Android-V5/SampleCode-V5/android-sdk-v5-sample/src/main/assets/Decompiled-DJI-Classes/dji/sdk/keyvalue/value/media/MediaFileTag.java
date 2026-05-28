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
import org.json.JSONObject;

public class MediaFileTag
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean stared;
    Boolean starTagValid;
    Boolean syncedToCloud;
    Boolean cloudTagValid;

    public MediaFileTag() {
    }

    public MediaFileTag(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4) {
    }

    public static MediaFileTag fromJson(String string) {
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

    public Boolean getStared() {
        return null;
    }

    public void setStared(Boolean bl) {
    }

    public Boolean getStarTagValid() {
        return null;
    }

    public void setStarTagValid(Boolean bl) {
    }

    public Boolean getSyncedToCloud() {
        return null;
    }

    public void setSyncedToCloud(Boolean bl) {
    }

    public Boolean getCloudTagValid() {
        return null;
    }

    public void setCloudTagValid(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

