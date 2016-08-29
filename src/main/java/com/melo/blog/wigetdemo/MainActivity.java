package com.melo.blog.wigetdemo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Toolbar.OnMenuItemClickListener {

    private Toolbar toolbar;
    private DrawerLayout drawerlayout;
    private LinearLayout mNavigationDrawer;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initListener();
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        initData();
    }

    private void initView() {
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.menu_main);
        drawerlayout = (DrawerLayout) findViewById(R.id.drawerlayout);
        mNavigationDrawer = (LinearLayout) findViewById(R.id.navigation_drawer);
        mToggle = new ActionBarDrawerToggle(this,drawerlayout,toolbar, R.string.open,R.string.close);
    }

    private void initData() {
        mToggle.syncState();
    }

    private void initListener() {
        toolbar.setOnMenuItemClickListener(this);
    }


    @Override
    public boolean onMenuItemClick(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_settings:
                Toast.makeText(this, getResources().getString(R.string.action_settings), Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_about:
                Toast.makeText(this, getResources().getString(R.string.action_about), Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_collect:
                Toast.makeText(this, getResources().getString(R.string.action_collect), Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_like:
                Toast.makeText(this, getResources().getString(R.string.action_like), Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_share:
                Toast.makeText(this, getResources().getString(R.string.action_share), Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }
}
