/**
 * Created by HT2S on 09-02-2018. Stores information about cars.
 */

package com.example.ht2s.listviewimage;

public class Car {
    private String make;
    private int year;
    private int iconID;
    private String condition;

    public Car(String make, int year, int iconID, String condition) {
        super();
        this.make = make;
        this.year = year;
        this.iconID = iconID;
        this.condition = condition;
    }

    public String getMake() {
        return make;
    }
    public int getYear() {
        return year;
    }
    public int getIconID() {
        return iconID;
    }
    public String getCondition() {
        return condition;
    }
}

