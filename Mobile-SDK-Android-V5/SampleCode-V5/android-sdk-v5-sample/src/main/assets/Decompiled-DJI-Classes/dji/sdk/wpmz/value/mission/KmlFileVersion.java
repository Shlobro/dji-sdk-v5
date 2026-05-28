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
import dji.sdk.wpmz.value.mission.KmlVersionParseError;
import dji.sdk.wpmz.value.mission.WpmzVersion;
import java.util.Objects;
import org.json.JSONObject;

public class KmlFileVersion
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WpmzVersion version;
    KmlVersionParseError parseError = KmlVersionParseError.UNKNOWN;

    public KmlFileVersion() {
    }

    public KmlFileVersion(WpmzVersion version, KmlVersionParseError parseError) {
        if (version != null) {
            this.version = version;
        }
        if (parseError != null) {
            this.parseError = parseError;
        }
    }

    public static KmlFileVersion fromJson(String jsonString) {
        KmlFileVersion tmpValueResult_ = new KmlFileVersion();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.version = WpmzVersion.fromJson(jsonObj.getJSONObject("version").toString());
            tmpValueResult_.parseError = KmlVersionParseError.find(jsonObj.getInt("parseError"));
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
            if (null != this.version) {
                json.put("version", (Object)this.version.toJson());
            }
            if (null != this.parseError) {
                json.put("parseError", this.parseError.value());
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
        serializedLength += ByteStreamHelper.getLength(this.version, WpmzVersion.class);
        return serializedLength += ByteStreamHelper.integerGetLength(this.parseError.value());
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.version, serializedIndex, WpmzVersion.class);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.parseError.value(), serializedIndex);
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
        ByteResult<WpmzVersion> tmpVersion = ByteStreamHelper.fromBytes(data, deserilizationIndex, WpmzVersion.class);
        this.version = (WpmzVersion)tmpVersion.result;
        deserilizationIndex = tmpVersion.endIndex;
        ByteResult<Integer> tmpParseError = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.parseError = KmlVersionParseError.find((Integer)tmpParseError.result);
        deserilizationIndex = tmpParseError.endIndex;
        return deserilizationIndex;
    }

    public WpmzVersion getVersion() {
        return this.version;
    }

    public void setVersion(WpmzVersion version) {
        this.version = version;
    }

    public KmlVersionParseError getParseError() {
        return this.parseError;
    }

    public void setParseError(KmlVersionParseError parseError) {
        this.parseError = parseError;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KmlFileVersion)) {
            return false;
        }
        KmlFileVersion that = (KmlFileVersion)o;
        return Objects.equals(this.version, that.version) && Objects.equals(this.parseError, that.parseError);
    }

    public int hashCode() {
        return Objects.hash(this.version, this.parseError);
    }
}

