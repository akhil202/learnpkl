package com.example.learn;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class coursedetails extends Fragment {

    public coursedetails() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String value = getArguments().getString("course");
        Toast.makeText(getActivity(),"course details "+value, Toast.LENGTH_LONG).show();
        return inflater.inflate(R.layout.fragment_coursedetails, container, false);

    }
}
