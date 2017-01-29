package com.romelapj.coordinatormasterexamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //App bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar_main);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Coordinator Master Layout");
    }

    public void showCoordinatorLayout(View view) {
        startActivity(new Intent(MainActivity.this, SimpleCoordinatorLayoutActivity.class));
    }
}
