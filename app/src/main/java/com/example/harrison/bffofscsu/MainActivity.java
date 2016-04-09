package com.example.harrison.bffofscsu;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        switch (id){
            case R.id.office_hour:
                Toast.makeText(this,"Touched office hour",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),OfficeHourActivity.class);
                intent.putExtra("key",1);
                startActivity(intent);
                return true;
            case R.id.free_resource:
                Toast.makeText(this,"Touched free resource",Toast.LENGTH_LONG).show();
                return true;
            case R.id.event_news:
                Toast.makeText(this,"Touched event news",Toast.LENGTH_LONG).show();
                return true;
            case R.id.me:
                Toast.makeText(this,"Touched profile",Toast.LENGTH_LONG).show();
                return true;
            case R.id.search:
                Toast.makeText(this,"Touched search",Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_settings:
                Toast.makeText(this,"Touched setting",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}
