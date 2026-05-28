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
import org.json.JSONObject;

public class IconFileSet
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String nameSelectedIcon;
    String nameUnselectedIcon;

    public IconFileSet() {
    }

    public IconFileSet(String string, String string2) {
    }

    public static IconFileSet fromJson(String string) {
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

    public String getNameSelectedIcon() {
        return null;
    }

    public void setNameSelectedIcon(String string) {
    }

    public String getNameUnselectedIcon() {
        return null;
    }

    public void setNameUnselectedIcon(String string) {
    }

    public String toString() {
        return null;
    }
}

