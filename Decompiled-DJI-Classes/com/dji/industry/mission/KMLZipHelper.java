/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.dji.industry.mission;

import android.content.Context;
import dji.v5.utils.common.LogUtils;
import java.io.File;
import java.util.List;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class KMLZipHelper {
    private static final String TAG = LogUtils.getTag("KMLZipHelper");

    private KMLZipHelper() {
    }

    public static String getSelectFilePath(Context context, String string, String string2) {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static File unZipFile(Context context, String string, String string2, String string3) {
        return null;
    }

    public static void unZipFolder(Context context, String string, String string2, boolean bl) {
    }

    private static void unZipFileEntry(Context context, ZipInputStream zipInputStream, String string, String string2) {
    }

    public static void zipFiles(Context context, List<String> list, String string) throws Exception {
    }

    private static void doZipFiles(Context context, String string, String string2, ZipOutputStream zipOutputStream) throws Exception {
    }
}

