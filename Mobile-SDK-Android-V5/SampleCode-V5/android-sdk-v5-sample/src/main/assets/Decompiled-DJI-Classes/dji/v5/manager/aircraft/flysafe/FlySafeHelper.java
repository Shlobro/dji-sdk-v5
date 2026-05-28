/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.aircraft.flysafe;

import android.content.Context;
import androidx.annotation.NonNull;
import com.dji.flysafe.mapkit.core.core.models.DJILatLng;
import dji.component.flysafe.dbupgrade.model.FlysafeDataUpgradeModelWrapper;
import dji.component.flysafe.model.FlyForbidElement;
import dji.component.flysafe.model.JNIFSCEDatabaseInfo;
import dji.component.flysafe.model.JNIWarnModelWrappers;
import dji.component.flysafe.unlock.model.FlyfrbLicenseV3GroupData;
import dji.component.flysafe.unlock.model.WhiteListLicense;
import dji.csdk.flysafe.RTHTipsEventType;
import dji.sdk.keyvalue.value.common.LocationCoordinate2D;
import dji.v5.manager.aircraft.flysafe.FlySafeDatabaseState;
import dji.v5.manager.aircraft.flysafe.FlySafeDatabaseUpgradeMode;
import dji.v5.manager.aircraft.flysafe.info.FlySafeDatabaseInfo;
import dji.v5.manager.aircraft.flysafe.info.FlySafeReturnToHomeInformation;
import dji.v5.manager.aircraft.flysafe.info.FlySafeSeriousWarningInformation;
import dji.v5.manager.aircraft.flysafe.info.FlySafeTipInformation;
import dji.v5.manager.aircraft.flysafe.info.FlySafeWarningInformation;
import dji.v5.manager.aircraft.flysafe.info.FlyZoneInformation;
import dji.v5.manager.aircraft.flysafe.info.FlyZoneLicenseInfo;
import java.util.List;

class FlySafeHelper {
    private FlySafeHelper() {
    }

    public static FlyZoneInformation translateForbidElement(FlyForbidElement flyForbidElement) {
        return null;
    }

    public static List<FlyZoneInformation> translateForbidElement(List<FlyForbidElement> list) {
        return null;
    }

    public static String getResStr(Context context, int n, Object ... objectArray) {
        return null;
    }

    public static FlySafeTipInformation generateFlySafeTipInformation(JNIWarnModelWrappers.ShowTipsWrapper showTipsWrapper) {
        return null;
    }

    public static FlySafeWarningInformation generateFlySafeWarningInformation(JNIWarnModelWrappers.ShowWarningWrapper showWarningWrapper) {
        return null;
    }

    public static FlySafeSeriousWarningInformation generateFlySafeSeriousWarningInformation(JNIWarnModelWrappers.ShowCDLWarningWrapper showCDLWarningWrapper) {
        return null;
    }

    public static FlySafeReturnToHomeInformation generateFlySafeReturnToHomeInformation(RTHTipsEventType rTHTipsEventType) {
        return null;
    }

    public static FlyZoneLicenseInfo translateWhiteListLicense(WhiteListLicense whiteListLicense, String string2) {
        return null;
    }

    public static List<FlyZoneLicenseInfo> translateWhiteListLicense(List<WhiteListLicense> list, String string2) {
        return null;
    }

    public static List<FlyZoneLicenseInfo> translateFlyfrbLicenseV3GroupData(FlyfrbLicenseV3GroupData flyfrbLicenseV3GroupData) {
        return null;
    }

    public static List<FlyZoneLicenseInfo> translateFlyfrbLicenseV3GroupData(List<FlyfrbLicenseV3GroupData> list) {
        return null;
    }

    public static List<LocationCoordinate2D> translateDJILatLngList(List<DJILatLng> list) {
        return null;
    }

    public static FlySafeDatabaseInfo generateFlySafeDatabaseInfo(JNIFSCEDatabaseInfo jNIFSCEDatabaseInfo) {
        return null;
    }

    public static JNIFSCEDatabaseInfo.CEDatabaseType generateDatabaseType(FlySafeDatabaseUpgradeMode flySafeDatabaseUpgradeMode) {
        return null;
    }

    public static FlySafeDatabaseState generateFlysafeDatabaseState(@NonNull FlysafeDataUpgradeModelWrapper.CEDbUpgradeStateWrapper cEDbUpgradeStateWrapper) {
        return null;
    }
}

