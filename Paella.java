package co.nz.chiwicatering.chiwicatering;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.NumberFormat;

import nz.co.chiwicatering.chiwicatering.R;


public class Paella extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paella);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_paella, menu);
        return true;
    }
    
    
    
    int quantity = 0;
    int priceOfChickenPaella = 10;
    int chorizoAdding = 3;

    public void increment(View view){
        quantity = quantity +1;
        display(quantity);
        displayPrice(quantity * priceOfChickenPaella);
        boolean checked = checkboxChorizoOnClick.isChecked();
    }
    public void decrement(View view){
        quantity= quantity -1;
        display(quantity);
        displayPrice(quantity * priceOfChickenPaella );
    }
    public void checkboxChorizoOnClick(View view){
        CheckBox chorizotopping = (CheckBox) findViewById(R.id.checkboxChorizo);
        boolean checked = ((CheckBox)view).isChecked();
        switch(view.getId()){
            case R.id.checkboxChorizo:
                if (checked)
                    displayPrice(quantity * priceOfChickenPaella + calculateAddChorizo());
                else
                    displayPrice(quantity * priceOfChickenPaella);
                break;
        }
    }
    public void addItToMyOrder (View view){
        int price = calculatePrice()+ calculateAddChorizo();
        String  priceMessage = createOrderSummary(price);
        displayMessage (priceMessage);
    }

    private int calculatePrice(){
        return quantity * priceOfChickenPaella ;
    }
    private int calculateAddChorizo(){
        return quantity * chorizoAdding;
    }

    private String createOrderSummary(int price){
        String  priceMessage = "Name : Michael";
        priceMessage = priceMessage + "\nQuantity " + quantity + " Chicken Paella";
        priceMessage = priceMessage + "\nadd"+ quantity + "Chorizo" ;
        priceMessage = priceMessage + "\nTotal: $ " + price;
        return priceMessage;

    }


    private void display(int number) {
        TextView quantityTextView1 = (TextView) findViewById(R.id.quantity_text_view1);
        quantityTextView1.setText("" + number);
    }
    private void displayPrice (int number){
        TextView priceTextView = (TextView) findViewById(R.id.priceTextView);
        priceTextView.setText((NumberFormat.getCurrencyInstance().format(number)));
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextViewFinal = (TextView) findViewById(R.id.priceTextView);
        priceTextViewFinal.setText(message);
    }
}