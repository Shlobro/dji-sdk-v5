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
import dji.sdk.wpmz.value.mission.BackgroundInfo;
import dji.sdk.wpmz.value.mission.CameraFov;
import dji.sdk.wpmz.value.mission.CameraLookAtInfo;
import java.util.Objects;
import org.json.JSONObject;

public class LookAtSceneParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    BackgroundInfo background;
    CameraLookAtInfo lookAt;
    CameraFov fov;

    public LookAtSceneParam() {
    }

    public LookAtSceneParam(BackgroundInfo background, CameraLookAtInfo lookAt, CameraFov fov) {
        if (background != null) {
            this.background = background;
        }
        if (lookAt != null) {
            this.lookAt = lookAt;
        }
        if (fov != null) {
            this.fov = fov;
        }
    }

    public static LookAtSceneParam fromJson(String jsonString) {
        LookAtSceneParam tmpValueResult_ = new LookAtSceneParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.background = BackgroundInfo.fromJson(jsonObj.getJSONObject("background").toString());
            tmpValueResult_.lookAt = CameraLookAtInfo.fromJson(jsonObj.getJSONObject("lookAt").toString());
            tmpValueResult_.fov = CameraFov.fromJson(jsonObj.getJSONObject("fov").toString());
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
            if (null != this.background) {
                json.put("background", (Object)this.background.toJson());
            }
            if (null != this.lookAt) {
                json.put("lookAt", (Object)this.lookAt.toJson());
            }
            if (null != this.fov) {
                json.put("fov", (Object)this.fov.toJson());
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
        serializedLength += ByteStreamHelper.getLength(this.background, BackgroundInfo.class);
        serializedLength += ByteStreamHelper.getLength(this.lookAt, CameraLookAtInfo.class);
        return serializedLength += ByteStreamHelper.getLength(this.fov, CameraFov.class);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.background, serializedIndex, BackgroundInfo.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.lookAt, serializedIndex, CameraLookAtInfo.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.fov, serializedIndex, CameraFov.class);
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
        ByteResult<BackgroundInfo> tmpBackground = ByteStreamHelper.fromBytes(data, deserilizationIndex, BackgroundInfo.class);
        this.background = (BackgroundInfo)tmpBackground.result;
        deserilizationIndex = tmpBackground.endIndex;
        ByteResult<CameraLookAtInfo> tmpLookAt = ByteStreamHelper.fromBytes(data, deserilizationIndex, CameraLookAtInfo.class);
        this.lookAt = (CameraLookAtInfo)tmpLookAt.result;
        deserilizationIndex = tmpLookAt.endIndex;
        ByteResult<CameraFov> tmpFov = ByteStreamHelper.fromBytes(data, deserilizationIndex, CameraFov.class);
        this.fov = (CameraFov)tmpFov.result;
        deserilizationIndex = tmpFov.endIndex;
        return deserilizationIndex;
    }

    public BackgroundInfo getBackground() {
        return this.background;
    }

    public void setBackground(BackgroundInfo background) {
        this.background = background;
    }

    public CameraLookAtInfo getLookAt() {
        return this.lookAt;
    }

    public void setLookAt(CameraLookAtInfo lookAt) {
        this.lookAt = lookAt;
    }

    public CameraFov getFov() {
        return this.fov;
    }

    public void setFov(CameraFov fov) {
        this.fov = fov;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LookAtSceneParam)) {
            return false;
        }
        LookAtSceneParam that = (LookAtSceneParam)o;
        return Objects.equals(this.background, that.background) && Objects.equals(this.lookAt, that.lookAt) && Objects.equals(this.fov, that.fov);
    }

    public int hashCode() {
        return Objects.hash(this.background, this.lookAt, this.fov);
    }
}

