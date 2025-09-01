package com.example.orders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
    private final String id;
    private final String customerEmail;
    private final List<OrderLine> lines;
    private final Integer discountPercent;
    private final boolean expedited;
    private final String notes;

    private Order(Builder b) {
        this.id = b.id;
        this.customerEmail = b.customerEmail;
        this.discountPercent = b.discountPercent;
        this.expedited = b.expedited;
        this.notes = b.notes;

        List<OrderLine> copy = new ArrayList<>();
        for (OrderLine l : b.lines) {
            copy.add(new OrderLine(l.getSku(), l.getQuantity(), l.getUnitPriceCents()));
        }
        this.lines = Collections.unmodifiableList(copy);
    }

    public String getId() { return id; }
    public String getCustomerEmail() { return customerEmail; }
    public List<OrderLine> getLines() { return lines; }
    public Integer getDiscountPercent() { return discountPercent; }
    public boolean isExpedited() { return expedited; }
    public String getNotes() { return notes; }

    public int totalBeforeDiscount() {
        int sum = 0;
        for (OrderLine l : lines) sum += l.getQuantity() * l.getUnitPriceCents();
        return sum;
    }

    public int totalAfterDiscount() {
        int base = totalBeforeDiscount();
        if (discountPercent == null) return base;
        return base - (base * discountPercent / 100);
    }

    public static class Builder {
        private final String id;
        private final String customerEmail;
        private final List<OrderLine> lines = new ArrayList<>();
        private Integer discountPercent;
        private boolean expedited;
        private String notes;

        public Builder(String id, String customerEmail, OrderLine firstLine) {
            this.id = id;
            this.customerEmail = customerEmail;
            if (firstLine != null) this.lines.add(firstLine);
        }

        public Builder addLine(OrderLine line) {
            if (line != null) this.lines.add(line);
            return this;
        }

        public Builder discountPercent(Integer discountPercent) {
            this.discountPercent = discountPercent;
            return this;
        }

        public Builder expedited(boolean expedited) {
            this.expedited = expedited;
            return this;
        }

        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        public Order build() {
            if (id == null || id.isEmpty()) throw new IllegalArgumentException("id required");
            if (!PricingRules.isValidEmail(customerEmail)) throw new IllegalArgumentException("invalid email");
            if (!PricingRules.isValidDiscount(discountPercent)) throw new IllegalArgumentException("discount 0..100");
            if (lines.isEmpty()) throw new IllegalArgumentException("at least one line required");
            return new Order(this);
        }
    }
}
