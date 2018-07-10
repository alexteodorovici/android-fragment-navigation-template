package com.ideeastudios.fragment.navigation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;


public class CollapsingToolbarFragment extends Fragment {

    public CollapsingToolbarFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Objects.requireNonNull(((MainActivity) getActivity()).getSupportActionBar()).setTitle("Collapsing Toolbar");
       // Objects.requireNonNull(((MainActivity) getActivity()).getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        return inflater.inflate(R.layout.fragment_collapsing_toolbar, container, false);
    }

//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//       // loadBackdrop();
//    }
//
//    private void loadBackdrop() {
//        // load images with Glide
//        final ImageView imageView = getActivity().findViewById(R.id.backdrop);
//        Glide.with(this).load(R.drawable.cheese_2).apply(RequestOptions.centerCropTransform()).into(imageView);
//    }


}