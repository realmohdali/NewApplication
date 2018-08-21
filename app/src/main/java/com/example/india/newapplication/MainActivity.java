package com.example.india.newapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Main Feed");

        int array[] = {R.drawable.chrysanthemum, R.drawable.desert, R.drawable.hydrangeas, R.drawable.jellyfish, R.drawable.koala, R.drawable.lighthouse, R.drawable.penguins, R.drawable.tulips};

        RecyclerView recyclerView = findViewById(R.id.feed);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter = new myAdapter(array);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.upload:
                Intent intent = new Intent(this, Upload.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.logout:
                Intent intent1 = new Intent(this, Login.class);
                startActivity(intent1);
                overridePendingTransition(0, 0);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
