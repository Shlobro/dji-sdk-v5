/*
 * Decompiled with CFR 0.152.
 */
package dji.mission.callback;

public interface MissionActionCallback {
    public void onSuccess();

    public void onFailed(int var1, String var2);
}

