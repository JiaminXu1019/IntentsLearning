package com.example.intentslearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class SendMessageActivity extends AppCompatActivity {

    private EditText editText;
    private Button send;
    private Button buttonShare;

    public static final String EXTRA_MESSAGE = "com.example.intentsLearning";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        wireWidgets();

        buttonShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentShare = new Intent(Intent.ACTION_SEND);
                intentShare.setType("text/plain");
                intentShare.putExtra(EXTRA_MESSAGE, editText.getText().toString());
                startActivity(intentShare);
            }
        });
    }


            private void wireWidgets() {
                editText = findViewById(R.id.edittext_sendmessage_msg);
                send = findViewById(R.id.button_sendmessage_msg);
                buttonShare = findViewById(R.id.button_share_msg);
            }

            public void sendMessage(View view) {
                String message = editText.getText().toString();

                Intent intent = new Intent(this, DisplayMessage.class);
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        }
