package com.example.android.justjava;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    public int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        int price= calculatePrice(quantity,5);
        String priceMessage = createOrderSummary(price);
        displayMessage(priceMessage);

    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method increases the value
     */
    public void increment(View view){
        quantity = quantity + 1;
        displayQuantity(quantity);

    }
    /**
     * This method decreases the value
     */
    public void decrement(View view){
        quantity = quantity - 1;
        displayQuantity(quantity);
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

    /**
     * This methods calculates price
     * @param quantity
     * @param priceOfCoffee
     * @return
     */
    private int calculatePrice(int quantity, int priceOfCoffee){
        return quantity*priceOfCoffee;

    }
    /**
     * This is a order summary method
     * @return
     * @param num
     */
    private String createOrderSummary(int num){
        return ("Name:"+"Saurya Paudel" + "\nQuantity:"+ quantity + "\nTotal: $"+ num + "\nThank you!");
    }
}

