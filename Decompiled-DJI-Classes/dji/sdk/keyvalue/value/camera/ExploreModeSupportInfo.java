/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class ExploreModeSupportInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean intervalShotSupport;
    Boolean continueShotSupport;
    Boolean video1080P30FrameRateSupport;

    public ExploreModeSupportInfo() {
    }

    public ExploreModeSupportInfo(Boolean bl, Boolean bl2, Boolean bl3) {
    }

    public static ExploreModeSupportInfo fromJson(String string) {
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

    public Boolean getIntervalShotSupport() {
        return null;
    }

    public void setIntervalShotSupport(Boolean bl) {
    }

    public Boolean getContinueShotSupport() {
        return null;
    }

    public void setContinueShotSupport(Boolean bl) {
    }

    public Boolean getVideo1080P30FrameRateSupport() {
        return null;
    }

    public void setVideo1080P30FrameRateSupport(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

