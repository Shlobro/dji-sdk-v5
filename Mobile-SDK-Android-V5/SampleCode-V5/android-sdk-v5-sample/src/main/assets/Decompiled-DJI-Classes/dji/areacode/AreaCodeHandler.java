/*
 * Decompiled with CFR 0.152.
 */
package dji.areacode;

import dji.jni.JNIProguardKeepTag;

public abstract class AreaCodeHandler
implements JNIProguardKeepTag {
    public abstract String GetAcFromMcc();

    public abstract boolean IsRoot();
}

