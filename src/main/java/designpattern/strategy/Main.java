package designpattern.strategy;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Discount di = new KishDiscount();
        Discount discount = new Discount() {
            @Override
            public void pay(BigDecimal value) {
                //TODO
            }
        };

        Discount discount1 = ((BigDecimal a)-> a.multiply(BigDecimal.valueOf(1000)));
    }
}
