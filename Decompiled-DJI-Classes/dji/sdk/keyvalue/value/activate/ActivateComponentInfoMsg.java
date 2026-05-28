/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.activate;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.activate.ActivateComponentType;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import org.json.JSONObject;

public class ActivateComponentInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ActivateComponentType type;
    ComponentIndexType componentIndex;

    public ActivateComponentInfoMsg() {
    }

    public ActivateComponentInfoMsg(ActivateComponentType activateComponentType, ComponentIndexType componentIndexType) {
    }

    public static ActivateComponentInfoMsg fromJson(String string) {
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

    public ActivateComponentType getType() {
        return null;
    }

    public void setType(ActivateComponentType activateComponentType) {
    }

    public ComponentIndexType getComponentIndex() {
        return null;
    }

    public void setComponentIndex(ComponentIndexType componentIndexType) {
    }

    public String toString() {
        return null;
    }
}

