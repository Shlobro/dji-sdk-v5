/*
 * Decompiled with CFR 0.152.
 */
package dji.file.callback;

import dji.sdk.keyvalue.value.file.CommonFile;
import java.util.List;

public interface IFetchCommonFileCallback {
    public void onFetched(int var1, List<CommonFile> var2, boolean var3);
}

