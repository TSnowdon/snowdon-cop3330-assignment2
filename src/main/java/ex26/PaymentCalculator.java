package ex26;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class PaymentCalculator {

    /**
     * n = number of months
     * i = the daily rate (APR divided by 365)
     * b = the balance
     * p = the monthly payment
     * <p>
     * n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
     *
     * @return The number of months until the APR is paid off.
     */
    public static long calculateMonthsUntilPaidOff(double i, double b, double p) {
        i /= (100 * 365);
        b = centRound(b);
        p = centRound(p);

        double x = -(1f / 30f);
        double y = Math.pow(1 + i, 30);
        double z = Math.log(1 + b / p * (1 - y));
        double aa = Math.log(1 + i);

        return Math.round(Math.ceil(x * z / aa));
    }

    /**
     * Rounds to the nearest 100th's place (or 2 decimal places)
     *
     * @param value the raw double value
     * @return the rounded double value
     */
    public static double centRound(double value) {
        BigDecimal decimal = new BigDecimal(Double.toString(value));
        decimal = decimal.setScale(2, RoundingMode.HALF_UP);
        return decimal.doubleValue();
    }
}
