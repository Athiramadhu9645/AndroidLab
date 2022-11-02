package com.example.menudriven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    EditText c1,c2,c3,c4;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        c1=(EditText) findViewById(R.id.c1);
        c2=(EditText) findViewById(R.id.c2);
        c3=(EditText) findViewById(R.id.c3);
        c4=(EditText) findViewById(R.id.c4);
        b2=(Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1=c1.getText().toString();
                String n2=c2.getText().toString();
                String n3=c3.getText().toString();
                String n4=c4.getText().toString();
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
