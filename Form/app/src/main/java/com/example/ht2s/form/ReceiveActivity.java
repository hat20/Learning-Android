package com.example.ht2s.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class ReceiveActivity extends AppCompatActivity {
    TextView fname,lname,gen,coun,occ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);

        fname = (TextView)findViewById(R.id.fname_text);
        lname = (TextView)findViewById(R.id.lname_text);
        gen = (TextView)findViewById(R.id.gender);
        coun = (TextView)findViewById(R.id.country_text);
        occ = (TextView)findViewById(R.id.occ_text);

        Intent intent = getIntent();
        String FNAME = intent.getStringExtra("FNAME_KEY");
        fname.setText(FNAME);
        String LNAME = intent.getStringExtra("LNAME_KEY");
        lname.setText(LNAME);
        String GEN = intent.getStringExtra("GEN_KEY");
        gen.setText(GEN);
        String COUNTRY = intent.getStringExtra("COUN_KEY");
        coun.setText(COUNTRY);
        String OCCU = intent.getStringExtra("OCC_KEY");
        occ.setText(OCCU);
    }
}
