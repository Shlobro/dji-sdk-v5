/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.waypointv2.action;

import com.dji.industry.mission.waypointv2.action.ActionTypes;
import com.dji.industry.mission.waypointv2.action.NavigationAccurateShootPhotoOperationParam;

public class WaypointNavigationActionParam {
    private ActionTypes.NavigationType type;
    private NavigationAccurateShootPhotoOperationParam param;

    private WaypointNavigationActionParam(Builder builder) {
    }

    public ActionTypes.NavigationType getType() {
        return null;
    }

    public NavigationAccurateShootPhotoOperationParam getParam() {
        return null;
    }

    /* synthetic */ WaypointNavigationActionParam(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private ActionTypes.NavigationType type;
        private NavigationAccurateShootPhotoOperationParam param;

        public Builder type(ActionTypes.NavigationType navigationType) {
            return null;
        }

        public Builder param(NavigationAccurateShootPhotoOperationParam navigationAccurateShootPhotoOperationParam) {
            return null;
        }

        public WaypointNavigationActionParam build() {
            return null;
        }

        static /* synthetic */ ActionTypes.NavigationType access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ NavigationAccurateShootPhotoOperationParam access$100(Builder builder) {
            return null;
        }
    }
}

