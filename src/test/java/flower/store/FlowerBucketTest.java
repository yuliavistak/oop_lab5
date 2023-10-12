package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.Random;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Flower();
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.add(flowerPack);
        Assertions.assertEquals(price * quantity, flowerBucket.getPrice());
    }

    @Test
    public void testAdd() {
        FlowerBucket flowerBucket2 = new FlowerBucket();
        Assertions.assertEquals(flowerBucket2.getPacks().size(), 0);

        Flower flower1 = new Flower();
        Flower flower2 = new Flower();
        Flower flower3 = new Flower();

        FlowerPack flowerPack1 = new FlowerPack(flower1, 5);
        FlowerPack flowerPack2 = new FlowerPack(flower2, 2);
        FlowerPack flowerPack3 = new FlowerPack(flower3, 10);
        flowerBucket2.add(flowerPack1);
        flowerBucket2.add(flowerPack2);
        flowerBucket2.add(flowerPack3);
        Assertions.assertEquals(flowerBucket2.getPacks().size(), 3);
    }

    @Test

    public void testGetPacks() {

        Flower flower1 = new Flower();
        Flower flower2 = new Flower();
        Flower flower3 = new Flower();

        flower2.setColor(FlowerColor.RED);
        FlowerPack flowerPack1 = new FlowerPack(flower1, 5);
        FlowerPack flowerPack2 = new FlowerPack(flower2, 2);
        FlowerPack flowerPack3 = new FlowerPack(flower3, 10);
        
        flower1.setPrice(13.5);
        flowerBucket.add(flowerPack1);
        flowerBucket.add(flowerPack2);
        flowerBucket.add(flowerPack3);
        List<FlowerPack> lstPacks = flowerBucket.getPacks();
        Flower flowerFromBucket = lstPacks.get(1).getFlower();
        Flower flowerFromBucket2 = lstPacks.get(0).getFlower();


        Assertions.assertEquals(flowerFromBucket.getColor(), "#FF0000");
        Assertions.assertEquals(flowerFromBucket2.getPrice(), 0);
    }
    
    @Test
    public void testGetPrice(){
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Flower();
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.add(flowerPack);

        flower.setPrice(101.6);
        Assertions.assertEquals(flowerBucket.getPrice(), price*quantity);

    }
    
}
