package com.example.sandtable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);
        Button btnLogIn = findViewById(R.id.btnLogIn);
        Button btnCancel = findViewById(R.id.btnCancel);
        btnLogIn.setOnClickListener(this);
        btnCancel.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnLogIn:
                Intent intent = new Intent(MainActivity.this,MainPageActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.btnCancel:
                finish();
                break;
        }
    }
}
