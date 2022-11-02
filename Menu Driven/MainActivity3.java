package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    EditText t4,t5,t6,t7;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t4=(EditText) findViewById(R.id.t4);
        t5=(EditText) findViewById(R.id.t5);
        t6=(EditText) findViewById(R.id.t6);
        t7=(EditText) findViewById(R.id.t7);
        b2=(Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1=t4.getText().toString();
                String n2=t5.getText().toString();
                String n3=t6.getText().toString();
                String n4=t7.getText().toString();
                int a=Integer.parseInt(n1);
                int b=Integer.parseInt(n2);
                int c=Integer.parseInt(n3);
                int d=Integer.parseInt(n4);
                double p=a*Math.pow(1+(b/d),d*c);
                String s5=String.valueOf(p);
                Toast.makeText(getApplicationContext(),"result"+s5,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
