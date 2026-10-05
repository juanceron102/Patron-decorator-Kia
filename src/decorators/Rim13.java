package decorators;

import car.KiaCar;

public class Rim13 extends AccesoriesDecorator{
    public Rim13(KiaCar car){
        this.car=car;
        description=car.getDescription()+", Rin Aluminio 13' ";
    }
    @Override
    public double cost() {
        return 350000+ car.cost();
    }

    @Override
    public String getDescription() {
        return description;
    }
    
}
