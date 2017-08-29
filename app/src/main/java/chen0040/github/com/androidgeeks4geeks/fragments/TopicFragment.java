package chen0040.github.com.androidgeeks4geeks.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import chen0040.github.com.androidgeeks4geeks.R;
import chen0040.github.com.androidgeeks4geeks.components.SolutionAdapter;
import chen0040.github.com.androidgeeks4geeks.enums.Field;
import chen0040.github.com.androidgeeks4geeks.enums.Topic;
import chen0040.github.com.androidgeeks4geeks.models.Solution;
import chen0040.github.com.androidgeeks4geeks.services.SolutionFactory;

/**
 * Created by chen0 on 24/8/2017.
 */

public class TopicFragment extends Fragment {
    public static final String TAG = "TopicFrag";
    private ListView lvSolutions;
    private FragmentMediator mediator;
    private List<Solution> solutions;
    private Field field;
    private Topic topic;

    public TopicFragment() {
    }

    public void setMediator(FragmentMediator mediator) {
        this.mediator =mediator;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.fragment_topic, container, false);

        lvSolutions = (ListView)mainView.findViewById(R.id.lvSolutions);
        SolutionAdapter adapter = new SolutionAdapter(getContext(), solutions);
        lvSolutions.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        lvSolutions.setOnItemClickListener((parent, view, position, id) -> mediator.gotoSolution(solutions.get(position)));


        return mainView;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.field = Field.getEnum(getArguments().getString("field"));
        this.topic = Topic.getEnum(getArguments().getString("topic"));
        this.solutions = getSolutions();
    }

    private List<Solution> getSolutions() {
        return SolutionFactory.getSolutions(field, topic);
    }

}