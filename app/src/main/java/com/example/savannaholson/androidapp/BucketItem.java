package com.example.savannaholson.androidapp;

import java.util.ArrayList;

public class BucketItem {
    private String title;
    private String date;

    public BucketItem(String title1, String date1) {
        title = title1;
        date = date1;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public static ArrayList<BucketItem> createInitialBucketList() {
        ArrayList<BucketItem> bucketList = new ArrayList<BucketItem>();

        BucketItem bi = new BucketItem("Finish this App", "09/19/2018");
        bucketList.add(bi);

        BucketItem bi2 = new BucketItem("???", "09/20/2018");
        bucketList.add(bi2);

        BucketItem bi3 = new BucketItem("Profit", "09/21/2018");
        bucketList.add(bi3);

        return bucketList;
    }
    }
