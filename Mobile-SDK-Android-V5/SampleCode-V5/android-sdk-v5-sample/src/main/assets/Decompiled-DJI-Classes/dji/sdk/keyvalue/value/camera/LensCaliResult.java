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
import dji.sdk.keyvalue.value.camera.LensCaliPoint;
import java.util.List;
import org.json.JSONObject;

public class LensCaliResult
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String name;
    List<LensCaliPoint> caliPoints;

    public LensCaliResult() {
    }

    public LensCaliResult(String string, List<LensCaliPoint> list) {
    }

    public static LensCaliResult fromJson(String string) {
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

    public String getName() {
        return null;
    }

    public void setName(String string) {
    }

    public List<LensCaliPoint> getCaliPoints() {
        return null;
    }

    public void setCaliPoints(List<LensCaliPoint> list) {
    }

    public String toString() {
        return null;
    }
}

