package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    public void testPriceFirst() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColorFirst() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor());
    }
    @Test
    public void testPriceSecond() {
        Flower flowerSecond = new Flower(FlowerColor.GREEN, 
                MAX_PRICE, MAX_PRICE, FlowerType.CHAMOMILE); 
        int price = MAX_PRICE;
        flower.setPrice(price);
        Assertions.assertEquals(flower.getPrice(), flowerSecond.getPrice());
    }    
    @Test
    public void testColorSecond() {
        FlowerColor color = FlowerColor.YELLOW;
        flower.setColor(color);
        FlowerColor colorT = FlowerColor.GREEN;
        double pr = 0.0;
        double len = 0.0;
        FlowerType t = FlowerType.TULIP;
        Flower flowerThird = new Flower(colorT, pr, len, t); 
        Assertions.assertNotEquals(flowerThird.getClass(), flower.getColor());
    }
}
