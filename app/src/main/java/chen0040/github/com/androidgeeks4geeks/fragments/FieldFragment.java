package chen0040.github.com.androidgeeks4geeks.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import chen0040.github.com.androidgeeks4geeks.R;
import chen0040.github.com.androidgeeks4geeks.enums.Field;

/**
 * Created by chen0 on 24/8/2017.
 */

public class FieldFragment extends Fragment {
    public static final String TAG = "FieldFrag";
    private FragmentMediator mediator;
    private Field field;

    public FieldFragment() {
    }

    public void setMediator(FragmentMediator mediator) {
        this.mediator = mediator;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.field = Field.valueOf(getArguments().getString("field"));
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.fragment_field, container, false);

        return mainView;
    }
}