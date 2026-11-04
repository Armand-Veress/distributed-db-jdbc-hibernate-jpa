package ro.unitbv.student.bdd.expenses.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Expense {
    private Long expenseId;

    private String description;

    private BigDecimal amount;

    private LocalDate date;

    private Category category;

    public Expense() {}

    public Expense(String description, BigDecimal amount, LocalDate date, Category category) {
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public Long getExpenseId() {
        return expenseId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public Category getCategory() {
        return category;
    }

    public void setExpenseId(Long expenseId) {
        this.expenseId = expenseId;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "expenseId=" + expenseId +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                ", category=" + category +
                '}';
    }
}
