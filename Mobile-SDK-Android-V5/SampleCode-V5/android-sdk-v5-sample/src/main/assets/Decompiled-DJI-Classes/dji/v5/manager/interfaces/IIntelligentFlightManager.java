/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.interfaces;

import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.intelligent.AutoSensingInfoListener;
import dji.v5.manager.intelligent.IntelligentFlightInfoListener;
import dji.v5.manager.intelligent.flyto.IFlyToMissionManager;
import dji.v5.manager.intelligent.poi.IPOIMissionManager;
import dji.v5.manager.intelligent.smarttrack.ISmartTrackMissionManager;
import dji.v5.manager.intelligent.spotlight.ISpotLightManager;

public interface IIntelligentFlightManager {
    public void init();

    public void destroy();

    public void addIntelligentFlightInfoListener(IntelligentFlightInfoListener var1);

    public void removeIntelligentFlightInfoListener(IntelligentFlightInfoListener var1);

    public void addAutoSensingInfoListener(AutoSensingInfoListener var1);

    public void removeAutoSensingInfoListener(AutoSensingInfoListener var1);

    public void startAutoSensing(CommonCallbacks.CompletionCallback var1);

    public void stopAutoSensing(CommonCallbacks.CompletionCallback var1);

    public void selectIntelligentModel(int var1, CommonCallbacks.CompletionCallback var2);

    public IPOIMissionManager getPOIMissionManager();

    public IFlyToMissionManager getFlyToMissionManager();

    public ISpotLightManager getSpotLightManager();

    public ISmartTrackMissionManager getSmartTrackMissionManager();
}

