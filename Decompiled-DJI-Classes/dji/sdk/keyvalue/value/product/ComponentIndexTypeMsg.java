/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import org.json.JSONObject;

public class ComponentIndexTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ComponentIndexType value;

    public ComponentIndexTypeMsg() {
    }

    public ComponentIndexTypeMsg(ComponentIndexType componentIndexType) {
    }

    public static ComponentIndexTypeMsg fromJson(String string) {
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

    public ComponentIndexType getValue() {
        return null;
    }

    public void setValue(ComponentIndexType componentIndexType) {
    }

    public String toString() {
        return null;
    }
}

