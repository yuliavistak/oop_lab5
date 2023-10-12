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
    public void testPrice1() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor1() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor());
    }
    @Test
    public void testPrice2() {
        Flower flower2 = new Flower(MAX_PRICE, MAX_PRICE, FlowerColor.GREEN, FlowerType.CHAMOMILE); 
        int price = MAX_PRICE;
        flower.setPrice(price);
        Assertions.assertEquals(flower.getPrice(), flower2.getPrice());
    }    
    @Test
    public void testColor2() {
        FlowerColor color = FlowerColor.YELLOW;
        flower.setColor(color);
        Flower flower3 = new Flower(0.0, 4.3, FlowerColor.GREEN, FlowerType.TULIP); 
        Assertions.assertNotEquals(flower3.getClass(), flower.getColor());
    }


    
}
