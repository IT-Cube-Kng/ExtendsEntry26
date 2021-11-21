package com.itschool.practisetwofourfive.exercisecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.itschool.practisetwofourfive.exercisecalculator.calculate.Operation;
import com.itschool.practisetwofourfive.exercisecalculator.calculate.PlusOperation;

public class MainActivity extends AppCompatActivity {
    EditText editTextOne;
    EditText editTextTwo;
    TextView result;
    Button resultButton;
    final static String TAG = "Calculator:MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextOne = findViewById(R.id.et_op1);
        editTextTwo = findViewById(R.id.et_op2);
        result = findViewById(R.id.tw_result);
        resultButton = findViewById(R.id.bt_result_sum);
        final Operation op = new PlusOperation();
        // реализуйте кнопки с методами вычитания, умножения, деления, возведения в степень, корня,
        // очистки результатов
        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation(v, op);
            }
        });

    }


    public void calculation(View v, Operation op) {
        Double numOne;
        Double numTwo;
        numOne = Double.parseDouble(String.valueOf(editTextOne.getText()));
        numTwo = Double.parseDouble(String.valueOf(editTextTwo.getText()));
        Log.d(TAG, String.format("Number one: %f. Number two: %f", numOne, numTwo));
        op.setOp1(numOne);
        op.setOp2(numTwo);

        Double res = op.calc();
        result.setText(getString(R.string.result, "" + res));


    }


}
