package com.example.inhm.hello;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * 2016-05-11
 *
 * 안드로이드 버튼 예제 프로젝트
 * 버튼 5개, 동작 5개
 * '안녕' 버튼을 누를 경우 Toast 메세지가 "안녕" 이라고 뜨게 만들기
 * 시작1 버튼을 누를 경우 구글 홈페이지가 뜨도록 만들기
 * 시작2 버튼을 누를 경우 전화 걸기 앱 실행되도록 만들기
 * 시작3 버튼을 누를 경우 새로운 화면을 띄우기
 * 돌아가기 버튼을 누를 경우 이전 화면으로 돌아가기
 *
 * 작성자: 인형민
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v) {
        Toast.makeText(this,"안녕",Toast.LENGTH_LONG).show();
    }
    public void onButton2Clicked(View v) {

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(intent);
    }
    public void onButton3Clicked(View v) {

        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:010-0000-0000"));
        startActivity(intent);
    }
    public void onButton4Clicked(View v) {

        Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
        startActivity(intent);
    }
}
