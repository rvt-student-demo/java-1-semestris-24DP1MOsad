package rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }

    public void eatAffordably(){
        if (balance >= 2.6) {
            balance -= 2.6;
        } 
    }

    public void eatHeartily() {
        if (balance >= 4.6) {
            balance -= 4.6;
        }
    }

    public void addMoney(double amont) {
        if (amont + balance > 150) {
            balance = 150.0;
        } else if (amont > 0) {
            balance += amont;
        }
    }
}
