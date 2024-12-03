public class FlatRateDiscount implements DiscountStrategy {

    private final double flatRate;

    public FlatRateDiscount(double flatRate) {
        this.flatRate = flatRate;
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount - flatRate; //applies a fixed amount discount
    }
}
