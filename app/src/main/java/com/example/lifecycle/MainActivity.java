package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"onstart",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"onresume",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"onpause",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"onStop",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"onRestart",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"onDestroy",Toast.LENGTH_LONG).show();
    }
}