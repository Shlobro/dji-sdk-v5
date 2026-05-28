/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.inner.analytics.engine;

import androidx.annotation.Keep;
import dji.v5.common.callback.CommonCallbacks;
import java.util.Map;

@Keep
public interface IDJIAnalyticsEngine {
    public void setAnalyticsEnable(boolean var1);

    public void track(String var1, String var2);

    public void track(String var1, String var2, Map<String, Object> var3);

    public void track(String var1, String var2, Map<String, Object> var3, CommonCallbacks.CompletionCallback var4);

    public void init();

    public void destroy();
}

