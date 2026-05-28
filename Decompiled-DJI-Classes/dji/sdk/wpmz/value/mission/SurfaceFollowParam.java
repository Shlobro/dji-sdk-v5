/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;
import dji.sdk.wpmz.value.ByteResult;
import dji.sdk.wpmz.value.ByteStream;
import dji.sdk.wpmz.value.ByteStreamHelper;
import dji.sdk.wpmz.value.base.DJIValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class SurfaceFollowParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean surfaceFollowModeEnable = false;
    Boolean isRealtimeSurfaceFollow = false;
    Double surfaceRelativeHeight = 0.0;
    List<String> dsmFiles = new ArrayList<String>();
    List<String> dsmUrls = new ArrayList<String>();

    public SurfaceFollowParam() {
    }

    public SurfaceFollowParam(Boolean surfaceFollowModeEnable, Boolean isRealtimeSurfaceFollow, Double surfaceRelativeHeight, List<String> dsmFiles, List<String> dsmUrls) {
        if (surfaceFollowModeEnable != null) {
            this.surfaceFollowModeEnable = surfaceFollowModeEnable;
        }
        if (isRealtimeSurfaceFollow != null) {
            this.isRealtimeSurfaceFollow = isRealtimeSurfaceFollow;
        }
        if (surfaceRelativeHeight != null) {
            this.surfaceRelativeHeight = surfaceRelativeHeight;
        }
        if (dsmFiles != null) {
            this.dsmFiles = dsmFiles;
        }
        if (dsmUrls != null) {
            this.dsmUrls = dsmUrls;
        }
    }

    public static SurfaceFollowParam fromJson(String jsonString) {
        SurfaceFollowParam tmpValueResult_ = new SurfaceFollowParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.surfaceFollowModeEnable = jsonObj.getBoolean("surfaceFollowModeEnable");
            tmpValueResult_.isRealtimeSurfaceFollow = jsonObj.getBoolean("isRealtimeSurfaceFollow");
            tmpValueResult_.surfaceRelativeHeight = jsonObj.getDouble("surfaceRelativeHeight");
            JSONArray dsmFilesJsonArr = jsonObj.getJSONArray("dsmFiles");
            for (int i = 0; i < dsmFilesJsonArr.length(); ++i) {
                tmpValueResult_.dsmFiles.add(dsmFilesJsonArr.getString(i));
            }
            JSONArray dsmUrlsJsonArr = jsonObj.getJSONArray("dsmUrls");
            for (int i = 0; i < dsmUrlsJsonArr.length(); ++i) {
                tmpValueResult_.dsmUrls.add(dsmUrlsJsonArr.getString(i));
            }
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
            int i;
            json = new JSONObject();
            if (null != this.surfaceFollowModeEnable) {
                json.put("surfaceFollowModeEnable", (Object)this.surfaceFollowModeEnable);
            }
            if (null != this.isRealtimeSurfaceFollow) {
                json.put("isRealtimeSurfaceFollow", (Object)this.isRealtimeSurfaceFollow);
            }
            if (null != this.surfaceRelativeHeight) {
                json.put("surfaceRelativeHeight", (Object)this.surfaceRelativeHeight);
            }
            if (null != this.dsmFiles) {
                JSONArray json_arr_dsmFiles = new JSONArray();
                for (i = 0; i < this.dsmFiles.size(); ++i) {
                    json_arr_dsmFiles.put((Object)this.dsmFiles.get(i));
                }
                json.put("dsmFiles", (Object)json_arr_dsmFiles);
            }
            if (null != this.dsmUrls) {
                JSONArray json_arr_dsmUrls = new JSONArray();
                for (i = 0; i < this.dsmUrls.size(); ++i) {
                    json_arr_dsmUrls.put((Object)this.dsmUrls.get(i));
                }
                json.put("dsmUrls", (Object)json_arr_dsmUrls);
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
        serializedLength += ByteStreamHelper.booleanGetLength(this.surfaceFollowModeEnable);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isRealtimeSurfaceFollow);
        serializedLength += ByteStreamHelper.doubleGetLength(this.surfaceRelativeHeight);
        serializedLength += ByteStreamHelper.stringArrayGetLength(this.dsmFiles);
        return serializedLength += ByteStreamHelper.stringArrayGetLength(this.dsmUrls);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.surfaceFollowModeEnable, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isRealtimeSurfaceFollow, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.surfaceRelativeHeight, serializedIndex);
        serializedIndex = ByteStreamHelper.stringArrayToBytes(resultBytes, this.dsmFiles, serializedIndex);
        serializedIndex = ByteStreamHelper.stringArrayToBytes(resultBytes, this.dsmUrls, serializedIndex);
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
        ByteResult<Boolean> tmpSurfaceFollowModeEnable = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.surfaceFollowModeEnable = (Boolean)tmpSurfaceFollowModeEnable.result;
        deserilizationIndex = tmpSurfaceFollowModeEnable.endIndex;
        ByteResult<Boolean> tmpIsRealtimeSurfaceFollow = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isRealtimeSurfaceFollow = (Boolean)tmpIsRealtimeSurfaceFollow.result;
        deserilizationIndex = tmpIsRealtimeSurfaceFollow.endIndex;
        ByteResult<Double> tmpSurfaceRelativeHeight = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.surfaceRelativeHeight = (Double)tmpSurfaceRelativeHeight.result;
        deserilizationIndex = tmpSurfaceRelativeHeight.endIndex;
        ByteResult<List<String>> tmpDsmFiles = ByteStreamHelper.stringArrayFromBytes(data, deserilizationIndex);
        this.dsmFiles = (List)tmpDsmFiles.result;
        deserilizationIndex = tmpDsmFiles.endIndex;
        ByteResult<List<String>> tmpDsmUrls = ByteStreamHelper.stringArrayFromBytes(data, deserilizationIndex);
        this.dsmUrls = (List)tmpDsmUrls.result;
        deserilizationIndex = tmpDsmUrls.endIndex;
        return deserilizationIndex;
    }

    public Boolean getSurfaceFollowModeEnable() {
        return this.surfaceFollowModeEnable;
    }

    public void setSurfaceFollowModeEnable(Boolean surfaceFollowModeEnable) {
        this.surfaceFollowModeEnable = surfaceFollowModeEnable;
    }

    public Boolean getIsRealtimeSurfaceFollow() {
        return this.isRealtimeSurfaceFollow;
    }

    public void setIsRealtimeSurfaceFollow(Boolean isRealtimeSurfaceFollow) {
        this.isRealtimeSurfaceFollow = isRealtimeSurfaceFollow;
    }

    public Double getSurfaceRelativeHeight() {
        return this.surfaceRelativeHeight;
    }

    public void setSurfaceRelativeHeight(Double surfaceRelativeHeight) {
        this.surfaceRelativeHeight = surfaceRelativeHeight;
    }

    public List<String> getDsmFiles() {
        return this.dsmFiles;
    }

    public void setDsmFiles(List<String> dsmFiles) {
        this.dsmFiles = dsmFiles;
    }

    public List<String> getDsmUrls() {
        return this.dsmUrls;
    }

    public void setDsmUrls(List<String> dsmUrls) {
        this.dsmUrls = dsmUrls;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SurfaceFollowParam)) {
            return false;
        }
        SurfaceFollowParam that = (SurfaceFollowParam)o;
        return Objects.equals(this.surfaceFollowModeEnable, that.surfaceFollowModeEnable) && Objects.equals(this.isRealtimeSurfaceFollow, that.isRealtimeSurfaceFollow) && Objects.equals(this.surfaceRelativeHeight, that.surfaceRelativeHeight) && Objects.equals(this.dsmFiles, that.dsmFiles) && Objects.equals(this.dsmUrls, that.dsmUrls);
    }

    public int hashCode() {
        return Objects.hash(this.surfaceFollowModeEnable, this.isRealtimeSurfaceFollow, this.surfaceRelativeHeight, this.dsmFiles, this.dsmUrls);
    }
}

