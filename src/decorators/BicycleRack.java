package decorators;

import car.KiaCar;

public class BicycleRack extends AccesoriesDecorator{
    public BicycleRack(KiaCar car){
        this.car=car;
        description=car.getDescription()+", Porta bicicletas 2 puestos ";
    }
    @Override
    public double cost() {
        return 910000+ car.cost();
    }

    @Override
    public String getDescription() {
        return description;
    }
}
