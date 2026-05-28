/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.UriPermission
 *  android.net.Uri
 *  android.util.Log
 *  android.util.Pair
 *  androidx.documentfile.provider.DocumentFile
 */
package com.dji.wpmzsdk.common.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.UriPermission;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import androidx.documentfile.provider.DocumentFile;
import com.dji.wpmzsdk.common.utils.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class DocumentsUtils {
    private static final String TAG = DocumentsUtils.class.getSimpleName();
    public static final int OPEN_DOCUMENT_TREE_CODE_IMPORT = 8000;
    public static final int OPEN_DOCUMENT_TREE_CODE_EXPORT = 8001;

    private DocumentsUtils() {
    }

    @TargetApi(value=19)
    private static String[] getExtSdCardPaths(Context context) {
        ArrayList<String> extSdCardPaths = new ArrayList<String>();
        for (File file : context.getExternalFilesDirs("external")) {
            if (file == null || file.equals(context.getExternalFilesDir("external"))) continue;
            int index = file.getAbsolutePath().lastIndexOf("/Android/data");
            if (index < 0) {
                Log.w((String)TAG, (String)("Unexpected external file dir: " + file.getAbsolutePath()));
                continue;
            }
            String path = file.getAbsolutePath().substring(0, index);
            try {
                path = new File(path).getCanonicalPath();
            }
            catch (IOException iOException) {
                // empty catch block
            }
            extSdCardPaths.add(path);
        }
        if (extSdCardPaths.isEmpty()) {
            extSdCardPaths.add("/storage/sdcard1");
        }
        return extSdCardPaths.toArray(new String[0]);
    }

    @TargetApi(value=19)
    private static String getExtSdCardFolder(File file, Context context) {
        String[] extSdPaths = DocumentsUtils.getExtSdCardPaths(context);
        try {
            for (int i = 0; i < extSdPaths.length; ++i) {
                if (!file.getCanonicalPath().startsWith(extSdPaths[i])) continue;
                return extSdPaths[i];
            }
        }
        catch (IOException e) {
            return null;
        }
        return null;
    }

    @TargetApi(value=19)
    public static boolean isOnExtSdCard(File file, Context c) {
        return DocumentsUtils.getExtSdCardFolder(file, c) != null;
    }

    public static DocumentFile getDocumentFile(File file, boolean isDirectory, Context context) {
        String baseFolder = DocumentsUtils.getExtSdCardFolder(file, context);
        boolean originalDirectory = false;
        if (baseFolder == null) {
            return null;
        }
        String relativePath = "";
        try {
            String fullPath = file.getCanonicalPath();
            if (!baseFolder.equals(fullPath)) {
                relativePath = fullPath.substring(baseFolder.length() + 1);
            } else {
                originalDirectory = true;
            }
        }
        catch (IOException e) {
            return null;
        }
        catch (Exception f) {
            originalDirectory = true;
        }
        Pair<Uri, String> resolvedRelativePath = DocumentsUtils.resolvePermissionPath(context, baseFolder, relativePath);
        if (resolvedRelativePath == null) {
            return null;
        }
        DocumentFile document = DocumentFile.fromTreeUri((Context)context, (Uri)((Uri)resolvedRelativePath.first));
        if (originalDirectory) {
            return document;
        }
        return DocumentsUtils.getDocumentFile((String)resolvedRelativePath.second, isDirectory, document);
    }

    private static Pair<Uri, String> resolvePermissionPath(Context context, String baseFolder, String relativePath) {
        List persistedUriPermissions = context.getContentResolver().getPersistedUriPermissions();
        for (UriPermission item : persistedUriPermissions) {
            String permissionPath = item.getUri().getLastPathSegment();
            if (permissionPath == null) continue;
            String[] permissionRelativePaths = permissionPath.split(":");
            String permissionRelativePath = "";
            if (permissionRelativePaths.length > 1) {
                permissionRelativePath = permissionRelativePaths[1];
            }
            if (!baseFolder.endsWith(permissionRelativePaths[0]) || !relativePath.startsWith(permissionRelativePath)) continue;
            Uri treeUri = item.getUri();
            String resolvedRelativePath = relativePath.substring(permissionRelativePath.length());
            return new Pair((Object)treeUri, (Object)resolvedRelativePath);
        }
        return null;
    }

    private static DocumentFile getDocumentFile(String relativePath, boolean isDirectory, DocumentFile document) {
        if (null == document) {
            return null;
        }
        String[] parts = relativePath.split("/");
        for (int i = 0; i < parts.length; ++i) {
            if (parts[i].equals("")) continue;
            if (null == document) {
                return null;
            }
            DocumentFile nextDocument = document.findFile(parts[i]);
            if (nextDocument == null) {
                nextDocument = i < parts.length - 1 || isDirectory ? document.createDirectory(parts[i]) : document.createFile("", parts[i]);
            }
            document = nextDocument;
        }
        return document;
    }

    public static boolean mkdirs(File dir) {
        return FileUtils.mkdirs(dir);
    }

    public static boolean delete(File file) {
        return FileUtils.delFile(file);
    }

    public static InputStream getInputStream(Context context, File destFile) {
        InputStream in = null;
        try {
            if (DocumentsUtils.isOnExtSdCard(destFile, context)) {
                DocumentFile file = DocumentsUtils.getDocumentFile(destFile, false, context);
                if (file != null && file.canWrite()) {
                    in = context.getContentResolver().openInputStream(file.getUri());
                } else {
                    Log.e((String)TAG, (String)"getInputStream file or file.cannot Write");
                }
            } else {
                String canonicalDestinationPath = destFile.getCanonicalPath();
                if (!canonicalDestinationPath.contains("s")) {
                    throw new IOException("Entry is outside of the target directory");
                }
                in = new FileInputStream(destFile);
            }
        }
        catch (IOException e) {
            Log.e((String)TAG, (String)e.getMessage());
        }
        return in;
    }

    public static OutputStream getOutputStream(Context context, File destFile) {
        OutputStream out = null;
        try {
            if (DocumentsUtils.isOnExtSdCard(destFile, context)) {
                DocumentFile file = DocumentsUtils.getDocumentFile(destFile, false, context);
                if (file != null && file.canWrite()) {
                    out = context.getContentResolver().openOutputStream(file.getUri());
                }
            } else {
                String canonicalDestinationPath = destFile.getCanonicalPath();
                if (!canonicalDestinationPath.contains("s")) {
                    throw new IOException("Entry is outside of the target directory");
                }
                out = new FileOutputStream(destFile);
            }
        }
        catch (IOException e) {
            Log.e((String)TAG, (String)e.getMessage());
        }
        return out;
    }

    public static boolean checkWritableRootPath(Context context, String rootPath) {
        File root = new File(rootPath);
        if (!root.canWrite()) {
            if (DocumentsUtils.isOnExtSdCard(root, context)) {
                DocumentFile documentFile = DocumentsUtils.getDocumentFile(root, true, context);
                return documentFile != null && documentFile.canWrite();
            }
            return false;
        }
        return true;
    }
}

