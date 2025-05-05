public class Variables {
}
class SavingsAccount {
    void calculateInterest() {
        double principal = 5000.00;
        double rate = 5.0; // percentage
        double amount;

        System.out.println("Initial amount: " + principal);

        // Calculate amount after one year
        amount = principal * (100 + rate) / 100;
        System.out.println("Amount after 1 year: " + amount);

        // Calculate amount after two years (interest compounds)
        amount = amount * (100 + rate) / 100;
        System.out.println("Amount after 2 years: " + amount);
    }

    public static void main(String[] args) {
        (new SavingsAccount()).calculateInterest();
}
}