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
import java.util.Objects;
import org.json.JSONObject;

public class WpmzVersion
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer major = 0;
    Integer minor = 0;
    Integer patch = 0;

    public WpmzVersion() {
    }

    public WpmzVersion(Integer major, Integer minor, Integer patch) {
        if (major != null) {
            this.major = major;
        }
        if (minor != null) {
            this.minor = minor;
        }
        if (patch != null) {
            this.patch = patch;
        }
    }

    public static WpmzVersion fromJson(String jsonString) {
        WpmzVersion tmpValueResult_ = new WpmzVersion();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.major = jsonObj.getInt("major");
            tmpValueResult_.minor = jsonObj.getInt("minor");
            tmpValueResult_.patch = jsonObj.getInt("patch");
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
            if (null != this.major) {
                json.put("major", (Object)this.major);
            }
            if (null != this.minor) {
                json.put("minor", (Object)this.minor);
            }
            if (null != this.patch) {
                json.put("patch", (Object)this.patch);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.major);
        serializedLength += ByteStreamHelper.integerGetLength(this.minor);
        return serializedLength += ByteStreamHelper.integerGetLength(this.patch);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.major, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.minor, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.patch, serializedIndex);
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
        ByteResult<Integer> tmpMajor = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.major = (Integer)tmpMajor.result;
        deserilizationIndex = tmpMajor.endIndex;
        ByteResult<Integer> tmpMinor = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.minor = (Integer)tmpMinor.result;
        deserilizationIndex = tmpMinor.endIndex;
        ByteResult<Integer> tmpPatch = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.patch = (Integer)tmpPatch.result;
        deserilizationIndex = tmpPatch.endIndex;
        return deserilizationIndex;
    }

    public Integer getMajor() {
        return this.major;
    }

    public void setMajor(Integer major) {
        this.major = major;
    }

    public Integer getMinor() {
        return this.minor;
    }

    public void setMinor(Integer minor) {
        this.minor = minor;
    }

    public Integer getPatch() {
        return this.patch;
    }

    public void setPatch(Integer patch) {
        this.patch = patch;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WpmzVersion)) {
            return false;
        }
        WpmzVersion that = (WpmzVersion)o;
        return Objects.equals(this.major, that.major) && Objects.equals(this.minor, that.minor) && Objects.equals(this.patch, that.patch);
    }

    public int hashCode() {
        return Objects.hash(this.major, this.minor, this.patch);
    }
}

