package Class8;

public class Bank {

    public static void main(String[] args) {


        // CustomerObject c1 = new CustomerObject(); [name, ssn, accType, amount]
        // name can be anything, ssn can be anything


        // if:
        // accType: saving or checking
        // amount: >= 1000
        // then only: an account should be created of accType


        Customer c1 = new Customer("John","Johnson", "123456789", "Checking", 1056);
        c1.makeDeposit(78);
        c1.makeWithdrawal(7000);
        c1.miniStatement();


    }
}
