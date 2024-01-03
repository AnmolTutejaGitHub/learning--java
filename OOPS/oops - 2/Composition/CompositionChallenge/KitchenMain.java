//In this challenge, you need to create an application for controlling a smart kitchen.
// Your smart kitchen will have several appliances.
// Your appliances will be Internet Of Things (IoT) devices, which can be programmed.

// It's your job to write the code, to enable your Smart Kitchen application, to execute certain jobs.
// Methods on your SmartKitchen class, will determine what work needs to be done:
// addWater() will set the Coffee Maker's hasWorkToDo field to true.
// pourMilk() will set Refrigerator's hasWorkToDo to true.
// loadDishwasher() will set the hasWorkToDo flag to true, on that appliance.
// Alternately, you could have a single method, called setKitchenState, that takes three boolean values,
// which could combine the three methods above.

// To execute the work needed to be done by the appliances, you'll implement this in two ways:
// First, your application will access each appliance (by using a getter), and execute a method.
// The appliance methods are orderFood() on Refrigerator, doDishes() on DishWasher, and brewCoffee() on CoffeeMaker.  
// These methods should check the hasWorkToDo flag, and if true, print a message out, about what work is being done.
// Second, your application won't access the appliances directly.
// It should call doKitchenWork(), which delegates the work, to any of its appliances.

package Composition.CompositionChallenge;

public class KitchenMain {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

        // kitchen.getDishWasher().setHasWorkToDo(true);
        // kitchen.getIceBox().setHasWorkToDo(true);
        // kitchen.getBrewMaster().setHasWorkToDo(true);
        //
        // kitchen.getDishWasher().doDishes();
        // kitchen.getIceBox().orderFood();
        // kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }

    // output :
    // Brewing Coffee
    // Washing Dishes
}
