package com.m68476521.mike.duk;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by miguel on 1/19/17.
 */

public class DUNFragment extends Fragment {

    private RecyclerView mDUNRecyclerView;

    public static DUNFragment newInstance() {
        return new DUNFragment();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dun_gallery, container, false);

        mDUNRecyclerView = (RecyclerView) v
                .findViewById(R.id.fragment_dun_gallery_recycler_view);
        mDUNRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));

        return v;
    }


}
