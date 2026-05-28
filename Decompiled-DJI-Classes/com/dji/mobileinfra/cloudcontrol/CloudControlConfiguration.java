/*
 * Decompiled with CFR 0.152.
 */
package com.dji.mobileinfra.cloudcontrol;

import com.dji.mobileinfra.cloudcontrol.ParseError;
import java.util.Map;

public final class CloudControlConfiguration {
    private final Map<String, Namespace> a;

    CloudControlConfiguration(Map<String, Namespace> map) {
    }

    public Map<String, Namespace> getNamespaces() {
        return null;
    }

    public Namespace getNamespace(String string) {
        return null;
    }

    static class a {
        a() {
        }

        CloudControlConfiguration a(String string) throws ParseError {
            return null;
        }

        String a(CloudControlConfiguration cloudControlConfiguration) throws ParseError {
            return null;
        }
    }

    public static class Namespace {
        private final String a;
        private final Map<String, Entry> b;

        public Namespace(String string, Map<String, Entry> map) {
        }

        public String getName() {
            return null;
        }

        public Map<String, Entry> getEntries() {
            return null;
        }

        public Entry getEntry(String string) {
            return null;
        }
    }

    public static final class Entry {
        private final String a;
        private final Object b;

        public Entry(String string, Object object) {
        }

        private static boolean a(Object object, Object object2) {
            return false;
        }

        public String getKey() {
            return null;
        }

        public Object getValue() {
            return null;
        }

        public int hashCode() {
            return 0;
        }

        public boolean equals(Object object) {
            return false;
        }

        public Boolean getBooleanValue() {
            return null;
        }

        public boolean optBooleanValue() {
            return false;
        }

        public boolean optBooleanValue(boolean bl) {
            return false;
        }

        public Double getDoubleValue() {
            return null;
        }

        public double optDoubleValue() {
            return 0.0;
        }

        public double optDoubleValue(double d2) {
            return 0.0;
        }

        public Integer getIntegerValue() {
            return null;
        }

        public int optIntValue() {
            return 0;
        }

        public int optIntValue(int n) {
            return 0;
        }

        public Long getLongValue() {
            return null;
        }

        public long optLongValue() {
            return 0L;
        }

        public long optLongValue(long l2) {
            return 0L;
        }

        public String getStringValue() {
            return null;
        }

        public String optStringValue() {
            return null;
        }

        public String optStringValue(String string) {
            return null;
        }
    }
}

