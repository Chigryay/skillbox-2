package service;

import data.Transaction;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class FinancialAccounting {
    private final Deque<Transaction> transactions;

    public FinancialAccounting() {
        transactions = new ArrayDeque<>();
    }



}
