/*
 * Decompiled with CFR 0.152.
 */
package dji.flightrecord.callback;

import dji.sdk.keyvalue.value.flightcontroller.FlightRecordRecoveryInfo;

public interface RecoveryEventCallback {
    public void callback(int var1, int var2, FlightRecordRecoveryInfo var3);
}

