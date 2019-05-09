package com.example.android.examplefragmentsviewpager;

public class Item {
    /**
     * Left item
     */
    private String mLeftItem;
    /**
     * Right item
     */
    private String mRightItem;

    /**
     * Create a new Item object.
     *
     * @param leftItem
     * @param rightItem
     */
    public Item(String leftItem, String rightItem) {
        mLeftItem = leftItem;
        mRightItem = rightItem;
    }

    /**
     * Get the leftItem
     */
    public String getLeftItem() {
        return mLeftItem;
    }

    /**
     * Get the rightItem
     */
    public String getRightItem() {
        return mRightItem;
    }

}

