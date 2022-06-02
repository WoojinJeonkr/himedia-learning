package com.apple.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    //view 객체의 값을 넣어줄 변수 선언!
    Button b1, b2;
    TextView t1, t2, t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 안드로이드에서 자원과 관련된 것은
        // R 클래스가 담당하고 값이 저장된 변수를 가지고 있음
        // R 클래스가 가지고 있는 변수를 가지고 view 객체에 대한
        // 주소를 획득하여 선언된 변수에 저장
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);

        // b1에 클릭 이벤트 등록
        // 인터페이스를 따르는 익명 클래스의 객체를 입력값으로 넣어줌
        // 이 생성된 객체가 이벤트 처리를 담당
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // onclick 처리 내용을 구현
                Log.d("확인용", "버튼1을 클릭했군요!");
                String s1 = t1.getText().toString();
                String s2 = t2.getText().toString();
                Log.d("입력값", s1);
                Log.d("입력값", s2);
            }
        }); //b1

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // onclick 처리 내용 구현
                Log.d("확인용", "버튼2를 클릭했군요!");
                String s2 = t2.getText().toString();
                Log.d("확인용", s2);
            }
        }); //b2
    }
}
