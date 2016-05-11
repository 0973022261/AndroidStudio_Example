package com.example.inhm.intent_example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    String title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intent = getIntent();
        if(intent != null) {
            title = intent.getStringExtra("title");
            Toast.makeText(getApplicationContext(),title,Toast.LENGTH_LONG).show();
        }
    }

    public void onButton1Clicked(View v) {
        finish();
    }
}
