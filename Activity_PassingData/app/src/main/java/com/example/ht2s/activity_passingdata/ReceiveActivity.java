package com.example.ht2s.activity_passingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReceiveActivity extends AppCompatActivity {

    TextView name,city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);

        name = (TextView)findViewById(R.id.name_text);
        city = (TextView)findViewById(R.id.city_text);

        Intent intent = getIntent();
        String NAME = intent.getStringExtra("NAME_KEY");
        name.setText(NAME);
        String CITY = intent.getStringExtra("CITY_KEY");
        city.setText(CITY);

    }
}
