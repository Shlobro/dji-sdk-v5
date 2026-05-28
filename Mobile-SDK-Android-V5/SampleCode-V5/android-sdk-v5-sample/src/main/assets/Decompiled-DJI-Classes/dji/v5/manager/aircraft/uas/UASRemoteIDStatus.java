/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.manager.aircraft.uas;

import androidx.annotation.Keep;
import dji.v5.manager.aircraft.uas.RemoteIdWorkingState;

@Keep
public class UASRemoteIDStatus {
    @Keep
    private boolean isBroadcastRemoteIdEnabled;
    @Keep
    private RemoteIdWorkingState remoteIdWorkingState;

    @Keep
    public boolean isBroadcastRemoteIdEnabled() {
        return false;
    }

    public RemoteIdWorkingState getRemoteIdWorkingState() {
        return null;
    }

    public String toString() {
        return null;
    }
}

