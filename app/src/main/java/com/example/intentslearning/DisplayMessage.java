package com.example.intentslearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessage extends AppCompatActivity {

    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        wirewidgets();

        Intent intent = getIntent();
        String message = intent.getStringExtra(SendMessageActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        display = findViewById(R.id.textview_displaymessage_msg);
        display.setText(message);

    }

    private void wirewidgets() {
        display = findViewById(R.id.textview_displaymessage_msg);


    }

}
