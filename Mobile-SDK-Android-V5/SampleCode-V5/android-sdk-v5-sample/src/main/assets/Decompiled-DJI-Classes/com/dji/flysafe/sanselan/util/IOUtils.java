/*
 * Decompiled with CFR 0.152.
 */
package com.dji.flysafe.sanselan.util;

import com.dji.flysafe.thirdparty.sanselan.SanselanConstants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOUtils
implements SanselanConstants {
    private IOUtils() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] getInputStreamBytes(InputStream inputStream) throws IOException {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] getFileBytes(File file) throws IOException {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void writeToFile(byte[] byArray, File file) throws IOException {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void putInputStreamToFile(InputStream inputStream, File file) throws IOException {
    }

    public static void copyStreamToStream(InputStream inputStream, OutputStream outputStream) throws IOException {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void copyStreamToStream(InputStream inputStream, OutputStream outputStream, boolean bl) throws IOException {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final boolean copyFileNio(File file, File file2) throws IOException {
        return false;
    }
}

