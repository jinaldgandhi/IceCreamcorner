package com.example.icecreamcorner;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;

public class IcecreamCategoryActivity extends ListActivity {
    private AutoCompleteTextView listIcecream;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listPizza = getListView();

        ArrayAdapter<Icecream> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Icecream.icecreams
        );
        listIcecream.setAdapter(listAdapter);

        // Set up an item click listener
        listIcecream.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the selected Icecream item
                Icecream selectedIcecream = (Icecream) parent.getItemAtPosition(position);

                // Create an Intent to start the next activity (replace NextActivity.class with the actual name of your next activity)
                Intent intent = new Intent(IcecreamCategoryActivity.this, ConfirmSizeAndOrderActivity.class);

                // Pass any data you want to the next activity using extras (if needed)
                intent.putExtra("Icecream_name", selectedIcecream.getName());

                // Start the next activity
                startActivity(intent);
            }
        });
    }
}
