package co.nz.chiwicatering.chiwicatering;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;

import nz.co.chiwicatering.chiwicatering.R;


public class special extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_special, menu);
        return true;
    }


}
