package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter@AllArgsConstructor@ToString@NoArgsConstructor
public class Flower {

    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Flower(Flower flower) {
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
    }

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