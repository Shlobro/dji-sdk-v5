/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 */
package dji.v5.utils.common;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    static final String TAG = "FileUtils";
    public static final String LOG_PATH = "/sdcard/DJI/DJIPilot/Logs/";
    public static final String MIME_TYPE_AUDIO = "audio/*";
    public static final String MIME_TYPE_TEXT = "text/*";
    public static final String MIME_TYPE_IMAGE = "image/*";
    public static final String MIME_TYPE_VIDEO = "video/*";
    public static final String MIME_TYPE_APP = "application/*";
    public static final String FILE_BASE = "file://";
    public static final String CONTENT_BASE = "content:";
    public static final String HIDDEN_PREFIX = ".";
    public static final char DOT = '.';
    public static final int MXA_REMAINING_CAPACITY = 0x3200000;
    private static String dirName;

    private FileUtils() {
    }

    public static ArrayList<File> getAllFile(File file) throws FileNotFoundException {
        return null;
    }

    public static String toReadableSize(long l2) {
        return null;
    }

    public static boolean exist(String string2) {
        return false;
    }

    public static boolean isFile(String string2) {
        return false;
    }

    public static boolean isFile(File file) {
        return false;
    }

    public static boolean isDir(String string2) {
        return false;
    }

    public static boolean isDir(File file) {
        return false;
    }

    public static int getSubFileCount(String string2, FilenameFilter filenameFilter) {
        return 0;
    }

    public static boolean createFile(String string2) {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean createFile(File file) {
        return false;
    }

    public static boolean delFile(String string2) {
        return false;
    }

    public static boolean delFile(File file) {
        return false;
    }

    public static boolean delFile(File file, boolean bl) {
        return false;
    }

    private static boolean isEmpty(File file) {
        return false;
    }

    @RequiresApi(api=26)
    public static void deleteAllFile(File file) {
    }

    public static boolean mkdirs(String string2) {
        return false;
    }

    public static boolean mkdirs(File file) {
        return false;
    }

    public static String readFile(String string2, String string3) {
        return null;
    }

    public static String readFile(String string2, String string3, int n) {
        return null;
    }

    public static boolean writeFile(String string2, String string3, boolean bl) {
        return false;
    }

    public static boolean writeFileByMap(String string2, String string3, String string4) {
        return false;
    }

    public static void moveFile(File file, File file2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean copyStreamByStream(InputStream inputStream, String string2) {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean copyStreamByBuffer(InputStream inputStream, String string2) {
        return false;
    }

    public static boolean copyAssetsFile(Context context, String string2, String string3) {
        return false;
    }

    public static boolean copyAssetsFileIfNeed(Context context, String string2, File file) {
        return false;
    }

    public static boolean copyFile(String string2, String string3) {
        return false;
    }

    public static boolean copyFileByBuffer(String string2, String string3) {
        return false;
    }

    public static boolean copyFileByChannel(String string2, String string3) {
        return false;
    }

    public static boolean copyDir(String string2, String string3) {
        return false;
    }

    public static boolean copyDir(File file, File file2) {
        return false;
    }

    private static void copy(File file, File file2) {
    }

    public static String getPath(Context context, Uri uri) {
        return null;
    }

    private static String handleMediaDocument(Uri uri, Context context) {
        return null;
    }

    public static File getFile(Context context, Uri uri) {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String getDataColumn(Context context, Uri uri, String string2, String[] stringArray) {
        return null;
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return false;
    }

    public static boolean isGooglePhotosUri(Uri uri) {
        return false;
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return false;
    }

    public static boolean isMediaDocument(Uri uri) {
        return false;
    }

    public static File getAppDir(Context context) {
        return null;
    }

    public static File getFlightRecordDir(Context context) {
        return null;
    }

    public static File getVoiceSaveDir(Context context) {
        return null;
    }

    public static File getUtmissSaveDir(Context context) {
        return null;
    }

    public static boolean isSpaceEnough(Context context, long l2) {
        return false;
    }

    public static boolean renameFile(String string2, String string3) {
        return false;
    }

    @Nullable
    public static String getFileMD5(String string2) {
        return null;
    }

    @Nullable
    public static String getFileMD5(File file) {
        return null;
    }

    public static String bytesToHexString(byte[] byArray) {
        return null;
    }

    public static void writeBytesToFile(Context context, String string2, byte[] byArray) {
    }

    public static byte[] readFile(Context context, String string2) {
        return null;
    }

    public static File getMainDir(File file, String string2) {
        return null;
    }

    public static long getFileSize(File file) {
        return 0L;
    }

    public static String getFileName(String string2, String string3) {
        return null;
    }

    public static boolean checkFreeSpace(Long l2) {
        return false;
    }

    public static List<String> readLineFromAsset(Context context, String string2) {
        return null;
    }

    public static Long getAvailableSize() {
        return null;
    }

    public static String getDJIAudioDirPath(Context context) {
        return null;
    }

    public static File getDJIAudioDirFile(Context context) {
        return null;
    }
}

