/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.lib.codec;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.v5.lib.codec.VideoCodec;
import dji.v5.lib.codec.decode.VideoDecoder;
import dji.v5.lib.codec.encode.VideoEncoder;
import java.io.IOException;

public class CodecFactory {
    private CodecFactory() {
    }

    @Nullable
    public static VideoEncoder createEncoder(@VideoCodec.MimeType String string2, @Nullable String string3) {
        return null;
    }

    @Nullable
    public static VideoDecoder createDecoder(@VideoCodec.MimeType String string2, @Nullable String string3) {
        return null;
    }

    static MediaCodec createCodec(@VideoCodec.MimeType String string2, boolean bl) throws IOException {
        return null;
    }

    @NonNull
    public static MediaCodec createSoftwareCodec(@VideoCodec.MimeType String string2, boolean bl) throws IOException {
        return null;
    }
}

