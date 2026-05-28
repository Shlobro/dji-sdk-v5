/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import com.dji.wpmzsdk.common.utils.kml.model.ScanMode;
import java.util.Objects;

public class PayloadConfigInfoModel
implements Cloneable {
    public static final int ECHO_MODE_SINGLE_FIRST = 0;
    public static final int ECHO_MODE_SINGLE_STRONG = 1;
    public static final int ECHO_MODE_DOUBLE = 2;
    public static final int ECHO_MODE_TREBLE = 3;
    public static final int METERING_MODE_GLOBAL = 0;
    public static final int METERING_MODE_POINT = 1;
    private int meteringMode;
    private boolean enableDewarp;
    private int echoMode;
    private int sampleRate;
    private int scanMode = ScanMode.REPEAT.value();
    private boolean needVariegation;

    public int getMeteringMode() {
        return this.meteringMode;
    }

    public void setMeteringMode(int meteringMode) {
        this.meteringMode = meteringMode;
    }

    public boolean isEnableDewarp() {
        return this.enableDewarp;
    }

    public void setEnableDewarp(boolean enableDewarp) {
        this.enableDewarp = enableDewarp;
    }

    public int getEchoMode() {
        return this.echoMode;
    }

    public void setEchoMode(int echoMode) {
        this.echoMode = echoMode;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public void setSampleRate(int sampleRate) {
        this.sampleRate = sampleRate;
    }

    public int getScanMode() {
        return this.scanMode;
    }

    public void setScanMode(int scanMode) {
        this.scanMode = scanMode;
    }

    public boolean isNeedVariegation() {
        return this.needVariegation;
    }

    public void setNeedVariegation(boolean needVariegation) {
        this.needVariegation = needVariegation;
    }

    protected PayloadConfigInfoModel clone() {
        try {
            return (PayloadConfigInfoModel)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        PayloadConfigInfoModel that = (PayloadConfigInfoModel)o;
        return this.meteringMode == that.meteringMode && this.enableDewarp == that.enableDewarp && this.echoMode == that.echoMode && this.sampleRate == that.sampleRate && this.scanMode == that.scanMode && this.needVariegation == that.needVariegation;
    }

    public int hashCode() {
        return Objects.hash(this.meteringMode, this.enableDewarp, this.echoMode, this.sampleRate, this.scanMode, this.needVariegation);
    }

    public String toString() {
        return "PayloadConfigInfoModel{meteringMode=" + this.meteringMode + ", enableDewarp=" + this.enableDewarp + ", echoMode=" + this.echoMode + ", sampleRate=" + this.sampleRate + ", scanMode=" + this.scanMode + ", needVariegation=" + this.needVariegation + '}';
    }
}

