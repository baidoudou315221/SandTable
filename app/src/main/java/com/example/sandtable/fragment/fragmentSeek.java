package com.example.sandtable.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.sandtable.R;

public class fragmentSeek extends Fragment {
    private static final String TAG = "------>";
    private String[] data = {"湿度","温度","水分"};
    private View SeekView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG,"onCreateView");
        SeekView = inflater.inflate(R.layout.fragment_seek,container,false);
        return SeekView;

    }
}
