package co.nz.chiwicatering.chiwicatering;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;

import nz.co.chiwicatering.chiwicatering.R;

/**
 * Created by Michael on 11/04/2016.
 */
public class mussels extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mussels);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mussels, menu);
        return true;
    }
}
