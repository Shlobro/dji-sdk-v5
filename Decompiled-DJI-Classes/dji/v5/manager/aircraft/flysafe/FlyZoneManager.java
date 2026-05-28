/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  io.reactivex.rxjava3.core.Observable
 *  io.reactivex.rxjava3.core.ObservableEmitter
 *  io.reactivex.rxjava3.disposables.Disposable
 *  io.reactivex.rxjava3.subjects.Subject
 */
package dji.v5.manager.aircraft.flysafe;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import dji.component.flysafe.dbupgrade.listener.CEDatabaseInfoListener;
import dji.component.flysafe.dbupgrade.listener.CEDbUpgradeStateChangeListener;
import dji.component.flysafe.dbupgrade.listener.CommonProgressListener;
import dji.component.flysafe.dbupgrade.model.FlysafeDataUpgradeModelWrapper;
import dji.component.flysafe.listener.OnFlysafeWarnListener;
import dji.component.flysafe.listener.OnLimitDataChangedListener;
import dji.component.flysafe.model.FlyForbidElement;
import dji.component.flysafe.model.JNIFSCEDatabaseInfo;
import dji.sdk.keyvalue.value.common.LocationCoordinate2D;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.flysafe.FlySafeDatabaseListener;
import dji.v5.manager.aircraft.flysafe.FlySafeDatabaseState;
import dji.v5.manager.aircraft.flysafe.FlySafeDatabaseUpgradeMode;
import dji.v5.manager.aircraft.flysafe.FlySafeNotificationListener;
import dji.v5.manager.aircraft.flysafe.info.FlyZoneInformation;
import dji.v5.manager.aircraft.flysafe.info.FlyZoneLicenseInfo;
import dji.v5.manager.interfaces.IFlyZoneManager;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.List;

public class FlyZoneManager
implements IFlyZoneManager {
    private static final int VERSION_PRECISE_DB_FOR_APP = 39;
    private static final String PRECISE_STATIC_DB_NAME = "flysafe_areas_djigo.db.confumix";
    private static final String KEY_PRECISE_DB_VERSION_FOR_APP = "pref_key_precise_db_version_for_app";
    private static final String BASIC_STATIC_DB_NAME = "dji.nfzdb2.confumix";
    private static final String BASIC_STATIC_DB_SIGNATURE_NAME = "dji.nfzdb2.sig";
    private static final String KEY_BASIC_DB_VERSION_FOR_APP = "pref_key_basic_db_version_for_app";
    private static final int VERSION_BASIC_DB_FOR_APP = 9;
    private final Subject<List<FlyZoneLicenseInfo>> flyZoneLicenseInfoSubject;
    private final List<FlySafeNotificationListener> notificationListeners;
    private final List<FlyZoneInformation> aircraftNearByFlyZoneInformation;
    private final List<FlySafeDatabaseListener> flySafeDatabaseListeners;
    private CommonCallbacks.CompletionCallbackWithProgress<Double> importDatabaseProgressCallback;
    private CommonCallbacks.CompletionCallbackWithProgress<Double> sysDatabaseProgressCallback;
    private Disposable disposable;
    private FlysafeDataUpgradeModelWrapper.CEDbUpgradeStateWrapper latestUpgradeState;
    private final OnLimitDataChangedListener onLimitDataChangedListener;
    private final OnFlysafeWarnListener warnListener;
    private final CEDatabaseInfoListener ceDatabaseInfoListener;
    private final CommonProgressListener sysnProgressListener;
    private final CommonProgressListener importProgressListener;
    private final CEDbUpgradeStateChangeListener upgradeStateChangeListener;

    private FlyZoneManager() {
    }

    public static FlyZoneManager getInstance() {
        return null;
    }

    @Override
    public void init() {
    }

    private void addCEListener() {
    }

    private void removeCElistner() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void addFlySafeNotificationListener(@NonNull FlySafeNotificationListener flySafeNotificationListener) {
    }

    @Override
    public void removeFlySafeNotificationListener(@NonNull FlySafeNotificationListener flySafeNotificationListener) {
    }

    @Override
    public void clearAllFlySafeNotificationListener() {
    }

    @Override
    public void getFlyZonesInSurroundingArea(@NonNull LocationCoordinate2D locationCoordinate2D, @NonNull CommonCallbacks.CompletionCallbackWithParam<List<FlyZoneInformation>> completionCallbackWithParam) {
    }

    @Override
    @NonNull
    public List<FlyZoneInformation> getFlyZonesByAreaID(int n) {
        return null;
    }

    @Override
    public void downloadFlyZoneLicensesFromServer(@NonNull CommonCallbacks.CompletionCallbackWithParam<List<FlyZoneLicenseInfo>> completionCallbackWithParam) {
    }

    @Override
    public void getFlyZoneLicensesFromLocalLicensesFile(@NonNull CommonCallbacks.CompletionCallbackWithParam<List<FlyZoneLicenseInfo>> completionCallbackWithParam) {
    }

    @Override
    @SuppressLint(value={"CheckResult"})
    public void pushFlyZoneLicensesToAircraft(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @SuppressLint(value={"CheckResult"})
    public void pullFlyZoneLicensesFromAircraft(@NonNull CommonCallbacks.CompletionCallbackWithParam<List<FlyZoneLicenseInfo>> completionCallbackWithParam) {
    }

    @Override
    public void deleteFlyZoneLicensesFromAircraft(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void setFlyZoneLicensesEnabled(@NonNull FlyZoneLicenseInfo flyZoneLicenseInfo, boolean bl, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void unlockAuthorizationFlyZone(int n, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void unlockAllEnhancedWarningFlyZone(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void addFlySafeDatabaseListener(@NonNull FlySafeDatabaseListener flySafeDatabaseListener) {
    }

    private void notifyCurUpgradeState() {
    }

    private void transToState(FlySafeDatabaseState flySafeDatabaseState) {
    }

    private void queryCurFlySafeDatabaseInfo() {
    }

    private void getAircraftCEDatabase(JNIFSCEDatabaseInfo jNIFSCEDatabaseInfo) {
    }

    @Override
    public void removeFlySafeDatabaseListener(@NonNull FlySafeDatabaseListener flySafeDatabaseListener) {
    }

    @Override
    public void clearAllFlySafeDatabaseListener() {
    }

    @Override
    public void setFlySafeDynamicDatabaseUpgradeMode(@NonNull FlySafeDatabaseUpgradeMode flySafeDatabaseUpgradeMode, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void importFlySafeDynamicDatabaseToMSDK(String string2, @NonNull CommonCallbacks.CompletionCallbackWithProgress<Double> completionCallbackWithProgress) {
    }

    @Override
    public void pushFlySafeDynamicDatabaseToAircraft(@NonNull CommonCallbacks.CompletionCallbackWithProgress<Double> completionCallbackWithProgress) {
    }

    public Observable<List<FlyForbidElement>> fetchNearLimitDataByGps(double d2, double d3) {
        return null;
    }

    public Observable<List<FlyForbidElement>> fetchCENearLimitDataByPhoneGps(double d2, double d3) {
        return null;
    }

    public Observable<List<FlyZoneLicenseInfo>> observeFlyZoneLicenseInfoChanged() {
        return null;
    }

    private void onSurroundingFlyZonesUpdate() {
    }

    private void updateAppBasicDatabase(Context context) {
    }

    private void updatePreciseDatabase(Context context) {
    }

    private static /* synthetic */ void lambda$fetchCENearLimitDataByPhoneGps$16(ObservableEmitter observableEmitter) throws Throwable {
    }

    private static /* synthetic */ void lambda$fetchCENearLimitDataByPhoneGps$15(ObservableEmitter observableEmitter, List list) {
    }

    private static /* synthetic */ void lambda$fetchNearLimitDataByGps$14(double d2, double d3, ObservableEmitter observableEmitter) throws Throwable {
    }

    private static /* synthetic */ void lambda$fetchNearLimitDataByGps$13(ObservableEmitter observableEmitter, List list) {
    }

    private static /* synthetic */ void lambda$pullFlyZoneLicensesFromAircraft$12(CommonCallbacks.CompletionCallbackWithParam completionCallbackWithParam, Throwable throwable) throws Throwable {
    }

    private /* synthetic */ void lambda$pullFlyZoneLicensesFromAircraft$11(CommonCallbacks.CompletionCallbackWithParam completionCallbackWithParam, String string2) throws Throwable {
    }

    private static /* synthetic */ void lambda$pushFlyZoneLicensesToAircraft$10(CommonCallbacks.CompletionCallback completionCallback, Throwable throwable) throws Throwable {
    }

    private /* synthetic */ void lambda$pushFlyZoneLicensesToAircraft$9(CommonCallbacks.CompletionCallback completionCallback, String string2) throws Throwable {
    }

    private static /* synthetic */ void lambda$getFlyZonesInSurroundingArea$8(CommonCallbacks.CompletionCallbackWithParam completionCallbackWithParam, List list) throws Throwable {
    }

    private static /* synthetic */ List lambda$getFlyZonesInSurroundingArea$7(List list, List list2) throws Throwable {
        return null;
    }

    private /* synthetic */ void lambda$new$6(FlysafeDataUpgradeModelWrapper.CEDbUpgradeStateWrapper cEDbUpgradeStateWrapper) {
    }

    private /* synthetic */ void lambda$new$5(double d2) {
    }

    private /* synthetic */ void lambda$new$4(double d2) {
    }

    private /* synthetic */ void lambda$new$3(JNIFSCEDatabaseInfo jNIFSCEDatabaseInfo) {
    }

    private /* synthetic */ void lambda$init$2(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$init$1() {
    }

    private /* synthetic */ void lambda$new$0() {
    }

    static /* synthetic */ List access$000(FlyZoneManager flyZoneManager) {
        return null;
    }

    /* synthetic */ FlyZoneManager(1 var1_1) {
    }

    static /* synthetic */ void access$300(FlyZoneManager flyZoneManager, FlySafeDatabaseState flySafeDatabaseState) {
    }

    static /* synthetic */ List access$400(FlyZoneManager flyZoneManager) {
        return null;
    }

    static /* synthetic */ void access$500(FlyZoneManager flyZoneManager, JNIFSCEDatabaseInfo jNIFSCEDatabaseInfo) {
    }

    static /* synthetic */ CommonCallbacks.CompletionCallbackWithProgress access$600(FlyZoneManager flyZoneManager) {
        return null;
    }

    static /* synthetic */ CommonCallbacks.CompletionCallbackWithProgress access$700(FlyZoneManager flyZoneManager) {
        return null;
    }

    static /* synthetic */ Subject access$800(FlyZoneManager flyZoneManager) {
        return null;
    }

    static /* synthetic */ List access$900(FlyZoneManager flyZoneManager) {
        return null;
    }

    static /* synthetic */ void access$1000(FlyZoneManager flyZoneManager) {
    }

    private static class LazyHolder {
        private static final FlyZoneManager INSTANCE = new FlyZoneManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ FlyZoneManager access$200() {
            return null;
        }
    }
}

