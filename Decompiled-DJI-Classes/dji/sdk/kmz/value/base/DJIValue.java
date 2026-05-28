/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.kmz.value.base;

import org.json.JSONObject;

public interface DJIValue {
    public JSONObject toJson();

    public int toBytes(byte[] var1, int var2);

    public byte[] toBytes();

    public int fromBytes(byte[] var1, int var2);
}

