package com.example.savannaholson.androidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class AddItemActivity extends AppCompatActivity {

    private EditText addTitle;
    private EditText addDesc;
    private EditText addLat;
    private EditText addLong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        addTitle = findViewById(R.id.add_title);
        addDesc = findViewById(R.id.add_desc);
        addLat = findViewById(R.id.add_lat);
        addLong = findViewById(R.id.add_long);

    }

    public void onBackButtonClicked(View view) {
        addTitle.setText("");
        addDesc.setText("");
        addLat.setText("");
        addLong.setText("");

        super.finish();
    }

    public void onSaveButtonClicked(View view) {

    }
}
