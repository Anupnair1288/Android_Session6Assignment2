package com.android.anup.optionsmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView menu_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu_textview = (TextView) findViewById(R.id.menuitem);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu); //Menu Resource Menu
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                Toast.makeText(MainActivity.this, "About Selected", Toast.LENGTH_LONG).show();
                menu_textview.setText(R.string.about_selected);
                return true;
            case R.id.help:
                Toast.makeText(MainActivity.this, "Help Selected", Toast.LENGTH_LONG).show();
                menu_textview.setText(R.string.help_selected);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
