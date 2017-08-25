package chen0040.github.com.androidgeeks4geeks.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.github.chen0040.androidcodeview.HtmlUtils;
import com.github.chen0040.androidcodeview.SourceCodeView;

import java.util.Arrays;
import java.util.List;

import chen0040.github.com.androidgeeks4geeks.R;
import chen0040.github.com.androidgeeks4geeks.components.FieldAdapter;
import chen0040.github.com.androidgeeks4geeks.enums.Field;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public static final String TAG = "MainActivityFrag";


    private ListView lvFields;
    private FragmentMediator mediator;
    private final List<Field> fields = Arrays.asList(Field.Algorithm, Field.DataStructure, Field.ComplexityAnalysis);

    public MainActivityFragment() {
    }

    public void setMediator(FragmentMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.fragment_main, container, false);

        lvFields = (ListView)mainView.findViewById(R.id.lvFields);
        FieldAdapter adapter = new FieldAdapter(getContext(), fields);
        lvFields.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        lvFields.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                mediator.gotoField(fields.get(position));
            }
        });


        return mainView;
    }

}
