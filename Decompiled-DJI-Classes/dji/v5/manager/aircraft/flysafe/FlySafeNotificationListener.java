/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.aircraft.flysafe;

import androidx.annotation.NonNull;
import dji.v5.manager.aircraft.flysafe.info.FlySafeReturnToHomeInformation;
import dji.v5.manager.aircraft.flysafe.info.FlySafeSeriousWarningInformation;
import dji.v5.manager.aircraft.flysafe.info.FlySafeTipInformation;
import dji.v5.manager.aircraft.flysafe.info.FlySafeWarningInformation;
import dji.v5.manager.aircraft.flysafe.info.FlyZoneInformation;
import java.util.List;

public interface FlySafeNotificationListener {
    public void onTipNotificationUpdate(@NonNull FlySafeTipInformation var1);

    public void onWarningNotificationUpdate(@NonNull FlySafeWarningInformation var1);

    public void onSeriousWarningNotificationUpdate(@NonNull FlySafeSeriousWarningInformation var1);

    public void onReturnToHomeNotificationUpdate(@NonNull FlySafeReturnToHomeInformation var1);

    public void onSurroundingFlyZonesUpdate(@NonNull List<FlyZoneInformation> var1);
}

