package chen0040.github.com.androidgeeks4geeks.fragments;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
        AssetManager am = getContext().getAssets();
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(am.open(filename)));
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

        browser.setJavaCode(getCode(sourceCode));

        TextView txtProblem = (TextView)mainView.findViewById(R.id.txtProblem);

        txtProblem.setText(getComments(sourceCode));

        return mainView;
    }

    private String getCode(String source){
        int end = source.indexOf("**/");
        if(end >= 0) {
            return source.substring(end+3);
        }
        return source;
    }

    private String getComments(String source) {
        int start = source.indexOf("/**");
        int end = source.indexOf("**/");
        if(start >= 0 && end >=0) {
            String text = source.substring(start + 3, end);
            String[] lines = text.split("\n");
            StringBuilder sb = new StringBuilder();
            for(String line : lines) {
                line = line.trim();
                if(line.startsWith("*")) {
                    line = line.substring(1);
                }
                line = line.trim();
                if(line.equals("")){
                    sb.append("\n\n");
                }
                sb.append(line);
            }
            return sb.toString();
        } else {
            return "";
        }
    }
}