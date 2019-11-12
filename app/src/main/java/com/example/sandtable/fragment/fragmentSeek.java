package com.example.sandtable.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.sandtable.R;
import com.example.sandtable.adapter.ListAdapter;
import com.example.sandtable.info.EnvironmentData;

import java.util.List;
import java.util.zip.Inflater;


public class fragmentSeek extends Fragment {
    private static final String TAG = "------>";
    private View SeekView;
    private EnvironmentData environmentData = new EnvironmentData();


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        SeekView = inflater.inflate(R.layout.fragment_seek,container,false);
//        ListAdapter listAdapter = new ListAdapter();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this.getActivity(),android.R.layout.simple_list_item_1,environmentData.getDataName());
        ListView listView = SeekView.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return SeekView;
    }
}
