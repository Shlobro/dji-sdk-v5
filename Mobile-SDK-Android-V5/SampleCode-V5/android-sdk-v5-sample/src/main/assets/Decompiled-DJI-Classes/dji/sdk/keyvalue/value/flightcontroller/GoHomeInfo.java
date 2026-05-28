/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import android.os.Parcel;
import android.os.Parcelable;
import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightcontroller.GoHomeNeedConfirmType;
import org.json.JSONObject;

public class GoHomeInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream,
Parcelable {
    GoHomeNeedConfirmType type;
    public static final Parcelable.Creator<GoHomeInfo> CREATOR = new Parcelable.Creator<GoHomeInfo>(){

        public GoHomeInfo createFromParcel(Parcel parcel) {
            return null;
        }

        public GoHomeInfo[] newArray(int n) {
            return null;
        }
    };

    public GoHomeInfo() {
    }

    public GoHomeInfo(GoHomeNeedConfirmType goHomeNeedConfirmType) {
    }

    public static GoHomeInfo fromJson(String string) {
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

    public GoHomeNeedConfirmType getType() {
        return null;
    }

    public void setType(GoHomeNeedConfirmType goHomeNeedConfirmType) {
    }

    public String toString() {
        return null;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n) {
    }

    protected GoHomeInfo(Parcel parcel) {
    }
}

