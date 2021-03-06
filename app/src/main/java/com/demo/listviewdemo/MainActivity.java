package com.demo.listviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] listViewType = {"ListView", "ExpendableListView", "ListView Header Footer", "BaseAdapter ListView"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("ListViewDemo");

        ListAdapter mListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listViewType);
        ListView mListView = (ListView) findViewById(R.id.mainListView);
        mListView.setAdapter(mListAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, ListAdapterListView.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, ExpendListView.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, HeaderFooterListView.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this, BaseAdapterListView.class));
                        break;
                }
            }
        });
    }
}
