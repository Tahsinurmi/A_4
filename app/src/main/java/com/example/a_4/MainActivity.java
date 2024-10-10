package com.example.a_4;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.customListView);

        // Sample data for the ListView
        List<String> itemList = new ArrayList<>();
        itemList.add("Item 1: Description 1");
        itemList.add("Item 2: Description 2");
        itemList.add("Item 3: Description 3");

        // Create an ArrayAdapter using the item list
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, // Built-in layout for single line items
                itemList
        );

        // Set the adapter to the ListView
        listView.setAdapter(adapter);
    }
}
