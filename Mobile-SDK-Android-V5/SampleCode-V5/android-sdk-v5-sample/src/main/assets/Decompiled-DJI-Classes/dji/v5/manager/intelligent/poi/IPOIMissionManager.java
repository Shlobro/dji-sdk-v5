/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.intelligent.poi;

import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.intelligent.IMissionManager;
import dji.v5.manager.intelligent.poi.POICapability;
import dji.v5.manager.intelligent.poi.POIInfo;
import dji.v5.manager.intelligent.poi.POIParam;
import dji.v5.manager.intelligent.poi.POITarget;

public interface IPOIMissionManager
extends IMissionManager<POITarget, POIParam, POIInfo, POICapability> {
    public void lockCircularVelocity(boolean var1, CommonCallbacks.CompletionCallback var2);

    public void lockGimbalPitch(boolean var1, CommonCallbacks.CompletionCallback var2);
}

