/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class CollectionUtil {
    public static boolean isEmpty(Object[] array) {
        return array == null || array.length == 0;
    }

    public static boolean isNotEmpty(Object[] array) {
        return !CollectionUtil.isEmpty(array);
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isNotEmpty(Collection<?> collection) {
        return !CollectionUtil.isEmpty(collection);
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public static boolean isNotEmpty(Map<?, ?> map) {
        return !CollectionUtil.isEmpty(map);
    }

    public static <S, R> List<R> transform(List<S> sourceList, Transformer<S, R> transformer) {
        ArrayList<R> list = new ArrayList<R>();
        if (CollectionUtil.isNotEmpty(sourceList)) {
            for (S source : sourceList) {
                R target = transformer.transform(source);
                list.add(target);
            }
        }
        return list;
    }

    public static <T> boolean isEquals(List<T> list1, List<T> list2, Comparator<? super T> c) {
        if (list1 == null && list2 == null) {
            return true;
        }
        if (list1 == null || list2 == null) {
            return false;
        }
        if (list1.size() != list2.size()) {
            return false;
        }
        list1 = new ArrayList<T>(list1);
        list2 = new ArrayList<T>(list2);
        Collections.sort(list1, c);
        Collections.sort(list2, c);
        return list1.equals(list2);
    }

    public static <T extends Comparable<T>> boolean isEquals(List<T> list1, List<T> list2) {
        return CollectionUtil.isEquals(list1, list2, null);
    }

    public static interface Transformer<S, R> {
        public R transform(S var1);
    }
}

