/*
 * Decompiled with CFR 0.152.
 */
package xcrash;

import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

class FileManager {
    private String placeholderPrefix;
    private String placeholderCleanSuffix;
    private String placeholderDirtySuffix;
    private String logDir;
    private int javaLogCountMax;
    private int nativeLogCountMax;
    private int anrLogCountMax;
    private int traceLogCountMax;
    private int placeholderCountMax;
    private int placeholderSizeKb;
    private int delayMs;
    private AtomicInteger unique;
    private static final FileManager instance = new FileManager();

    private FileManager() {
    }

    static FileManager getInstance() {
        return null;
    }

    void initialize(String string, int n, int n2, int n3, int n4, int n5, int n6) {
    }

    void maintain() {
    }

    boolean maintainAnr() {
        return false;
    }

    File createLogFile(String string) {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean appendText(String string, String string2) {
        return false;
    }

    boolean recycleLogFile(File file) {
        return false;
    }

    private void doMaintain() {
    }

    private void doMaintainTombstone(File file) {
    }

    private boolean doMaintainTombstoneType(File file, String string, int n) {
        return false;
    }

    private void doMaintainPlaceholder(File file) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean cleanTheDirtyFile(File file) {
        return false;
    }

    private int getNextUnique() {
        return 0;
    }

    static /* synthetic */ void access$000(FileManager fileManager) {
    }

    static /* synthetic */ String access$100(FileManager fileManager) {
        return null;
    }

    static /* synthetic */ String access$200(FileManager fileManager) {
        return null;
    }

    static /* synthetic */ String access$300(FileManager fileManager) {
        return null;
    }
}

