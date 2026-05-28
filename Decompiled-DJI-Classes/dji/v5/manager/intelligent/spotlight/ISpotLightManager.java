/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.intelligent.spotlight;

import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.intelligent.IMissionManager;
import dji.v5.manager.intelligent.spotlight.SpotLightCapability;
import dji.v5.manager.intelligent.spotlight.SpotLightInfo;
import dji.v5.manager.intelligent.spotlight.SpotLightParam;
import dji.v5.manager.intelligent.spotlight.SpotLightTarget;

public interface ISpotLightManager
extends IMissionManager<SpotLightTarget, SpotLightParam, SpotLightInfo, SpotLightCapability> {
    public void enterSpotLightMode(CommonCallbacks.CompletionCallback var1);

    public void exitSpotLightMode(CommonCallbacks.CompletionCallback var1);

    public void confirmTarget(CommonCallbacks.CompletionCallback var1);
}

