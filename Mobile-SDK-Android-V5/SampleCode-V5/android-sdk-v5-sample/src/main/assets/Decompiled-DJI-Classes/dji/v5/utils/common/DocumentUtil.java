/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package dji.v5.utils.common;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ$\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b`\u00142\u0006\u0010\f\u001a\u00020\rH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0015"}, d2={"Ldji/v5/utils/common/DocumentUtil;", "", "<init>", "()V", "validLenth", "", "getValidLenth", "()I", "setValidLenth", "(I)V", "getPath", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "isExternalStorageDocument", "", "getExtSdCardPaths", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "utils_release"})
@SourceDebugExtension(value={"SMAP\nDocumentUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentUtil.kt\ndji/v5/utils/common/DocumentUtil\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,58:1\n37#2:59\n36#2,3:60\n*S KotlinDebug\n*F\n+ 1 DocumentUtil.kt\ndji/v5/utils/common/DocumentUtil\n*L\n20#1:59\n20#1:60,3\n*E\n"})
public final class DocumentUtil {
    @NotNull
    public static final DocumentUtil INSTANCE = new DocumentUtil();
    private static int validLenth = 2;

    private DocumentUtil() {
    }

    public final int getValidLenth() {
        return 0;
    }

    public final void setValidLenth(int n) {
    }

    @NotNull
    public final String getPath(@NotNull Context context, @Nullable Uri uri) {
        return null;
    }

    public final boolean isExternalStorageDocument(@Nullable Uri uri) {
        return false;
    }

    private final ArrayList<String> getExtSdCardPaths(Context context) {
        return null;
    }
}

