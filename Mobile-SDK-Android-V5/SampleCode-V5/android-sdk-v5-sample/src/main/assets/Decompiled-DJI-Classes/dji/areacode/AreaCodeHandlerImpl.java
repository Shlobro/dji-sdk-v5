/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.areacode;

import android.content.Context;
import dji.areacode.AreaCodeHandler;

public class AreaCodeHandlerImpl
extends AreaCodeHandler {
    private Context mContext;

    public AreaCodeHandlerImpl(Context context) {
    }

    @Override
    public String GetAcFromMcc() {
        return null;
    }

    @Override
    public boolean IsRoot() {
        return false;
    }

    public static boolean isSuperUser() {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static boolean isExecutable(String string2) {
        return false;
    }

    private String getAcFromMccByPhone() {
        return null;
    }
}

