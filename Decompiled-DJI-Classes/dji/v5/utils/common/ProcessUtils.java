/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.utils.common;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeoutException;

public class ProcessUtils {
    private static final String TAG = "ProcessUtils";
    private static final String CURRENT_PID_CPU_TOP = "top -n 1";
    private static final String CURRENT_PID_CPU_PROC_STATUS = "cat /proc/%d/status";

    public static int executeCommand(String string2, long l2) throws IOException, InterruptedException, TimeoutException {
        return 0;
    }

    public static boolean isReachable(String string2, int n) throws UnknownHostException, IOException {
        return false;
    }

    public static String execRootCmd(String string2) {
        return null;
    }

    public static void saveCurrentSystemMsg() {
    }

    private static void execCmd(String string2, StringBuilder stringBuilder, Filter filter) {
    }

    private static /* synthetic */ String lambda$saveCurrentSystemMsg$1(String string2) {
        return null;
    }

    private static /* synthetic */ String lambda$saveCurrentSystemMsg$0(String string2) {
        return null;
    }

    private static class Worker
    extends Thread {
        private final Process process;
        private Integer exit;

        private Worker(Process process) {
        }

        @Override
        public void run() {
        }

        /* synthetic */ Worker(Process process, 1 var2_2) {
        }

        static /* synthetic */ Integer access$100(Worker worker) {
            return null;
        }
    }

    static interface Filter {
        public String result(String var1);
    }
}

