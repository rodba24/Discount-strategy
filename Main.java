public class Main {

    public static void main(String[] args) {
        // Example 1: Percentage Discount
        Order order1 = new Order();
        order1.setDiscountStrategy(new PercentageDiscount(20)); // 20% discount
        double total1 = order1.calculateWithDiscount(100); // 100 - 20% of 100
        System.out.println("Total after 20% discount on $100: $" + total1);

        // Example 2: Fixed Discount
        Order order2 = new Order();
        order2.setDiscountStrategy(new FlatRateDiscount(15)); // $15 discount
        double total2 = order2.calculateWithDiscount(100); // 100 - 15
        System.out.println("Total after $15 discount on $100: $" + total2);

      
    }
}
