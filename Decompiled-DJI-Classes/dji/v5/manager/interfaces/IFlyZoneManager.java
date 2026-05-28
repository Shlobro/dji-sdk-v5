/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.interfaces;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.common.LocationCoordinate2D;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.flysafe.FlySafeDatabaseListener;
import dji.v5.manager.aircraft.flysafe.FlySafeDatabaseUpgradeMode;
import dji.v5.manager.aircraft.flysafe.FlySafeNotificationListener;
import dji.v5.manager.aircraft.flysafe.info.FlyZoneInformation;
import dji.v5.manager.aircraft.flysafe.info.FlyZoneLicenseInfo;
import java.util.List;

public interface IFlyZoneManager {
    public void init();

    public void destroy();

    public void addFlySafeNotificationListener(@NonNull FlySafeNotificationListener var1);

    public void removeFlySafeNotificationListener(@NonNull FlySafeNotificationListener var1);

    public void clearAllFlySafeNotificationListener();

    public void getFlyZonesInSurroundingArea(@NonNull LocationCoordinate2D var1, @NonNull CommonCallbacks.CompletionCallbackWithParam<List<FlyZoneInformation>> var2);

    public void downloadFlyZoneLicensesFromServer(@NonNull CommonCallbacks.CompletionCallbackWithParam<List<FlyZoneLicenseInfo>> var1);

    public void getFlyZoneLicensesFromLocalLicensesFile(@NonNull CommonCallbacks.CompletionCallbackWithParam<List<FlyZoneLicenseInfo>> var1);

    @NonNull
    public List<FlyZoneInformation> getFlyZonesByAreaID(int var1);

    public void pushFlyZoneLicensesToAircraft(@NonNull CommonCallbacks.CompletionCallback var1);

    public void pullFlyZoneLicensesFromAircraft(@NonNull CommonCallbacks.CompletionCallbackWithParam<List<FlyZoneLicenseInfo>> var1);

    public void deleteFlyZoneLicensesFromAircraft(@NonNull CommonCallbacks.CompletionCallback var1);

    public void setFlyZoneLicensesEnabled(@NonNull FlyZoneLicenseInfo var1, boolean var2, @NonNull CommonCallbacks.CompletionCallback var3);

    public void unlockAuthorizationFlyZone(int var1, @NonNull CommonCallbacks.CompletionCallback var2);

    public void unlockAllEnhancedWarningFlyZone(@NonNull CommonCallbacks.CompletionCallback var1);

    public void addFlySafeDatabaseListener(@NonNull FlySafeDatabaseListener var1);

    public void removeFlySafeDatabaseListener(@NonNull FlySafeDatabaseListener var1);

    public void clearAllFlySafeDatabaseListener();

    public void setFlySafeDynamicDatabaseUpgradeMode(@NonNull FlySafeDatabaseUpgradeMode var1, @NonNull CommonCallbacks.CompletionCallback var2);

    public void importFlySafeDynamicDatabaseToMSDK(String var1, @NonNull CommonCallbacks.CompletionCallbackWithProgress<Double> var2);

    public void pushFlySafeDynamicDatabaseToAircraft(@NonNull CommonCallbacks.CompletionCallbackWithProgress<Double> var1);
}

