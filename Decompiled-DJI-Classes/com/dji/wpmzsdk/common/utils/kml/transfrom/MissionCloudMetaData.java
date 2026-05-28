/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.Nullable
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t\u00a8\u0006\u0013"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/transfrom/MissionCloudMetaData;", "", "()V", "cameraKeys", "", "", "getCameraKeys", "()Ljava/util/List;", "setCameraKeys", "(Ljava/util/List;)V", "droneKey", "getDroneKey", "()Ljava/lang/String;", "setDroneKey", "(Ljava/lang/String;)V", "templateKeys", "", "getTemplateKeys", "setTemplateKeys", "wpmzsdk_release"})
public final class MissionCloudMetaData {
    @Nullable
    private String droneKey;
    @Nullable
    private List<String> cameraKeys;
    @Nullable
    private List<Integer> templateKeys;

    @Nullable
    public final String getDroneKey() {
        return this.droneKey;
    }

    public final void setDroneKey(@Nullable String string) {
        this.droneKey = string;
    }

    @Nullable
    public final List<String> getCameraKeys() {
        return this.cameraKeys;
    }

    public final void setCameraKeys(@Nullable List<String> list) {
        this.cameraKeys = list;
    }

    @Nullable
    public final List<Integer> getTemplateKeys() {
        return this.templateKeys;
    }

    public final void setTemplateKeys(@Nullable List<Integer> list) {
        this.templateKeys = list;
    }
}

