/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 */
package dji.log;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import dji.log.Controller;
import dji.log.DJILogConsoleConfig;
import dji.log.DJILogConsolePrinter;
import dji.log.DJILogEntry;
import dji.log.DJILogFileConfig;
import dji.log.DJILogFileManager;
import dji.log.DJILogWarnHandler;
import dji.log.Interceptor;
import java.text.SimpleDateFormat;
import java.util.List;

public class DJILogHelper {
    public static DJILogHelper INSTANCE;
    private DJILogConsolePrinter consolePrinter;
    private Controller controller;
    private DJILogFileManager fileManager;
    private List<DJILogEntry> memoryCache;
    private static final int TRANSACTION_SIZE = 20;
    private static final int TRANSACTION_MAX_SIZE = 200;
    private static final long INTERVAL_TIME_PUT_TO_MEMORY = 100L;
    private long currentTimePutToMemory;
    private LogHandler handler;
    private DJILogWarnHandler mConsoleWarnHandler;
    private DJILogWarnHandler mFileManagerHandler;
    private static final int MSG_LOG_TO_CACHE = 0;
    private List<Interceptor> mInterceptors;
    protected static boolean OPEN;
    protected static boolean DEBUGGABLE;
    private static String[] filterTag;
    SimpleDateFormat dateFormat;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DJILogHelper getInstance() {
        return null;
    }

    private DJILogHelper() {
    }

    void init(Context context) {
    }

    void init(Context context, DJILogFileConfig dJILogFileConfig, DJILogConsoleConfig dJILogConsoleConfig) {
    }

    private void initLogHelper(Context context, DJILogFileConfig dJILogFileConfig, DJILogConsoleConfig dJILogConsoleConfig) {
    }

    private void initLogConfig(DJILogFileConfig dJILogFileConfig) {
    }

    private void initManagers(Context context, DJILogFileConfig dJILogFileConfig, DJILogConsoleConfig dJILogConsoleConfig) {
    }

    public Controller controller() {
        return null;
    }

    public void setController(Controller controller) {
    }

    public Controller newController() {
        return null;
    }

    String getRootDirectory() {
        return null;
    }

    private String getCachePath() {
        return null;
    }

    private String getCachePath(String string) {
        return null;
    }

    void v(String string, String string2, Object ... objectArray) {
    }

    void v(String string, String string2, Throwable throwable, Object ... objectArray) {
    }

    void d(String string, String string2, Object ... objectArray) {
    }

    void d(String string, String string2, Throwable throwable, Object ... objectArray) {
    }

    void i(String string, String string2, Object ... objectArray) {
    }

    void i(String string, String string2, Throwable throwable, Object ... objectArray) {
    }

    void w(String string, String string2, Object ... objectArray) {
    }

    void w(String string, String string2, Throwable throwable, Object ... objectArray) {
    }

    void e(String string, String string2, Object ... objectArray) {
    }

    void e(String string, String string2, Throwable throwable, Object ... objectArray) {
    }

    void println(int n, String string, String string2) {
    }

    long[] getPriorityRatio() {
        return null;
    }

    private void dispatchLog(int n, String string, String string2, Throwable throwable, Object ... objectArray) {
    }

    void saveLog(String string) {
    }

    void saveLog(String string, String string2) {
    }

    void saveLog(String string, String string2, String string3) {
    }

    void saveLog(int n, String string, String string2, String string3) {
    }

    void saveExtraLog(String string, String string2) {
    }

    void saveExtraLog(String string, String string2, String string3) {
    }

    void showView(String string) {
    }

    void flush() {
    }

    void addInterceptors(Interceptor interceptor) {
    }

    void removeInterceptors(Interceptor interceptor) {
    }

    public void dispatchLogCache(int n, String string, String string2, String string3) {
    }

    private DJILogEntry obtainLogEntry(int n, String string, String string2, String string3) {
        return null;
    }

    private void putLogCacheToMemory(DJILogEntry dJILogEntry) {
    }

    private void initForOld(Context context) {
    }

    public void autoHandle() {
    }

    public void closeLog() {
    }

    public String getLogParentDir() {
        return null;
    }

    public String getLogName() {
        return null;
    }

    public void LOGI(String string, String string2) {
    }

    public void LOGD(String string, String string2) {
    }

    public void LOGE(String string, String string2) {
    }

    public void LOGI(String string, String string2, boolean bl, boolean bl2) {
    }

    public void LOGD(String string, String string2, boolean bl, boolean bl2) {
    }

    public void LOGE(String string, String string2, boolean bl, boolean bl2) {
    }

    public void LOGI(String string, String string2, String string3) {
    }

    public void LOGD(String string, String string2, String string3) {
    }

    public void LOGE(String string, String string2, String string3) {
    }

    public void pLogD(String string, String string2, Object ... objectArray) {
    }

    public void pLogD(String string, Object object) {
    }

    public void pLogE(String string, String string2, Object ... objectArray) {
    }

    public void pLogE(String string, int n, String string2, Object ... objectArray) {
    }

    public void pLogE(String string, Throwable throwable, String string2, Object ... objectArray) {
    }

    public void pLogI(String string, String string2, Object ... objectArray) {
    }

    public void pLogDFile(String string, String string2, String string3, Object ... objectArray) {
    }

    public void pLogDFile(String string, String string2, Object object) {
    }

    public void pLogEFile(String string, String string2, String string3, Object ... objectArray) {
    }

    public void pLogIFile(String string, String string2, String string3, Object ... objectArray) {
    }

    public void pJson(String string) {
    }

    public void pXml(String string) {
    }

    private String createMessage(String string, Object ... objectArray) {
        return null;
    }

    private boolean checkTagFilter(String string) {
        return false;
    }

    public void logNoVideoData() {
    }

    private void nfzSaveCrashInfo2File(String string) {
    }

    public void NFZSavedLOGE(String string, String string2, boolean bl, boolean bl2) {
    }

    public void writeMapLog(String string) {
    }

    static /* synthetic */ void access$000(DJILogHelper dJILogHelper, DJILogEntry dJILogEntry) {
    }

    static {
        OPEN = false;
        DEBUGGABLE = false;
        filterTag = new String[0];
    }

    private class LogHandler
    extends Handler {
        final /* synthetic */ DJILogHelper this$0;

        public LogHandler(DJILogHelper dJILogHelper, Looper looper) {
        }

        public void handleMessage(Message message) {
        }
    }
}

