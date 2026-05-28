/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.network;

import androidx.annotation.NonNull;
import dji.v5.common.KeepProguard;
import java.util.Map;

public class DJIHttpResponse
implements KeepProguard {
    public static final int DEFAULT_ERROR = -1;
    private final int code;
    private final String body;
    private final Map<String, String> rspHeaders;

    public DJIHttpResponse(int n, String string2, Map<String, String> map) {
    }

    public DJIHttpResponse(int n) {
    }

    public int code() {
        return 0;
    }

    public String body() {
        return null;
    }

    public Map<String, String> rspHeaders() {
        return null;
    }

    public boolean isSuccessful() {
        return false;
    }

    @NonNull
    public String toString() {
        return null;
    }
}

