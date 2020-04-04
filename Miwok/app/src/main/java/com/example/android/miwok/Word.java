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

    /** Image for the word translation **/
    private int mImageResourceId;

    /**
     *
     * @param defaultTranslation
     * @param miworkTranslation
     */
    public Word(String defaultTranslation, String miworkTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;
    }

    /**
     *
     * @param defaultTranslation
     * @param miworkTranslation
     * @param imageResourceId
     */
    public Word(String defaultTranslation, String miworkTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;
        mImageResourceId = imageResourceId;
    }
    /**
     * Return the Default translation of the word
     *
     * @return mDefaultTranslation
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }



    /**
     * Return the Miwok translation of the word
     *
     * @return mMiworkTranslation
     */
    public String getMiworkTranslation() {
        return mMiworkTranslation;
    }

    /**
     * Return the imageReasource from the drawable folder
     *
     * @return mImageResource
     */
    public int getImageResource() {
        return mImageResourceId;
    }
}
