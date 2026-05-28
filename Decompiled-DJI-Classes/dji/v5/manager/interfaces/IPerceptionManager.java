/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.interfaces;

import dji.v5.manager.aircraft.perception.IPerceptionCommon;
import dji.v5.manager.aircraft.perception.IVisualManager;
import dji.v5.manager.interfaces.IRadarManager;

public interface IPerceptionManager
extends IVisualManager,
IPerceptionCommon {
    public void init();

    public void destroy();

    public IRadarManager getRadarManager();
}

