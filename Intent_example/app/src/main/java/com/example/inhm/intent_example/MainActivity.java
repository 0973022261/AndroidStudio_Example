package com.example.inhm.intent_example;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * 2016-05-11
 *
 * 프로젝트명 : 액티비티간 인텐트 초급 연습
 *
 * 전화걸기 버튼을 누를시 전화걸기 다이얼을 띄운다.
 * 메뉴화면 버튼을 누를시 메뉴화면을 띄운다.
 *
 * 작성자 : 인형민
 */

public class MainActivity extends AppCompatActivity {

    private static final int REQ_MENU = 1001;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel-010-1234-5678"));
        startActivity(intent);
    }
    public void onButton2Clicked(View v) {
        Intent intent = new Intent(getApplicationContext(),MenuActivity.class);

        intent.putExtra("title", "안드로이드 연습");
        startActivityForResult(intent,REQ_MENU);


    }
}
