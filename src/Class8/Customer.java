package Class8;



public class Customer extends Account implements BankGuidelines {

    String firstName;
    String lastName;
    String ssn;
    String accType;
    int customerAccNum;
    int accNum = 1000;
    // I can make accNum -> static if I want to share this variable with new accounts.
    // Every account newly created will take the previous accNum, increment it by one and assign to itself.
    double balance;
    double amount;
    int[] subAccounts;


    public Customer(String firstName, String lastName, String ssn, String accType, double amount) {
        if (accType == "Checking" || accType == "Saving" && amount >= 1000) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.ssn = ssn;
            this.accType = accType;
            this.customerAccNum = ++accNum;
            this.amount = amount;
            this.balance = 1000;
            // as a customer's initial amount deposited while opening an account should be >=$1000
            // I assigned $1000 to his/her balance as a starting point
            System.out.println(firstName + " " + lastName + "," + " welcome to " + "'The Bank'!");
        } else {
            System.out.println("Invalid data provided");
        }
    }


    @Override
    public double makeDeposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Invalid amount to deposit " + amount);
        }
        return balance;
    }


    @Override
    public double makeWithdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Invalid amount to withdraw " + amount);
        }
        return balance;
    }


    @Override
    public void miniStatement() {
        System.out.println("Name: " + firstName + " " + lastName + "\nSSN " + ssn +
                "\nAccount Number " + customerAccNum + "\nBalance " + balance);
    }

    @Override
    public void openNewAccount(String accType, double amount) {
        int[] subAccounts = new int[4];
        for (int i = 0; i < subAccounts.length; i++) {
            if (accType == "Checking" || accType == "Saving" && amount >= 1000) {
                this.accType = accType;
                this.amount = amount;
                System.out.println(customerAccNum + balance);
            } else {
                System.out.println("Invalid data provided");
            }

        }
    }
}







