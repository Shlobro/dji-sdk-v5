/*
 * Decompiled with CFR 0.152.
 */
package xcrash;

import java.io.File;

public class TombstoneManager {
    private TombstoneManager() {
    }

    public static boolean appendSection(String string, String string2, String string3) {
        return false;
    }

    public static boolean isJavaCrash(File file) {
        return false;
    }

    public static boolean isNativeCrash(File file) {
        return false;
    }

    public static boolean isAnr(File file) {
        return false;
    }

    public static File[] getJavaTombstones() {
        return null;
    }

    public static File[] getNativeTombstones() {
        return null;
    }

    public static File[] getAnrTombstones() {
        return null;
    }

    public static File[] getAllTombstones() {
        return null;
    }

    public static boolean deleteTombstone(File file) {
        return false;
    }

    public static boolean deleteTombstone(String string) {
        return false;
    }

    public static boolean clearJavaTombstones() {
        return false;
    }

    public static boolean clearNativeTombstones() {
        return false;
    }

    public static boolean clearAnrTombstones() {
        return false;
    }

    public static boolean clearAllTombstones() {
        return false;
    }

    private static File[] getTombstones(String[] stringArray) {
        return null;
    }

    private static boolean clearTombstones(String[] stringArray) {
        return false;
    }
}

