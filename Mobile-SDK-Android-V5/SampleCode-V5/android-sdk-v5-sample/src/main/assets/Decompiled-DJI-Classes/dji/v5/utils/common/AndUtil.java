/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Point
 *  android.graphics.drawable.Drawable
 *  android.util.Size
 *  android.view.View
 *  androidx.annotation.ArrayRes
 *  androidx.annotation.ColorRes
 *  androidx.annotation.DimenRes
 *  androidx.annotation.DrawableRes
 *  androidx.annotation.StringRes
 */
package dji.v5.utils.common;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.View;
import androidx.annotation.ArrayRes;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import dji.v5.utils.common.LogUtils;
import java.io.FileFilter;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class AndUtil {
    public static final String TAG = LogUtils.getTag("AndUtil");
    private static final Set<String> CHINA_TIME_ZONE = new HashSet<String>();
    public static final int MIX_PIXEL = 60;
    private static final String DEF_TYPE = "string";
    private static final String UTF_8 = "UTF-8";
    private static final FileFilter CPU_FILTER;

    public static Size getLandScreenSize(Context context) {
        return null;
    }

    public static int getLandScreenWidth(Context context) {
        return 0;
    }

    public static int getLandScreenHeight(Context context) {
        return 0;
    }

    public static int dip2px(Context context, float f2) {
        return 0;
    }

    public static int px2dip(Context context, float f2) {
        return 0;
    }

    public static boolean isLeftGravity(View view) {
        return false;
    }

    public static boolean isRightGravity(View view) {
        return false;
    }

    public static void hideSoftInput(Activity activity) {
    }

    public static void hideSoftInput(View view) {
    }

    public static String getResString(String string2) {
        return null;
    }

    @SuppressLint(value={"ResourceType"})
    public static String getResString(@StringRes int n) {
        return null;
    }

    @SuppressLint(value={"ResourceType"})
    public static CharSequence getHtmlResString(Context context, @StringRes int n) {
        return null;
    }

    @SuppressLint(value={"ResourceType"})
    public static String getResString(@StringRes int n, Object ... objectArray) {
        return null;
    }

    public static String getResString(String string2, Object ... objectArray) {
        return null;
    }

    public static String getFormatResString(@StringRes int n, Object ... objectArray) {
        return null;
    }

    @SuppressLint(value={"ResourceType"})
    public static String getFormatResString(Locale locale, @StringRes int n, Object ... objectArray) {
        return null;
    }

    public static String getFormatResString(String string2, Object ... objectArray) {
        return null;
    }

    public static String getFormatResString(Locale locale, String string2, Object ... objectArray) {
        return null;
    }

    @SuppressLint(value={"ResourceType"})
    public static String[] getResStringArray(Context context, @ArrayRes int n) {
        return null;
    }

    @SuppressLint(value={"ResourceType"})
    public static int getResColor(@ColorRes int n) {
        return 0;
    }

    @SuppressLint(value={"ResourceType"})
    public static Drawable getResDrawable(@DrawableRes int n) {
        return null;
    }

    @SuppressLint(value={"ResourceType"})
    public static float getDimension(@DimenRes int n) {
        return 0.0f;
    }

    public static String getTimeZone() {
        return null;
    }

    public static boolean isChinaTimeZone() {
        return false;
    }

    public static String getProcessName(int n) {
        return null;
    }

    public static int getCPUCores() {
        return 0;
    }

    public static float getItemHeight(Context context) {
        return 0.0f;
    }

    public static Activity getActivity(Context context) {
        return null;
    }

    public static boolean isTabletDevice(Context context) {
        return false;
    }

    public static boolean isFloatEquals(float f2, float f3) {
        return false;
    }

    public static boolean isDoubleEquals(double d2, double d3) {
        return false;
    }

    public static boolean isEquals(Point point, Point point2) {
        return false;
    }

    public static String getApiKeyData(Context context) {
        return null;
    }

    public static boolean isGPSModeString(String string2) {
        return false;
    }

    public static List<Object> filterRepeatList(List<Object> list) {
        return null;
    }

    public static float byteToMB(float f2) {
        return 0.0f;
    }

    public static float byteToKB(float f2) {
        return 0.0f;
    }

    public static String encodeBase64(String string2) {
        return null;
    }

    public static String decodeBase64(String string2) {
        return null;
    }

    public static String getCrystalProductName() {
        return null;
    }

    public static String getCrystalVersionCodeOfLocalSystem() {
        return null;
    }

    private static String getProp(String string2, String string3) {
        return null;
    }

    public static boolean querySoundEffectsEnabled(Context context) {
        return false;
    }

    public static boolean isForeground(Context context) {
        return false;
    }

    private AndUtil() {
    }

    static {
        CHINA_TIME_ZONE.add("Asia/Chongqing");
        CHINA_TIME_ZONE.add("Asia/Shanghai");
        CHINA_TIME_ZONE.add("Asia/Urumqi");
        CPU_FILTER = file -> false;
    }
}

