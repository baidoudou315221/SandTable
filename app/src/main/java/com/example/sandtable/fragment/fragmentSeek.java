package com.example.sandtable.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.sandtable.R;
import com.example.sandtable.adapter.ListAdapter;
import com.example.sandtable.info.EnvironmentData;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class fragmentSeek extends Fragment {
        private ArrayList<EnvironmentData> list = new ArrayList<EnvironmentData>();
        private View view;
        private ListView listView;
        private ListAdapter listAdapter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        list.add(new EnvironmentData("温度：","25"));
        list.add(new EnvironmentData("湿度：","78"));
        list.add(new EnvironmentData("光强：","200"));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_seek,container,false);
        listView = view.findViewById(R.id.listView);
        listAdapter = new ListAdapter(this.getActivity(),R.layout.fragment_seek_text,list);
        listView.setAdapter(listAdapter);
        return view;
    }
}
