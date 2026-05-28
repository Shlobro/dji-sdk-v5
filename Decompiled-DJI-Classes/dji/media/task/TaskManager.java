/*
 * Decompiled with CFR 0.152.
 */
package dji.media.task;

import dji.media.task.Task;
import java.util.HashMap;
import java.util.Map;

public class TaskManager {
    private static final String TaskManagerKeyInfix = "-TaskManagerKey-";
    private static Map<String, TaskManager> taskManagerRecorder = new HashMap<String, TaskManager>();
    private int productId;
    private int cameraIndex;
    private boolean suspend;

    private TaskManager() {
    }

    private TaskManager(int n, int n2) {
    }

    public static TaskManager getTaskManager(int n, int n2) {
        return null;
    }

    public boolean getSuspend() {
        return false;
    }

    public void setSuspend(boolean bl) {
    }

    public void pushFront(Task task) {
    }

    public void pushBack(Task task) {
    }

    public void trySyncTask(Task task, ITaskActionCallback iTaskActionCallback) {
    }

    public void cancel(Task task, ITaskActionCallback iTaskActionCallback) {
    }

    public void cancelAllTask(ITaskActionCallback iTaskActionCallback) {
    }

    public void deferExecuteTask(int n) {
    }

    public void deferExecuteTask() {
    }

    private static /* synthetic */ void lambda$deferExecuteTask$14(int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$deferExecuteTask$13(int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$cancelAllTask$12(ITaskActionCallback iTaskActionCallback, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$cancelAllTask$11(ITaskActionCallback iTaskActionCallback, int n) {
    }

    private static /* synthetic */ void lambda$cancel$10(ITaskActionCallback iTaskActionCallback, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$cancel$9(ITaskActionCallback iTaskActionCallback, int n) {
    }

    private static /* synthetic */ void lambda$trySyncTask$8(ITaskActionCallback iTaskActionCallback, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$trySyncTask$7(ITaskActionCallback iTaskActionCallback, int n) {
    }

    private static /* synthetic */ void lambda$trySyncTask$6(Task task, int n, byte[] byArray, byte[] byArray2) {
    }

    private static /* synthetic */ void lambda$trySyncTask$5(Task task, int n, byte[] byArray, byte[] byArray2) {
    }

    private static /* synthetic */ void lambda$pushBack$4(Task task, int n, byte[] byArray, byte[] byArray2) {
    }

    private static /* synthetic */ void lambda$pushBack$3(int n, byte[] byArray, Task task, byte[] byArray2) {
    }

    private static /* synthetic */ void lambda$pushFront$2(Task task, int n, byte[] byArray, byte[] byArray2) {
    }

    private static /* synthetic */ void lambda$pushFront$1(Task task, int n, byte[] byArray, byte[] byArray2) {
    }

    private static /* synthetic */ void lambda$setSuspend$0(int n, byte[] byArray) {
    }

    public static interface ITaskActionCallback {
        public void onComplete(int var1);
    }
}

