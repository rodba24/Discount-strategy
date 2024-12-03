//context class

public class Order {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateWithDiscount(double totalAmount) {

        if (discountStrategy == null) { 
            throw new IllegalStateException("strategy not set");
        }
        return discountStrategy.applyDiscount(totalAmount);
    }
}
