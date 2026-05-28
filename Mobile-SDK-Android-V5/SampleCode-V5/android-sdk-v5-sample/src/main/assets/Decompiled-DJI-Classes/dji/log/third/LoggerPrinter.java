/*
 * Decompiled with CFR 0.152.
 */
package dji.log.third;

import dji.log.third.Printer;
import dji.log.third.Settings;

final class LoggerPrinter
implements Printer {
    private static final String DEFAULT_TAG = "PRETTYLOGGER";
    private static final int DEBUG = 3;
    private static final int ERROR = 6;
    private static final int ASSERT = 7;
    private static final int INFO = 4;
    private static final int VERBOSE = 2;
    private static final int WARN = 5;
    private static final int CHUNK_SIZE = 4000;
    private static final int JSON_INDENT = 2;
    private static final int MIN_STACK_OFFSET = 3;
    private static final char TOP_LEFT_CORNER = '\u2554';
    private static final char BOTTOM_LEFT_CORNER = '\u255a';
    private static final char MIDDLE_CORNER = '\u255f';
    private static final char HORIZONTAL_DOUBLE_LINE = '\u2551';
    private static final String DOUBLE_DIVIDER = "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550";
    private static final String SINGLE_DIVIDER = "\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500";
    private static final String TOP_BORDER = "\u2554\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550";
    private static final String BOTTOM_BORDER = "\u255a\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550";
    private static final String MIDDLE_BORDER = "\u255f\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500";
    private String tag;
    private final ThreadLocal<String> localTag;
    private final ThreadLocal<Integer> localMethodCount;
    private final Settings settings;

    @Override
    public Settings init(String string) {
        return null;
    }

    @Override
    public Settings getSettings() {
        return null;
    }

    @Override
    public Printer t(String string, int n) {
        return null;
    }

    @Override
    public void d(String string, Object ... objectArray) {
    }

    @Override
    public void d(Object object) {
    }

    @Override
    public void e(String string, Object ... objectArray) {
    }

    @Override
    public void e(Throwable throwable, String string, Object ... objectArray) {
    }

    @Override
    public void w(String string, Object ... objectArray) {
    }

    @Override
    public void i(String string, Object ... objectArray) {
    }

    @Override
    public void v(String string, Object ... objectArray) {
    }

    @Override
    public void wtf(String string, Object ... objectArray) {
    }

    @Override
    public void json(String string) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void xml(String string) {
    }

    @Override
    public synchronized void log(int n, String string, String string2, Throwable throwable) {
    }

    @Override
    public void resetSettings() {
    }

    private synchronized void log(int n, Throwable throwable, String string, Object ... objectArray) {
    }

    private void logTopBorder(int n, String string) {
    }

    private void logHeaderContent(int n, String string, int n2) {
    }

    private void logBottomBorder(int n, String string) {
    }

    private void logDivider(int n, String string) {
    }

    private void logContent(int n, String string, String string2) {
    }

    private void logChunk(int n, String string, String string2) {
    }

    private String getSimpleClassName(String string) {
        return null;
    }

    private String formatTag(String string) {
        return null;
    }

    private String getTag() {
        return null;
    }

    private String createMessage(String string, Object ... objectArray) {
        return null;
    }

    private int getMethodCount() {
        return 0;
    }

    private int getStackOffset(StackTraceElement[] stackTraceElementArray) {
        return 0;
    }
}

