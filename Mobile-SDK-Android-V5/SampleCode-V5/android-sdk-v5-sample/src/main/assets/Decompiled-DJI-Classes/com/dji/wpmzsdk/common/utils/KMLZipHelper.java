/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 */
package com.dji.wpmzsdk.common.utils;

import android.content.Context;
import android.util.Log;
import com.dji.wpmzsdk.common.utils.DocumentsUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class KMLZipHelper {
    private static final String TAG = "KMLZipHelper";

    private KMLZipHelper() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String getSelectFilePath(Context context, String srcFile, String selectFileName) {
        try (ZipInputStream inZip = new ZipInputStream(DocumentsUtils.getInputStream(context, new File(srcFile)));){
            String name;
            ZipEntry zipEntry;
            do {
                if ((zipEntry = inZip.getNextEntry()) == null) return null;
                name = zipEntry.getName();
            } while (zipEntry.isDirectory() || !name.endsWith(selectFileName));
            String string = name;
            return string;
        }
        catch (Exception e) {
            Log.e((String)TAG, (String)e.getMessage());
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static File unZipFile(Context context, String srcFile, String destFile, String selectFileName) {
        OutputStream out = null;
        try (ZipInputStream inZip = new ZipInputStream(DocumentsUtils.getInputStream(context, new File(srcFile)));){
            while (true) {
                ZipEntry zipEntry;
                if ((zipEntry = inZip.getNextEntry()) != null) {
                    int len;
                    String name = zipEntry.getName();
                    if (zipEntry.isDirectory() || !name.endsWith(selectFileName)) continue;
                    File file = new File(destFile);
                    out = DocumentsUtils.getOutputStream(context, file);
                    byte[] buffer = new byte[1024];
                    while ((len = inZip.read(buffer)) != -1) {
                        out.write(buffer, 0, len);
                        out.flush();
                    }
                    out.close();
                    File file2 = file;
                    return file2;
                    continue;
                }
                break;
            }
        }
        catch (Exception e) {
            Log.e((String)TAG, (String)e.getMessage());
        }
        finally {
            if (out != null) {
                try {
                    out.close();
                }
                catch (IOException e) {
                    Log.e((String)TAG, (String)e.getMessage());
                }
            }
        }
        return null;
    }

    public static void unZipFolder(Context context, String zipFileString, String outPathString, boolean flatFolder) {
        try (ZipInputStream inZip = new ZipInputStream(DocumentsUtils.getInputStream(context, new File(zipFileString)));){
            ZipEntry zipEntry;
            while ((zipEntry = inZip.getNextEntry()) != null) {
                String name = zipEntry.getName();
                if (zipEntry.isDirectory()) {
                    File folder = new File(outPathString, name);
                    DocumentsUtils.mkdirs(folder);
                    continue;
                }
                if (flatFolder && name.contains("/")) {
                    name = name.substring(name.lastIndexOf(47));
                }
                KMLZipHelper.unZipFileEntry(context, inZip, outPathString, name);
            }
        }
        catch (Exception e) {
            Log.e((String)TAG, (String)e.getMessage());
        }
    }

    private static void unZipFileEntry(Context context, ZipInputStream inZip, String outPathString, String name) {
        File file = new File(outPathString, name);
        if (file.getParentFile() != null) {
            DocumentsUtils.mkdirs(file.getParentFile());
        }
        try (OutputStream out = DocumentsUtils.getOutputStream(context, file);){
            int len;
            byte[] buffer = new byte[1024];
            while ((len = inZip.read(buffer)) != -1) {
                out.write(buffer, 0, len);
                out.flush();
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public static void zipFiles(Context context, List<String> files, String zipFile) throws Exception {
        try (FileOutputStream outputStream = new FileOutputStream(zipFile);
             ZipOutputStream outZip = new ZipOutputStream(outputStream);){
            for (String filePath : files) {
                File file = new File(filePath);
                KMLZipHelper.doZipFiles(context, file.getParent() + File.separator, file.getName(), outZip);
            }
            outZip.finish();
            outputStream.getFD().sync();
        }
    }

    private static void doZipFiles(Context context, String folderString, String fileString, ZipOutputStream zipOutputSteam) throws Exception {
        if (zipOutputSteam == null) {
            return;
        }
        File file = new File(folderString, fileString);
        if (file.isFile()) {
            int len;
            ZipEntry zipEntry = new ZipEntry(fileString);
            InputStream inputStream = DocumentsUtils.getInputStream(context, file);
            zipOutputSteam.putNextEntry(zipEntry);
            byte[] buffer = new byte[4096];
            while ((len = inputStream.read(buffer)) != -1) {
                zipOutputSteam.write(buffer, 0, len);
            }
            inputStream.close();
            zipOutputSteam.closeEntry();
        } else {
            String[] fileList = file.list();
            if (fileList.length <= 0) {
                ZipEntry zipEntry = new ZipEntry(fileString + File.separator);
                zipOutputSteam.putNextEntry(zipEntry);
                zipOutputSteam.closeEntry();
            }
            for (String aFileList : fileList) {
                KMLZipHelper.doZipFiles(context, folderString, fileString + File.separator + aFileList, zipOutputSteam);
            }
        }
    }
}

