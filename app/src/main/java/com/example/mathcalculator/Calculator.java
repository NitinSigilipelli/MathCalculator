package com.example.mathcalculator;

import android.util.Log;
import android.widget.TextView;

public class Calculator {
    private StringBuilder str = new StringBuilder();
    private TextView pro;

    public Calculator(TextView proTextView) {
        pro = proTextView;
    }

    public void a1() {
        str.append(1);
        pro.setText(str.toString());
    }

    public void a2() {
        str.append(2);
        pro.setText(str.toString());
    }

    public void a3() {
        str.append(3);
        pro.setText(str.toString());
    }

    public void a4() {
        str.append(4);
        pro.setText(str.toString());
    }

    public void a5() {
        str.append(5);
        pro.setText(str.toString());
    }

    public void a6() {
        str.append(6);
        pro.setText(str.toString());
    }

    public void a7() {
        str.append(7);
        pro.setText(str.toString());
    }

    public void a8() {
        str.append(8);
        pro.setText(str.toString());
    }

    public void a9() {
        str.append(9);
        pro.setText(str.toString());
    }

    public void a0() {
        str.append(0);
        pro.setText(str.toString());
    }

    public void add() {
        str.append("+");
        pro.setText(str.toString());
    }

    public void sub() {
        str.append("-");
        pro.setText(str.toString());
    }

    public void mul() {
        str.append("*");
        pro.setText(str.toString());
    }

    public void div() {
        str.append("/");
        pro.setText(str.toString());
    }

    public void eq() {
        if (str == null || str.length() == 0) {
            // Handle empty input or null input.
            pro.setText("Invalid input");
            return;
        }

        int a = 0;
        String st = "";
        String[] arr = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar != '+' && currentChar != '-' && currentChar != '*' && currentChar != '/') {
                st += currentChar;
            } else {
                arr[a] = st;
                a++;
                arr[a] = String.valueOf(currentChar);
                st = "";
                a++;
            }
        }

        arr[a] = st;

        int res = 0; // Initialize the result variable

        try {
            res = Integer.parseInt(arr[0]);
            Log.d("TAG", String.valueOf(arr.length));
            for (int i = 0; i < a+1; i++) {
                Log.i("TAG", String.valueOf(i));
                switch (arr[i]) {
                    case "+":
                        res += Integer.parseInt(arr[i + 1]);
                        break;
                    case "-":
                        res -= Integer.parseInt(arr[i + 1]);
                        break;
                    case "*":
                        res *= Integer.parseInt(arr[i + 1]);
                        break;
                    case "/":
                        int denominator = Integer.parseInt(arr[i + 1]);
                        if (denominator != 0) {
                            res /= denominator;
                        } else {
                            // Handle division by zero error.
                            pro.setText("Division by zero");
                            return;
                        }
                        break;
                }
            }

            System.out.println(res);
            pro.setText(String.valueOf(res));
            str.delete(0,str.length());
            str.append(res);
        } catch (NumberFormatException e) {
            // Handle invalid number format in the input.
            pro.setText("Invalid input");
        }
    }


    public void reset() {
        pro.setText("");
        str.setLength(0);
    }

    public void back() {
        if (str.length() > 0) {
            str.deleteCharAt(str.length() - 1);
            pro.setText(str.toString());
        }
    }
}

