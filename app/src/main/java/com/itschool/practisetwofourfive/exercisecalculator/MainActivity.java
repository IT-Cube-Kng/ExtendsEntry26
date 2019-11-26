package com.itschool.practisetwofourfive.exercisecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextOne;
    EditText editTextTwo;
    TextView result;
    final static String TAG = "Calculator:MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextOne = findViewById(R.id.editText);
        editTextTwo = findViewById(R.id.editText2);
        result = findViewById(R.id.result_textView);


    }

    public void plusNum(View view) {
        Double numOne;
        Double numTwo;
        numOne = Double.parseDouble(String.valueOf(editTextOne.getText()));
        numTwo = Double.parseDouble(String.valueOf(editTextTwo.getText()));
        Log.d(TAG, String.format("Number one: %f. Number two: %f", numOne, numTwo));
        result.setText(Double.toString(numOne + numTwo));
    }




    // реализуйте кнопки с методами вычитания, умножения, деления, очистки результатов
}
