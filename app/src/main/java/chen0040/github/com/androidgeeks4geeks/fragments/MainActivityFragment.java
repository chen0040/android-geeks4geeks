package chen0040.github.com.androidgeeks4geeks.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.chen0040.androidcodeview.HtmlUtils;
import com.github.chen0040.androidcodeview.SourceCodeView;

import chen0040.github.com.androidgeeks4geeks.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.fragment_main, container, false);



        StringBuilder sb = new StringBuilder();

        sb.append("import java.utils.*\n");
        sb.append("/** Hello World **/");
        sb.append("// Hello World\n");
        sb.append("class Test<T> {\n");
        sb.append("}\n");


        //setJavaCode(browser, sb.toString());

        return mainView;
    }

}
