/*
 * Decompiled with CFR 0.152.
 */
package com.dji.mobileinfra.cloudcontrol;

import com.dji.mobileinfra.cloudcontrol.Cache;
import com.dji.mobileinfra.cloudcontrol.Callback;
import com.dji.mobileinfra.cloudcontrol.CloudControlBuilder;
import com.dji.mobileinfra.cloudcontrol.CloudControlConfiguration;
import com.dji.mobileinfra.cloudcontrol.ParseError;
import com.dji.mobileinfra.cloudcontrol.RequestBuilder;
import com.dji.mobileinfra.cloudcontrol.a;
import com.dji.mobileinfra.cloudcontrol.b;
import java.util.concurrent.Executor;

public class CloudControl {
    private static volatile CloudControl g;
    private volatile CloudControlConfiguration a;
    private final a b;
    private final Cache c;
    private final Executor d;
    private final b e;
    private final CloudControlConfiguration.a f;

    CloudControl(a a2, Cache cache, Executor executor, b b2, CloudControlConfiguration.a a3) {
    }

    private void b(CloudControlConfiguration cloudControlConfiguration) {
    }

    private CloudControlConfiguration a() throws ParseError {
        return null;
    }

    private void a(Runnable runnable) {
    }

    private void a(CloudControlConfiguration cloudControlConfiguration) {
    }

    public static synchronized void init(CloudControlBuilder cloudControlBuilder) {
    }

    public static CloudControl get() {
        return null;
    }

    static /* synthetic */ b a(CloudControl cloudControl) {
        return null;
    }

    static /* synthetic */ a b(CloudControl cloudControl) {
        return null;
    }

    static /* synthetic */ CloudControlConfiguration.a c(CloudControl cloudControl) {
        return null;
    }

    static /* synthetic */ CloudControlConfiguration d(CloudControl cloudControl) throws ParseError {
        return null;
    }

    static /* synthetic */ void a(CloudControl cloudControl, CloudControlConfiguration cloudControlConfiguration) {
    }

    public CloudControlConfiguration getConfiguration() {
        return null;
    }

    public void request(RequestBuilder requestBuilder, Callback callback) {
    }

    public void loadCache(Callback callback) {
    }
}

