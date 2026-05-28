/*
 * Decompiled with CFR 0.152.
 */
package dji.log.third;

import dji.log.third.Settings;

public interface Printer {
    public Printer t(String var1, int var2);

    public Settings init(String var1);

    public Settings getSettings();

    public void d(String var1, Object ... var2);

    public void d(Object var1);

    public void e(String var1, Object ... var2);

    public void e(Throwable var1, String var2, Object ... var3);

    public void w(String var1, Object ... var2);

    public void i(String var1, Object ... var2);

    public void v(String var1, Object ... var2);

    public void wtf(String var1, Object ... var2);

    public void json(String var1);

    public void xml(String var1);

    public void log(int var1, String var2, String var3, Throwable var4);

    public void resetSettings();
}

