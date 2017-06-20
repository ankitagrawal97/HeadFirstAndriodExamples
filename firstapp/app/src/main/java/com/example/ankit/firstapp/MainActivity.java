package com.example.ankit.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bmain = (Button) findViewById(R.id.button);


        bmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"you clicked button",Toast.LENGTH_SHORT).show();
            }

        });

        bmain.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(),"long clicked!",Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }


    public void Clickme(View view){
        Toast.makeText(this,"you clicked the button",Toast.LENGTH_SHORT).show();

    }
}
