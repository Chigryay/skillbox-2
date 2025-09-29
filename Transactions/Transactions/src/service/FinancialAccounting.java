package service;

import data.Transaction;

import java.util.ArrayDeque;
import java.util.Deque;

public class FinancialAccounting {

    private final Deque<Transaction> transactions;

    public FinancialAccounting() {
        transactions = new ArrayDeque<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.addFirst(transaction);
        System.out.println("Транзакция добавлена " + transaction);
    }

    public Transaction removeTransaction() {
        System.out.println("Транзакция удалена");
        return transactions.removeLast();
    }

    public void printTransactions() {
        transactions.forEach(System.out::println);
    }

}
