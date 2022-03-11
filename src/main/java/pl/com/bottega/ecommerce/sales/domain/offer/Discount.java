package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {
    private String cause;
    private Money value;

    public Discount(String cause, BigDecimal amount, String currency) {
        this.cause = cause;
        this.value = new Money(amount, currency);
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public Money getValue() {
        return value;
    }

    public void setValue(BigDecimal amount, String currency) {
        this.value.amount = amount;
        this.value.currency = currency;
    }
}
