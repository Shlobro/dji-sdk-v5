/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import java.util.List;
import org.json.JSONObject;

public class MultiGimbalSyncStatus
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isInGimbalSync;
    List<ComponentIndexType> OnSyncGimbals;

    public MultiGimbalSyncStatus() {
    }

    public MultiGimbalSyncStatus(Boolean bl, List<ComponentIndexType> list) {
    }

    public static MultiGimbalSyncStatus fromJson(String string) {
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

    public Boolean getIsInGimbalSync() {
        return null;
    }

    public void setIsInGimbalSync(Boolean bl) {
    }

    public List<ComponentIndexType> getOnSyncGimbals() {
        return null;
    }

    public void setOnSyncGimbals(List<ComponentIndexType> list) {
    }

    public String toString() {
        return null;
    }
}

