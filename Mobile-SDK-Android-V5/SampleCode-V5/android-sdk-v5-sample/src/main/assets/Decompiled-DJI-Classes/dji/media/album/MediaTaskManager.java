/*
 * Decompiled with CFR 0.152.
 */
package dji.media.album;

import dji.media.album.MediaBaseTask;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.file.FileTaskResponse;
import java.util.HashMap;
import java.util.Map;

public class MediaTaskManager {
    public static final String Tag = "[Media-java]";
    private static final String TaskManagerKeyInfix = "-TaskManagerKey-";
    private static Map<String, MediaTaskManager> taskManagerRecorder = new HashMap<String, MediaTaskManager>();
    private int productId;
    private int deviceId;
    private int cameraIndex;
    private boolean suspend;

    private MediaTaskManager() {
    }

    private MediaTaskManager(int n, int n2, int n3) {
    }

    public static synchronized MediaTaskManager getInstance() {
        return null;
    }

    public static synchronized MediaTaskManager getInstance(ComponentIndexType componentIndexType) {
        return null;
    }

    public static synchronized MediaTaskManager getInstance(int n, int n2, ComponentIndexType componentIndexType) {
        return null;
    }

    public boolean getSuspend() {
        return false;
    }

    public void setSuspend(boolean bl) {
    }

    public void pushFront(MediaBaseTask mediaBaseTask) {
    }

    public void pushBack(MediaBaseTask mediaBaseTask) {
    }

    public void trySyncTask(MediaBaseTask mediaBaseTask, ITaskActionCallback iTaskActionCallback) {
    }

    public void cancel(MediaBaseTask mediaBaseTask, ITaskActionCallback iTaskActionCallback) {
    }

    public void cancelAllTask(ITaskActionCallback iTaskActionCallback) {
    }

    public void deferExecuteTask(int n) {
    }

    private static /* synthetic */ void lambda$deferExecuteTask$13(int n) {
    }

    private static /* synthetic */ void lambda$cancelAllTask$12(ITaskActionCallback iTaskActionCallback, int n) {
    }

    private static /* synthetic */ void lambda$cancelAllTask$11(ITaskActionCallback iTaskActionCallback, int n) {
    }

    private static /* synthetic */ void lambda$cancel$10(ITaskActionCallback iTaskActionCallback, int n) {
    }

    private static /* synthetic */ void lambda$cancel$9(ITaskActionCallback iTaskActionCallback, int n) {
    }

    private static /* synthetic */ void lambda$trySyncTask$8(ITaskActionCallback iTaskActionCallback, int n) {
    }

    private static /* synthetic */ void lambda$trySyncTask$7(ITaskActionCallback iTaskActionCallback, int n) {
    }

    private static /* synthetic */ void lambda$trySyncTask$6(MediaBaseTask mediaBaseTask, int n, FileTaskResponse fileTaskResponse, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$trySyncTask$5(MediaBaseTask mediaBaseTask, int n, FileTaskResponse fileTaskResponse, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$pushBack$4(MediaBaseTask mediaBaseTask, int n, FileTaskResponse fileTaskResponse, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$pushBack$3(MediaBaseTask mediaBaseTask, int n, FileTaskResponse fileTaskResponse, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$pushFront$2(MediaBaseTask mediaBaseTask, int n, FileTaskResponse fileTaskResponse, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$pushFront$1(MediaBaseTask mediaBaseTask, int n, FileTaskResponse fileTaskResponse, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$setSuspend$0(int n) {
    }

    public static interface ITaskActionCallback {
        public void onComplete(int var1);
    }
}

