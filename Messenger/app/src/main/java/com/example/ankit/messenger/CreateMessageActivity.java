package com.example.ankit.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {
    EditText messageView;
    public static final String MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);

        messageView = (EditText) findViewById(R.id.sendingmessage);
    }

    public void onSendMessage(View view){

        String messageText = messageView.getText().toString();
        Intent intent = new Intent(this,RecieveMessageActivity.class);
        intent.putExtra(MESSAGE,messageText);
        startActivity(intent);

    }
}
