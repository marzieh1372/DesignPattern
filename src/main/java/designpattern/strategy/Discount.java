package designpattern.strategy;

import java.math.BigDecimal;

public interface Discount {

    void pay(BigDecimal value);
}
