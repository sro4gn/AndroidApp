package com.example.savannaholson.androidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import android.content.Intent;
import java.util.ArrayList;

public class BucketListActivity extends AppCompatActivity {

    private ArrayList<BucketItem> bucketList = new ArrayList<>();
    private RecyclerView rvBucketList;
    private BucketListAdapter adapter;
    private FloatingActionButton addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucket_list);

        rvBucketList = findViewById(R.id.rv_bucket_list);
        bucketList = BucketItem.createInitialBucketList();
        BucketListAdapter adapter = new BucketListAdapter(this, bucketList);
        rvBucketList.setAdapter(adapter);
        rvBucketList.setLayoutManager(new LinearLayoutManager(this));

        addButton = findViewById(R.id.add_button);
        }

        public void onButtonClicked(View view) {
        Intent intent = new Intent(this, AddItemActivity.class);
        startActivity(intent);
        }
    }

