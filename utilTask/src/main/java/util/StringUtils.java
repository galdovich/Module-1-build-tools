package util;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (NumberUtils.isCreatable(str)) {
            double number = Double.valueOf(str);
            return number > 0;
        } else {
            return false;
        }
    }
}
