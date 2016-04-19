package com.example.justin.lab3exercise;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNum;
    EditText secondNum;
    TextView addResult;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNum = (EditText)findViewById(R.id.editText);
        secondNum = (EditText)findViewById(R.id.editText2);
        addResult = (TextView)findViewById(R.id.textView2);
        btnAdd = (Button)findViewById(R.id.button);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a;
                int b;
                a = Integer.parseInt(firstNum.getText().toString());
                b = Integer.parseInt(secondNum.getText().toString());
                int sum = sum(a,b);
                addResult.setText(Integer.toString(sum));
            }
        });


    }

    public int sum(int a, int b){
        return a+b;
    }
}
