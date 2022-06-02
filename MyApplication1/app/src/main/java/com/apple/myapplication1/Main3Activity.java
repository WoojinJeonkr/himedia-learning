package com.apple.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    Button b11, b22, b33, b44, b55;
    EditText t11, t22;
    ImageView imageView;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b11 = findViewById(R.id.b11);
        b22 = findViewById(R.id.b22);
        b33 = findViewById(R.id.b33);
        b44 = findViewById(R.id.b44);
        b55 = findViewById(R.id.b55);
        t11 = findViewById(R.id.t11);
        t22 = findViewById(R.id.t22);
        result = findViewById(R.id.result);
        imageView = findViewById(R.id.imageView2);

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.tour);
            }
        }); //b11 : click 시 이미지 변경

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int[] datas = input();
                // 연산한 다음
                int plus = datas[0] + datas[1];

                // 화면에 결과를 보여주기
                result.setText("결과는 " + plus);
            }
        }); // b22: plus

        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int[] datas = input();
                // 연산한 다음
                int minus = datas[0] - datas[1];

                // 화면에 결과를 보여주기
                result.setText("결과는 " + minus);
            }
        }); // b33: minus

        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int[] datas = input();
                // 연산한 다음
                int multi = datas[0] * datas[1];

                // 화면에 결과를 보여주기
                result.setText("결과는 " + multi);
            }
        }); // b44: multi

        b55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int[] datas = input();
                // 연산한 다음
                int div = datas[0] / datas[1];

                // 화면에 결과를 보여주기
                result.setText("결과는 " + div);
            }
        }); // b55: div
    }

    // 입력을 받아서 정수로 변경해줌
    public int[] input(){
        // 데이터를 가지고 와서,
        String s11 = t11.getText().toString();
        String s22 = t22.getText().toString();

        // 정수로 변경하고
        int i11 = Integer.parseInt(s11);
        int i22 = Integer.parseInt(s22);

        int[] values = new int[2];
        values[0] = i11;
        values[1] = i22;
        return values;
    }
}
