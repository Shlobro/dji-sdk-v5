/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.generate.ProgressInformation;
import dji.upgrade.generate.TotalUpgradeProgressInformation;
import java.util.ArrayList;

public interface CompositeProgressObserver
extends JNIProguardKeepTag {
    public void OnUpgradeProgress(ArrayList<ProgressInformation> var1, TotalUpgradeProgressInformation var2);
}

