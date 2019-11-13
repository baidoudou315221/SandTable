package com.example.sandtable.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.sandtable.R;

public class fragmentChange extends Fragment implements View.OnClickListener{
    private View view;
    private Button btn_hand;
    private Button btn_self;
    private EditText ed_temp;
    private EditText ed_humi;
    private EditText ed_illum;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_change,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btn_hand = view.findViewById(R.id.btn_hand);
        btn_self = view.findViewById(R.id.btn_self);
        ed_temp = view.findViewById(R.id.ed_temp);
        ed_humi = view.findViewById(R.id.ed_humi);
        ed_illum = view.findViewById(R.id.ed_illum);

        btn_hand.setOnClickListener(this);
        btn_self.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_hand:
                Toast.makeText(this.getActivity(),"手动调节",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_self:
                Toast.makeText(this.getActivity(),"自动调节",Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
