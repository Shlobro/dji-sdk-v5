/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package dji.v5.common.recorder;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005\u00a8\u0006\t"}, d2={"Ldji/v5/common/recorder/PCMTools;", "", "<init>", "()V", "convertToPcmFileSync", "", "audioFilePath", "convertToOpusFileSync", "pcmFilePath", "aircraft_release"})
@Keep
public final class PCMTools {
    @NotNull
    public static final PCMTools INSTANCE = new PCMTools();

    private PCMTools() {
    }

    @NotNull
    public final String convertToPcmFileSync(@NotNull String string2) {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @NotNull
    public final String convertToOpusFileSync(@NotNull String string2) {
        return null;
    }
}

