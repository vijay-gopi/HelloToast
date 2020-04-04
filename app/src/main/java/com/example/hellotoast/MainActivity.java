package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Toast_btn;
    Button Count_btn;
    TextView Text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast_btn = findViewById(R.id.toast);
        Count_btn = findViewById(R.id.count);
        Text = findViewById(R.id.disp);
        Text.setText("0");


        Toast_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Toast is Pressed",Toast.LENGTH_SHORT).show();
            }
        });

        Count_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c = Integer.parseInt(Text.getText().toString())+1;
                Text.setText(""+c);
            }
        });


    }
}
