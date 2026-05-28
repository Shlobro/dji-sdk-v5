/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.mop;

import dji.v5.manager.mop.Pipeline;
import java.util.Map;

public interface PipelineConnectionListener {
    public void onPipelineConnectionUpdate(Map<Integer, Pipeline> var1);
}

