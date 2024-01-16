package com.apple.hightrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                print("네이버로 가자!");
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://m.naver.com")
                );
                startActivity(intent);
            }
        }); // 클릭시 네이버로 이동

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                print("전화걸기");
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("tel:/01094141111")
                );
                startActivity(intent);
            }
        }); // 클릭 시 전화 걸기

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                print("페이지2!");
                Intent intent
                        = new Intent(MainActivity.this,
                                    Main2Activity.class
                );
                startActivity(intent);
            }
        }); // 클릭 시 페이지 2로 이동

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                print("끝내기!");
                finish();
            }
        }); // 클릭 시 끝내기
    }

    public void print(String data) {
        Toast.makeText(getApplicationContext(),
                data,
                Toast.LENGTH_SHORT
        ).show();
    }
}
