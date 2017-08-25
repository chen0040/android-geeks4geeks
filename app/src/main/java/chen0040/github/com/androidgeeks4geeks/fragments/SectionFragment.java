package chen0040.github.com.androidgeeks4geeks.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.chen0040.androidcodeview.SourceCodeView;

import chen0040.github.com.androidgeeks4geeks.R;

/**
 * Created by chen0 on 25/8/2017.
 */

public class SectionFragment  extends Fragment {

    private String sourceCode;

    public SectionFragment() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.fragment_section, container, false);
        SourceCodeView browser = (SourceCodeView)mainView.findViewById(R.id.codeViewer);
        browser.enableDebugging(this.getContext());

        browser.setJavaCode(sourceCode);

        return mainView;
    }
}