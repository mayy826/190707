package com.example.a190707practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate.....", Toast.LENGTH_SHORT).show();
        Log.v("TAG","Toast基本用法");
    }

    @Override
    protected void  onPause(){
        super.onPause();
        Toast.makeText(this, "OpPause", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "OpResume", Toast.LENGTH_SHORT).show();
    }

}
