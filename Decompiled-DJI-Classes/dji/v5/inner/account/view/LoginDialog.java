/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.Window
 *  android.webkit.HttpAuthHandler
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.fragment.app.DialogFragment
 */
package dji.v5.inner.account.view;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.HttpAuthHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import dji.v5.common.error.IDJIError;
import dji.v5.utils.common.LogUtils;
import dji.v5.utils.inner.ConstantsUtils;

public class LoginDialog
extends DialogFragment
implements View.OnClickListener {
    private static final String TAG = LogUtils.getTag("LoginDialog");
    private boolean fullScreen;
    private static int IDEAL_WIDTH = 998;
    private static int IDEAL_HEIGHT = 654;
    private static String LOGIN_CALLBACK_URL = ConstantsUtils.getConstant(ConstantsUtils.CONSTANT.LOGIN_CALLBACK_URL);
    private static final String JS_BRIDGE = "jsbridge";
    public static final String AUTHORITY_CLOSE_PAGE = "closePage";
    public static final String AUTHORITY_INIT_PAGE = "initPage";
    private static final String PARAMETER_CALLBACK = "cb";
    private LoginListener loginListener;
    private WebView webView;
    public static final String LOGIN_URL = ConstantsUtils.getUrl(ConstantsUtils.URL.LOGIN);

    public static LoginDialog create(boolean bl) {
        return null;
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
    }

    public void onCreate(@Nullable Bundle bundle) {
    }

    public void onStart() {
    }

    public void onClick(View view) {
    }

    public void onDestroyView() {
    }

    public void setDialogListener(LoginListener loginListener) {
    }

    public boolean handledUrlLoading(WebResourceRequest webResourceRequest) {
        return false;
    }

    private void queryLoginResult(String string2) {
    }

    private void loginSuccess(String string2, String string3, String string4) {
    }

    private void loadLoginWebView() {
    }

    private boolean isCurrentLanguageChinese() {
        return false;
    }

    private boolean isSupportNewVerifyUrl() {
        return false;
    }

    private void resizeDialog(Window window) {
    }

    @SuppressLint(value={"SetJavaScriptEnabled"})
    private void initWebView() {
    }

    private void handleClosePage(Uri uri) {
    }

    private void handleInitPage(Uri uri) {
    }

    private void doJsCallbackSync(Uri uri, String string2) {
    }

    private static /* synthetic */ void lambda$doJsCallbackSync$0(String string2) {
    }

    static /* synthetic */ boolean access$000(LoginDialog loginDialog) {
        return false;
    }

    static /* synthetic */ String access$100() {
        return null;
    }

    static /* synthetic */ void access$200(LoginDialog loginDialog, String string2) {
    }

    static /* synthetic */ void access$300(LoginDialog loginDialog, String string2, String string3, String string4) {
    }

    static /* synthetic */ LoginListener access$400(LoginDialog loginDialog) {
        return null;
    }

    public static interface LoginListener {
        public void loginCancel();

        public void loginSuccess(String var1, String var2, String var3);

        public void loginFail(IDJIError var1);
    }

    private final class CommonWebViewClient
    extends WebViewClient {
        final /* synthetic */ LoginDialog this$0;

        private CommonWebViewClient(LoginDialog loginDialog) {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String string2) {
            return false;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return false;
        }

        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String string2, String string3) {
        }

        /* synthetic */ CommonWebViewClient(LoginDialog loginDialog, 1 var2_2) {
        }
    }
}

