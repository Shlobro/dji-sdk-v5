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
import dji.sdk.keyvalue.value.payload.IconFileSet;
import org.json.JSONObject;

public class DetailSubItem
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String itemName;
    IconFileSet iconFileSet;

    public DetailSubItem() {
    }

    public DetailSubItem(String string, IconFileSet iconFileSet) {
    }

    public static DetailSubItem fromJson(String string) {
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

    public String getItemName() {
        return null;
    }

    public void setItemName(String string) {
    }

    public IconFileSet getIconFileSet() {
        return null;
    }

    public void setIconFileSet(IconFileSet iconFileSet) {
    }

    public String toString() {
        return null;
    }
}

