/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.common.video.interfaces;

@Deprecated
public interface IVideoFrame {
    public byte[] getData();

    public int getWidth();

    public int getHeight();

    public int getFps();

    public long getSeqNumber();

    public boolean isIFrame();

    public long getPTS();

    public byte[] getSps();

    public byte[] getPps();
}

