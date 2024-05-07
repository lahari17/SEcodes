package Assignment8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Driver {
    public static <Hash> void main(String[] args) {
        Map<String, Snack> snacks = createSnacks();
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setSnacks(snacks);

        System.out.println(" Enough money and quantity");
        vendingMachine.selectSnack("Coke", 2);
        vendingMachine.insertCoin(10);
        vendingMachine.dispenseSnack();
        System.out.println("");


        System.out.println("NOT ENOUGH MONEY");
        vendingMachine.selectSnack("Doritos", 1);
        vendingMachine.insertCoin(2.5);
        vendingMachine.dispenseSnack();
        System.out.println("");

        System.out.println("WHERE QUANTITY HITS 0 WITH SNICKERS");
        vendingMachine.selectSnack("Snickers", 4);
        vendingMachine.insertCoin(10);
        vendingMachine.dispenseSnack();
        System.out.println("");

        System.out.println("NO MORE QUANTITY OF SNACK");
        vendingMachine.selectSnack("Snickers", 5);
        vendingMachine.insertCoin(15);
        System.out.println("");
    }

    public static Map<String, Snack> createSnacks(){
        Map<String, Snack> snacks = new HashMap<String, Snack>();
        snacks.put("Coke", new Snack("Coke", 1.25, 5));
        snacks.put("Pepsi", new Snack("Pepsi", 1.20, 4));
        snacks.put("Cheetos", new Snack("Cheetos", 2.75, 6));
        snacks.put("Doritos", new Snack("Doritos", 3.00, 7));
        snacks.put("KitKat", new Snack("KitKat", 1.50, 3));
        snacks.put("Snickers", new Snack("Snickers", 1.30, 4));

        System.out.println("Snack Details:");
        for (Map.Entry<String, Snack> entry : snacks.entrySet()) {
            String name = entry.getKey();
            Snack snack = entry.getValue();
            String formattedOutput = String.format("Name: %-10s Quantity: %-5d Price: $%-5.2f", snack.getSnackName(), snack.getSnackQuantity(), snack.getSnackPrice());
            System.out.println(formattedOutput);
        }

        System.out.println();

        return snacks;
    }
}
