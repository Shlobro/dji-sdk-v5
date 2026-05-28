/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.reflect.TypeToken
 */
package dji.v5.utils.common;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dji.v5.utils.common.LogUtils;
import java.io.File;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;

public class JsonUtil {
    public static final String TAG = LogUtils.getTag("JsonUtil");
    private static Gson gson;

    public static synchronized Gson getGson() {
        return null;
    }

    private JsonUtil() {
    }

    public static <T> T toBean(String string2, Class<T> clazz) {
        return null;
    }

    public static <T> T toBean(Reader reader, Type type) {
        return null;
    }

    public static <T> T toBean(File file, Class<T> clazz) {
        return null;
    }

    public static <T> String toJson(T t) {
        return null;
    }

    public static <T> String toJson(List<T> list) {
        return null;
    }

    public static <T> List<T> getList(String string2, TypeToken<List<T>> typeToken) {
        return null;
    }

    public static <T> List<T> getList(File file, TypeToken<List<T>> typeToken) {
        return null;
    }

    public static String jsonFormatter(String string2) {
        return null;
    }
}

