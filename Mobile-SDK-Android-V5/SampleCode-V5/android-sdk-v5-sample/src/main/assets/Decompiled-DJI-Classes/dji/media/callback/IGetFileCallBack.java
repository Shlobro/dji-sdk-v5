/*
 * Decompiled with CFR 0.152.
 */
package dji.media.callback;

public interface IGetFileCallBack {
    public void onSuccess(boolean var1, double var2, byte[] var4);

    public void onFailed(int var1, String var2);
}

