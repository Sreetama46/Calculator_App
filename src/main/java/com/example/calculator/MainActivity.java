package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button add,sub,mult,div;

    EditText first,second;

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=(Button)findViewById(R.id.btn1);
        sub=(Button)findViewById(R.id.btn2);
        mult=(Button)findViewById(R.id.btn3);
        div=(Button)findViewById(R.id.btn4);

        first=(EditText)findViewById(R.id.first_number);
        second=(EditText)findViewById(R.id.second_number);

        result=(TextView)findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= first.getText().toString();
                String s2= second.getText().toString();
                double res= Integer.parseInt(s1) + Integer.parseInt(s2);
                result.setText(String.valueOf(res));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= first.getText().toString();
                String s2= second.getText().toString();
                double res= Integer.parseInt(s1) - Integer.parseInt(s2);
                result.setText(String.valueOf(res));

            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= first.getText().toString();
                String s2= second.getText().toString();
                double res= Integer.parseInt(s1) * Integer.parseInt(s2);
                result.setText(String.valueOf(res));

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= first.getText().toString();
                String s2= second.getText().toString();
                double res= Integer.parseInt(s1) / Integer.parseInt(s2);
                result.setText(String.valueOf(res));

            }
        });
    }
}
