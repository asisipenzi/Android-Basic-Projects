package com.example.android.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.os.Bundle;

import java.text.NumberFormat;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 2;
    boolean mChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is pressed.
     */
    public void submitOrder(View view) {
        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();
        int price = calculatePrice();
        displayMessage(createOrderSummary(price, hasWhippedCream));
    }

    /**
     * calculates the price of the order
     *
     * @return price
     */
    private int calculatePrice() {
        return quantity * 5;
    }


    /**
     * This method displays the given quantity value on the screen.
     *
     * @param number
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * @param price of the order
     * @param addWhippedCream is whether or not the user wants whipped cream topping
     * @return Order summary
     */
    private String createOrderSummary(int price, boolean addWhippedCream) {
        String summaryMessage = "Name: Andrew Sisipenzi" +"\nAdd Whipped Cream? " + addWhippedCream
                +"\nQuantity: " + quantity + "\nTotal: $" + price + "\nThank you!";
        return summaryMessage;

    }

    /**
     * Display message passed to the method via a TextView
     *
     * @param message
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

    /**
     * Increase quantity by 1
     *
     * @param view
     */
    public void increment(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * Decrease quantity by 1
     *
     * @param view
     */
    public void decrement(View view) {
        quantity = quantity - 1;
        displayQuantity(quantity);
    }
}
