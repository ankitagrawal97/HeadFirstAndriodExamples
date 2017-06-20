package com.example.ankit.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecieveMessageActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_message);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(CreateMessageActivity.MESSAGE);

        TextView messageView = (TextView) findViewById(R.id.message);
        messageView.setText(messageText);

    }
}
