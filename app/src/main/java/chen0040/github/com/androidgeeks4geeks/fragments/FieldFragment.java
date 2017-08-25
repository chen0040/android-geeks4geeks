package chen0040.github.com.androidgeeks4geeks.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import chen0040.github.com.androidgeeks4geeks.R;
import chen0040.github.com.androidgeeks4geeks.components.FieldAdapter;
import chen0040.github.com.androidgeeks4geeks.components.TopicAdapter;
import chen0040.github.com.androidgeeks4geeks.enums.Field;
import chen0040.github.com.androidgeeks4geeks.enums.Topic;

/**
 * Created by chen0 on 24/8/2017.
 */

public class FieldFragment extends Fragment {
    public static final String TAG = "FieldFrag";
    private FragmentMediator mediator;
    private Field field;
    private ListView lvTopics;
    private List<Topic> topics;

    public FieldFragment() {
    }

    public void setMediator(FragmentMediator mediator) {
        this.mediator = mediator;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.field = Field.getEnum(getArguments().getString("field"));
        this.topics = getTopics();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.fragment_field, container, false);

        lvTopics = (ListView)mainView.findViewById(R.id.lvTopics);
        TopicAdapter adapter = new TopicAdapter(getContext(), topics);
        lvTopics.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        lvTopics.setOnItemClickListener((parent, view, position, id) -> mediator.gotoTopic(field, topics.get(position)));

        return mainView;
    }

    private List<Topic> getTopics() {
        List<Topic> topics = new ArrayList<>();
        topics.add(Topic.BitwiseAlgorithms);

        return topics;
    }
}