package com.ideeastudios.fragment.navigation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;


public class SlideShowFragment extends Fragment {

    public SlideShowFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Objects.requireNonNull(((MainActivity) getActivity()).getSupportActionBar()).setTitle("SlideShowFragment");
        //Objects.requireNonNull(((MainActivity) getActivity()).getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        return inflater.inflate(R.layout.fragment_slide_show, container, false);
    }
}