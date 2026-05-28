/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.areacode;

import androidx.annotation.NonNull;
import dji.areacode.AreaCodeStrategy;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;
import dji.v5.manager.areacode.AreaCodeChangeListener;
import dji.v5.manager.areacode.AreaCodeData;
import dji.v5.manager.interfaces.IAreaCodeManager;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class AreaCodeManager
implements IAreaCodeManager {
    private final String TAG;
    private static final int CE_HEIGHT_LIMIT = 120;
    private final CopyOnWriteArrayList<AreaCodeChangeListener> areaCodeChangeListeners;
    private AreaCodeData areaCode;
    private AreaCodeData oldAreaCode;
    private int callbackPtr;
    private int productId;
    private final AtomicBoolean hasInit;

    @Override
    public void init(int n) {
    }

    private void initSetCECountryTypeListener() {
    }

    private boolean canSetAreaCode() {
        return false;
    }

    private void setCountryType(AreaCodeData areaCodeData) {
    }

    @Override
    public void addAreaCodeChangeListener(@NonNull AreaCodeChangeListener areaCodeChangeListener) {
    }

    @Override
    public void removeAreaCodeChangeListener(@NonNull AreaCodeChangeListener areaCodeChangeListener) {
    }

    @Override
    public void clearAllListeners() {
    }

    @Override
    public AreaCodeData getAreaCode() {
        return null;
    }

    @Override
    public IDJIError updateAreaCode(String string2) {
        return null;
    }

    @Override
    public void getAreaCode(@NonNull CommonCallbacks.CompletionCallbackWithParam<AreaCodeData> completionCallbackWithParam) {
    }

    @Override
    public void destroy() {
    }

    private void updateAreaCode(AreaCodeData areaCodeData) {
    }

    private void notifyAreaCodeChangeListener(AreaCodeData areaCodeData, AreaCodeData areaCodeData2) {
    }

    private void initAreaCode() {
    }

    public static IAreaCodeManager getInstance() {
        return null;
    }

    private AreaCodeManager() {
    }

    private /* synthetic */ void lambda$getAreaCode$8(CommonCallbacks.CompletionCallbackWithParam completionCallbackWithParam) {
    }

    private /* synthetic */ void lambda$setCountryType$7(AreaCodeData areaCodeData, ProductType productType) throws Throwable {
    }

    private /* synthetic */ void lambda$setCountryType$6(Throwable throwable) throws Throwable {
    }

    private /* synthetic */ void lambda$setCountryType$5() throws Throwable {
    }

    private /* synthetic */ void lambda$setCountryType$4(Throwable throwable) throws Throwable {
    }

    private /* synthetic */ void lambda$setCountryType$3() throws Throwable {
    }

    private /* synthetic */ void lambda$initSetCECountryTypeListener$2(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$initSetCECountryTypeListener$1(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$init$0(int n, int n2, String string2, int n3, AreaCodeStrategy areaCodeStrategy) {
    }

    static /* synthetic */ String access$000(AreaCodeManager areaCodeManager) {
        return null;
    }

    /* synthetic */ AreaCodeManager(1 var1_1) {
    }

    private static class LazyHolder {
        private static final IAreaCodeManager INSTANCE = new AreaCodeManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ IAreaCodeManager access$100() {
            return null;
        }
    }
}

