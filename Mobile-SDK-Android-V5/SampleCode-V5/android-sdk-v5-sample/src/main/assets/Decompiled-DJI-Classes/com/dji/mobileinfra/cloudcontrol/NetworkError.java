/*
 * Decompiled with CFR 0.152.
 */
package com.dji.mobileinfra.cloudcontrol;

public class NetworkError
extends Exception {
    private static final long serialVersionUID = -549709568398544420L;
    private final int a;
    private final String b;

    public NetworkError(int n, String string) {
    }

    public int getStatusCode() {
        return 0;
    }

    @Override
    public String getMessage() {
        return null;
    }

    public String getError() {
        return null;
    }
}

