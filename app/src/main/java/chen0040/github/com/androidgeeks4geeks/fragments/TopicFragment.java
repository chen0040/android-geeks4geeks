package chen0040.github.com.androidgeeks4geeks.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import chen0040.github.com.androidgeeks4geeks.R;

/**
 * Created by chen0 on 24/8/2017.
 */

public class TopicFragment extends Fragment {

    public TopicFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.fragment_topic, container, false);
        return mainView;
    }
}