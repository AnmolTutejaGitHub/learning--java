package BillBurgerChallenge.Bonus;

public class Main {

    public static void main(String[] args) {

        // Item coke = new Item("drink", "coke", 1.50);
        // coke.printItem();
        // coke.setSize("LARGE");
        // coke.printItem();
        //
        // Item avocado = new Item("Topping", "avocado", 1.50);
        // avocado.printItem();

        // Burger burger = new Burger("regular", 4.00);
        // burger.addToppings("BACON", "CHEESE", "MAYO");
        // burger.printItem();

        // MealOrder regularMeal = new MealOrder();
        // regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
        // regularMeal.setDrinkSize("LARGE");
        // regularMeal.printItemizedList();

        // MealOrder secondMeal = new MealOrder("turkey", "7-up",
        // "chili");
        // secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        // secondMeal.setDrinkSize("SMALL");
        // secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up",
                "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE",
                "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();

        // output :
        // BASE BURGER: 8.50
        // AVOCADO: 0.00
        // BACON: 0.00
        // LETTUCE: 0.00
        // CHEESE: 0.00
        // MAYO: 0.00
        // ------------------------------
        // DELUXE BURGER: 8.50
        // SMALL 7-UP: 0.00
        // MEDIUM CHILI: 0.00
        // ------------------------------
        // TOTAL PRICE: 8.50
    }
}
