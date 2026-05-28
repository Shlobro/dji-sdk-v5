/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package xcrash;

import android.content.Context;
import java.io.File;
import java.util.Date;

class Util {
    private static final String memInfoFmt = "%21s %8s\n";
    private static final String memInfoFmt2 = "%21s %8s %21s %8s\n";
    static final String TAG = "xcrash";
    static final String sepHead = "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***";
    static final String sepOtherThreads = "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---";
    static final String sepOtherThreadsEnding = "+++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++";
    static final String timeFormatterStr = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    static final String javaCrashType = "java";
    static final String nativeCrashType = "native";
    static final String anrCrashType = "anr";
    static final String logPrefix = "tombstone";
    static final String javaLogSuffix = ".java.xcrash";
    static final String nativeLogSuffix = ".native.xcrash";
    static final String anrLogSuffix = ".anr.xcrash";
    static final String traceLogSuffix = ".trace.xcrash";
    private static final String[] suPathname = new String[]{"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};

    private Util() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static String getProcessName(Context context, int n) {
        return null;
    }

    static boolean isRoot() {
        return false;
    }

    static String getAbiList() {
        return null;
    }

    static String getFileMD5(File file) {
        return null;
    }

    static String getAppVersion(Context context) {
        return null;
    }

    static String getProcessMemoryInfo() {
        return null;
    }

    private static String getFileContent(String string) {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static String getFileContent(String string, int n) {
        return null;
    }

    static boolean checkAndCreateDir(String string) {
        return false;
    }

    static boolean checkProcessAnrState(Context context, long l2) {
        return false;
    }

    static String getLogHeader(Date date, Date date2, String string, String string2, String string3) {
        return null;
    }

    static String getMemoryInfo() {
        return null;
    }

    static String getNetworkInfo() {
        return null;
    }

    static String getFds() {
        return null;
    }

    static String getLogcat(int n, int n2, int n3) {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void getLogcatByBufferName(int n, StringBuilder stringBuilder, String string, int n2, char c2) {
    }

    public static String getSystemProperty(String string, String string2) {
        return null;
    }

    public static String getMobileModel() {
        return null;
    }

    public static class Rom {
        private static final String TAG = "Rom";
        public static final String ROM_MIUI = "MIUI";
        public static final String ROM_EMUI = "EMUI";
        public static final String ROM_FLYME = "FLYME";
        public static final String ROM_OPPO = "OPPO";
        public static final String ROM_SMARTISAN = "SMARTISAN";
        public static final String ROM_VIVO = "VIVO";
        public static final String ROM_QIKU = "QIKU";
        private static final String KEY_VERSION_MIUI = "ro.miui.ui.version.name";
        private static final String KEY_VERSION_EMUI = "ro.build.version.emui";
        private static final String KEY_VERSION_OPPO = "ro.build.version.opporom";
        private static final String KEY_VERSION_SMARTISAN = "ro.smartisan.version";
        private static final String KEY_VERSION_VIVO = "ro.vivo.os.version";
        private static String sName;
        private static String sVersion;

        public static boolean isEmui() {
            return false;
        }

        public static boolean isMiui() {
            return false;
        }

        public static boolean isVivo() {
            return false;
        }

        public static boolean isOppo() {
            return false;
        }

        public static boolean isFlyme() {
            return false;
        }

        public static boolean is360() {
            return false;
        }

        public static boolean isSmartisan() {
            return false;
        }

        public static String getName() {
            return null;
        }

        public static String getVersion() {
            return null;
        }

        public static boolean check(String string) {
            return false;
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public static String getProp(String string) {
            return null;
        }
    }
}

