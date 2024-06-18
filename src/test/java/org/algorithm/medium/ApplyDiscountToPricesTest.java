package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplyDiscountToPricesTest {

    @Test
    void discountPrices() {
        ApplyDiscountToPrices applyDiscountToPrices = new ApplyDiscountToPrices();
        String sentence = "1 2 $3 4 $5 $6 7 8$ $9 $10$";
        int discount = 100;
        String res = applyDiscountToPrices.discountPrices(sentence, discount);
        assertEquals("1 2 $0.00 4 $0.00 $0.00 7 8$ $0.00 $10$", res);
    }
}