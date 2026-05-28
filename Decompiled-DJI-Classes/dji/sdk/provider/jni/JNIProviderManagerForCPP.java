/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.provider.jni;

import dji.jni.JNIProguardKeepTag;

public class JNIProviderManagerForCPP
implements JNIProguardKeepTag {
    public static int clientLanguage() {
        return 0;
    }

    public static byte[] clientLocation() {
        return null;
    }

    public static byte[] clientAltitude() {
        return null;
    }

    public static boolean isAppInForeground() {
        return false;
    }

    public static boolean isLocationServiceEnabled() {
        return false;
    }
}

