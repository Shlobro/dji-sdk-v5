/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.component.flysafe.model;

import androidx.annotation.Keep;
import dji.csdk.flysafe.SupervisorRecordContext;

@Keep
public class FlyfrbStepInfo {
    public long mTFRUploadStep;
    public String mAppDynamicDbUuid;
    public String mFlightDynamicDBUid;
    public int mUploadNum;

    public void reset() {
    }

    public void copyFromValuedField(FlyfrbStepInfo flyfrbStepInfo) {
    }

    public void convertFromJniModel(SupervisorRecordContext supervisorRecordContext) {
    }

    public FlyfrbStepInfo setAppDynamicDbUuid(String string) {
        return null;
    }

    public FlyfrbStepInfo setFlightDynamicDBUid(String string) {
        return null;
    }

    public FlyfrbStepInfo setUploadNum(int n) {
        return null;
    }
}

