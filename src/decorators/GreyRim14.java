package decorators;

import car.KiaCar;

public class GreyRim14 extends AccesoriesDecorator{
    public GreyRim14(KiaCar car){
        this.car=car;
        description=car.getDescription()+", Rin Aluminio 14' gris mecanizado ";
    }
    @Override
    public double cost() {
        return 500000+ car.cost();
    }

    @Override
    public String getDescription() {
        return description;
    }
    
}
