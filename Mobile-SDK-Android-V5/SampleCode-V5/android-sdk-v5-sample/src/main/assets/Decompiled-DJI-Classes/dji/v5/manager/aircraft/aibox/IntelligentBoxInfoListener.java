/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.aibox;

import dji.v5.manager.aircraft.aibox.IntelligentBoxAppInfo;
import dji.v5.manager.aircraft.aibox.IntelligentBoxInfo;
import java.util.List;

public interface IntelligentBoxInfoListener {
    public void onBoxInfoUpdate(IntelligentBoxInfo var1);

    public void onBoxAppInfoUpdate(List<IntelligentBoxAppInfo> var1);
}

