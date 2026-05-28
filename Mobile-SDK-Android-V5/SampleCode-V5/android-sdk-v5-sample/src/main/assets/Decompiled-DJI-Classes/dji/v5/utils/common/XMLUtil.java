/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.utils.common;

import androidx.annotation.Keep;
import dji.v5.utils.common.LogUtils;

@Keep
public abstract class XMLUtil {
    private static final String TAG = LogUtils.getTag("XMLUtil");
    private static final String XMP_START_STRING = "<x:xmpmeta";
    private static final String XMP_END_STRING = "</x:xmpmeta>";
    private static final String USER_CUSTOM_PARSER_ELEMENT = "rdf:Description";
    private static final String USER_CUSTOM_DESCRIPT_KEY = "drone-dji:SelfData";

    public static MutablePair<String, String> readXMPInfo(String string2) {
        return null;
    }

    private XMLUtil() {
    }

    @Keep
    public static class MutablePair<F, S> {
        public F first;
        public S second;

        public MutablePair(F f2, S s) {
        }
    }
}

