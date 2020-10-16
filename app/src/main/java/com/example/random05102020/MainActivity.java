package com.example.random05102020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    // 1 : Khai báo biến
    TextView mTv;
    Button mBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2 : ánh xạ
        mTv = findViewById(R.id.textView);
        mBtn = findViewById(R.id.buttonClick);

        // Hàm log
        // ctrl + p : xem tham số truyền vào
        //Log.d("BBB",mTv.getText().toString());

        // Hàm Thông báo
//        Toast
//                .makeText(MainActivity.this , "Hello" , Toast.LENGTH_SHORT)
//                .show();
//        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
//        on vs emit
//        mBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Click", Toast.LENGTH_SHORT).show();
//            }
//        });
//        mTv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "textview", Toast.LENGTH_SHORT).show();
//            }
//        });
        // built in function : Log.d() , Math
        // Làm tròn
        //float num1 =  Math.round(1.5f);
        // Làm tròn xuống : floor (Sàn nhà)
        //double num2 = Math.floor(1.9999999);
        // Làm tròn lên : ceil (trần nhà)
        //double num3 = Math.ceil(1.01);
        // random
        // 0 - 5
//        for (int i = 0; i < 100 ; i++) {
//            double num4 = Math.floor(Math.random() * 6);
//            Log.d("BBB",num4 + "");
//        }
//        Toast.makeText(this, num4 + "", Toast.LENGTH_SHORT).show();
    }
}