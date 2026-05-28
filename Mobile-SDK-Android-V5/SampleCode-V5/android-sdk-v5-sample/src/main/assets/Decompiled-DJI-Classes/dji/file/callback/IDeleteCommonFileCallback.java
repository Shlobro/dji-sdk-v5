/*
 * Decompiled with CFR 0.152.
 */
package dji.file.callback;

import dji.sdk.keyvalue.value.file.CommonFile;
import java.util.List;

public interface IDeleteCommonFileCallback {
    public void onDelete(int var1, List<CommonFile> var2, List<CommonFile> var3, boolean var4);
}

