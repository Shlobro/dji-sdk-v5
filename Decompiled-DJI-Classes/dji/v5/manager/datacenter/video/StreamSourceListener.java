/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package dji.v5.manager.datacenter.video;

import androidx.annotation.Nullable;
import dji.v5.common.video.stream.StreamSource;
import java.util.List;

@Deprecated
public interface StreamSourceListener {
    public void onStreamSourceUpdate(@Nullable List<StreamSource> var1);
}

