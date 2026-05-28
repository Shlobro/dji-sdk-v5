/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.intelligent;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.common.DoubleRect;
import dji.sdk.keyvalue.value.flightassistant.AIIdentifyMode;
import dji.sdk.keyvalue.value.flightassistant.AIModelInfoMsg;
import dji.sdk.keyvalue.value.flightassistant.AIModelOverview;
import dji.sdk.keyvalue.value.flightassistant.SmartTrackInfo;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.datacenter.camera.FrameExtInfoAI;
import dji.v5.manager.intelligent.AutoSensingInfoListener;
import dji.v5.manager.intelligent.AutoSensingManager;
import dji.v5.manager.intelligent.AutoSensingTarget;
import dji.v5.manager.intelligent.IntelligentModel;
import dji.v5.manager.intelligent.spotlight.SportLightState;
import java.util.List;

class M4AutoSensingManager
extends AutoSensingManager {
    private static final int TARGET_TYPE_PERSON_FROM_FRAME = 2;
    private static final int TARGET_TYPE_CAR_FROM_FRAME = 3;
    private static final int TARGET_TYPE_BOAT_FROM_FRAME = 4;
    private static final int CUSTOM_TYPE_FIRST_IDX = 128;
    private AIModelInfoMsg aiModelInfo;
    private SportLightState sportLightState;

    public M4AutoSensingManager(AutoSensingInfoListener autoSensingInfoListener) {
    }

    @Override
    void init() {
    }

    @NonNull
    private static DoubleRect getDoubleRect(FrameExtInfoAI.PerTargetInfo perTargetInfo) {
        return null;
    }

    @NonNull
    private IntelligentModel getIntelligentModel(AIModelOverview aIModelOverview) {
        return null;
    }

    @Override
    void destroy() {
    }

    @Override
    void startAutoSensing(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    void stopAutoSensing(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    void selectIntelligentModel(int n, CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void updateLabelMap(int n) {
    }

    private AutoSensingTarget createAutoSensingTarget(int n, int n2, DoubleRect doubleRect) {
        return null;
    }

    private int transferTargetTypeFromFrame(int n) {
        return 0;
    }

    private boolean isTargetCustomType(int n) {
        return false;
    }

    private String findLabel(int n) {
        return null;
    }

    private /* synthetic */ void lambda$init$4(int n, int n2, byte[] byArray, int n3) {
    }

    private /* synthetic */ void lambda$init$3(SmartTrackInfo smartTrackInfo, SmartTrackInfo smartTrackInfo2) {
    }

    private /* synthetic */ void lambda$init$2(List list, List list2) {
    }

    private /* synthetic */ void lambda$init$1(Integer n, Integer n2) {
    }

    private /* synthetic */ void lambda$init$0(AIIdentifyMode aIIdentifyMode, AIIdentifyMode aIIdentifyMode2) {
    }

    static /* synthetic */ AIModelInfoMsg access$002(M4AutoSensingManager m4AutoSensingManager, AIModelInfoMsg aIModelInfoMsg) {
        return null;
    }
}

