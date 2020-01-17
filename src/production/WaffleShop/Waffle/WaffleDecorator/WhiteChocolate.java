package production.WaffleShop.Waffle.WaffleDecorator;

import production.WaffleShop.Waffle.Waffle;

public class WhiteChocolate extends ChocolateDecorator {
    Waffle waffle;

    public WhiteChocolate(Waffle waffle){
        this.waffle = waffle;
    }

    @Override
    public double cost() {
        return 1.50 + waffle.cost();
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", White Chocolate";
    }
}
