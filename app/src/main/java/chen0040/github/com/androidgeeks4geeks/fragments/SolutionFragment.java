package chen0040.github.com.androidgeeks4geeks.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.chen0040.androidcodeview.SourceCodeView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import chen0040.github.com.androidgeeks4geeks.R;
import chen0040.github.com.androidgeeks4geeks.enums.Field;
import chen0040.github.com.androidgeeks4geeks.enums.Topic;
import chen0040.github.com.androidgeeks4geeks.models.Solution;

/**
 * Created by chen0 on 25/8/2017.
 */

public class SolutionFragment extends Fragment {
    public static final String TAG = "SolutionFrag";
    private String sourceCode;
    private FragmentMediator mediator;
    private Solution solution;

    public SolutionFragment() {
    }

    public void setMediator(FragmentMediator mediator) {
        this.mediator = mediator;
    }

    private String getSourceCode() {
        String filename = solution.getFilename();
        String foldername = solution.getTopic().folder();
        String filepath = "" + foldername + "/" + filename;
        StringBuilder sb = new StringBuilder();
        try {
            File file = new File(filepath);
            if(file.exists()) {
                Log.i(TAG, "File exists: " + filepath);
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line;
            while((line = reader.readLine())!=null){
                sb.append(line);
                sb.append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Field field = Field.getEnum(getArguments().getString("field"));
        Topic topic = Topic.getEnum(getArguments().getString("topic"));
        String name = getArguments().getString("name");
        String filename = getArguments().getString("filename");
        this.solution = new Solution(name, filename, field, topic);
        this.sourceCode = getSourceCode();
        Log.i(TAG, sourceCode);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.fragment_solution, container, false);
        SourceCodeView browser = (SourceCodeView)mainView.findViewById(R.id.codeViewer);
        browser.enableDebugging(this.getContext());

        browser.setJavaCode(sourceCode);

        return mainView;
    }
}