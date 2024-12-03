
import org.junit.Test;
import org.junit.Assert;

public class StrategyTest {

    @Test
    public void testPercentageDiscount() {
        Order order = new Order();

        order.setDiscountStrategy(new PercentageDiscount(20));

        // 100 - 100 * 20% = 80
        Assert.assertTrue(order.calculateWithDiscount(100) == 80.0);
    }

    @Test
    public void testFixedDiscount() {
        Order order = new Order();
        // $10 off
        order.setDiscountStrategy(new FlatRateDiscount(10));

        // 100 - 10 = 90
        // Check if the calculated total is correct
        Assert.assertTrue(order.calculateWithDiscount(100) == 90.0);
    }
}
