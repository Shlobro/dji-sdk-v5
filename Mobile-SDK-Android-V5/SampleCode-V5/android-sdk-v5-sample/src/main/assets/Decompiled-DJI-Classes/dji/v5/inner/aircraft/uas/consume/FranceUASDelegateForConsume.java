/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.inner.aircraft.uas.consume;

import androidx.annotation.NonNull;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.aircraft.uas.consume.EuropeanUASDelegateForConsume;
import dji.v5.manager.aircraft.uas.AreaStrategy;
import dji.v5.manager.aircraft.uas.ElectronicIDStatus;
import dji.v5.manager.aircraft.uas.ElectronicIDStatusListener;
import java.util.List;

public class FranceUASDelegateForConsume
extends EuropeanUASDelegateForConsume {
    private final List<ElectronicIDStatusListener> electronicIDStatusListenerList;
    private final ElectronicIDStatus electronicIDStatus;

    public FranceUASDelegateForConsume(boolean bl, AreaStrategy areaStrategy) {
    }

    @Override
    public void init() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void setElectronicIDEnabled(boolean bl, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getElectronicIDEnabled(@NonNull CommonCallbacks.CompletionCallbackWithParam<Boolean> completionCallbackWithParam) {
    }

    @Override
    public void addElectronicIDStatusListener(ElectronicIDStatusListener electronicIDStatusListener) {
    }

    @Override
    public void clearAllElectronicIDStatusListener() {
    }

    @Override
    protected void addKeyListener() {
    }

    @Override
    public void removeElectronicIDStatusListener(ElectronicIDStatusListener electronicIDStatusListener) {
    }

    private void updateElectronicIDStatus() {
    }

    private /* synthetic */ void lambda$addKeyListener$0(Boolean bl, Boolean bl2) {
    }
}

