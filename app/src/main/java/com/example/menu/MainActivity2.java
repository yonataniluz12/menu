package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MainActivity2 extends AppCompatActivity {
    ConstraintLayout Cl;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Cl = findViewById(R.id.CL);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,400,"Green");
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
        String str = menuItem.getTitle().toString();
        int id = menuItem.getItemId();
        switch (id){
            case R.id.Black:
                Cl.setBackgroundColor(Color.BLACK);
                break;
            case R.id.Red:
                Cl.setBackgroundColor(Color.RED);
                break;
            case R.id.Blue:
                Cl.setBackgroundColor(Color.BLUE);
                break;
        }
        if(str.equals("Green"))
            {
                Cl.setBackgroundColor(Color.GREEN);
            }
        return true;
    }

    public void go(View view) {
        finish();
    }
}