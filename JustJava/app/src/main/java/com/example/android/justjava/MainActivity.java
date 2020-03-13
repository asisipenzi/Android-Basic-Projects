package com.example.android.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;

import java.text.NumberFormat;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is pressed.
     */
    public void submitOrder(View view) {
        //Check if user wants whipped cream
        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();

        //Check if user wants chocolate
        CheckBox chocolateCheckBox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        boolean hasChocolate = chocolateCheckBox.isChecked();

        //Get user name
        EditText nameEditText = (EditText) findViewById(R.id.name_edittext);
        String customerName = nameEditText.getText().toString();

        //Calculate price for the drinks
        int price = calculatePrice(hasChocolate, hasWhippedCream);
        displayMessage(createOrderSummary(price, hasWhippedCream, hasChocolate, customerName));
    }

    /**
     * calculates the price of the order
     *
     * @param chocPrice    price of chocolate in a drink
     * @param whippedPrice price of whipped cream in a drink
     * @return price total price of the drinks ordered
     */
    private int calculatePrice(boolean chocPrice, boolean whippedPrice) {
        int total = 0;

        if (chocPrice == true) {
            total += 2;
        }

        if (whippedPrice == true) {
            total += 1;
        }
        return quantity * (5 + total);
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
     * @param price           of the order
     * @param addWhippedCream whether or not the user wants whipped cream topping
     * @param addChocolate    whether or not the user wants whipped cream topping
     * @param addCustomerName adds the customer name to the order summary
     * @return Order summary
     */
    private String createOrderSummary(int price, boolean addWhippedCream, boolean addChocolate,
                                      String addCustomerName) {
        String summaryMessage = "Name: " + addCustomerName +
                "\nAdd Whipped Cream? " + addWhippedCream +
                "\nAdd Chocolate? " + addChocolate +
                "\nQuantity: " + quantity +
                "\nTotal: $" + price +
                "\nThank you!";
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
        if (quantity >= 100) {
            Toast.makeText(this, "You cannot order more than 100 cups!",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * Decrease quantity by 1
     *
     * @param view
     */
    public void decrement(View view) {
        if (quantity < 2) {
            Toast.makeText(this, "You cannot order less than 1 cup!",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity - 1;
        displayQuantity(quantity);
    }
}
