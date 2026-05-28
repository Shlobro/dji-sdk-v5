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
import dji.sdk.wpmz.value.mission.WaylineActionMegaphoneBitrate;
import dji.sdk.wpmz.value.mission.WaylineActionMegaphoneOperateType;
import java.util.Objects;
import org.json.JSONObject;

public class ActionMegaphoneParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String actionUUID = "";
    Integer payloadPositionIndex = 0;
    WaylineActionMegaphoneOperateType megaphoneOperateType = WaylineActionMegaphoneOperateType.UNKNOWN;
    Integer volume = 0;
    Boolean isLoop = false;
    String filePath = "";
    String fileMd5 = "";
    String fileName = "";
    String fileOriginalName = "";
    WaylineActionMegaphoneBitrate bitrate = WaylineActionMegaphoneBitrate.UNKNOWN;

    public ActionMegaphoneParam() {
    }

    public ActionMegaphoneParam(String actionUUID, Integer payloadPositionIndex, WaylineActionMegaphoneOperateType megaphoneOperateType, Integer volume, Boolean isLoop, String filePath, String fileMd5, String fileName, String fileOriginalName, WaylineActionMegaphoneBitrate bitrate) {
        if (actionUUID != null) {
            this.actionUUID = actionUUID;
        }
        if (payloadPositionIndex != null) {
            this.payloadPositionIndex = payloadPositionIndex;
        }
        if (megaphoneOperateType != null) {
            this.megaphoneOperateType = megaphoneOperateType;
        }
        if (volume != null) {
            this.volume = volume;
        }
        if (isLoop != null) {
            this.isLoop = isLoop;
        }
        if (filePath != null) {
            this.filePath = filePath;
        }
        if (fileMd5 != null) {
            this.fileMd5 = fileMd5;
        }
        if (fileName != null) {
            this.fileName = fileName;
        }
        if (fileOriginalName != null) {
            this.fileOriginalName = fileOriginalName;
        }
        if (bitrate != null) {
            this.bitrate = bitrate;
        }
    }

    public static ActionMegaphoneParam fromJson(String jsonString) {
        ActionMegaphoneParam tmpValueResult_ = new ActionMegaphoneParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.actionUUID = jsonObj.getString("actionUUID");
            tmpValueResult_.payloadPositionIndex = jsonObj.getInt("payloadPositionIndex");
            tmpValueResult_.megaphoneOperateType = WaylineActionMegaphoneOperateType.find(jsonObj.getInt("megaphoneOperateType"));
            tmpValueResult_.volume = jsonObj.getInt("volume");
            tmpValueResult_.isLoop = jsonObj.getBoolean("isLoop");
            tmpValueResult_.filePath = jsonObj.getString("filePath");
            tmpValueResult_.fileMd5 = jsonObj.getString("fileMd5");
            tmpValueResult_.fileName = jsonObj.getString("fileName");
            tmpValueResult_.fileOriginalName = jsonObj.getString("fileOriginalName");
            tmpValueResult_.bitrate = WaylineActionMegaphoneBitrate.find(jsonObj.getInt("bitrate"));
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
            if (null != this.actionUUID) {
                json.put("actionUUID", (Object)this.actionUUID);
            }
            if (null != this.payloadPositionIndex) {
                json.put("payloadPositionIndex", (Object)this.payloadPositionIndex);
            }
            if (null != this.megaphoneOperateType) {
                json.put("megaphoneOperateType", this.megaphoneOperateType.value());
            }
            if (null != this.volume) {
                json.put("volume", (Object)this.volume);
            }
            if (null != this.isLoop) {
                json.put("isLoop", (Object)this.isLoop);
            }
            if (null != this.filePath) {
                json.put("filePath", (Object)this.filePath);
            }
            if (null != this.fileMd5) {
                json.put("fileMd5", (Object)this.fileMd5);
            }
            if (null != this.fileName) {
                json.put("fileName", (Object)this.fileName);
            }
            if (null != this.fileOriginalName) {
                json.put("fileOriginalName", (Object)this.fileOriginalName);
            }
            if (null != this.bitrate) {
                json.put("bitrate", this.bitrate.value());
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
        serializedLength += ByteStreamHelper.stringGetLength(this.actionUUID);
        serializedLength += ByteStreamHelper.integerGetLength(this.payloadPositionIndex);
        serializedLength += ByteStreamHelper.integerGetLength(this.megaphoneOperateType.value());
        serializedLength += ByteStreamHelper.integerGetLength(this.volume);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isLoop);
        serializedLength += ByteStreamHelper.stringGetLength(this.filePath);
        serializedLength += ByteStreamHelper.stringGetLength(this.fileMd5);
        serializedLength += ByteStreamHelper.stringGetLength(this.fileName);
        serializedLength += ByteStreamHelper.stringGetLength(this.fileOriginalName);
        return serializedLength += ByteStreamHelper.integerGetLength(this.bitrate.value());
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.actionUUID, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.payloadPositionIndex, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.megaphoneOperateType.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.volume, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isLoop, serializedIndex);
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.filePath, serializedIndex);
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.fileMd5, serializedIndex);
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.fileName, serializedIndex);
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.fileOriginalName, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.bitrate.value(), serializedIndex);
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
        ByteResult<String> tmpActionUUID = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.actionUUID = (String)tmpActionUUID.result;
        deserilizationIndex = tmpActionUUID.endIndex;
        ByteResult<Integer> tmpPayloadPositionIndex = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.payloadPositionIndex = (Integer)tmpPayloadPositionIndex.result;
        deserilizationIndex = tmpPayloadPositionIndex.endIndex;
        ByteResult<Integer> tmpMegaphoneOperateType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.megaphoneOperateType = WaylineActionMegaphoneOperateType.find((Integer)tmpMegaphoneOperateType.result);
        deserilizationIndex = tmpMegaphoneOperateType.endIndex;
        ByteResult<Integer> tmpVolume = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.volume = (Integer)tmpVolume.result;
        deserilizationIndex = tmpVolume.endIndex;
        ByteResult<Boolean> tmpIsLoop = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isLoop = (Boolean)tmpIsLoop.result;
        deserilizationIndex = tmpIsLoop.endIndex;
        ByteResult<String> tmpFilePath = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.filePath = (String)tmpFilePath.result;
        deserilizationIndex = tmpFilePath.endIndex;
        ByteResult<String> tmpFileMd5 = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.fileMd5 = (String)tmpFileMd5.result;
        deserilizationIndex = tmpFileMd5.endIndex;
        ByteResult<String> tmpFileName = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.fileName = (String)tmpFileName.result;
        deserilizationIndex = tmpFileName.endIndex;
        ByteResult<String> tmpFileOriginalName = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.fileOriginalName = (String)tmpFileOriginalName.result;
        deserilizationIndex = tmpFileOriginalName.endIndex;
        ByteResult<Integer> tmpBitrate = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.bitrate = WaylineActionMegaphoneBitrate.find((Integer)tmpBitrate.result);
        deserilizationIndex = tmpBitrate.endIndex;
        return deserilizationIndex;
    }

    public String getActionUUID() {
        return this.actionUUID;
    }

    public void setActionUUID(String actionUUID) {
        this.actionUUID = actionUUID;
    }

    public Integer getPayloadPositionIndex() {
        return this.payloadPositionIndex;
    }

    public void setPayloadPositionIndex(Integer payloadPositionIndex) {
        this.payloadPositionIndex = payloadPositionIndex;
    }

    public WaylineActionMegaphoneOperateType getMegaphoneOperateType() {
        return this.megaphoneOperateType;
    }

    public void setMegaphoneOperateType(WaylineActionMegaphoneOperateType megaphoneOperateType) {
        this.megaphoneOperateType = megaphoneOperateType;
    }

    public Integer getVolume() {
        return this.volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Boolean getIsLoop() {
        return this.isLoop;
    }

    public void setIsLoop(Boolean isLoop) {
        this.isLoop = isLoop;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileMd5() {
        return this.fileMd5;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileOriginalName() {
        return this.fileOriginalName;
    }

    public void setFileOriginalName(String fileOriginalName) {
        this.fileOriginalName = fileOriginalName;
    }

    public WaylineActionMegaphoneBitrate getBitrate() {
        return this.bitrate;
    }

    public void setBitrate(WaylineActionMegaphoneBitrate bitrate) {
        this.bitrate = bitrate;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionMegaphoneParam)) {
            return false;
        }
        ActionMegaphoneParam that = (ActionMegaphoneParam)o;
        return Objects.equals(this.actionUUID, that.actionUUID) && Objects.equals(this.payloadPositionIndex, that.payloadPositionIndex) && Objects.equals(this.megaphoneOperateType, that.megaphoneOperateType) && Objects.equals(this.volume, that.volume) && Objects.equals(this.isLoop, that.isLoop) && Objects.equals(this.filePath, that.filePath) && Objects.equals(this.fileMd5, that.fileMd5) && Objects.equals(this.fileName, that.fileName) && Objects.equals(this.fileOriginalName, that.fileOriginalName) && Objects.equals(this.bitrate, that.bitrate);
    }

    public int hashCode() {
        return Objects.hash(this.actionUUID, this.payloadPositionIndex, this.megaphoneOperateType, this.volume, this.isLoop, this.filePath, this.fileMd5, this.fileName, this.fileOriginalName, this.bitrate);
    }
}

