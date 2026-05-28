/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.MultiControlAuthorityTypeInfo;
import org.json.JSONObject;

public class MultiControlLockAuthorityInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MultiControlAuthorityTypeInfo lockAuthorityType;
    Boolean bLock;

    public MultiControlLockAuthorityInfo() {
    }

    public MultiControlLockAuthorityInfo(MultiControlAuthorityTypeInfo multiControlAuthorityTypeInfo, Boolean bl) {
    }

    public static MultiControlLockAuthorityInfo fromJson(String string) {
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

    public MultiControlAuthorityTypeInfo getLockAuthorityType() {
        return null;
    }

    public void setLockAuthorityType(MultiControlAuthorityTypeInfo multiControlAuthorityTypeInfo) {
    }

    public Boolean getBLock() {
        return null;
    }

    public void setBLock(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

