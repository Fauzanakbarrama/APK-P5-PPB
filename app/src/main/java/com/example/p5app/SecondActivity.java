package com.example.p5app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("LifeCycleMain","onCreate dimulai");

        // TabLayout
        TabLayout tabLayout = findViewById(R.id.layout_tab);
        tabLayout.addTab(tabLayout.newTab().setText("Pengertian"));
        tabLayout.addTab(tabLayout.newTab().setText("Ciri-ciri"));
        tabLayout.addTab(tabLayout.newTab().setText("Tujuan"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //ViewPager and PagerAdapter
        ViewPager viewPager = findViewById(R.id.view_pager1);
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    // OptionMenu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_setting) {
            Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.action_search) {
            Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.action_helps) {
            Toast.makeText(this, "Helps", Toast.LENGTH_SHORT).show();
        }
        return true;
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
}