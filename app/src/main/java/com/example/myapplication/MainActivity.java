package com.example.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] arrName = {"Samsung","Sony","Apple","LG","Motorola",
                "HTC","Acer","Lenovo","Oppo","Nokia","BlackBerry","Huawei","ZTE","Meizu","HP","Asus","Panasonic"};
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, arrName);
        ListView listView = findViewById(R.id.id_list);
        listView.setAdapter(adapter);
}
    }