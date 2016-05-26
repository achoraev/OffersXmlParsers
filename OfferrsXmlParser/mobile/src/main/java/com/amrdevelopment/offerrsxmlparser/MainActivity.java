package com.amrdevelopment.offerrsxmlparser;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.amrdevelopment.parse.*;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Parse.enableLocalDatastore(this);
        ParseObject.registerSubclass(ParseMainOffer.class);
        ParseObject.registerSubclass(ParseContact.class);
        ParseObject.registerSubclass(ParseMerchant.class);
        ParseObject.registerSubclass(ParsePicture.class);
        ParseObject.registerSubclass(ParsePlace.class);
        ParseObject.registerSubclass(ParsePlace.class);
        ParseObject.registerSubclass(ParseValidation.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("i22R4Pu2LfoJfxCsBZcAseFwVrcFLcv28cSELAF2")
                .server("https://gepioferta.azurewebsites.net/parse/")
                .enableLocalDataStore()
                .build()
        );

        ParseInstallation.getCurrentInstallation().saveEventually();

        ParseMainOffer current = new ParseMainOffer();
        current.setId(123456);
        current.setCities("Cities");
        current.setCategories("Categories");
        current.setTitle("Title");
        current.setDescription("Desc");
        current.setTerms("Terms");
//        current.setPrice(price);
        current.setSold(150);
//        current.setValidation(valid);
        current.setLink("Link");
//        current.setPictures(pics);
//        current.setMerchants(currentMerc);
        current.setPriority(100);
        current.setRpvlt(10);
        current.setRpv24(24);
        current.saveInBackground();

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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
