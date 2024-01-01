// //Create a new class for a bank account.
// Create fields for account characteristics like:
// account number
// account balance
// customer name
// email
// phone number

// Create getters and setters for each field.
// Create two additional methods:
// one for depositing funds into the account
// one for withdrawing funds from the account

// A customer should not be allowed to withdraw funds, if that withdrawal takes their balance negative.
// Create a new project called ClassesChallenge, with the usual Main class with the usual main method.   
// You'll create an instance of an Account class, and then test your withdraw and deposit methods. 
// You'll print information to the console, that confirms what the balance is after the methods are called.

// You want to make this class encapsulated, so you'll make all your attributes private, and set up getter and setter methods for your attributes.
// In addition, you'll have two behavioral methods, for depositing funds, and withdrawing funds.
// In addition to this class, you'll set up a Main class, with a main method, that creates at least one instance of the Bank Account class, and simulates depositing and withdrawing money from the account.
public class Main4 {

    public static void main(String[] args) {

        Account bobsAccount = new Account();

        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(1000.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmail("myemail@bob.com");
        bobsAccount.setCustomerPhone("(087) 123-4567");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);
    }

}
