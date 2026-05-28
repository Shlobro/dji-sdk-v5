/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.google.gson.Gson
 *  org.json.JSONObject
 */
package dji.component.flysafe.util;

import androidx.annotation.Nullable;
import com.google.gson.Gson;
import org.json.JSONObject;

public class HttpJsonParseHelper {
    private static Gson gson;

    private static synchronized Gson getExposeGson() {
        return null;
    }

    public static <T> T toBeanWithExpose(String string, Class<T> clazz) {
        return null;
    }

    @Nullable
    public static String parseCustomKey(String string, String string2) {
        return null;
    }

    @Nullable
    public static String parseCustomKey(@Nullable JSONObject jSONObject, String string) {
        return null;
    }

    @Nullable
    public static JSONObject parseJSONObject(String string) {
        return null;
    }
}

