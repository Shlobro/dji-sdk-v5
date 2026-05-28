/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.lib.codec.decode;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.v5.lib.codec.decode.VideoDecoder;
import dji.v5.lib.codec.model.FrameInfo;
import dji.v5.lib.codec.model.NalUnit;
import java.io.IOException;
import java.util.List;

public class H264VideoDecoder
extends VideoDecoder {
    public static final int MAX_AUD_DATA_LENGTH = 50;

    public H264VideoDecoder(@Nullable String string2) throws IOException {
    }

    @Override
    protected int getNalType(@NonNull byte[] byArray, int n) {
        return 0;
    }

    @Override
    protected boolean isNextFrameStart(List<NalUnit> list, int n) {
        return false;
    }

    @Override
    protected void parseNalUnit(@NonNull FrameInfo frameInfo, @NonNull List<NalUnit> list, @NonNull byte[] byArray) {
    }

    private static boolean mayIllegalFrameInfo(@NonNull FrameInfo frameInfo) {
        return false;
    }
}

