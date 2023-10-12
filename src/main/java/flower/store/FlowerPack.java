package flower.store;

import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 1){
            this.quantity = 1;
        }
        else{
            this.quantity = quantity;
        }
    }

    public double getPrice(){
        return quantity * flower.getPrice();
    }
    public Flower getFlower(){
        return this.flower;
    }
}
