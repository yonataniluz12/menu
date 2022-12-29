package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {
    /**
     * The Cl.
     */
    ConstraintLayout Cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cl = findViewById(R.id.CL);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
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
        return true;
    }

    /**
     * Go.
     *
     * @param view the view
     */
    public void go(View view) {
        Intent si = new Intent(this,MainActivity2.class);
        startActivity(si);
    }
}