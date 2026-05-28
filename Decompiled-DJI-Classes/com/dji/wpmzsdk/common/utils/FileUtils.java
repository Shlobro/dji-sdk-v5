/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentUris
 *  android.content.Context
 *  android.database.Cursor
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Environment
 *  android.provider.DocumentsContract
 *  android.provider.MediaStore$Audio$Media
 *  android.provider.MediaStore$Images$Media
 *  android.provider.MediaStore$Video$Media
 *  android.text.TextUtils
 *  android.util.Log
 *  android.webkit.URLUtil
 *  androidx.annotation.Nullable
 */
package com.dji.wpmzsdk.common.utils;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import androidx.annotation.Nullable;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

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

    public static String toReadableSize(long size) {
        int unitIndex;
        if (size <= 0L) {
            return "0B";
        }
        if (size < 1024L) {
            return size + "B";
        }
        String[] sizeUnits = new String[]{"B", "KiB", "MiB", "GiB", "TiB", "PiB"};
        long newSize = size;
        for (unitIndex = 0; unitIndex < sizeUnits.length - 1; ++unitIndex) {
            if ((size /= 1024L) < 1000L) {
                ++unitIndex;
                break;
            }
            newSize = size;
        }
        float result = (float)newSize / 1024.0f;
        DecimalFormat df = new DecimalFormat("####.##", new DecimalFormatSymbols(Locale.US));
        return df.format(result) + sizeUnits[unitIndex];
    }

    public static boolean exist(String path) {
        boolean ret = false;
        if (null != path) {
            File file = new File(path);
            ret = file.exists();
        }
        return ret;
    }

    public static boolean isFile(String path) {
        boolean ret = false;
        if (null != path) {
            File file = new File(path);
            ret = file.exists() && file.isFile();
        }
        return ret;
    }

    public static boolean isFile(File file) {
        boolean ret = false;
        if (file != null && file.exists() && file.isFile()) {
            ret = true;
        }
        return ret;
    }

    public static boolean isDir(String path) {
        boolean ret = false;
        if (null != path) {
            File file = new File(path);
            ret = file.exists() && file.isDirectory();
        }
        return ret;
    }

    public static boolean isDir(File file) {
        boolean ret = false;
        if (null != file && file.exists() && file.isDirectory()) {
            ret = true;
        }
        return ret;
    }

    public static int getSubFileCount(String path, FilenameFilter filter) {
        File[] subs;
        File file;
        int count = 0;
        if (null != path && (file = new File(path)).exists() && file.isDirectory() && (subs = file.listFiles(filter)) != null) {
            count = subs.length;
        }
        return count;
    }

    public static boolean createFile(String path) {
        boolean ret = false;
        if (null != path) {
            File file = new File(path);
            ret = FileUtils.createFile(file);
        }
        return ret;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean createFile(File file) {
        boolean ret;
        block4: {
            block5: {
                ret = false;
                if (null == file) break block4;
                if (file.exists() && file.isFile()) break block5;
                File parentFile = file.getParentFile();
                if (!FileUtils.mkdirs(parentFile)) break block4;
                try {
                    file.createNewFile();
                    ret = file.exists() && file.isFile();
                }
                catch (Exception e) {
                    try {
                        e.printStackTrace();
                        ret = file.exists() && file.isFile();
                    }
                    catch (Throwable throwable) {
                        ret = file.exists() && file.isFile();
                        throw throwable;
                    }
                    break block4;
                }
                break block4;
            }
            ret = true;
        }
        return ret;
    }

    public static boolean delFile(String path) {
        boolean ret = false;
        if (null != path) {
            File file = new File(path);
            FileUtils.delFile(file);
        }
        return ret;
    }

    public static boolean delFile(File file) {
        boolean ret = true;
        if (null != file && file.exists()) {
            if (file.isFile()) {
                file.delete();
            } else if (file.isDirectory()) {
                File[] files = file.listFiles();
                if (null != files && files.length > 0) {
                    for (File tmp : files) {
                        FileUtils.delFile(tmp);
                    }
                }
                file.delete();
            }
        }
        return ret;
    }

    public static boolean mkdirs(String path) {
        boolean ret = false;
        if (null != path) {
            File file = new File(path);
            ret = FileUtils.mkdirs(file);
        }
        return ret;
    }

    public static boolean mkdirs(File file) {
        boolean ret;
        block13: {
            block14: {
                ret = false;
                if (null == file) break block13;
                if (file.exists() && file.isDirectory()) break block14;
                try {
                    file.mkdirs();
                    boolean bl = ret = file.exists() && file.isDirectory();
                }
                catch (Exception e) {
                    try {
                        e.printStackTrace();
                        boolean bl = ret = file.exists() && file.isDirectory();
                    }
                    catch (Throwable throwable) {
                        boolean bl = ret = file.exists() && file.isDirectory();
                        if (!ret) {
                            try {
                                file.mkdirs();
                            }
                            catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                        ret = file.exists() && file.isDirectory();
                        throw throwable;
                    }
                    if (!ret) {
                        try {
                            file.mkdirs();
                        }
                        catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                    ret = file.exists() && file.isDirectory();
                    break block13;
                }
                if (!ret) {
                    try {
                        file.mkdirs();
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                ret = file.exists() && file.isDirectory();
                break block13;
            }
            ret = true;
        }
        return ret;
    }

    public static String readFile(String path) {
        File file;
        StringBuilder sb = null;
        if (null != path && FileUtils.isFile(file = new File(path))) {
            try (BufferedReader br = new BufferedReader(new FileReader(file));){
                sb = new StringBuilder();
                String line = null;
                while (null != (line = br.readLine())) {
                    sb.append(line);
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sb == null ? "" : sb.toString();
    }

    public static boolean writeFile(String path, String content, boolean append) {
        boolean ret = false;
        if (null != path && FileUtils.createFile(path) && content != null && content.length() > 0) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, append), 1024);){
                bw.write(content);
                bw.flush();
                ret = true;
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ret;
    }

    public static boolean writeFileByMap(String path, String content, String charsetName) {
        boolean ret = false;
        if (null != path && FileUtils.isFile(path) && content != null && content.length() > 0) {
            try (RandomAccessFile fos = new RandomAccessFile(path, "rw");
                 FileChannel fc = fos.getChannel();){
                MappedByteBuffer mbb = fc.map(FileChannel.MapMode.READ_WRITE, 0L, content.length() + 4);
                mbb.put(content.getBytes(charsetName));
                mbb.force();
                ret = true;
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ret;
    }

    public static void moveFile(File file, File dir) {
        try (FileChannel outputChannel = new FileOutputStream(dir).getChannel();
             FileChannel inputChannel = new FileInputStream(file).getChannel();){
            inputChannel.transferTo(0L, inputChannel.size(), outputChannel);
            file.delete();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean copyStreamByStream(InputStream is, String dstPath) {
        boolean ret = false;
        if (null != is && null != dstPath) {
            try (BufferedInputStream br = new BufferedInputStream(is);
                 BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(dstPath));){
                byte[] buffer = new byte[2048];
                int count = 0;
                while ((count = br.read(buffer, 0, 2048)) > 0) {
                    bw.write(buffer, 0, count);
                }
                bw.flush();
                ret = true;
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            finally {
                try {
                    is.close();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return ret;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean copyStreamByBuffer(InputStream is, String dstPath) {
        boolean ret = false;
        if (null != is && null != dstPath) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(is), 1024);
                 BufferedWriter bw = new BufferedWriter(new FileWriter(dstPath), 1024);){
                char[] buffer = new char[1024];
                int count = 0;
                while ((count = br.read(buffer, 0, 1024)) > 0) {
                    bw.write(buffer, 0, count);
                }
                bw.flush();
                ret = true;
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            finally {
                try {
                    is.close();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return ret;
    }

    public static boolean copyAssetsFile(Context context, String fileName, String newPath) {
        boolean retVal = false;
        try (InputStream is = context.getAssets().open(fileName);
             FileOutputStream fos = new FileOutputStream(newPath);){
            byte[] buffer = new byte[1024];
            int byteCount = 0;
            while ((byteCount = is.read(buffer)) != -1) {
                fos.write(buffer, 0, byteCount);
            }
            fos.flush();
            retVal = true;
        }
        catch (Exception e) {
            e.printStackTrace();
            retVal = false;
        }
        return retVal;
    }

    public static boolean copyFile(String srcPath, String dstPath) {
        boolean ret = false;
        if (null != srcPath && null != dstPath) {
            File src = new File(srcPath);
            File dst = new File(dstPath);
            if (dst.exists()) {
                FileUtils.delFile(dst);
            }
            if (src.exists() && src.isFile()) {
                try {
                    try (FileInputStream fileInputStream = new FileInputStream(srcPath);
                         FileOutputStream fileOutputStream = new FileOutputStream(dstPath);){
                        int byteRead;
                        byte[] buffer = new byte[1024];
                        while (-1 != (byteRead = fileInputStream.read(buffer))) {
                            fileOutputStream.write(buffer, 0, byteRead);
                        }
                        fileOutputStream.flush();
                    }
                    ret = true;
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return ret;
    }

    public static void writeStringToFile(String filePath, String messageToBeWritten, boolean appending) throws IOException {
        if (!TextUtils.isEmpty((CharSequence)messageToBeWritten)) {
            if (appending) {
                try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(filePath, true), StandardCharsets.UTF_8));){
                    writer.write(messageToBeWritten);
                    ((Writer)writer).flush();
                }
            }
            try (FileWriter writer = new FileWriter(filePath, false);){
                writer.write(messageToBeWritten);
                writer.flush();
            }
        }
    }

    public static boolean copyFileByBuffer(String srcPath, String dstPath) {
        File src;
        boolean ret = false;
        if (null != srcPath && null != dstPath && (src = new File(srcPath)).exists() && src.isFile()) {
            try (BufferedReader br = new BufferedReader(new FileReader(srcPath), 1024);
                 BufferedWriter bw = new BufferedWriter(new FileWriter(dstPath), 1024);){
                String line = null;
                while (null != (line = br.readLine())) {
                    bw.write(line);
                }
                bw.flush();
                ret = true;
            }
            catch (Exception e) {
                Log.e((String)TAG, (String)("copyFileByBuffer: " + e));
            }
        }
        return ret;
    }

    public static boolean copyFileByChannel(String srcPath, String dstPath) {
        File src;
        boolean ret = false;
        if (null != srcPath && null != dstPath && (src = new File(srcPath)).exists() && src.isFile()) {
            ByteBuffer buffer = null;
            try (FileInputStream fis = new FileInputStream(src);
                 FileOutputStream fos = new FileOutputStream(dstPath);
                 FileChannel srcFileChn = fis.getChannel();
                 FileChannel dstFileChn = fos.getChannel();){
                buffer = ByteBuffer.allocate(1024);
                buffer.clear();
                while (-1 != srcFileChn.read(buffer)) {
                    buffer.flip();
                    dstFileChn.write(buffer);
                    buffer.clear();
                }
                dstFileChn.force(true);
                ret = true;
            }
            catch (Exception ignore) {
                Log.e((String)TAG, (String)("copyFileByChannel: " + ignore));
            }
        }
        return ret;
    }

    public static boolean copyDir(String srcPath, String dstPath) {
        boolean ret = false;
        if (null != srcPath && dstPath != null) {
            File file = new File(srcPath);
            File dstFile = new File(dstPath);
            ret = FileUtils.copyDir(file, dstFile);
        }
        return ret;
    }

    public static boolean copyDir(File srcFile, File dstFile) {
        boolean ret = false;
        if (null != srcFile && null != dstFile && FileUtils.isDir(srcFile) && FileUtils.mkdirs(dstFile)) {
            ret = true;
            File[] files = srcFile.listFiles();
            if (null != files && files.length > 0) {
                for (File tmp : files) {
                    if (tmp.isFile()) {
                        FileUtils.copyFileByChannel(tmp.getAbsolutePath(), dstFile.getAbsolutePath() + "/" + tmp.getName());
                        continue;
                    }
                    if (!tmp.isDirectory()) continue;
                    FileUtils.copyDir(tmp, new File(dstFile.getAbsolutePath() + File.separator + tmp.getName()));
                }
            }
        }
        return ret;
    }

    public static String getPath(Context context, Uri uri) {
        Log.d((String)"FileUtils File -", (String)("Authority: " + uri.getAuthority() + ", Fragment: " + uri.getFragment() + ", Port: " + uri.getPort() + ", Query: " + uri.getQuery() + ", Scheme: " + uri.getScheme() + ", Host: " + uri.getHost() + ", Segments: " + uri.getPathSegments().toString()));
        if (Build.VERSION.SDK_INT >= 19 && DocumentsContract.isDocumentUri((Context)context, (Uri)uri)) {
            if (FileUtils.isExternalStorageDocument(uri)) {
                String docId = DocumentsContract.getDocumentId((Uri)uri);
                String[] split = docId.split(":");
                String type = split[0];
                if ("primary".equalsIgnoreCase(type)) {
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                }
            } else {
                if (FileUtils.isDownloadsDocument(uri)) {
                    String id = DocumentsContract.getDocumentId((Uri)uri);
                    Uri contentUri = ContentUris.withAppendedId((Uri)Uri.parse((String)"content://downloads/public_downloads"), (long)Long.valueOf(id));
                    return FileUtils.getDataColumn(context, contentUri, null, null);
                }
                if (FileUtils.isMediaDocument(uri)) {
                    String docId = DocumentsContract.getDocumentId((Uri)uri);
                    String[] split = docId.split(":");
                    String type = split[0];
                    Uri contentUri = null;
                    if ("image".equals(type)) {
                        contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(type)) {
                        contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(type)) {
                        contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    String selection = "_id=?";
                    String[] selectionArgs = new String[]{split[1]};
                    return FileUtils.getDataColumn(context, contentUri, "_id=?", selectionArgs);
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                if (FileUtils.isGooglePhotosUri(uri)) {
                    return uri.getLastPathSegment();
                }
                return FileUtils.getDataColumn(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static File getFile(Context context, Uri uri) {
        String path;
        if (uri != null && (path = FileUtils.getPath(context, uri)) != null && !URLUtil.isNetworkUrl((String)path)) {
            return new File(path);
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String getDataColumn(Context context, Uri uri, String selection, String[] selectionArgs) {
        Cursor cursor = null;
        String column = "_data";
        String[] projection = new String[]{"_data"};
        try {
            cursor = context.getContentResolver().query(uri, projection, selection, selectionArgs, null);
            if (cursor != null && cursor.moveToFirst()) {
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                return string;
            }
        }
        finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return null;
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static File getAppDir(Context context) {
        if (dirName == null && Environment.getExternalStorageState().equals("mounted")) {
            dirName = Environment.getExternalStorageDirectory() + "/DJI/" + context.getPackageName();
        }
        if (dirName != null) {
            File dir = new File(dirName);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            return dir;
        }
        return context.getFilesDir();
    }

    public static File getPinExportDir() {
        File dir = new File(Environment.getExternalStorageDirectory() + "/DJI/Pin");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
    }

    public static File getFlightRecordDir(Context context) {
        File dir = new File(FileUtils.getAppDir(context), "FlightRecord");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
    }

    public static File getVoiceSaveDir(Context context) {
        File cacheDir = context.getCacheDir();
        File voiceDir = new File(cacheDir, "voices");
        if (!voiceDir.exists()) {
            voiceDir.mkdirs();
        }
        return voiceDir;
    }

    public static File getUtmissSaveDir(Context context) {
        File appDir = FileUtils.getAppDir(context);
        File utmissDir = new File(appDir, "utmiss");
        if (!utmissDir.exists()) {
            utmissDir.mkdirs();
        }
        return utmissDir;
    }

    public static boolean isSpaceEnough(Context context, long need) {
        File file = new File(FileUtils.getAppDir(context).getPath());
        return file.getUsableSpace() - need >= 0x3200000L;
    }

    public static boolean renameFile(String srcPath, String dstPath) {
        return new File(srcPath).renameTo(new File(dstPath));
    }

    @Nullable
    public static String getFileMD5(String fileName) {
        return FileUtils.getFileMD5(new File(fileName));
    }

    @Nullable
    public static String getFileMD5(File file) {
        String string;
        if (!file.isFile() || !file.exists()) {
            return null;
        }
        byte[] buffer = new byte[1024];
        FileInputStream inputStream = new FileInputStream(file);
        try {
            int len;
            MessageDigest digest = MessageDigest.getInstance("MD5");
            while ((len = inputStream.read(buffer, 0, 1024)) != -1) {
                digest.update(buffer, 0, len);
            }
            string = FileUtils.bytesToHexString(digest.digest());
        }
        catch (Throwable throwable) {
            try {
                try {
                    inputStream.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        inputStream.close();
        return string;
    }

    public static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder();
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; ++i) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

    public static long getFileSize(File f) throws FileNotFoundException {
        long size = 0L;
        File[] flist = f.listFiles();
        if (flist == null) {
            return size;
        }
        for (File file : flist) {
            if (file.isDirectory()) {
                size += FileUtils.getFileSize(file);
                continue;
            }
            size += file.length();
        }
        return size;
    }

    public static void copyAssetsDirToSDCard(Context context, String assetsDirName, String sdCardPath) {
        block20: {
            Log.d((String)TAG, (String)("copyAssetsDirToSDCard() called with: context = [" + context + "], assetsDirName = [" + assetsDirName + "], sdCardPath = [" + sdCardPath + "]"));
            try {
                File file;
                String[] list = context.getAssets().list(assetsDirName);
                if (list.length == 0) {
                    try (InputStream inputStream = context.getAssets().open(assetsDirName);){
                        byte[] mByte = new byte[1024];
                        int bt = 0;
                        File file2 = new File(sdCardPath + File.separator + assetsDirName.substring(assetsDirName.lastIndexOf(47)));
                        if (file2.exists()) {
                            return;
                        }
                        file2.createNewFile();
                        try (FileOutputStream fos = new FileOutputStream(file2);){
                            while ((bt = inputStream.read(mByte)) != -1) {
                                fos.write(mByte, 0, bt);
                            }
                            fos.flush();
                            break block20;
                        }
                    }
                }
                String subDirName = assetsDirName;
                if (assetsDirName.contains("/")) {
                    subDirName = assetsDirName.substring(assetsDirName.lastIndexOf(47) + 1);
                }
                if (!(file = new File(sdCardPath = sdCardPath + File.separator + subDirName)).exists()) {
                    file.mkdirs();
                }
                for (String s : list) {
                    FileUtils.copyAssetsDirToSDCard(context, assetsDirName + File.separator + s, sdCardPath);
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String getDJIDirPath(Context context) {
        return Environment.getExternalStorageDirectory() + "/DJI/" + context.getPackageName();
    }
}

