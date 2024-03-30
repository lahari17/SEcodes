package Assignment5.Decorator;

public class CustomerLoyalty {

    public enum LoyaltyLevel{
        VIP(0.10),
        REGULAR(0);

        private double discount;

        LoyaltyLevel(double discount){
            this.discount = discount;
        }

        public double getDiscount(){
            return discount;
        }
    }

    private LoyaltyLevel loyaltyLevel;

    public CustomerLoyalty(String loyaltyLevel){
        this.loyaltyLevel = LoyaltyLevel.valueOf(loyaltyLevel.toUpperCase());
    }

    public double applyDiscount(double totalCost){
        System.out.printf("Customer Loyalty Level: %s%n", loyaltyLevel);
        System.out.println("Discount applied: " + loyaltyLevel.getDiscount() * 100 + "%");
        totalCost -= (totalCost * loyaltyLevel.getDiscount());
        return totalCost;
    }


}
