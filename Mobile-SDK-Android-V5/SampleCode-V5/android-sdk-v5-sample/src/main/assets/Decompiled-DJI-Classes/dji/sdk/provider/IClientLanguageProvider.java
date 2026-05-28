/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.provider;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.common.ClientLanguage;

public interface IClientLanguageProvider
extends JNIProguardKeepTag {
    public ClientLanguage clientLanguage();
}

