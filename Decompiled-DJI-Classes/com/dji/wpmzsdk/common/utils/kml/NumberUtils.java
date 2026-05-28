/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.dji.wpmzsdk.common.utils.kml;

import android.text.TextUtils;
import java.util.regex.Pattern;

public class NumberUtils {
    public static float parseFloat(String number, float defaultValue) {
        try {
            float value = Float.parseFloat(number);
            return value;
        }
        catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    public static int parseInt(String number, int defaultValue) {
        try {
            int value = Integer.parseInt(number);
            return value;
        }
        catch (NumberFormatException numberFormatException) {
            return defaultValue;
        }
    }

    public static double parseDouble(String number, double defaultValue) {
        try {
            return Double.parseDouble(number);
        }
        catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    public static boolean isDoubleOrFloat(String str) {
        if (TextUtils.isEmpty((CharSequence)str)) {
            return false;
        }
        Pattern pattern = Pattern.compile("^[-\\+]?[.\\d]*$");
        return pattern.matcher(str).matches();
    }
}

