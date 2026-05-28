/*
 * Decompiled with CFR 0.152.
 */
package xcrash;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class TombstoneParser {
    public static final String keyTombstoneMaker = "Tombstone maker";
    public static final String keyCrashType = "Crash type";
    public static final String keyStartTime = "Start time";
    public static final String keyCrashTime = "Crash time";
    public static final String keyAppId = "App ID";
    public static final String keyAppVersion = "App version";
    public static final String keyRooted = "Rooted";
    public static final String keyApiLevel = "API level";
    public static final String keyOsVersion = "OS version";
    public static final String keyKernelVersion = "Kernel version";
    public static final String keyAbiList = "ABI list";
    public static final String keyManufacturer = "Manufacturer";
    public static final String keyBrand = "Brand";
    public static final String keyModel = "Model";
    public static final String keyBuildFingerprint = "Build fingerprint";
    public static final String keyAbi = "ABI";
    public static final String keyProcessId = "pid";
    public static final String keyThreadId = "tid";
    public static final String keyProcessName = "pname";
    public static final String keyThreadName = "tname";
    public static final String keySignal = "signal";
    public static final String keyCode = "code";
    public static final String keyFaultAddr = "fault addr";
    public static final String keyAbortMessage = "Abort message";
    public static final String keyRegisters = "registers";
    public static final String keyBacktrace = "backtrace";
    public static final String keyBuildId = "build id";
    public static final String keyStack = "stack";
    public static final String keyMemoryNear = "memory near";
    public static final String keyMemoryMap = "memory map";
    public static final String keyLogcat = "logcat";
    public static final String keyOpenFiles = "open files";
    public static final String keyNetworkInfo = "network info";
    public static final String keyMemoryInfo = "memory info";
    public static final String keyOtherThreads = "other threads";
    public static final String keyJavaStacktrace = "java stacktrace";
    public static final String keyXCrashError = "xcrash error";
    public static final String keyForeground = "foreground";
    public static final String keyXCrashErrorDebug = "xcrash error debug";
    private static final Pattern patHeadItem = Pattern.compile("^(.*):\\s'(.*?)'$");
    private static final Pattern patProcessThread = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");
    private static final Pattern patProcess = Pattern.compile("^pid:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");
    private static final Pattern patSignalCode = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");
    private static final Pattern patAppVersionProcessName = Pattern.compile("^(\\d{20})_(.*)__(.*)$");
    private static final Set<String> keyHeadItems = new HashSet<String>(Arrays.asList("Tombstone maker", "Crash type", "Start time", "Crash time", "App ID", "App version", "Rooted", "API level", "OS version", "Kernel version", "ABI list", "Manufacturer", "Brand", "Model", "Build fingerprint", "ABI", "Abort message"));
    private static final Set<String> keySections = new HashSet<String>(Arrays.asList("backtrace", "build id", "stack", "memory map", "logcat", "open files", "java stacktrace", "xcrash error", "xcrash error debug"));
    private static final Set<String> keySingleLineSections = new HashSet<String>(Arrays.asList("foreground"));

    private TombstoneParser() {
    }

    public static Map<String, String> parse(File file) throws IOException {
        return null;
    }

    public static Map<String, String> parse(String string) throws IOException {
        return null;
    }

    public static Map<String, String> parse(String string, String string2) throws IOException {
        return null;
    }

    private static void parseFromLogPath(Map<String, String> map, String string) {
    }

    private static void addSystemInfo(Map<String, String> map) {
    }

    private static String readLineInBinary(BufferedReader bufferedReader) throws IOException {
        return null;
    }

    private static void parseFromReader(Map<String, String> map, BufferedReader bufferedReader, boolean bl) throws IOException {
    }

    private static void putKeyValue(Map<String, String> map, String string, String string2) {
    }

    private static void putKeyValue(Map<String, String> map, String string, String string2, boolean bl) {
    }

    private static enum Status {
        UNKNOWN,
        HEAD,
        SECTION;

    }
}

