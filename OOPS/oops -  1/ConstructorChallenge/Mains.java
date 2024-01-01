//So for this challenge, you'll want to:
// Create a new class, called Customer, with three fields:
// name
// credit limit
// email address.
// Create the getter methods only, for each field.  You don't need to create the setters.

// Create three constructors for this class:
// First, create a constructor for all three fields which should assign the arguments directly to the instance fields.
// Second, create a no args constructor that calls another constructor, passing some literal values for each argument.
// And lastly, create a constructor with just the name and email parameters, which also calls another constructor.

public class Mains {

    public static void main(String[] args) {

        Customer customer = new Customer("Anmol", 1000,
                "anmol@email.com");
        System.out.println(customer.getName()); // Anmol
        System.out.println(customer.getCreditLimit()); // 1000.0
        System.out.println(customer.getEmail()); // anmol@email.com

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName()); // Nobody
        System.out.println(secondCustomer.getCreditLimit()); // 1000.0
        System.out.println(secondCustomer.getEmail()); // nobody@nowhere.com

        Customer thirdCustomer = new Customer("Joe", "joe@email.com");
        System.out.println(thirdCustomer.getName()); // Joe
        System.out.println(thirdCustomer.getCreditLimit()); // 1000.0
        System.out.println(thirdCustomer.getEmail()); // joe@email.com
    }
}
