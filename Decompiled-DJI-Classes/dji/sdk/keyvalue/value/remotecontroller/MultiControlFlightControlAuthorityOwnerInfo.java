/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.MultiControlChannel;
import org.json.JSONObject;

public class MultiControlFlightControlAuthorityOwnerInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MultiControlChannel FlightControlOwner;

    public MultiControlFlightControlAuthorityOwnerInfo() {
    }

    public MultiControlFlightControlAuthorityOwnerInfo(MultiControlChannel multiControlChannel) {
    }

    public static MultiControlFlightControlAuthorityOwnerInfo fromJson(String string) {
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

    public MultiControlChannel getFlightControlOwner() {
        return null;
    }

    public void setFlightControlOwner(MultiControlChannel multiControlChannel) {
    }

    public String toString() {
        return null;
    }
}

