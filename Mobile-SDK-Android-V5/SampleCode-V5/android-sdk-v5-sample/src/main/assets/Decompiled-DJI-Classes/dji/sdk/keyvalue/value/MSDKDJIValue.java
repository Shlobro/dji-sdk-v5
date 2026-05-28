/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value;

import dji.sdk.keyvalue.value.base.DJIValue;
import dji.v5.utils.common.LogPath;
import org.json.JSONObject;

public abstract class MSDKDJIValue
implements DJIValue {
    public static final LogPath TAG = LogPath.COMMON;

    @Override
    public abstract JSONObject toJson();

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

    public String toString() {
        return null;
    }
}

