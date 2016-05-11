package com.example.inhm.layoutinflater_example;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


/**
 * 2016-05-11
 *
 * 프로젝트명 : 레이아웃 인플레이터를 통해 부분화면 만들어보기
 *
 * '부분화면 띄우기'버튼을 클릭시 새로 지정한 부분화면이 화면에 나타난다.
 * 부분화면버튼을 클릭시 Toast메세지로 버튼의 동작을 보여준다.
 *
 * 작성자: 인형민
 * 
 */
public class MainActivity extends AppCompatActivity {

    Button button;
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v) {

        layout = (LinearLayout) findViewById(R.id.container);
        LayoutInflater layoutInflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        button = (Button) layout.findViewById(R.id.button2);
        layoutInflater.inflate(R.layout.mylayout,layout,true);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"부분화면의 버튼이 눌렸습니다.",Toast.LENGTH_LONG).show();
            }
        });
    }
}
