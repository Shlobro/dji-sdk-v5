/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.relay.RelaySdrRoleType;
import org.json.JSONObject;

public class RelaySdrRoleTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RelaySdrRoleType value;

    public RelaySdrRoleTypeMsg() {
    }

    public RelaySdrRoleTypeMsg(RelaySdrRoleType relaySdrRoleType) {
    }

    public static RelaySdrRoleTypeMsg fromJson(String string) {
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

    public RelaySdrRoleType getValue() {
        return null;
    }

    public void setValue(RelaySdrRoleType relaySdrRoleType) {
    }

    public String toString() {
        return null;
    }
}

