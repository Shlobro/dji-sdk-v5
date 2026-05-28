/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.aibox;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.aibox.AIBoxAppType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class AIBoxAppInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String id;
    String name;
    AIBoxAppType type;
    String version;
    Double appSize;
    Double dataSize;
    String publisher;
    String platform;
    String description;
    Double time;
    Boolean isAIRenderingApp;
    Boolean isAutoLaunch;

    public AIBoxAppInfoMsg() {
    }

    public AIBoxAppInfoMsg(String string, String string2, AIBoxAppType aIBoxAppType, String string3, Double d2, Double d3, String string4, String string5, String string6, Double d4, Boolean bl, Boolean bl2) {
    }

    public static AIBoxAppInfoMsg fromJson(String string) {
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

    public String getId() {
        return null;
    }

    public void setId(String string) {
    }

    public String getName() {
        return null;
    }

    public void setName(String string) {
    }

    public AIBoxAppType getType() {
        return null;
    }

    public void setType(AIBoxAppType aIBoxAppType) {
    }

    public String getVersion() {
        return null;
    }

    public void setVersion(String string) {
    }

    public Double getAppSize() {
        return null;
    }

    public void setAppSize(Double d2) {
    }

    public Double getDataSize() {
        return null;
    }

    public void setDataSize(Double d2) {
    }

    public String getPublisher() {
        return null;
    }

    public void setPublisher(String string) {
    }

    public String getPlatform() {
        return null;
    }

    public void setPlatform(String string) {
    }

    public String getDescription() {
        return null;
    }

    public void setDescription(String string) {
    }

    public Double getTime() {
        return null;
    }

    public void setTime(Double d2) {
    }

    public Boolean getIsAIRenderingApp() {
        return null;
    }

    public void setIsAIRenderingApp(Boolean bl) {
    }

    public Boolean getIsAutoLaunch() {
        return null;
    }

    public void setIsAutoLaunch(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

