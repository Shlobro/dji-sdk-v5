/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.common.video.interfaces;

import dji.v5.common.video.decoder.DecoderState;

@Deprecated
public interface DecoderStateChangeListener {
    public void onUpdate(DecoderState var1, DecoderState var2);
}

