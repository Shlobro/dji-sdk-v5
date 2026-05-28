/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.os.Build$VERSION
 */
package com.cySdkyc.clx;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.List;

public class Helper {
    public static String CPU_ABI = null;
    public static String JNIPPATH = null;
    public static String PPATH = null;
    public static ClassLoader cl;
    public static String new_so_dir;
    public static String sdkname = "clx";
    public static Context CTX;

    public static native void attach(Application var0, Context var1);

    public static native void installApplicationEx(String var0, Class var1);

    public static native String d(String var0);

    public static native void i();

    public static native Object[] makeInMemoryDexElements(Object var0, List<IOException> var1, String var2);

    public static void installApplicationEx(String pkg) {
        Helper.installApplicationEx(pkg, Helper.class);
    }

    public static void install(Application app) {
        sdkname = "clx";
        CTX = app.getBaseContext();
        try {
            System.loadLibrary("Sdkyclx_" + sdkname);
            Helper.i();
        }
        catch (Error error) {
            // empty catch block
        }
    }

    private static void cpAst(String filename, String dst) {
        InputStream ast = null;
        try {
            ast = CTX.getAssets().open(filename);
            FileOutputStream fos = new FileOutputStream(new File(dst));
            byte[] buffer = new byte[1024];
            int byteCount = 0;
            while ((byteCount = ast.read(buffer)) != -1) {
                fos.write(buffer, 0, byteCount);
            }
            fos.flush();
            ast.close();
            fos.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getCPUABI() {
        if (CPU_ABI != null) {
            return CPU_ABI;
        }
        try {
            CPU_ABI = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.product.cpu.abi").getInputStream())).readLine().contains("x86") ? "x86" : "arm";
        }
        catch (Exception e) {
            CPU_ABI = "arm";
        }
        return CPU_ABI;
    }

    public static String getRelease() {
        if (Build.VERSION.SDK_INT <= 10) {
            return "2.2";
        }
        return "4.0";
    }

    private static void customBufferStreamCopy(File source, File target) {
        FileOutputStream fos = null;
        try {
            FileInputStream inputStream;
            FileInputStream fis = new FileInputStream(source);
            try {
                fos = new FileOutputStream(target);
            }
            catch (Exception e2) {
                inputStream = fis;
                e2.printStackTrace();
            }
            try {
                byte[] buf = new byte[4096];
                while (true) {
                    int i;
                    if ((i = ((InputStream)fis).read(buf)) == -1) {
                        ((InputStream)fis).close();
                        ((OutputStream)fos).close();
                        FileOutputStream outputStream = fos;
                        inputStream = fis;
                        return;
                    }
                    ((OutputStream)fos).write(buf, 0, i);
                }
            }
            catch (Exception e3) {
                FileOutputStream outputStream = fos;
                inputStream = fis;
                e3.printStackTrace();
            }
        }
        catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    static {
        new_so_dir = null;
        CTX = null;
    }
}

