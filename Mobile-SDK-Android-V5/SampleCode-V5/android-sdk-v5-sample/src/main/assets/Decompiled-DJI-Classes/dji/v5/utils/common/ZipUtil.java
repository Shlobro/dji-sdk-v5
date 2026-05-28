/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.utils.common;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipUtil {
    private static String TAG = "ZipUtil";
    private static int DEFAULT_ZIP_LEVEL = 1;
    private static final List<String> DEFAULT_ZIP_PREFIX_LIST = new ArrayList<String>();

    public static void ZipFiles(File file, File file2) {
    }

    public static void ZipFiles(File file, File file2, int n) {
    }

    public static void ZipFiles(File file, File file2, OnZipProgressCallback onZipProgressCallback) {
    }

    public static void ZipFiles(File file, File file2, String string2, OnZipProgressCallback onZipProgressCallback) {
    }

    public static void ZipFiles(File file, File file2, List<String> list, ZipFileFilter zipFileFilter, OnZipProgressCallback onZipProgressCallback) {
    }

    public static void ZipFiles(File file, File file2, List<String> list, int n, ZipFileFilter zipFileFilter, OnZipProgressCallback onZipProgressCallback) {
    }

    private static void checkZipFilesValid(File file, File file2, int n) {
    }

    public static void ZipFiles(File file, File file2, List<File> list, OnZipProgressCallback onZipProgressCallback) {
    }

    public static void ZipFiles(File file, File file2, int n, List<File> list, OnZipProgressCallback onZipProgressCallback) {
    }

    private static int compressSingleFile(File file, OnZipProgressCallback onZipProgressCallback, WritableByteChannel writableByteChannel, ZipOutputStream zipOutputStream, int n, int n2, File file2) {
        return 0;
    }

    private static void closeChannel(FileChannel fileChannel) {
    }

    private static String getZipName(File file, File file2) {
        return null;
    }

    private static List<File> getFileList(File file, List<String> list) {
        return null;
    }

    public static void unzip(String string2, String string3) {
    }

    private static File newFile(File file, ZipEntry zipEntry) throws IOException {
        return null;
    }

    private static /* synthetic */ boolean lambda$getFileList$0(List list, File file) {
        return false;
    }

    public static interface ZipFileFilter {
        public List<File> filter(File var1, List<String> var2);
    }

    public static interface OnZipProgressCallback {
        public void onZipProgress(int var1);
    }
}

