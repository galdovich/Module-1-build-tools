package com.galdovich.util;

import org.apache.commons.lang3.math.NumberUtils;
import util.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str) {
        return Arrays.stream(str)
                .filter(num -> NumberUtils.isDigits(num))
                .filter(num -> StringUtils.isPositiveNumber(num))
                .collect(Collectors.toList()).toArray().length == str.length;
    }
}
