package com.galdovich.api;

import com.galdovich.util.Utils;

public class Api {
    public static void main(String[] args) {
        System.out.println("Are all numbers even? (-2, 6, 7, 2, 3): " +
                Utils.isAllPositiveNumbers("-2", "6", "7", "2", "3"));
    }
}
