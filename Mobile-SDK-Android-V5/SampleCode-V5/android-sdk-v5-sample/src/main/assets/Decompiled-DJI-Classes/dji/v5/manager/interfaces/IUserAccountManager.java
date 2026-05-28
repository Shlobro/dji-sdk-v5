/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.fragment.app.FragmentActivity
 */
package dji.v5.manager.interfaces;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.account.LoginInfo;
import dji.v5.manager.account.LoginInfoUpdateListener;

public interface IUserAccountManager {
    public void init();

    public void logInDJIUserAccount(FragmentActivity var1, boolean var2, @Nullable CommonCallbacks.CompletionCallback var3);

    public void logInDJIUserAccount(@NonNull String var1, @NonNull String var2, @Nullable String var3, @Nullable CommonCallbacks.CompletionCallback var4);

    public String getVerificationCodeImageURL();

    public void logOutDJIUserAccount(@Nullable CommonCallbacks.CompletionCallback var1);

    public void addLoginInfoUpdateListener(@NonNull LoginInfoUpdateListener var1);

    public void removeLoginInfoUpdateListener(@NonNull LoginInfoUpdateListener var1);

    public void clearAllLoginInfoUpdateListener();

    @NonNull
    public LoginInfo getLoginInfo();

    public void destroy();
}

