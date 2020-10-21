package com.example.random05102020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    EditText mEdtMax, mEdtMin;
    Button mBtnRandom;
    String mTxtMax, mTxtMin;
    TextView mTvResult;
    int mSMin, mSMax;
    Random mRandom;
    int mResult = -1;
    String mResults = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Hàm trong java : Tái sử dụng code
        initView();
        // Task 1 : Valid (Khi click button)
//            + Kiểm tra chuỗi trong edittext khác rỗng
//            + Kiểm tra số max không được bé hoăc bằng hơn min (max = min + 1)
        // Task 2 : Random (Khi click button)
//            + Hiển thị kết quả random vào trong text : 1 - 2 -
        // Task 3 : Random (Nang cao)
//            + Không có kết quả trùng : 1 - 2 - 3 -
//            + Xử lý kiểm tra khi hết số thông báo
        // Task 4 :
//            + Hiển thị giao diện : 1 - 2 - 3
        event();

        // Array
//        int[] arrNums = new int[10];
//        int[] arrNums1 = {1,2,3,4,5,6,7,8,9,10};
//        arrNums1[0] = 11;
//        Log.d("BBB",arrNums1[0] + "");
        // List (Arraylist)
        List<String> arrayList = new ArrayList<>();
        // insert
        arrayList.add("Teo"); // 0
        arrayList.add("Ti"); // 1
        // update
        arrayList.set(0 , "Tuan");
        // remove
        arrayList.remove(0);
        Log.d("BBB",arrayList.get(0));
    }
    private void initView() {
        mBtnRandom = findViewById(R.id.buttonRandom);
        mEdtMax = findViewById(R.id.editTextMax);
        mEdtMin = findViewById(R.id.editTextMin);
        mTvResult = findViewById(R.id.textViewResult);
        mSMin = mSMax = -1;
        mRandom = new Random();
    }

    private void event() {
        mBtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTxtMax = mEdtMax.getText().toString();
                mTxtMin = mEdtMin.getText().toString();

                // Kiểm tra khác 0
                if (mTxtMax.length() <= 0 || mTxtMin.length() <= 0) {
                    Toast.makeText(MainActivity.this, "Bạn chưa nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Kiểm tra giá trị min và max
                mSMax = Integer.parseInt(mTxtMax);
                mSMin = Integer.parseInt(mTxtMin);

                if (mSMax <= mSMin){
                    mSMax = mSMin + 1;
                }
                // Gắn lại giao diện
                mEdtMax.setText(mSMax + "");

                mResult = mRandom.nextInt(mSMax - mSMin + 1) + mSMin;
                mResults += mResult + " - ";
                mTvResult.setText(mResults);
            }
        });
    }
}
// 2 : ánh xạ
//        mTv = findViewById(R.id.textView);
//        mBtn = findViewById(R.id.buttonClick);

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

// 3 - 107
//        Random random = new Random();
//        for (int i = 0; i < 20 ; i++) {
//            int numRandom = random.nextInt(107 - 3 + 1) + 3;
//            Log.d("BBB",numRandom + "");
//        }

// 1 : Access modifier (phạm vi truy cập : class , function , interface , ...)
// 2 : Result (Giá trị sau khi thực thi)
// 3 : Name (Tên hàm)
// 4 : Parameter (Tham số truyền vào)

//    1       2   3       4
//    private String setName(String name){
//        return "";
//    }
