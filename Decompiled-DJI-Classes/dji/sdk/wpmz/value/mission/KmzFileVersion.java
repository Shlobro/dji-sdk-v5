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
import dji.sdk.wpmz.value.mission.KmlFileVersion;
import java.util.Objects;
import org.json.JSONObject;

public class KmzFileVersion
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    KmlFileVersion templateFileVersion;
    KmlFileVersion waylineFileVersion;

    public KmzFileVersion() {
    }

    public KmzFileVersion(KmlFileVersion templateFileVersion, KmlFileVersion waylineFileVersion) {
        if (templateFileVersion != null) {
            this.templateFileVersion = templateFileVersion;
        }
        if (waylineFileVersion != null) {
            this.waylineFileVersion = waylineFileVersion;
        }
    }

    public static KmzFileVersion fromJson(String jsonString) {
        KmzFileVersion tmpValueResult_ = new KmzFileVersion();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.templateFileVersion = KmlFileVersion.fromJson(jsonObj.getJSONObject("templateFileVersion").toString());
            tmpValueResult_.waylineFileVersion = KmlFileVersion.fromJson(jsonObj.getJSONObject("waylineFileVersion").toString());
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
            if (null != this.templateFileVersion) {
                json.put("templateFileVersion", (Object)this.templateFileVersion.toJson());
            }
            if (null != this.waylineFileVersion) {
                json.put("waylineFileVersion", (Object)this.waylineFileVersion.toJson());
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
        serializedLength += ByteStreamHelper.getLength(this.templateFileVersion, KmlFileVersion.class);
        return serializedLength += ByteStreamHelper.getLength(this.waylineFileVersion, KmlFileVersion.class);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.templateFileVersion, serializedIndex, KmlFileVersion.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.waylineFileVersion, serializedIndex, KmlFileVersion.class);
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
        ByteResult<KmlFileVersion> tmpTemplateFileVersion = ByteStreamHelper.fromBytes(data, deserilizationIndex, KmlFileVersion.class);
        this.templateFileVersion = (KmlFileVersion)tmpTemplateFileVersion.result;
        deserilizationIndex = tmpTemplateFileVersion.endIndex;
        ByteResult<KmlFileVersion> tmpWaylineFileVersion = ByteStreamHelper.fromBytes(data, deserilizationIndex, KmlFileVersion.class);
        this.waylineFileVersion = (KmlFileVersion)tmpWaylineFileVersion.result;
        deserilizationIndex = tmpWaylineFileVersion.endIndex;
        return deserilizationIndex;
    }

    public KmlFileVersion getTemplateFileVersion() {
        return this.templateFileVersion;
    }

    public void setTemplateFileVersion(KmlFileVersion templateFileVersion) {
        this.templateFileVersion = templateFileVersion;
    }

    public KmlFileVersion getWaylineFileVersion() {
        return this.waylineFileVersion;
    }

    public void setWaylineFileVersion(KmlFileVersion waylineFileVersion) {
        this.waylineFileVersion = waylineFileVersion;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KmzFileVersion)) {
            return false;
        }
        KmzFileVersion that = (KmzFileVersion)o;
        return Objects.equals(this.templateFileVersion, that.templateFileVersion) && Objects.equals(this.waylineFileVersion, that.waylineFileVersion);
    }

    public int hashCode() {
        return Objects.hash(this.templateFileVersion, this.waylineFileVersion);
    }
}

