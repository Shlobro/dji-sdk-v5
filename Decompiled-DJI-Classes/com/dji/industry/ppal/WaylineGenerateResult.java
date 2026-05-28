/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.ppal;

import java.util.List;

public class WaylineGenerateResult {
    private int errorCode;
    private List<byte[]> waylines;

    public WaylineGenerateResult(List<byte[]> waylines, int errorCode) {
        this.errorCode = errorCode;
        this.waylines = waylines;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public List<byte[]> getWaylines() {
        return this.waylines;
    }

    public void setWaylines(List<byte[]> waylines) {
        this.waylines = waylines;
    }
}

