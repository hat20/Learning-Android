package com.example.ht2s.activity_passingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,city;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name =  (EditText) findViewById(R.id.name);
        city = (EditText) findViewById(R.id.city);
        send = (Button) findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NAME = name.getText().toString();
                String CITY = city.getText().toString();

                Intent intent = new Intent(MainActivity.this,ReceiveActivity.class);
                intent.putExtra("NAME_KEY",NAME);
                intent.putExtra("CITY_KEY",CITY);
                startActivity(intent);


            }
        });
    }
}
