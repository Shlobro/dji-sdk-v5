/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.manager.datacenter.media;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class DJIList<T>
extends ArrayList<T> {
    @Override
    public T remove(int n) {
        return null;
    }

    @Override
    public boolean removeAll(@NonNull Collection<?> collection) {
        return false;
    }

    @Override
    protected void removeRange(int n, int n2) {
    }

    @Override
    public boolean remove(@Nullable Object object) {
        return false;
    }

    @Override
    public boolean removeIf(@NonNull Predicate<? super T> predicate) {
        return false;
    }
}

