package com.example.android.examplefragmentsviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

// this fragment creates the view for first list
public class FirstFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retain this fragment across configuration changes.
        setRetainInstance(true);
    }

    public FirstFragment() {
        // Required empty public constructor
    }

    // this fragment uses the  Item object I created and the ItemAdapter
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View firstRootView = inflater.inflate(R.layout.fragment_layout, container, false);
        final ArrayList<Item> firstFragmentItems = new ArrayList<Item>();
        // creating the first fragment item list
        firstFragmentItems.add(new Item("One", "1"));
        firstFragmentItems.add(new Item("Two", "2"));
        firstFragmentItems.add(new Item("Three", "3"));
        firstFragmentItems.add(new Item("Four", "4"));
        firstFragmentItems.add(new Item("five", "5"));
        firstFragmentItems.add(new Item("Six", "6"));
        firstFragmentItems.add(new Item("Sever", "7"));
        firstFragmentItems.add(new Item("Eight", "8"));
        firstFragmentItems.add(new Item("Nine", "9"));
        // set a new adapter for the list
        ItemAdapter firstAdapter = new ItemAdapter(getActivity(), firstFragmentItems);
        // Find the ListView object in the layout
        ListView firstListView = firstRootView.findViewById(R.id.list);
        // set the adapter on the listView
        firstListView.setAdapter(firstAdapter);
        return firstRootView;
    }
}
