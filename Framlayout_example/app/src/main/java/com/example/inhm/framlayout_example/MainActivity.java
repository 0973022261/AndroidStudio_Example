package com.example.inhm.framlayout_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


/**
 * 2016-05-11
 *
 * 프로젝트명 : 프레임 레이아웃 사용해보기
 *
 * 버튼을 누를경우 2개의 이미지뷰가 서로 번갈아 가면서 화면에 나타난다.
 *
 * 작성자 : 인형민
 */
public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView imageView2;
    ImageView imageView;

    boolean selected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.imageView);
        imageView2 = (ImageView)findViewById(R.id.imageView2);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(selected == true) {
                    imageView.setVisibility(View.VISIBLE);
                    imageView2.setVisibility(View.GONE);
                } else {
                    imageView.setVisibility(View.GONE);
                    imageView2.setVisibility(View.VISIBLE);
                }

                selected = !selected;
            }
        });
    }
}
