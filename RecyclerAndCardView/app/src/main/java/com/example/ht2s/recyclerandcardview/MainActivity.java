package com.example.ht2s.recyclerandcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //a list to store all the products
    List<Product> productList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new Product(
                        1,
                        "Bugatti Veyron Supersport",
                        "Beast of the beasts, has top speed of 252 mph and was once the fastest car in the world and would cost you 12 crores!",
                        4.3,
                        1700000,
                        R.drawable.bugatti_icon));

        productList.add(
                new Product(
                        1,
                        "Ferrari 599 GTB",
                        "Well, it's a Ferrrrrrrrari! This monster will make a huge impact on your budget as it costs around 3.5 crores",
                        4.1,
                        600000,
                        R.drawable.ferr_icon));

        productList.add(
                new Product(
                        1,
                        "Audi R8",
                        "It's the ride of our favorite superhero, Iron Man! What more do you want! Also, it's the best you can get for 2.5 crores",
                        4.0,
                        550000,
                        R.drawable.audir8_icon));

        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }
}
