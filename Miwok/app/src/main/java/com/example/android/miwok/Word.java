package com.example.android.miwok;

/**
 * (@link Word) represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    /** Default translation for the word **/
    private String mDefaultTranslation;

    /** Default translation for the word **/
    private String mMiworkTranslation;

    public Word(String defaultTranslation, String miworkTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;
    }

    /**
     * Get the Default translation of the word
     *
     * @return mDefaultTranslation
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word
     *
     * @return mMiworkTranslation
     */
    public String getMiworkTranslation() {
        return mMiworkTranslation;
    }
}
