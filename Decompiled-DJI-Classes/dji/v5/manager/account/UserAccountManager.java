/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.fragment.app.FragmentActivity
 *  org.aspectj.lang.JoinPoint$StaticPart
 */
package dji.v5.manager.account;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.account.view.LoginDialog;
import dji.v5.inner.analytics.annotation.TrackEvent;
import dji.v5.inner.analytics.helper.DJIAnalyticsPerformHelper;
import dji.v5.manager.account.LoginInfo;
import dji.v5.manager.account.LoginInfoUpdateListener;
import dji.v5.manager.interfaces.IUserAccountManager;
import dji.v5.utils.common.LogUtils;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.aspectj.lang.JoinPoint;

public class UserAccountManager
implements IUserAccountManager {
    public static final String TAG;
    private final AtomicBoolean isInit;
    private List<LoginInfoUpdateListener> loginInfoUpdateListenerList;
    private DJIAnalyticsPerformHelper analyticsPerformHelper;
    private static final String REGEX_MOBILE = "(\\+\\d+)?1[3456789]\\d{9}$";
    private LoginInfo currentLoginInfo;
    private LoginDialog loginDialog;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;

    public static IUserAccountManager getInstance() {
        return null;
    }

    private UserAccountManager() {
    }

    @Override
    public void init() {
    }

    @Override
    public void logInDJIUserAccount(FragmentActivity fragmentActivity, boolean bl, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void logInDJIUserAccount(@NonNull String string2, @NonNull String string3, @Nullable String string4, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void logInDJIUserAccountWithPhone(@NonNull String string2, @NonNull String string3, @NonNull String string4, @Nullable String string5, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void logInDJIUserAccountWithEmail(@NonNull String string2, @NonNull String string3, @Nullable String string4, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public String getVerificationCodeImageURL() {
        return null;
    }

    @Override
    @TrackEvent(eventName="logOutDJIUserAccount", category="ManagerAnnotation")
    public void logOutDJIUserAccount(@Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void addLoginInfoUpdateListener(@NonNull LoginInfoUpdateListener loginInfoUpdateListener) {
    }

    @Override
    public void removeLoginInfoUpdateListener(@NonNull LoginInfoUpdateListener loginInfoUpdateListener) {
    }

    @Override
    public void clearAllLoginInfoUpdateListener() {
    }

    @Override
    @NonNull
    public LoginInfo getLoginInfo() {
        return null;
    }

    private void login(FragmentActivity fragmentActivity, boolean bl, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    private boolean canVisitNetwork() {
        return false;
    }

    private void notifyLoginInfoChange(LoginInfo loginInfo) {
    }

    private void updateLoginAndNotifyOuter(String string2, String string3, String string4, CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void updateLoginInfoForCSDK(String string2, String string3, String string4) {
    }

    private LoginInfo getNotNullLoginInfo() {
        return null;
    }

    private boolean checkIfNeedLogin(CommonCallbacks.CompletionCallback completionCallback, String string2) {
        return false;
    }

    private static /* synthetic */ void lambda$updateLoginInfoForCSDK$0(Boolean bl) {
    }

    /* synthetic */ UserAccountManager(1 var1_1) {
    }

    static /* synthetic */ LoginInfo access$202(UserAccountManager userAccountManager, LoginInfo loginInfo) {
        return null;
    }

    static /* synthetic */ void access$300(UserAccountManager userAccountManager, LoginInfo loginInfo) {
    }

    static /* synthetic */ DJIAnalyticsPerformHelper access$400(UserAccountManager userAccountManager) {
        return null;
    }

    static /* synthetic */ void access$500(UserAccountManager userAccountManager, String string2, String string3, String string4, CommonCallbacks.CompletionCallback completionCallback) {
    }

    static /* synthetic */ LoginDialog access$602(UserAccountManager userAccountManager, LoginDialog loginDialog) {
        return null;
    }

    static {
        UserAccountManager.ajc$preClinit();
        TAG = LogUtils.getTag("UserAccountManager");
    }

    private static /* synthetic */ void ajc$preClinit() {
    }

    private static class UserAccountManagerHolder {
        private static final UserAccountManager INSTANCE = new UserAccountManager(null);

        private UserAccountManagerHolder() {
        }

        static /* synthetic */ UserAccountManager access$000() {
            return null;
        }
    }
}

