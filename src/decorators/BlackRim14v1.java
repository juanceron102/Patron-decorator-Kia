package decorators;

import car.KiaCar;

public class BlackRim14v1 extends AccesoriesDecorator{
    public BlackRim14v1(KiaCar car){
        this.car=car;
        description=car.getDescription()+", Rin Aluminio 14' negro mecanizado Version 1 ";
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
