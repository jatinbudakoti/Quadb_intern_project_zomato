package com.jatin.quadb_intern_test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();
        Fragment orderFragment = new OrderFragment();
        fm.beginTransaction()
                .replace(R.id.my_container, orderFragment)
                .commit();
        bottomNavigationView = findViewById(R.id.bottom_tab_navigator);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment goOutFragment = new GoOutFragment();
                Bundle extras = new Bundle();

                switch (item.getItemId()){
                    case R.id.order_tab:
                        Fragment orderFragment = new OrderFragment();
                        fm.beginTransaction()
                                .replace(R.id.my_container, orderFragment)
                                .commit();
                        break;

                    case R.id.go_out_tab:
                        extras.putString("fragmentName", "Go Out");
                        goOutFragment.setArguments(extras);
                        fm.beginTransaction()
                                .replace(R.id.my_container, goOutFragment)
                                .commit();
                        break;

                    case R.id.pro_tab:
                        extras.putString("fragmentName", "Pro");
                        goOutFragment.setArguments(extras);
                        fm.beginTransaction()
                                .replace(R.id.my_container, goOutFragment)
                                .commit();
                        break;

                    case R.id.explore_tab:
                        extras.putString("fragmentName", "Explore");
                        goOutFragment.setArguments(extras);
                        fm.beginTransaction()
                                .replace(R.id.my_container, goOutFragment)
                                .commit();
                        break;

                    case R.id.profile_tab:
                        extras.putString("fragmentName", "Profile");
                        goOutFragment.setArguments(extras);
                        fm.beginTransaction()
                                .replace(R.id.my_container, goOutFragment)
                                .commit();
                        break;

                }
                return true;
            }
        });

    }
}
