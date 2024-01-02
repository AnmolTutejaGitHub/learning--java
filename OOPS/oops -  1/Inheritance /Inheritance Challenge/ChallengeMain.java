// Your challenge is to create the Worker class, the Employee class, and either the SalariedEmployee, or the HourlyEmployee class. 
// For each class, create the attributes and methods shown on this diagram.
// Create a main method that will create either a SalariedEmployee or HourlyEmployee, and call the methods, getAge, collectPay, 
//and the method shown for the specific type of class you decide to implement.

// For Employee class, we have specific Employee attributes, employeeId, and hireDate.
// For simplicity's sake, we haven't included any methods specific to an Employee

// build a more specific type of Employee, one that's Salaried, or one that's Hourly.
// A salaried employee, is paid based on some percentage of his or her salary. 
// It this person is retired, then the salary may be 100 percent, but it is generally reduced somewhat.
// An hourly employee, is paid by the hours worked, and the hourly rate they agreed to work for.
// An hourly employee may also get double pay, if they work over a certain amount of hours.

public class ChallengeMain {
    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985",
                "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990",
                "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970",
                "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }

    // output :
    // Employee{employeeId=1, hireDate='01/01/2020'} Worker{name='Tim',
    // birthDate='11/11/1985', endDate='null'}
    // Age = 40
    // Pay = 0.0
    // Employee{employeeId=2, hireDate='03/03/2020'} Worker{name='Joe',
    // birthDate='11/11/1990', endDate='null'}
    // Joe's Paycheck = $1346.0
    // Joe's Pension check = $1211.0
    // Employee{employeeId=3, hireDate='03/03/2021'} Worker{name='Mary',
    // birthDate='05/05/1970', endDate='null'}
    // Mary's Paycheck = $600.0
    // Mary's Holiday Pay = $1200.0
}
