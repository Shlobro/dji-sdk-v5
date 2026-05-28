/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.mcs;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.multiclientsync.MCSDataModel;
import java.util.List;

public interface GetAllDataModelCallback
extends JNIProguardKeepTag {
    public void invoke(List<MCSDataModel> var1);
}

