/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.Size
 */
package dji.component.flysafe;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import dji.component.flysafe.ISDKDbUpgrade;
import dji.component.flysafe.listener.JNICommonCallbacks;
import dji.component.flysafe.listener.JNIUnlockCommonCallbacks;
import dji.component.flysafe.listener.OnFlysafeWarnListener;
import dji.component.flysafe.listener.OnLimitDataChangedListener;
import dji.component.flysafe.listener.OnUnlockAreasListener;
import dji.component.flysafe.model.FlyForbidDrawParam;
import dji.component.flysafe.model.FlyForbidElement;
import dji.component.flysafe.model.FlyfrbAreaJniElement;
import dji.component.flysafe.unlock.model.FlyfrbLicenseV3GroupData;
import dji.component.flysafe.unlock.model.FlyfrbLicenseV3Info;
import dji.component.flysafe.unlock.model.WhiteListLicense;
import java.util.List;

public interface ISDKDJIFlySafe {
    public static final String NAME_FLYSAFE_SERVICE = "FlysafeImpl";

    public void init(Context var1);

    public void configAfterAssetInstall(String var1, String var2, String var3);

    public ISDKDbUpgrade getDbUpgradeComponent();

    public List<FlyfrbAreaJniElement> getCurAreasToUnlock();

    public void unlockSwArea(List<Integer> var1, JNIUnlockCommonCallbacks.JNIUnlockCallback var2);

    public void queryUnlockV3KeyVersionJni(JNIUnlockCommonCallbacks.JNIUnlockCommonCallbackWith<Integer> var1);

    public void unlockAreasJni(@Nullable @Size(min=1L) List<Integer> var1, JNIUnlockCommonCallbacks.UnlockCallbackWithErrorEnum var2);

    public void unlockAreasLicensesInUavJni(@Nullable @Size(min=1L) List<Integer> var1, JNIUnlockCommonCallbacks.UnlockCallbackWithErrorEnum var2);

    public void disableUnlockLicensesJni(@NonNull List<Integer> var1, JNIUnlockCommonCallbacks.UnlockCallbackWithErrorEnum var2);

    public void fetchCachedLicenseInfoJni(JNIUnlockCommonCallbacks.JNIUnlockCommonCallbackWith<List<FlyfrbLicenseV3Info>> var1);

    public void fetchCachedLicenseGroupInfoJni(JNIUnlockCommonCallbacks.JNIUnlockCommonCallbackWith<List<FlyfrbLicenseV3GroupData>> var1);

    public void fetchServerLicenseGroupInfoJni(JNIUnlockCommonCallbacks.UnlockCommonCallbackWithInfo<List<FlyfrbLicenseV3GroupData>> var1);

    public void fetchLocalLicenseGroupInfoJni(List<String> var1, JNIUnlockCommonCallbacks.UnlockCommonCallbackWithInfo<List<FlyfrbLicenseV3GroupData>> var2);

    public void fetchServerLicenseInfoJni(JNIUnlockCommonCallbacks.UnlockCommonCallbackWithInfo<List<FlyfrbLicenseV3Info>> var1);

    public void queryFCLicensesJni(JNIUnlockCommonCallbacks.JNIUnlockCommonCallbackWith<List<WhiteListLicense>> var1);

    public void uploadLicenseGroupDataJni(int var1, JNIUnlockCommonCallbacks.UnlockCallbackWithErrorEnum var2);

    public void setLicenseEnableJni(boolean var1, int var2, JNIUnlockCommonCallbacks.UnlockCommonCallbackWithInfo<boolean[]> var3);

    public void removeLicensesInAircraft(JNIUnlockCommonCallbacks.JNIUnlockCallback var1);

    @Deprecated
    public List<FlyForbidElement> getLimitData();

    public void fetchNearLimitDataByPhoneGps(JNICommonCallbacks.JNICommonCallbackWith<List<FlyForbidElement>> var1);

    public void fetchNearLimitDataByGps(Double var1, Double var2, JNICommonCallbacks.JNICommonCallbackWith<List<FlyForbidElement>> var3);

    public List<FlyForbidElement> fetchLimitDataByAreaIDSync(int var1);

    public void fetchHighestOrderNearLimitDataByGps(Double var1, Double var2, JNICommonCallbacks.JNICommonCallbackWith<FlyForbidDrawParam> var3);

    public void addLimitDataChangedListener(OnLimitDataChangedListener var1);

    public void removeLimitDataChangedListener(OnLimitDataChangedListener var1);

    public void addFlysafeWarnListener(OnFlysafeWarnListener var1);

    public void removeFlysafeWarnListener(OnFlysafeWarnListener var1);

    public double convertCoord4Log(double var1);

    public void checkOneHourApplyTFR();

    public void checkThreeMinApplyTFR();

    public void setUploadGPSAndUserIDEnabled(boolean var1);

    public void fetchCENearLimitDataByPhoneGps(JNICommonCallbacks.JNICommonCallbackWith<List<FlyForbidElement>> var1);

    public void startListenUnlockAreas(OnUnlockAreasListener var1);

    public void stopListenUnlockAreas(OnUnlockAreasListener var1);

    public List<Long> getUnlockAreas();
}

