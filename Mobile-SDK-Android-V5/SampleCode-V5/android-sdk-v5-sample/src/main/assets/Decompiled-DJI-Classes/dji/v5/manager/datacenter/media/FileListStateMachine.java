/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.datacenter.media;

import androidx.annotation.NonNull;
import dji.v5.manager.datacenter.media.MediaFileListState;
import java.util.List;
import java.util.Map;

public class FileListStateMachine {
    Map<MediaFileListState, List<MediaFileListState>> mTransitRoutes;
    private MediaFileListState mFileListState;
    private StateChangedListener mStateChangedListener;

    public FileListStateMachine(@NonNull MediaFileListState mediaFileListState, StateChangedListener stateChangedListener) {
    }

    public void addTransitRoute(MediaFileListState mediaFileListState, MediaFileListState mediaFileListState2) {
    }

    public synchronized void tryTransitTo(MediaFileListState mediaFileListState) {
    }

    public MediaFileListState getFileListState() {
        return null;
    }

    private List<MediaFileListState> getRoutes(MediaFileListState mediaFileListState) {
        return null;
    }

    public static interface StateChangedListener {
        public void onStateChanged(MediaFileListState var1);
    }
}

