package chen0040.github.com.androidgeeks4geeks.components;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

import chen0040.github.com.androidgeeks4geeks.R;
import chen0040.github.com.androidgeeks4geeks.enums.Field;

import static android.widget.ImageView.ScaleType.CENTER_CROP;

/**
 * Created by chen0 on 25/8/2017.
 */

public class FieldAdapter extends BaseAdapter {
    private final Context context;
    private final List<Field> fields;

    public FieldAdapter(Context context, List<Field> fields) {
        this.context = context;
        this.fields = fields;
    }



    @Override public View getView(int position, View convertView, ViewGroup parent) {


        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.line_field, null);

        }

        final TextView txtName = (TextView) convertView.findViewById(R.id.txtName);
        txtName.setText(fields.get(position).toString());

        return convertView;
    }

    @Override public int getCount() {
        return fields.size();
    }

    @Override public String getItem(int position) {
        return fields.get(position).toString();
    }

    @Override public long getItemId(int position) {
        return position;
    }


}
