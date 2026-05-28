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
import dji.sdk.wpmz.value.mission.WaylineCheckError;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class WaylineCheckErrorMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<WaylineCheckError> value = new ArrayList<WaylineCheckError>();

    public WaylineCheckErrorMsg() {
    }

    public WaylineCheckErrorMsg(List<WaylineCheckError> value) {
        if (value != null) {
            this.value = value;
        }
    }

    public static WaylineCheckErrorMsg fromJson(String jsonString) {
        WaylineCheckErrorMsg tmpValueResult_ = new WaylineCheckErrorMsg();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            JSONArray valueJsonArr = jsonObj.getJSONArray("value");
            for (int i = 0; i < valueJsonArr.length(); ++i) {
                tmpValueResult_.value.add(WaylineCheckError.find(valueJsonArr.getInt(i)));
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
            json = new JSONObject();
            if (null != this.value) {
                JSONArray json_arr_value = new JSONArray();
                for (int i = 0; i < this.value.size(); ++i) {
                    json_arr_value.put(this.value.get(i).value());
                }
                json.put("value", (Object)json_arr_value);
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
        serializedLength += 4;
        for (int i = 0; i < this.value.size(); ++i) {
            serializedLength += ByteStreamHelper.integerGetLength(this.value.get(i).value());
        }
        return serializedLength;
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        int arrlength = this.value.size();
        ByteStreamHelper.intArrayTobyte(resultBytes, serializedIndex, arrlength);
        serializedIndex += 4;
        for (int i = 0; i < arrlength; ++i) {
            serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.value.get(i).value(), serializedIndex);
        }
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
        this.value = new ArrayList<WaylineCheckError>();
        int length = ByteBuffer.wrap(data, deserilizationIndex, 4).order(ByteOrder.LITTLE_ENDIAN).getInt();
        deserilizationIndex += 4;
        for (int i = 0; i < length; ++i) {
            ByteResult<Integer> member = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
            deserilizationIndex = member.endIndex;
            this.value.add(WaylineCheckError.find((Integer)member.result));
        }
        return deserilizationIndex;
    }

    public List<WaylineCheckError> getValue() {
        return this.value;
    }

    public void setValue(List<WaylineCheckError> value) {
        this.value = value;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineCheckErrorMsg)) {
            return false;
        }
        WaylineCheckErrorMsg that = (WaylineCheckErrorMsg)o;
        return Objects.equals(this.value, that.value);
    }

    public int hashCode() {
        return Objects.hash(this.value);
    }
}

