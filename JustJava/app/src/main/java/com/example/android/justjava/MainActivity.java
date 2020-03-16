package com.example.android.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
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
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.order_for, customerName));
        sendIntent.putExtra(Intent.EXTRA_TEXT, createOrderSummary(price, hasWhippedCream, hasChocolate, customerName));
        sendIntent.setType("text/plain");

        if (sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(sendIntent);
        }
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

        String summaryMessage = getString(R.string.order_summary_name) + "\n" + addCustomerName;
                summaryMessage += "\n" + getString(R.string.add_whipped_cream) + " " + addWhippedCream;
                summaryMessage += "\n" + getString(R.string.add_chocolate) + " " + addChocolate;
                summaryMessage += "\n" + getString(R.string.quantity) + " " + quantity;
                summaryMessage += "\n" + getString(R.string.total) + " " + price;
                summaryMessage += "\n" + getString(R.string.thank_you);
        return summaryMessage;

    }

    /**
     * Increase quantity by 1
     *
     * @param view
     */
    public void increment(View view) {
        if (quantity >= 100) {
            Toast.makeText(this, getString(R.string.upper_limit_warning),
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
            Toast.makeText(this, getString(R.string.lower_limit_warning),
                    Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity - 1;
        displayQuantity(quantity);
    }
}
