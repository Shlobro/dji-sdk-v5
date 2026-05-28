/*
 * Decompiled with CFR 0.152.
 */
package xcrash;

public interface ILogger {
    public void v(String var1, String var2);

    public void v(String var1, String var2, Throwable var3);

    public void d(String var1, String var2);

    public void d(String var1, String var2, Throwable var3);

    public void i(String var1, String var2);

    public void i(String var1, String var2, Throwable var3);

    public void w(String var1, String var2);

    public void w(String var1, String var2, Throwable var3);

    public void e(String var1, String var2);

    public void e(String var1, String var2, Throwable var3);
}

