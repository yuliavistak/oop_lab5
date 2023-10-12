package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter@AllArgsConstructor@ToString@NoArgsConstructor
public class Flower {

    public Flower(Flower flower) {
        this.color = flower.color;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.flowerType = flower.flowerType;

    }

    private FlowerColor color;
    private double price;
    private double sepalLength;
    private FlowerType flowerType;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double newprice) {
        this.price = newprice;
    }

    public void setColor(FlowerColor newcolor) {
        this.color = newcolor;
    }

    public String getColor() {
        return this.color.getCode();
    }
}