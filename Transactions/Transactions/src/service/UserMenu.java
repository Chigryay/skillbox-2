package service;

import data.EnumsChoice;
import data.Transaction;
import data.TypeTransaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserMenu {
    static final String REGEX;

    static {
        REGEX = "^([А-Яа-я\\s]+)\\;\\s([\\d+\\.]+)\\;\\s(INCOME|EXPENSE);" +
                "\\s(\\d{2}\\.[0|1]\\d\\.[1|2]\\d{3})$";
    }

    private final BufferedReader reader;

    public UserMenu() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void startProgram() throws IOException {
        showMenu();
        String input;
        do {
            input = reader.readLine();
            choiceUser(input);
        } while (input.equals(EnumsChoice.EXIT.toString()));
    }

    private void showMenu() {
        String menu = """
                HELP — вывести инструкцию по использованию приложения.
                REPORT — вывести отчёт о финансах.
                EXIT — вывести отчёт и завершить работу программы.
                """;

        System.out.println(menu);

        String example = "[Билет на Марс; 2499.99; EXPENSE; 24.03.2036]";

        System.out.println("""
                 Для совершения операции введите данные в консоль согласно шаблону:
                 Название; Сумма; Тип операции (EXPENSE или INCOME); Дата (dd.MM.yyyy)
                 Пример:\s
                \s""" + example);
    }

    private void choiceUser(String choice) {
        try {
            EnumsChoice enumChoice = convertToEnum(choice);
            switch (enumChoice) {
                case HELP -> System.out.println("help");
                case REPORT -> System.out.println("report");
                case EXIT -> System.out.println("Программа завершена");
                default -> System.out.println("Неверная команда");
            }
        } catch (IllegalArgumentException ex) {
            String transaction = choice;
            if (isTrueFormat(transaction)) {
                Transaction financialAccounting = new Transaction(transaction);
                String calculateFinancial = calculateTransaction(transaction);
                System.out.println(calculateFinancial);
            } else {
                System.out.println("Неверный формат транзакции");
            }
        }

    }

    private EnumsChoice convertToEnum(String choice) {
        return EnumsChoice.valueOf(choice.toUpperCase());
    }

    private TypeTransaction convertToTypeTransaction(String transaction) {
        return TypeTransaction.valueOf(transaction.toUpperCase());
    }

    private boolean isTrueFormat(String input) {
        return input.matches(REGEX);
    }

    private String calculateTransaction(String transaction) {
        StringBuilder result = new StringBuilder();
        Matcher matcher = Pattern.compile(REGEX).matcher(transaction);
        while (matcher.find()) {
            result.append(matcher.group(2))
                    .append("; ")
                    .append(matcher.group(3));
        }
        return result.toString();
    }
}
