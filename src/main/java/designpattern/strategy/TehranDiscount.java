package designpattern.strategy;

import java.math.BigDecimal;

public class TehranDiscount implements Discount {
    @Override
    public void pay(BigDecimal value) {
        BigDecimal amount =value.multiply(BigDecimal.valueOf(2000));
    }
}
