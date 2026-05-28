/*
 * Decompiled with CFR 0.152.
 */
package djimrtc;

public interface ILiveShareAction {
    public int startLiveShare();

    public int stopLiveShare();

    public int sendVideoFrameData(byte[] var1, long var2, long var4, int var6);

    public int sendAudioFrameData(byte[] var1, long var2, long var4);
}

