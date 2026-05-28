/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.log;

import android.content.Context;
import dji.log.DJILogEntry;
import dji.log.DJILogFileConfig;
import java.util.List;
import java.util.concurrent.ExecutorService;

class DJILogFileManager {
    private static final String TAG = "DJILogFileManager";
    private DJILogFileConfig config;
    private ExecutorService pool;

    DJILogFileManager() {
    }

    public void init(Context context, DJILogFileConfig dJILogFileConfig) {
    }

    void saveLog(List<DJILogEntry> list) {
    }

    protected String getRootDirectory() {
        return null;
    }

    protected String getCachePath() {
        return null;
    }

    protected String getCachePath(String string) {
        return null;
    }

    String getExtraPath(String string) {
        return null;
    }

    String generateFileName() {
        return null;
    }

    protected boolean isOpen() {
        return false;
    }

    private void writeLog2File(String string, String string2) {
    }

    private String generateLogMsg(long l2, int n, String string, String string2) {
        return null;
    }

    private String encrypt(String string) {
        return null;
    }

    private void executeTransactionJob(List<DJILogEntry> list) {
    }

    private void executeJob(Runnable runnable) {
    }

    private String getHeader(String string) {
        return null;
    }

    static /* synthetic */ String access$000(DJILogFileManager dJILogFileManager, long l2, int n, String string, String string2) {
        return null;
    }

    static /* synthetic */ void access$100(DJILogFileManager dJILogFileManager, String string, String string2) {
    }

    private class TransactionJob
    implements Runnable {
        final List<DJILogEntry> logCaches;
        final /* synthetic */ DJILogFileManager this$0;

        public TransactionJob(DJILogFileManager dJILogFileManager, List<DJILogEntry> list) {
        }

        @Override
        public void run() {
        }
    }
}

