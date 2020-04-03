package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(@NonNull Context context, @NonNull List<Word> words) {
        super(context, 0, (List<Word>) words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        // Check if the existing view is being reused, otherwise inflate the view

        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        // Get the current position of the word
        Word currentWord = getItem(position);

        // Find the default word translation TextView and set the word from the
        // current position in the ArrayList to the TextView

        TextView defaultWord = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultWord.setText(currentWord.getDefaultTranslation());

        // Find the miwork word translation TextView and set the word from the
        // current position in the ArrayList to the TextView

        TextView miworkWord = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miworkWord.setText(currentWord.getMiworkTranslation());


        return listItemView;
    }
}
