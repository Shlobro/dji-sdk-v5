/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.upgrade;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.upgrade.UpgradeHotPluginItem;
import java.util.List;
import org.json.JSONObject;

public class UpgradeHotPluginMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<UpgradeHotPluginItem> msgs;

    public UpgradeHotPluginMsg() {
    }

    public UpgradeHotPluginMsg(List<UpgradeHotPluginItem> list) {
    }

    public static UpgradeHotPluginMsg fromJson(String string) {
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

    public List<UpgradeHotPluginItem> getMsgs() {
        return null;
    }

    public void setMsgs(List<UpgradeHotPluginItem> list) {
    }

    public String toString() {
        return null;
    }
}

