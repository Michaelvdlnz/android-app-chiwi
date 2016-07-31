package co.nz.chiwicatering.chiwicatering;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;

import nz.co.chiwicatering.chiwicatering.R;


public class select_food extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_food);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_select_food, menu);
        return true;
    }

    /*Called when the user clicks the paella text*/
    public void click_paella(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Paella.class);

        startActivity(intent);


        }


    public void click_mussels(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, mussels.class);

        startActivity(intent);

    }
    public void click_pasta(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, pasta.class);

        startActivity(intent);

    }
    public void click_soup(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, soup.class);

        startActivity(intent);

    }
    public void click_pies(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, pies.class);

        startActivity(intent);

    }
    public void click_special(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, special.class);

        startActivity(intent);

    }
}
