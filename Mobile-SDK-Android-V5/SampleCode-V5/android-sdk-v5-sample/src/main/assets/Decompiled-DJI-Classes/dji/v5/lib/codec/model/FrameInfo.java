/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 *  androidx.annotation.NonNull
 */
package dji.v5.lib.codec.model;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import dji.v5.lib.codec.VideoCodec;
import dji.v5.lib.codec.model.NalUnit;
import dji.v5.lib.codec.model.SEIData;
import java.util.List;

@Keep
public class FrameInfo {
    @VideoCodec.MimeType
    public String mimeType;
    public int frameDataLength;
    public int frameDataOffset;
    public int frameContentOffset;
    public int width;
    public int height;
    public int frameRate;
    public long presentationTimeMs;
    public boolean isKeyFrame;
    public boolean isAbsoluteFrame;
    public boolean mayIllegalFrame;
    public final List<SEIData> seiList;
    public final List<NalUnit> nalUnitList;

    @NonNull
    public String toString() {
        return null;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }
}

