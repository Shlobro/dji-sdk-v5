/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.log;

import android.content.Context;
import dji.log.IEncryption;
import dji.log.IFileFormat;
import java.util.concurrent.ExecutorService;

public class DJILogFileConfig {
    public boolean open;
    public long SPACE_MARGINAL;
    public String LOG_FILE_PREFIX;
    public String LOG_FILE_TYPE;
    public String LOG_PATH_ROOT;
    public IEncryption encryption;
    public IFileFormat fileFormat;
    public String LOG_TIME_FORMAT;
    public String LINE_FEED;
    public int versionCode;
    public String versionName;
    public ExecutorService service;

    public static class Builder {
        private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors() - 1;
        private static final int MAXIMUM_POOL_SIZE = 5;
        private static final int CORE_POOL_SIZE = Math.max(2, Math.min(CPU_COUNT, 5));
        DJILogFileConfig config;

        public Builder(Context context) {
        }

        public Builder setOpen(boolean bl) {
            return null;
        }

        public Builder setSpaceMarginal(long l2) {
            return null;
        }

        public Builder setFilePrefix(String string) {
            return null;
        }

        public Builder setFileType(String string) {
            return null;
        }

        public Builder setPathRoot(String string) {
            return null;
        }

        public Builder setEncryption(IEncryption iEncryption) {
            return null;
        }

        public Builder setFileFormat(IFileFormat iFileFormat) {
            return null;
        }

        public Builder setLogTimeFormat(String string) {
            return null;
        }

        public Builder setLineFeed(String string) {
            return null;
        }

        public Builder setVersionCode(int n) {
            return null;
        }

        public Builder setVersionName(String string) {
            return null;
        }

        public Builder setExecutorService(ExecutorService executorService) {
            return null;
        }

        public DJILogFileConfig build() {
            return null;
        }
    }
}

