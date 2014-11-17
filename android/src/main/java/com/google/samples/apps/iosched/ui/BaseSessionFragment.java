package com.google.samples.apps.iosched.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;

import com.google.samples.apps.iosched.model.TagMetadata;

/**
 * Created by yangfeng on 14/11/17.
 */
public abstract class BaseSessionFragment extends Fragment {
    public interface Callbacks {
        public void onSessionSelected(String sessionId, View clickedView);
        public void onTagMetadataLoaded(TagMetadata metadata);
    }

    public abstract void requestQueryUpdate(String query);
    public abstract void reloadFromArguments(Bundle arguments);
}
