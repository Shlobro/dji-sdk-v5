/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.aibox;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.payload.AppLanguage;
import dji.sdk.keyvalue.value.payload.ScreenType;
import org.json.JSONObject;

public class AppLanguageInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    AppLanguage language;
    ScreenType screen;

    public AppLanguageInfo() {
    }

    public AppLanguageInfo(AppLanguage appLanguage, ScreenType screenType) {
    }

    public static AppLanguageInfo fromJson(String string) {
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

    public AppLanguage getLanguage() {
        return null;
    }

    public void setLanguage(AppLanguage appLanguage) {
    }

    public ScreenType getScreen() {
        return null;
    }

    public void setScreen(ScreenType screenType) {
    }

    public String toString() {
        return null;
    }
}

