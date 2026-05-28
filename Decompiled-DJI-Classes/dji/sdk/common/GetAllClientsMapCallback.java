/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.multiclientsync.ClientType;
import java.util.Map;

public interface GetAllClientsMapCallback
extends JNIProguardKeepTag {
    public void invoke(Map<Long, ClientType> var1);
}

