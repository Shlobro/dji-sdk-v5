/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.Keep
 */
package com.dji.flysafe.util;

import android.content.Context;
import androidx.annotation.Keep;
import com.dji.flysafe.mapkit.core.core.models.DJILatLng;
import com.dji.flysafe.midware.data.forbid.model.FlyfrbPolygonSubElement;
import com.dji.flysafe.util.DynamicAssetsHelper;
import dji.component.flysafe.model.FlyForbidElement;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Comparator;
import java.util.List;

@Keep
public class FlyforbidUtils {
    public static final String KEY_DJI_SERVER_TIME = "key_dji_server_time";
    public static final String INTERNAL_ASSET_PATH = DynamicAssetsHelper.getInternalPath();
    public static final String FLYFORBID_DB_SUB_PATH = "flysafe/";
    private static final int CONVERT_WORD = 1098439584;

    public static long getCurTimeStamp(Context context) {
        return 0L;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean copyDatabaseFromAsset(Context context, String string, String string2) {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean copyDatabaseToDatabasePath(File file, String string) {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean copyDatabaseFromPath(String string, String string2) {
        return false;
    }

    public static boolean copyDataBaseFromAssetOrInternal(Context context, String string, String string2) {
        return false;
    }

    private static void copyFile(InputStream inputStream, OutputStream outputStream) throws IOException {
    }

    public static <T extends FlyForbidElement> List<T> extractValidArea(List<? extends FlyForbidElement> list, Context context, double d2, double d3) {
        return null;
    }

    public static List<FlyfrbPolygonSubElement> extractValidSubArea(List<FlyfrbPolygonSubElement> list, Context context, double d2, double d3) {
        return null;
    }

    public static float getDistance(double d2, double d3, double d4, double d5) {
        return 0.0f;
    }

    public static DJILatLng convertMsgObjToLatLng(Object object) {
        return null;
    }

    public static long getSDFreeSize() {
        return 0L;
    }

    public static long getAvailableInternalStorageInMb() {
        return 0L;
    }

    public static long getAvailableStorageInMb() {
        return 0L;
    }

    public static int[] listToIntArray(List<Integer> list) {
        return null;
    }

    public static double convertCoord4Log(double d2) {
        return 0.0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void unZipFolder(String string, String string2) {
    }

    @Keep
    public static class DataComparator<T extends FlyForbidElement>
    implements Comparator<T> {
        @Override
        public int compare(FlyForbidElement flyForbidElement, FlyForbidElement flyForbidElement2) {
            return 0;
        }
    }
}

