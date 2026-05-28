/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.aircraft.lte;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.airlink.WlmDongleInfo;
import java.util.List;

@Keep
public interface LTEDongleInfoListener {
    public void onLTEAircraftDongleInfoUpdate(@NonNull List<WlmDongleInfo> var1);

    public void onLTERemoteControllerDongleInfoUpdate(@NonNull List<WlmDongleInfo> var1);
}

