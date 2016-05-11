package com.example.inhm.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.TooManyListenersException;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void onButton1Clicked(View v) {
        Toast.makeText(this,"돌아가기",Toast.LENGTH_LONG).show();
        finish();
    }
}
