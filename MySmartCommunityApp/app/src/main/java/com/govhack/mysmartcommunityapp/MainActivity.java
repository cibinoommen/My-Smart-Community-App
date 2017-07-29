package com.govhack.mysmartcommunityapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.govhack.mysmartcommunityapp.adapter.SlidingAdapter;
import com.govhack.mysmartcommunityapp.adapter.ViewPagerAdapter;
import com.govhack.mysmartcommunityapp.fragments.BusinessEnablers;
import com.govhack.mysmartcommunityapp.fragments.HomeFragment;
import com.govhack.mysmartcommunityapp.fragments.IdeaPlatform;
import com.govhack.mysmartcommunityapp.fragments.VolunteerPlatform;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getResources().getString(R.string.app_name));
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupViewPager(viewPager);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new HomeFragment(), "Home");
        adapter.addFrag(new IdeaPlatform(), "Ideas");
        adapter.addFrag(new VolunteerPlatform(), "Volunteers");
        adapter.addFrag(new BusinessEnablers(), "Business Enablers");
        adapter.addFrag(new IdeaPlatform(), "Idea Platform");
        adapter.addFrag(new VolunteerPlatform(), "Volunteer Platform");
        adapter.addFrag(new BusinessEnablers(), "Business Enablers");
        adapter.addFrag(new IdeaPlatform(), "Idea Platform");
        adapter.addFrag(new VolunteerPlatform(), "Volunteer Platform");
        adapter.addFrag(new BusinessEnablers(), "Business Enablers");
        adapter.addFrag(new IdeaPlatform(), "Idea Platform");
        adapter.addFrag(new VolunteerPlatform(), "Volunteer Platform");
        adapter.addFrag(new BusinessEnablers(), "Business Enablers");
        viewPager.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.home) {
            // Handle the camera action
        }
        else if (id == R.id.idea_platform) {
            // Handle the camera action
        } else if (id == R.id.voln_platform) {

        } else if (id == R.id.bus_enablers) {

        } else if (id == R.id.infra_logistics) {

        } else if (id == R.id.active_wellbeing) {

        } else if (id == R.id.safety_security) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
