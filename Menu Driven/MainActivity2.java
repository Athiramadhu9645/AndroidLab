package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText t1,t2,t3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=(EditText) findViewById(R.id.t1);
        t2=(EditText) findViewById(R.id.t2);
        t3=(EditText) findViewById(R.id.t3);
        b1=(Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String S1=t1.getText().toString();
                String S2=t2.getText().toString();
                String S3=t3.getText().toString();


                int x = Integer.parseInt(S1);
                int y = Integer.parseInt(S2);
                int z = Integer.parseInt(S3);
                int w = (x*y*z)/100;
                String S4=String.valueOf(w);


                Toast.makeText(getApplicationContext(),"RESULT:"+S4,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
