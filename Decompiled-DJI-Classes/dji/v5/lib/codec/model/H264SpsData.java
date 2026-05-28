/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.lib.codec.model;

import androidx.annotation.NonNull;

public class H264SpsData {
    public final int profileIdc;
    public final int constraintsFlagsAndReservedZero2Bits;
    public final int levelIdc;
    public final int seqParameterSetId;
    public final int maxNumRefFrames;
    public final int width;
    public final int height;
    public final int frameRate;
    public final float pixelWidthHeightRatio;
    public final boolean separateColorPlaneFlag;
    public final boolean frameMbsOnlyFlag;
    public final int frameNumLength;
    public final int picOrderCountType;
    public final int picOrderCntLsbLength;
    public final boolean deltaPicOrderAlwaysZeroFlag;
    public final int colorSpace;
    public final int colorRange;
    public final int colorTransfer;

    public H264SpsData(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, float f2, boolean bl, boolean bl2, int n9, int n10, int n11, boolean bl3, int n12, int n13, int n14) {
    }

    @NonNull
    public String toString() {
        return null;
    }
}

