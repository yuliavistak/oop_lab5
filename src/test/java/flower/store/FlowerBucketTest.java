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
        FlowerBucket flowerBucketB = new FlowerBucket();

        Assertions.assertEquals(flowerBucketB.getPacks().size(), 0);


        Flower flowerA = new Flower();
        Flower flowerB = new Flower();
        Flower flowerC = new Flower();

        FlowerPack flowerPackA = new FlowerPack(flowerA, 0);
        FlowerPack flowerPackB = new FlowerPack(flowerB, 0);
        FlowerPack flowerPackC = new FlowerPack(flowerC, 0);
        flowerBucketB.add(flowerPackA);
        flowerBucketB.add(flowerPackB);
        flowerBucketB.add(flowerPackC);
        Assertions.assertNotEquals(flowerBucketB.getPacks().size(), 0);
    }

    @Test

    public void testGetPacks() {

        Flower flowerA = new Flower();
        Flower flowerB = new Flower();
        Flower flowerC = new Flower();

        flowerB.setColor(FlowerColor.RED);

      
        FlowerPack flowerPackA = new FlowerPack(flowerA, 0);
        FlowerPack flowerPackB = new FlowerPack(flowerB, 0);
        FlowerPack flowerPackC = new FlowerPack(flowerC, 0);

        flowerBucket.add(flowerPackA);
        flowerBucket.add(flowerPackB);
        flowerBucket.add(flowerPackC);
        List<FlowerPack> lstPacks = flowerBucket.getPacks();
        Flower flowerFromBucket = lstPacks.get(1).getFlower();
        Flower flowerFromBucketB = lstPacks.get(0).getFlower();


        Assertions.assertEquals(flowerFromBucket.getColor(), "#FF0000");
        Assertions.assertEquals(flowerFromBucketB.getPrice(), 0);
    }
    
    @Test
    public void testGetPrice() {
        int price = MAX_PRICE;
        int quantity = MAX_QUANTITY;
        Flower rose = new Flower();
        rose.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(rose, quantity);
        flowerBucket.add(flowerPack);

        double newprice = MAX_PRICE + 1;
        rose.setPrice(newprice);
        Assertions.assertEquals(flowerBucket.getPrice(), price*quantity);

    }
    
}
