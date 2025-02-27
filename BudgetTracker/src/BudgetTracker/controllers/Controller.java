package BudgetTracker.controllers;

import BudgetTracker.models.CATEGORIES;

import java.util.ArrayList;

public class Controller {
    public boolean handleLogin(String username, String password) {
        return true;
    }

    public void handleLogout() {}

    public void handleRegistration(String username, String password, String email) {}

    public void addTransaction(double amount, CATEGORIES category, String description) {}

    public void editTransaction(String transactionId, double amount, CATEGORIES category, String description) {}

    public void deleteTransaction(String transactionId) {}

    public void getTransactionHistory() {}

    public void searchTransactions() {}
}
