/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.manager.aircraft.lte;

import androidx.annotation.Keep;
import dji.v5.manager.aircraft.lte.LTEAuthenticationInfo;

@Keep
public interface LTEAuthenticationInfoListener {
    public void onLTEAuthenticationInfoUpdate(LTEAuthenticationInfo var1);
}

