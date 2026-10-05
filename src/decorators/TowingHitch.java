package decorators;

import car.KiaCar;

public class TowingHitch extends AccesoriesDecorator{
    public TowingHitch(KiaCar car){
        this.car=car;
        description=car.getDescription()+", Tiro de arrastre ";
    }
    @Override
    public double cost() {
        return 810000+ car.cost();
    }

    @Override
    public String getDescription() {
        return description;
    }
    
}
