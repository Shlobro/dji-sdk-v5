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
import dji.sdk.keyvalue.value.flightcontroller.DbInnerCompositionVer;
import dji.sdk.keyvalue.value.flightcontroller.DbInnerProposalVer;
import org.json.JSONObject;

public class FlysafeDatabaseType
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DbInnerProposalVer proposalVer;
    DbInnerCompositionVer compositionVer;

    public FlysafeDatabaseType() {
    }

    public FlysafeDatabaseType(DbInnerProposalVer dbInnerProposalVer, DbInnerCompositionVer dbInnerCompositionVer) {
    }

    public static FlysafeDatabaseType fromJson(String string) {
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

    public DbInnerProposalVer getProposalVer() {
        return null;
    }

    public void setProposalVer(DbInnerProposalVer dbInnerProposalVer) {
    }

    public DbInnerCompositionVer getCompositionVer() {
        return null;
    }

    public void setCompositionVer(DbInnerCompositionVer dbInnerCompositionVer) {
    }

    public String toString() {
        return null;
    }
}

