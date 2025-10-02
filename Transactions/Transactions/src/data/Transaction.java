package data;

import java.math.BigDecimal;

public class Transaction {
    private final String textTransaction;
    private final TypeTransaction typeTransaction;
    private final BigDecimal valueTransaction;
    private final String dateTransaction;

    public Transaction(String transaction) {
        this.textTransaction = returnTextTransaction(transaction);
        this.typeTransaction = returnTypeTransaction(transaction);
        this.valueTransaction = returnValueTransaction(transaction);
        this.dateTransaction = returnDateTransaction(transaction);
    }

    private String returnTextTransaction(String transaction) {
        return transaction.split("; ")[0];
    }

    private BigDecimal returnValueTransaction(String transaction) {
        return new BigDecimal(transaction.split("; ")[1]);
    }

    private TypeTransaction returnTypeTransaction(String transaction) {
        return TypeTransaction.valueOf(transaction.split("; ")[2]);
    }

    private String returnDateTransaction(String transaction) {
        return transaction.split("; ")[3];
    }

    public TypeTransaction getTypeTransaction() {
        return typeTransaction;
    }

    public BigDecimal getValueTransaction() {
        return valueTransaction;
    }

    public String getTextTransaction() {
        return textTransaction;
    }

    public String getDateTransaction() {
        return dateTransaction;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "textTransaction='" + textTransaction + '\'' +
                ", typeTransaction=" + typeTransaction +
                ", valueTransaction=" + valueTransaction +
                ", dateTransaction='" + dateTransaction + '\'' +
                '}';
    }

    private boolean isIncomeTransaction(TypeTransaction typeTransaction) {
        return typeTransaction == TypeTransaction.INCOME;
    }
}
