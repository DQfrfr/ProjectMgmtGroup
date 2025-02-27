package BudgetTracker.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Transaction {
    private int transactionID;
    private byte userID;
    private double amount;
    private String category;
    private int date;
    private TRANSACTION_TYPE transactionType;

    public int getTransactionID() {
        return transactionID;
    }

    private void setTransactionID() {
        Random random = new Random();
        this.transactionID = random.nextInt(2147483647);
    }

    public byte getUserID() {
        return userID;
    }

    private void setUserID(byte userID) {
        this.userID = userID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getDate() {
        return date;
    }

    public String getTransactionType() {
        return transactionType.toString();
    }

    private void setTransactionType(double amount) {
        if (amount < 0) {
            this.transactionType = TRANSACTION_TYPE.WITHDRAWL;
        } else {
            this.transactionType = TRANSACTION_TYPE.DEPOSIT;
        }
    }

    public Transaction(int userID, double amount, String category) {
        userID = userID;
        this.amount = amount;
        this.category = category;
        date = Calendar.getInstance().get(Calendar.DATE);
        setTransactionType(amount);
        setTransactionID();
    }

    public String toString() {
        return "Transaction [transactionID=" + transactionID + ", userID=" + userID
    }
}
