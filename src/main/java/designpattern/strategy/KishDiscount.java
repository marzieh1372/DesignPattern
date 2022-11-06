package designpattern.strategy;

import java.math.BigDecimal;

public class KishDiscount implements Discount {

    @Override
    public void pay(BigDecimal value) {
        BigDecimal amount =value.multiply(BigDecimal.valueOf(1000));
    }
}
