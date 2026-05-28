/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;
import dji.sdk.wpmz.value.ByteResult;
import dji.sdk.wpmz.value.ByteStream;
import dji.sdk.wpmz.value.ByteStreamHelper;
import dji.sdk.wpmz.value.base.DJIValue;
import dji.sdk.wpmz.value.mission.WaylineOrientedPhotoModeType;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineOrientedPhotoModeParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineOrientedPhotoModeType modeType = WaylineOrientedPhotoModeType.UNKNOWN;

    public WaylineOrientedPhotoModeParam() {
    }

    public WaylineOrientedPhotoModeParam(WaylineOrientedPhotoModeType modeType) {
        if (modeType != null) {
            this.modeType = modeType;
        }
    }

    public static WaylineOrientedPhotoModeParam fromJson(String jsonString) {
        WaylineOrientedPhotoModeParam tmpValueResult_ = new WaylineOrientedPhotoModeParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.modeType = WaylineOrientedPhotoModeType.find(jsonObj.getInt("modeType"));
        }
        catch (Exception e) {
            tmpValueResult_ = null;
        }
        return tmpValueResult_;
    }

    @Override
    public JSONObject toJson() {
        JSONObject json = null;
        try {
            json = new JSONObject();
            if (null != this.modeType) {
                json.put("modeType", this.modeType.value());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }

    @Override
    public int serializedLength() {
        int serializedLength = 0;
        return serializedLength += ByteStreamHelper.integerGetLength(this.modeType.value());
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.modeType.value(), serializedIndex);
        return serializedIndex;
    }

    @Override
    public byte[] toBytes() {
        byte[] resultBytes = new byte[this.serializedLength()];
        this.toBytes(resultBytes, 0);
        return resultBytes;
    }

    @Override
    public int fromBytes(byte[] data, int deserilizationIndex) {
        ByteResult<Integer> tmpModeType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.modeType = WaylineOrientedPhotoModeType.find((Integer)tmpModeType.result);
        deserilizationIndex = tmpModeType.endIndex;
        return deserilizationIndex;
    }

    public WaylineOrientedPhotoModeType getModeType() {
        return this.modeType;
    }

    public void setModeType(WaylineOrientedPhotoModeType modeType) {
        this.modeType = modeType;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineOrientedPhotoModeParam)) {
            return false;
        }
        WaylineOrientedPhotoModeParam that = (WaylineOrientedPhotoModeParam)o;
        return Objects.equals(this.modeType, that.modeType);
    }

    public int hashCode() {
        return Objects.hash(this.modeType);
    }
}

