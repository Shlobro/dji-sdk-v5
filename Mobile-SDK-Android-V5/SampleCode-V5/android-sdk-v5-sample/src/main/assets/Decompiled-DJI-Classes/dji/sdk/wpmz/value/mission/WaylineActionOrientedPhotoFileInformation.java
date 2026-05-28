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

public class WaylineActionOrientedPhotoFileInformation
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer file_size = 0;
    String file_path = "";
    String file_md5 = "";
    String fileSuffix = "";

    public WaylineActionOrientedPhotoFileInformation() {
    }

    public WaylineActionOrientedPhotoFileInformation(Integer file_size, String file_path, String file_md5, String fileSuffix) {
        if (file_size != null) {
            this.file_size = file_size;
        }
        if (file_path != null) {
            this.file_path = file_path;
        }
        if (file_md5 != null) {
            this.file_md5 = file_md5;
        }
        if (fileSuffix != null) {
            this.fileSuffix = fileSuffix;
        }
    }

    public static WaylineActionOrientedPhotoFileInformation fromJson(String jsonString) {
        WaylineActionOrientedPhotoFileInformation tmpValueResult_ = new WaylineActionOrientedPhotoFileInformation();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.file_size = jsonObj.getInt("file_size");
            tmpValueResult_.file_path = jsonObj.getString("file_path");
            tmpValueResult_.file_md5 = jsonObj.getString("file_md5");
            tmpValueResult_.fileSuffix = jsonObj.getString("fileSuffix");
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
            if (null != this.file_size) {
                json.put("file_size", (Object)this.file_size);
            }
            if (null != this.file_path) {
                json.put("file_path", (Object)this.file_path);
            }
            if (null != this.file_md5) {
                json.put("file_md5", (Object)this.file_md5);
            }
            if (null != this.fileSuffix) {
                json.put("fileSuffix", (Object)this.fileSuffix);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.file_size);
        serializedLength += ByteStreamHelper.stringGetLength(this.file_path);
        serializedLength += ByteStreamHelper.stringGetLength(this.file_md5);
        return serializedLength += ByteStreamHelper.stringGetLength(this.fileSuffix);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.file_size, serializedIndex);
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.file_path, serializedIndex);
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.file_md5, serializedIndex);
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.fileSuffix, serializedIndex);
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
        ByteResult<Integer> tmpFile_size = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.file_size = (Integer)tmpFile_size.result;
        deserilizationIndex = tmpFile_size.endIndex;
        ByteResult<String> tmpFile_path = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.file_path = (String)tmpFile_path.result;
        deserilizationIndex = tmpFile_path.endIndex;
        ByteResult<String> tmpFile_md5 = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.file_md5 = (String)tmpFile_md5.result;
        deserilizationIndex = tmpFile_md5.endIndex;
        ByteResult<String> tmpFileSuffix = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.fileSuffix = (String)tmpFileSuffix.result;
        deserilizationIndex = tmpFileSuffix.endIndex;
        return deserilizationIndex;
    }

    public Integer getFile_size() {
        return this.file_size;
    }

    public void setFile_size(Integer file_size) {
        this.file_size = file_size;
    }

    public String getFile_path() {
        return this.file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public String getFile_md5() {
        return this.file_md5;
    }

    public void setFile_md5(String file_md5) {
        this.file_md5 = file_md5;
    }

    public String getFileSuffix() {
        return this.fileSuffix;
    }

    public void setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineActionOrientedPhotoFileInformation)) {
            return false;
        }
        WaylineActionOrientedPhotoFileInformation that = (WaylineActionOrientedPhotoFileInformation)o;
        return Objects.equals(this.file_size, that.file_size) && Objects.equals(this.file_path, that.file_path) && Objects.equals(this.file_md5, that.file_md5) && Objects.equals(this.fileSuffix, that.fileSuffix);
    }

    public int hashCode() {
        return Objects.hash(this.file_size, this.file_path, this.file_md5, this.fileSuffix);
    }
}

