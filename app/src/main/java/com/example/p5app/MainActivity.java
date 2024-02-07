package com.example.p5app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycleMain","onCreate dimulai");

        // DrawerLayout
        drawerLayout = findViewById(R.id.my_drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //DrawerLayout2
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    // LifeCycle
    @Override
    public void onStart() {
        super.onStart();
        Log.d("LifeCycleMain", "onStart dimulai");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d("LifeCycleMain", "onPause dimulai");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d("LifeCycleMain", "onResume dimulai");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d("LifeCycleMain", "onStop dimulai");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycleMain", "onDestroy dimulai");
    }

    // Intent
    public void openSecondActivity(View view) {
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }
    public void openThirdActivity(View view) {
        Intent a = new Intent(this, ThirdActivity.class);
        startActivity(a);
    }
}