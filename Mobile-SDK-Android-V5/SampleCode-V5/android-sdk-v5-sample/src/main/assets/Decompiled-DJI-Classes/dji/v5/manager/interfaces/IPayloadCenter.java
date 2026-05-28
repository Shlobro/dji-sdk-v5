/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.interfaces;

import dji.v5.manager.aircraft.payload.PayloadIndexType;
import dji.v5.manager.interfaces.IIntelligentBoxManager;
import dji.v5.manager.interfaces.IPayloadManager;
import java.util.Map;

public interface IPayloadCenter {
    public void init();

    public void destroy();

    public Map<PayloadIndexType, IPayloadManager> getPayloadManager();

    public Map<PayloadIndexType, IIntelligentBoxManager> getIntelligentBoxManager();
}

