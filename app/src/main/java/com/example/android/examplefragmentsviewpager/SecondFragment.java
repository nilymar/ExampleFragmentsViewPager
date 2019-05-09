package com.example.android.examplefragmentsviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

// this fragment creates the view for second list
public class SecondFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retain this fragment across configuration changes.
        setRetainInstance(true);
    }

    public SecondFragment() {
        // Required empty public constructor
    }

    // this fragment uses the  Item object I created and the ItemAdapter
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View secondRootView = inflater.inflate(R.layout.fragment_layout, container, false);
        final ArrayList<Item> secondFragmentItems = new ArrayList<Item>();
        // creating the first fragment item list
        secondFragmentItems.add(new Item("Rightward Arrow", "\u2192"));
        secondFragmentItems.add(new Item("Watch", "\u231A"));
        secondFragmentItems.add(new Item("Hourglass", "\u231B"));
        secondFragmentItems.add(new Item("Alarm Clock", "\u23F0"));
        secondFragmentItems.add(new Item("Smiling Face", "\u263A"));
        secondFragmentItems.add(new Item("Sun", "\u263C"));
        secondFragmentItems.add(new Item("White Telephone", "\u260F"));
        secondFragmentItems.add(new Item("Hot Beverage", "\u2615"));
        secondFragmentItems.add(new Item("Scales", "\u2696"));
        secondFragmentItems.add(new Item("Soccer Ball", "\u26BD"));
        // set a new adapter for the list
        ItemAdapter secondAdapter = new ItemAdapter(getActivity(), secondFragmentItems);
        // Find the ListView object in the layout
        ListView secondListView = secondRootView.findViewById(R.id.list);
        // set the adapter on the listView
        secondListView.setAdapter(secondAdapter);
        return secondRootView;
    }
}
