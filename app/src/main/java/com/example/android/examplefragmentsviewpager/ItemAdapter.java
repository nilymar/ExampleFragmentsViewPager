package com.example.android.examplefragmentsviewpager;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {
    TextView leftItem;
    TextView rightItem;

    // this is the constructor for the ItemAdapter object
    public ItemAdapter(Activity context, ArrayList<Item> items) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter the adapter is not going to use this second argument,
        // so it can be any value. Here, we used 0.
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        leftItem = convertView.findViewById(R.id.left_item);
        rightItem = convertView.findViewById(R.id.right_item);

        // get the Item object in the current position in the array
        final Item currentItem = getItem(position);
        // the leftItem is set in it's location in list_item layout
        leftItem.setText(currentItem.getLeftItem());
        // the rightItem is set in it's location in list_item layout
        rightItem.setText(currentItem.getRightItem());
        return convertView;
    }
}
