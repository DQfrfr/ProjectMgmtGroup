package BudgetTracker.models;

import java.util.Random;

public class User {
    private final int userId;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private double monthlyIncome;

    public int getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getIncome() {
        return monthlyIncome;
    }

    public void setIncome(int income) {
        this.monthlyIncome = income;
    }

    public void login() {}

    public void logout() {}

    public User(String firstName, String lastName, String password, String email, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.userId = getUserId();
        this.monthlyIncome = income;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    private int generateUserId() {
        Random random = new Random();
        int id = random.nextInt((4000 - 1000) + 1000);
        return id * 40;
    }
}
