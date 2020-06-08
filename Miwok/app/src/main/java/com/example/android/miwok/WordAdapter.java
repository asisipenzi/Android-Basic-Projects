package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    // Resource ID for the background color for the list of words
    private int mColorResourceId;

    public WordAdapter(@NonNull Context context, @NonNull List<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        // Check if the existing view is being reused, otherwise inflate the view
        if (listItemView == null)
            listItemView = LayoutInflater
                    .from(getContext())
                    .inflate(R.layout.list_item, parent, false);

        // Get the current position of the word
        Word currentWord = getItem(position);

        // Find the default word translation TextView and set the word in the
        // current position in the ArrayList to the TextView

        TextView defaultWord = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultWord.setText(currentWord.getDefaultTranslation());

        // Find the miwork word translation TextView and set the word in the
        // current position in the ArrayList to the TextView

        TextView miworkWord = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miworkWord.setText(currentWord.getMiworkTranslation());

        // Set the name color for the lsit item
        View textContainer = listItemView.findViewById(R.id.text_container);

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        // Set the background color of the container View
        textContainer.setBackgroundColor(color);
        // Find the ImageView and set the image in the
        // current position in the ArrayList to the ImageView

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_view);
        if (currentWord.hasImage()) {
            iconView.setImageResource(currentWord.getImageResource());
            iconView.setVisibility(View.VISIBLE);
        } else {
            iconView.setVisibility(View.GONE);
        }


        return listItemView;

    }


}
