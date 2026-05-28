/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.sdk.keyvalue.value.MSDKDJIValue;
import dji.sdk.keyvalue.value.camera.CameraStreamSettingsMsg;
import dji.sdk.keyvalue.value.camera.CameraType;
import dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType;
import java.util.List;
import org.json.JSONObject;

public class CameraStreamSettingsInfo
extends MSDKDJIValue {
    private boolean requestCurrentScreen;
    private List<CameraVideoStreamSourceType> cameraVideoStreamSources;

    public boolean getRequestCurrentScreen() {
        return false;
    }

    public List<CameraVideoStreamSourceType> getCameraVideoStreamSources() {
        return null;
    }

    public CameraStreamSettingsInfo setRequestCurrentScreen(boolean bl) {
        return null;
    }

    public CameraStreamSettingsInfo setCameraVideoStreamSources(List<CameraVideoStreamSourceType> list) {
        return null;
    }

    public CameraStreamSettingsInfo(boolean bl, List<CameraVideoStreamSourceType> list) {
    }

    public CameraStreamSettingsInfo() {
    }

    public static CameraStreamSettingsInfo fromJson(String string) {
        return null;
    }

    @Override
    public JSONObject toJson() {
        return null;
    }

    public CameraStreamSettingsMsg toMsg(CameraType cameraType) {
        return null;
    }

    public static CameraStreamSettingsInfo build(CameraStreamSettingsMsg cameraStreamSettingsMsg, CameraType cameraType) {
        return null;
    }
}

