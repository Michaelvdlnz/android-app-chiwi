package co.nz.chiwicatering.chiwicatering;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import nz.co.chiwicatering.chiwicatering.R;


public class OrderingActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordering);
    }
    /** Called when the user clicks the Send button */
    public void StartOrder(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, select_food.class);
        startActivity(intent);
    }


}
