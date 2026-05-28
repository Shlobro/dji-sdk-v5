/*
 * Decompiled with CFR 0.152.
 */
package dji.media.callback;

public interface ICallback<T> {
    public void onSuccess(T var1);

    public void onFailed(int var1, String var2);
}

