package chen0040.github.com.androidgeeks4geeks.components;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import chen0040.github.com.androidgeeks4geeks.R;
import chen0040.github.com.androidgeeks4geeks.models.Solution;

/**
 * Created by chen0 on 25/8/2017.
 */

public class SolutionAdapter extends BaseAdapter {
    private final Context context;
    private final List<Solution> solutions;

    public SolutionAdapter(Context context, List<Solution> solutions) {
        this.context = context;
        this.solutions = solutions;
    }



    @Override public View getView(int position, View convertView, ViewGroup parent) {


        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.line_solution, null);
        }

        final TextView txtName = (TextView) convertView.findViewById(R.id.txtName);
        txtName.setText(solutions.get(position).getName());

        final TextView txtProblemIndex = (TextView) convertView.findViewById(R.id.txtProblemIndex);
        txtProblemIndex.setText("Problem #" + (position+1));

        final TextView txtCategory = (TextView) convertView.findViewById(R.id.txtCategory);
        txtCategory.setText(solutions.get(position).getCategory());


        return convertView;
    }

    @Override public int getCount() {
        return solutions.size();
    }

    @Override public String getItem(int position) {
        return solutions.get(position).toString();
    }

    @Override public long getItemId(int position) {
        return position;
    }


}
