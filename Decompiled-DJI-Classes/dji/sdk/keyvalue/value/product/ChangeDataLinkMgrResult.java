/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;

public final class ChangeDataLinkMgrResult
extends Enum<ChangeDataLinkMgrResult>
implements JNIProguardKeepTag {
    public static final /* enum */ ChangeDataLinkMgrResult SUCCESSFUL = new ChangeDataLinkMgrResult(0);
    public static final /* enum */ ChangeDataLinkMgrResult PRODUCT_ID_NOT_EXISTED = new ChangeDataLinkMgrResult(1);
    public static final /* enum */ ChangeDataLinkMgrResult V1_DATALINK_NOT_EXISTED = new ChangeDataLinkMgrResult(2);
    public static final /* enum */ ChangeDataLinkMgrResult CURRENT_DATALINNK_STOPPED = new ChangeDataLinkMgrResult(3);
    public static final /* enum */ ChangeDataLinkMgrResult UNKNOWN = new ChangeDataLinkMgrResult(255);
    private int value;
    private static final ChangeDataLinkMgrResult[] allValues;
    private static final /* synthetic */ ChangeDataLinkMgrResult[] $VALUES;

    public static ChangeDataLinkMgrResult[] values() {
        return null;
    }

    public static ChangeDataLinkMgrResult valueOf(String string) {
        return null;
    }

    private ChangeDataLinkMgrResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ChangeDataLinkMgrResult find(int n) {
        return null;
    }

    private static /* synthetic */ ChangeDataLinkMgrResult[] $values() {
        return null;
    }

    static {
        $VALUES = ChangeDataLinkMgrResult.$values();
        allValues = ChangeDataLinkMgrResult.values();
    }
}

