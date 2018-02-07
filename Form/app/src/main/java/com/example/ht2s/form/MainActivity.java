package com.example.ht2s.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {
    EditText firstname,lastname;
    Button submit,reset;
    RadioButton radioButton;
    RadioGroup radioGroup;
    AutoCompleteTextView autoCompleteTextView;
    String country,gen;

    String arr[] = {"Doctor","Nurse","Businessman","Engineer","Lawyer","Entrepreneur","Other"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firstname = (EditText)findViewById(R.id.firstname) ;
        lastname = (EditText)findViewById(R.id.lastname);
        submit = (Button)findViewById(R.id.submit);
        reset = (Button)findViewById(R.id.reset);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        autoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.occ);
        final Spinner myspinner = (Spinner)findViewById(R.id.spinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.countries));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myAdapter);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.select_dialog_item,arr);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String first = firstname.getText().toString();
                String last = lastname.getText().toString();
                String occupation = autoCompleteTextView.getText().toString();

                Intent intent = new Intent(MainActivity.this,ReceiveActivity.class);
                intent.putExtra("FNAME_KEY",first);
                intent.putExtra("LNAME_KEY",last);
                intent.putExtra("GEN_KEY",gen);
                intent.putExtra("COUN_KEY",country);
                intent.putExtra("OCC_KEY",occupation);
                startActivity(intent);

            }
        });

        myspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                country = adapterView.getItemAtPosition(i).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    public void checkButton(View view)
    {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        gen = radioButton.getText().toString();
    }
}
