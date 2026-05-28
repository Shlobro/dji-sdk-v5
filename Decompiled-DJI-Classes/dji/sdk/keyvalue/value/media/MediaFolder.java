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
import dji.sdk.keyvalue.value.camera.DateTime;
import org.json.JSONObject;

public class MediaFolder
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    DateTime date;
    String name;
    Boolean isPageLastFolder;

    public MediaFolder() {
    }

    public MediaFolder(Integer n, DateTime dateTime, String string, Boolean bl) {
    }

    public static MediaFolder fromJson(String string) {
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

    public DateTime getDate() {
        return null;
    }

    public void setDate(DateTime dateTime) {
    }

    public String getName() {
        return null;
    }

    public void setName(String string) {
    }

    public Boolean getIsPageLastFolder() {
        return null;
    }

    public void setIsPageLastFolder(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

