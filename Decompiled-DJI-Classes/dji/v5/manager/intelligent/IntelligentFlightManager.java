/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.intelligent;

import dji.sdk.keyvalue.value.flightassistant.SmartEyeMode;
import dji.sdk.keyvalue.value.flightassistant.SmartTrackInfo;
import dji.sdk.keyvalue.value.flightcontroller.FlyToMissionInfo;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.intelligent.AutoSensingInfo;
import dji.v5.manager.intelligent.AutoSensingInfoListener;
import dji.v5.manager.intelligent.AutoSensingManager;
import dji.v5.manager.intelligent.IntelligentFlightInfo;
import dji.v5.manager.intelligent.IntelligentFlightInfoListener;
import dji.v5.manager.intelligent.IntelligentModel;
import dji.v5.manager.intelligent.MissionType;
import dji.v5.manager.intelligent.flyto.FlyToMissionManager;
import dji.v5.manager.intelligent.flyto.IFlyToMissionManager;
import dji.v5.manager.intelligent.poi.IPOIMissionManager;
import dji.v5.manager.intelligent.poi.POIMissionManager;
import dji.v5.manager.intelligent.smarttrack.SmartTrackMissionManager;
import dji.v5.manager.intelligent.spotlight.ISpotLightManager;
import dji.v5.manager.intelligent.spotlight.SpotLightManager;
import dji.v5.manager.interfaces.IIntelligentFlightManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntelligentFlightManager
implements IIntelligentFlightManager {
    private static final Map<ProductType, List<MissionType>> MISSION_TYPE_RANGE_MAP = new HashMap<ProductType, List<MissionType>>();
    private final List<IntelligentFlightInfoListener> flightInfoListeners;
    private final List<AutoSensingInfoListener> autoSensingInfoListeners;
    private ProductType productType;
    private final IntelligentFlightInfo flightInfo;
    private AutoSensingInfo autoSensingInfo;
    protected List<IntelligentModel> intelligentModels;
    protected int runningModelIndex;
    private final POIMissionManager poiMissionManager;
    private final FlyToMissionManager flyToMissionManager;
    private final SpotLightManager spotLightManager;
    private final SmartTrackMissionManager smartTrackMissionManager;
    private AutoSensingManager autoSensingManager;
    private SmartTrackInfo currentSmartTrackInfo;
    private FlyToMissionInfo currentFlyToMissionInfo;

    private IntelligentFlightManager() {
    }

    public static IIntelligentFlightManager getInstance() {
        return null;
    }

    @Override
    public void init() {
    }

    private void updateRunningMissionForIndustryMachine() {
    }

    public void initAutoSensingSource() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void addIntelligentFlightInfoListener(IntelligentFlightInfoListener intelligentFlightInfoListener) {
    }

    @Override
    public void removeIntelligentFlightInfoListener(IntelligentFlightInfoListener intelligentFlightInfoListener) {
    }

    @Override
    public void addAutoSensingInfoListener(AutoSensingInfoListener autoSensingInfoListener) {
    }

    @Override
    public void removeAutoSensingInfoListener(AutoSensingInfoListener autoSensingInfoListener) {
    }

    @Override
    public void startAutoSensing(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void stopAutoSensing(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void selectIntelligentModel(int n, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public IPOIMissionManager getPOIMissionManager() {
        return null;
    }

    @Override
    public IFlyToMissionManager getFlyToMissionManager() {
        return null;
    }

    @Override
    public ISpotLightManager getSpotLightManager() {
        return null;
    }

    @Override
    public SmartTrackMissionManager getSmartTrackMissionManager() {
        return null;
    }

    private void notifyIntelligentFlightInfoListeners() {
    }

    private void notifyAutoSensingInfoListeners() {
    }

    private void notifyIntelligentModelListener() {
    }

    private void notifyRunningIntelligentModelIdListener() {
    }

    private /* synthetic */ void lambda$init$3(FlyToMissionInfo flyToMissionInfo, FlyToMissionInfo flyToMissionInfo2) {
    }

    private /* synthetic */ void lambda$init$2(SmartTrackInfo smartTrackInfo, SmartTrackInfo smartTrackInfo2) {
    }

    private /* synthetic */ void lambda$init$1(SmartEyeMode smartEyeMode, SmartEyeMode smartEyeMode2) {
    }

    private /* synthetic */ void lambda$init$0(ProductType productType, ProductType productType2) {
    }

    /* synthetic */ IntelligentFlightManager(1 var1_1) {
    }

    static /* synthetic */ AutoSensingInfo access$202(IntelligentFlightManager intelligentFlightManager, AutoSensingInfo autoSensingInfo) {
        return null;
    }

    static /* synthetic */ IntelligentFlightInfo access$300(IntelligentFlightManager intelligentFlightManager) {
        return null;
    }

    static /* synthetic */ void access$400(IntelligentFlightManager intelligentFlightManager) {
    }

    static /* synthetic */ void access$500(IntelligentFlightManager intelligentFlightManager) {
    }

    static /* synthetic */ POIMissionManager access$600(IntelligentFlightManager intelligentFlightManager) {
        return null;
    }

    static /* synthetic */ FlyToMissionManager access$700(IntelligentFlightManager intelligentFlightManager) {
        return null;
    }

    static /* synthetic */ SpotLightManager access$800(IntelligentFlightManager intelligentFlightManager) {
        return null;
    }

    static /* synthetic */ void access$900(IntelligentFlightManager intelligentFlightManager) {
    }

    static /* synthetic */ void access$1000(IntelligentFlightManager intelligentFlightManager) {
    }

    static {
        MISSION_TYPE_RANGE_MAP.put(ProductType.DJI_MATRICE_4D_SERIES, Arrays.asList(MissionType.POI, MissionType.FLY_TO, MissionType.SPOTLIGHT));
        MISSION_TYPE_RANGE_MAP.put(ProductType.DJI_MATRICE_4_SERIES, Arrays.asList(MissionType.POI, MissionType.FLY_TO, MissionType.SPOTLIGHT));
        MISSION_TYPE_RANGE_MAP.put(ProductType.DJI_MAVIC_3_ENTERPRISE_SERIES, Collections.singletonList(MissionType.POI));
        MISSION_TYPE_RANGE_MAP.put(ProductType.DJI_MINI_4_PRO, Arrays.asList(MissionType.TRACK, MissionType.POI, MissionType.SPOTLIGHT));
        MISSION_TYPE_RANGE_MAP.put(ProductType.M300_RTK, Collections.singletonList(MissionType.SPOTLIGHT));
        MISSION_TYPE_RANGE_MAP.put(ProductType.M350_RTK, Collections.singletonList(MissionType.SPOTLIGHT));
    }

    private static class LazyHolder {
        private static final IntelligentFlightManager INSTANCE = new IntelligentFlightManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ IntelligentFlightManager access$100() {
            return null;
        }
    }
}

