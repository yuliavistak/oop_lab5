package flower.store;

import lombok.Getter;
import lombok.ToString;

@Getter@ToString
public enum FlowerColor {
    RED("#FF0000"), GREEN("#32A852"), YELLOW("#F2DD1B");
    private String colorCode;

    FlowerColor(String colorCode) {
        this.colorCode = colorCode;
    }

    public boolean hasThisColor(String otherColor) {
        return colorCode.equals(otherColor);
    }
}
