package com.pys.wishingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText n1,n2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast
        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        //textView.setText("Good Morning");

        button.setOnClickListener(new View.OnClickListener() {   //this method is used for defing the instructions to button and giving command toit
            @Override
            public void onClick(View v) {
                int sum=Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n1.getText().toString());//it is used to convert strings to integer
                textView.setText("sum is "+sum);
            }
        });

    }
}