/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.file.CommonFile;
import java.util.List;
import org.json.JSONObject;

public class WidgetInfoSet
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<CommonFile> data;

    public WidgetInfoSet() {
    }

    public WidgetInfoSet(List<CommonFile> list) {
    }

    public static WidgetInfoSet fromJson(String string) {
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

    public List<CommonFile> getData() {
        return null;
    }

    public void setData(List<CommonFile> list) {
    }

    public String toString() {
        return null;
    }
}

