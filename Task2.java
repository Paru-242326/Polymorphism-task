abstract class Payment {
    abstract void processPayment();
}

class CreditCard extends Payment {
    void processPayment() { System.out.println("Processing credit card payment."); }
}

class PayPal extends Payment {
    void processPayment() { System.out.println("Processing PayPal payment."); }
}

class BankTransfer extends Payment {
    void processPayment() { System.out.println("Processing bank transfer payment."); }
}

public class Task2 {
    public static void main(String[] args) {
        Payment[] payments = { new CreditCard(), new PayPal(), new BankTransfer() };
        for (Payment p : payments) {
            p.processPayment();
        }
    }
}
