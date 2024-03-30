package Assignment5.Decorator;

public class MainDriver {
    public static void main(String[] args){
        showMenu();
        Order customerOrder1 = new Order("#1");
        customerOrder1.addItem(new CheeseToppings(new Burger()));
        customerOrder1.receipt();

        //Same order with Loyal(VIP) Customer
        Order customerOrder2 = new Order("#2", "VIP");
        customerOrder2.addItem(new CheeseToppings(new Burger()));
        customerOrder2.receipt();


        Order customerOrder3 = new Order("#3");
        customerOrder3.addItem(new CheeseToppings(new Mayo(new HotDog())));
        customerOrder3.receipt();
    }

    public static void showMenu(){
        System.out.println("-------- Main Menu -------");
        System.out.printf("\tVeganBurger: $%.2f%n", Burger.COST);
        System.out.printf("\tHotDog: $%.2f%n", HotDog.COST);
        System.out.printf("\tFries: $%.2f%n", FriesToppings.COST);
        System.out.println("----------- Add-on Options ----------");
        System.out.printf("\tCheese : $%.2f%n", CheeseToppings.COST);
        System.out.printf("\tMayo: $%.2f%n", Mayo.COST);
        System.out.println("--- Discount for Customer Loyalty ---");
        System.out.println("\tVIP: 5%");
    }
}
