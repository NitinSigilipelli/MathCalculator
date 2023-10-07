package com.example.mathcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Calculator calculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the TextView in the layout
        TextView proTextView = findViewById(R.id.textView);

        // Create an instance of the Calculator class and associate it with the TextView
        calculator = new Calculator(proTextView);
    }
    public void onClickButton1(View view) {
        calculator.a1();
    }

    public void onClickButton2(View view) {
        calculator.a2();
    }

    public void onClickButton3(View view) {
        calculator.a3();
    }

    public void onClickButton4(View view) {
        calculator.a4();
    }

    public void onClickButton5(View view) {
        calculator.a5();
    }

    public void onClickButton6(View view) {
        calculator.a6();
    }

    public void onClickButton7(View view) {
        calculator.a7();
    }

    public void onClickButton8(View view) {
        calculator.a8();
    }

    public void onClickButton9(View view) {
        calculator.a9();
    }

    public void onClickButton0(View view) {
        calculator.a0();
    }

    public void onClickButtonAdd(View view) {
        calculator.add();
    }

    public void onClickButtonSub(View view) {
        calculator.sub();
    }

    public void onClickButtonMul(View view) {
        calculator.mul();
    }

    public void onClickButtonDiv(View view) {
        calculator.div();
    }

    public void onClickButtonEquals(View view) {
        calculator.eq();
    }

    public void onClickButtonReset(View view) {
        calculator.reset();
    }

    public void onClickButtonBack(View view) {
        calculator.back();
    }

}


