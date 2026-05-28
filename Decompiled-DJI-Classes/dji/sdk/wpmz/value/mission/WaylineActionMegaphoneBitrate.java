/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineActionMegaphoneBitrate implements JNIProguardKeepTag
{
    BITRATE_8000(1),
    BITRATE_16000(2),
    BITRATE_24000(3),
    BITRATE_32000(4),
    BITRATE_48000(5),
    BITRATE_64000(6),
    UNKNOWN(65535);

    private int value;
    private static final WaylineActionMegaphoneBitrate[] allValues;

    private WaylineActionMegaphoneBitrate(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineActionMegaphoneBitrate find(int value) {
        WaylineActionMegaphoneBitrate result = null;
        for (int i = 0; i < allValues.length; ++i) {
            if (!allValues[i].equals(value)) continue;
            result = allValues[i];
            break;
        }
        if (null == result) {
            result = UNKNOWN;
            result.value = value;
        }
        return result;
    }

    static {
        allValues = WaylineActionMegaphoneBitrate.values();
    }
}

