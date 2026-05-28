/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.reflect.TypeToken
 */
package com.dji.flysafe.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;

public class V_JsonUtil {
    public static Gson gson;

    public static synchronized Gson getGson() {
        return null;
    }

    @Deprecated
    public static <T> T getOne(String string, Class<T> clazz) {
        return null;
    }

    public static <T> T toBean(String string, Class<T> clazz) {
        return null;
    }

    public static <T> String toJson(T t) {
        return null;
    }

    public static <T> String toJson(List<T> list) {
        return null;
    }

    public static <T> List<T> getList(String string, TypeToken<List<T>> typeToken) {
        return null;
    }

    public static String jsonFormatter(String string) {
        return null;
    }
}

