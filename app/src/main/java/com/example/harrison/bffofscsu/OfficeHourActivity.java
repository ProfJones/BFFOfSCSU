package com.example.harrison.bffofscsu;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.security.ProviderInstaller;

import java.util.ArrayList;

public class OfficeHourActivity extends AppCompatActivity {
    ListView listView;
    String[] names = {"Ramnath Sarnath \nChairperson \nProfessor","Jie H. Meichsner \ncoordinator\nProfessor","Donald O. Hamnes \nProfessor",
            "Bryant A. Julstrom \nProfessor","Mehdi Mekni \nAssistant Professor","Jayantha Herath \nProfessor","Omar Al-Azzam Assistant \nProfessor",
            "Andrew A. Anda \nAssociate Professor","Alek Tomovic Adjunct \nProfessor"};
    String[] departments = {"CSIT","CSIT","CSIT","CSIT","CSIT","CSIT","CSIT","CSIT","CSIT"};
    int[] imgs = {R.drawable.sarnath_icon,R.drawable.meichsner_icon,R.drawable.hamnes_icon,R.drawable.julstrom_icon,
            R.drawable.mekni_icon,R.drawable.herath_icon,
            R.drawable.omar_icon,R.drawable.anda_icon,R.drawable.alex_icon,};


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.office_hour_layout);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

        listView = (ListView)findViewById(R.id.list_view_office_hour);
        OHAdapter adapter = new OHAdapter(this,names,departments,imgs);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//                if(view==null){
//                    inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//                    view = inflater.inflate(R.layout.office_hour_table,null);
//                }
                Intent tableIntent = new Intent(getApplicationContext(),OHTableActivity.class);
                tableIntent.putExtra("key",position);
                startActivity(tableIntent);


                Toast.makeText(getApplicationContext(),names[position],Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "OfficeHour Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.harrison.bffofscsu/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "OfficeHour Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.harrison.bffofscsu/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }


}
