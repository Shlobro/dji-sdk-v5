/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.net.Uri
 *  android.util.Pair
 *  androidx.documentfile.provider.DocumentFile
 */
package com.dji.industry.mission;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import androidx.documentfile.provider.DocumentFile;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

public class DocumentsUtils {
    private static final String TAG = DocumentsUtils.class.getSimpleName();
    public static final int OPEN_DOCUMENT_TREE_CODE_IMPORT = 8000;
    public static final int OPEN_DOCUMENT_TREE_CODE_EXPORT = 8001;

    private DocumentsUtils() {
    }

    @TargetApi(value=19)
    private static String[] getExtSdCardPaths(Context context) {
        return null;
    }

    @TargetApi(value=19)
    private static String getExtSdCardFolder(File file, Context context) {
        return null;
    }

    @TargetApi(value=19)
    public static boolean isOnExtSdCard(File file, Context context) {
        return false;
    }

    public static DocumentFile getDocumentFile(File file, boolean bl, Context context) {
        return null;
    }

    private static Pair<Uri, String> resolvePermissionPath(Context context, String string, String string2) {
        return null;
    }

    private static DocumentFile getDocumentFile(String string, boolean bl, DocumentFile documentFile) {
        return null;
    }

    public static boolean mkdirs(File file) {
        return false;
    }

    public static boolean delete(File file) {
        return false;
    }

    public static InputStream getInputStream(Context context, File file) {
        return null;
    }

    public static OutputStream getOutputStream(Context context, File file) {
        return null;
    }

    public static boolean checkWritableRootPath(Context context, String string) {
        return false;
    }
}

