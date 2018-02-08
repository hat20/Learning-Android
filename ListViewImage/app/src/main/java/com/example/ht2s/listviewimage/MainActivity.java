package com.example.ht2s.listviewimage;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Car> myCars = new ArrayList<Car>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateCarList();
        populateListView();
    }

    private void populateListView() {
        ArrayAdapter<Car> adapter = new MyListAdapter();
        ListView list = (ListView)findViewById(R.id.carsListView);
        list.setAdapter(adapter);
    }

    private void populateCarList() {
        myCars.add(new Car("Ferrari",2018,R.drawable.ferr_icon,"Brand New"));
        myCars.add(new Car("Aston Martin",2012,R.drawable.astonmartin_icon,"Second Hand"));
        myCars.add(new Car("Bugatti Veyron",2008,R.drawable.bugatti_icon,"Lightning fast"));
        myCars.add(new Car("Nissan GTR",2001,R.drawable.nissan_icon,"Needs work"));
        myCars.add(new Car("Audi R8",2011,R.drawable.audir8_icon,"Dependable"));
        myCars.add(new Car("Ford",2008,R.drawable.ford_icon,"Old but Gold"));
        myCars.add(new Car("Volkswagen",2012,R.drawable.vw_icon,"Third Hand"));
        myCars.add(new Car("BMW",2006,R.drawable.bmw_icon,"Still works"));
        myCars.add(new Car("Lambo",2001,R.drawable.lambo_icon,"As Good As New"));
        myCars.add(new Car("Audi",2010,R.drawable.audi_icon,"Well Maintained"));

    }

    private class MyListAdapter extends ArrayAdapter<Car>{
        public MyListAdapter(){
            super(MainActivity.this,R.layout.item_view,myCars);
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            View itemView = convertView;
            if(itemView == null){
                itemView = getLayoutInflater().inflate(R.layout.item_view,parent,false);
            }

            Car currentCar = myCars.get(position);

            ImageView imageView = (ImageView)itemView.findViewById(R.id.item_icon);
            imageView.setImageResource(currentCar.getIconID());

            TextView makeText = (TextView) itemView.findViewById(R.id.item_txtMake);
            makeText.setText(currentCar.getMake());

            TextView yearText = (TextView) itemView.findViewById(R.id.item_txtYear);
            yearText.setText(""+currentCar.getYear());

            TextView conditionText = (TextView) itemView.findViewById(R.id.item_txtCondition);
            conditionText.setText(currentCar.getCondition());


            return itemView;
        }

    }
}
