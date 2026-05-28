/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.lib.codec.model;

import androidx.annotation.NonNull;

public class H265SpsData {
    public final int generalProfileSpace;
    public final boolean generalTierFlag;
    public final int generalProfileIdc;
    public final int generalProfileCompatibilityFlags;
    public final int chromaFormatIdc;
    public final int bitDepthLumaMinus8;
    public final int bitDepthChromaMinus8;
    public final int[] constraintBytes;
    public final int generalLevelIdc;
    public final int seqParameterSetId;
    public final int width;
    public final int height;
    public final int frameRate;
    public final float pixelWidthHeightRatio;
    public final int colorSpace;
    public final int colorRange;
    public final int colorTransfer;

    public H265SpsData(int n, boolean bl, int n2, int n3, int n4, int n5, int n6, int[] nArray, int n7, int n8, int n9, int n10, int n11, float f2, int n12, int n13, int n14) {
    }

    @NonNull
    public String toString() {
        return null;
    }
}

