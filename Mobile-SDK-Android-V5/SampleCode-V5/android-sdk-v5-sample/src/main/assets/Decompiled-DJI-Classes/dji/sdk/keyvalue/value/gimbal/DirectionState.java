/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.gimbal.DirectionAdjustmentResult;
import dji.sdk.keyvalue.value.gimbal.SuggestedDirectionAdjustment;
import org.json.JSONObject;

public class DirectionState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DirectionAdjustmentResult adjustmentResultLR;
    SuggestedDirectionAdjustment adjustmentSuggestionLR;
    DirectionAdjustmentResult adjustmentResultUD;
    SuggestedDirectionAdjustment adjustmentSuggestionUD;
    DirectionAdjustmentResult adjustmentResultFB;
    SuggestedDirectionAdjustment adjustmentSuggestionFB;

    public DirectionState() {
    }

    public DirectionState(DirectionAdjustmentResult directionAdjustmentResult, SuggestedDirectionAdjustment suggestedDirectionAdjustment, DirectionAdjustmentResult directionAdjustmentResult2, SuggestedDirectionAdjustment suggestedDirectionAdjustment2, DirectionAdjustmentResult directionAdjustmentResult3, SuggestedDirectionAdjustment suggestedDirectionAdjustment3) {
    }

    public static DirectionState fromJson(String string) {
        return null;
    }

    @Override
    public JSONObject toJson() {
        return null;
    }

    @Override
    public int serializedLength() {
        return 0;
    }

    @Override
    public int toBytes(byte[] byArray, int n) {
        return 0;
    }

    @Override
    public byte[] toBytes() {
        return null;
    }

    @Override
    public int fromBytes(byte[] byArray, int n) {
        return 0;
    }

    public DirectionAdjustmentResult getAdjustmentResultLR() {
        return null;
    }

    public void setAdjustmentResultLR(DirectionAdjustmentResult directionAdjustmentResult) {
    }

    public SuggestedDirectionAdjustment getAdjustmentSuggestionLR() {
        return null;
    }

    public void setAdjustmentSuggestionLR(SuggestedDirectionAdjustment suggestedDirectionAdjustment) {
    }

    public DirectionAdjustmentResult getAdjustmentResultUD() {
        return null;
    }

    public void setAdjustmentResultUD(DirectionAdjustmentResult directionAdjustmentResult) {
    }

    public SuggestedDirectionAdjustment getAdjustmentSuggestionUD() {
        return null;
    }

    public void setAdjustmentSuggestionUD(SuggestedDirectionAdjustment suggestedDirectionAdjustment) {
    }

    public DirectionAdjustmentResult getAdjustmentResultFB() {
        return null;
    }

    public void setAdjustmentResultFB(DirectionAdjustmentResult directionAdjustmentResult) {
    }

    public SuggestedDirectionAdjustment getAdjustmentSuggestionFB() {
        return null;
    }

    public void setAdjustmentSuggestionFB(SuggestedDirectionAdjustment suggestedDirectionAdjustment) {
    }

    public String toString() {
        return null;
    }
}

