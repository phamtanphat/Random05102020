package com.example.random05102020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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
        Toast
                .makeText(MainActivity.this , "Hello" , Toast.LENGTH_SHORT)
                .show();
    }
}