/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package com.dji.industry.mission.natives.pack;

import androidx.annotation.Keep;
import dji.v5.common.KeepProguard;

public class PackHelper
implements KeepProguard {
    private PackHelper() {
    }

    public static class PackRoute {
        @Keep
        public int id;
        @Keep
        public int type;

        @Keep
        public PackRoute(int n, int n2) {
        }
    }

    @Keep
    public static class PackCmdType {
        @Keep
        public int encryptType;
        @Keep
        public int isNeedAck;
        @Keep
        public int isResponse;

        @Keep
        public PackCmdType(int n, int n2, int n3) {
        }
    }
}

