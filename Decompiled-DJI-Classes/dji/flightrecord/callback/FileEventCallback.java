/*
 * Decompiled with CFR 0.152.
 */
package dji.flightrecord.callback;

import dji.sdk.keyvalue.value.flightcontroller.FlightRecordFileInfo;

public interface FileEventCallback {
    public void callback(int var1, int var2, FlightRecordFileInfo var3);
}

