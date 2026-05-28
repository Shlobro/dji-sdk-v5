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
import dji.sdk.keyvalue.value.camera.PhotoDeletionCommandType;
import org.json.JSONObject;

public class PhotoDeletionCommand
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    PhotoDeletionCommandType operation;
    Integer fileIndex;

    public PhotoDeletionCommand() {
    }

    public PhotoDeletionCommand(PhotoDeletionCommandType photoDeletionCommandType, Integer n) {
    }

    public static PhotoDeletionCommand fromJson(String string) {
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

    public PhotoDeletionCommandType getOperation() {
        return null;
    }

    public void setOperation(PhotoDeletionCommandType photoDeletionCommandType) {
    }

    public Integer getFileIndex() {
        return null;
    }

    public void setFileIndex(Integer n) {
    }

    public String toString() {
        return null;
    }
}

