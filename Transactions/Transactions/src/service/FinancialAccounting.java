package service;

import data.Transaction;
import data.TypeTransaction;

import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.Deque;

public class FinancialAccounting {

    private static final Deque<Transaction> transactions = new ArrayDeque<>(5);
    private BigDecimal total = new BigDecimal(0);
    private BigDecimal income = new BigDecimal(0);
    private BigDecimal expensive = new BigDecimal(0);

    public void addTransaction(Transaction transaction) {
        transactions.addFirst(transaction);
        calculateTransactions(transaction, transaction.getTypeTransaction());
        System.out.println("Транзакция добавлена " + transaction);
    }

    public void printTransactions() {
        transactions.forEach(System.out::println);
    }

    Deque<Transaction> getTransactions() {
        return transactions;
    }

    private void calculateTransactions(Transaction transaction, TypeTransaction typeTransaction) {
        BigDecimal valueTransaction = transaction.getValueTransaction();
        switch (typeTransaction) {
            case INCOME -> {
                    income = income.add(valueTransaction);
                    total = total.add(income);
            }
            case EXPENSE -> {
                    expensive = expensive.subtract(valueTransaction);
                    total = total.subtract(expensive);
            }
        }
    }

    public BigDecimal getTotal() {
        return total;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public BigDecimal getExpensive() {
        return expensive;
    }

}
